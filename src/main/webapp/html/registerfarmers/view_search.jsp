<%@include file="/html/init.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String keywords = ParamUtil.getString(request, "keywords");
	Boolean inArchive = ParamUtil.getBoolean(request, "inArchive");
	Boolean everywhere = ParamUtil.getBoolean(request, "everywhere");
	String startDate = ParamUtil.getString(request, "startDate");
	String endDate = ParamUtil.getString(request, "endDate");
%>

<aui:script use="aui-min">
YUI({ lang: 'ru' }).use(
  'aui-datepicker',
  function(Y) {
    var datepicker = new Y.DatePicker(
      {
        trigger: '#<portlet:namespace />endDate',
        mask: '%d.%m.%Y',
        popover: {
          toolbars: {
            header: [[
              {
                icon:'icon-trash',
                label: 'Clear',
                on: {
                  click: function() {
                    datepicker.clearSelection();
                  }
                }
              }
            ]]
          },
          zIndex: 1
        }
      }
    );
  }
);
</aui:script>

<aui:script use="aui-min">
YUI({ lang: 'ru' }).use(
  'aui-datepicker',
  function(Y) {
    var datepicker = new Y.DatePicker(
      {
        trigger: '#<portlet:namespace />startDate',
        mask: '%d.%m.%Y',
        popover: {
          toolbars: {
            header: [[
              {
                icon:'icon-trash',
                label: 'Clear',
                on: {
                  click: function() {
                    datepicker.clearSelection();
                  }
                }
              }
            ]]
          },
          zIndex: 1
        }
      }
    );
  }
);
</aui:script>





<liferay-portlet:renderURL varImpl="searchURL">
	<portlet:param name="mvcPath"
		value="/html/registerfarmers/view_search.jsp" />
</liferay-portlet:renderURL>

<liferay-portlet:renderURL varImpl="viewURL">
	<portlet:param name="mvcPath" value="/html/registerfarmers/view.jsp" />
</liferay-portlet:renderURL>

<aui:form action="<%= searchURL %>" method="get" name="fm">
	<liferay-portlet:renderURLParams varImpl="searchURL" />

	<liferay-ui:header backURL="<%= viewURL.toString() %>" title="Поиск" />

	<div class="search-form">
		<span class="aui-search-bar">
				<aui:input label="Начальная дата" name="startDate" 
				type="text" placeholder="дд.мм.гггг" required="dd.MM.yyyy" /> 
				<aui:input label="Конечная дата" name="endDate"
				type="text" placeholder="дд.мм.гггг" required="dd.MM.yyyy" />
				<aui:input inlineField="<%= true %>" label="Ключевое слово" name="keywords" size="30"
				title="search-farmers" type="text" /> 
				<aui:input label="Искать в архиве" name="inArchive" title="search-archive"
				type="checkbox" align="right" /> 
				<aui:input label="Искать везде" name="everywhere"
				title="search-everywhere" type="checkbox" align="right" /> 
				<aui:button type="submit" value="Искать" />
		</span>
	</div>
</aui:form>

<%
SearchContext searchContext = SearchContextFactory.getInstance(request);

DateFormat df = new SimpleDateFormat("dd.MM.yyyy");

searchContext.setKeywords(keywords);
searchContext.setAttribute("paginationType", "more");

searchContext.setStart(0);
searchContext.setEnd(10);

Indexer indexer = IndexerRegistryUtil.getIndexer(Farmer.class);

Hits hits = indexer.search(searchContext);

List<Farmer> farmers = new ArrayList<Farmer>();
List<Farmer> filterFarmers = new ArrayList<Farmer>();

Map<String, List<String>> areaMap = new HashMap<String, List<String>>();

for (int i = 0; i < hits.getDocs().length; i++) {
	Document doc = hits.doc(i);

	long farmerId = GetterUtil.getLong(doc.get(Field.ENTRY_CLASS_PK));

	Farmer farmer = null;
	
	

	try {
		farmer = FarmerLocalServiceUtil.getFarmer(farmerId);
	} catch (PortalException pe) {
		_log.error(pe.getLocalizedMessage());
	} catch (SystemException se) {
		_log.error(se.getLocalizedMessage());
	}

	farmers.add(farmer);
}

if (!keywords.isEmpty() && farmers.isEmpty()) {
	List<Area> keywordsArea = AreaLocalServiceUtil.getAreas(keywords);
	if (keywordsArea != null) {
		for (Area itrArea : keywordsArea) {
			farmers.addAll(FarmerLocalServiceUtil.getFarmers(scopeGroupId, String.valueOf(itrArea.getAreaId())));
		}
	}
}

if (!farmers.isEmpty()) {
	for (Farmer itrFarmer : farmers) {
		if (startDate.isEmpty() || endDate.isEmpty()) {
			if (everywhere) {
				filterFarmers.add(itrFarmer);
			} else if (inArchive == itrFarmer.getInArchive()) {
				filterFarmers.add(itrFarmer);
			}
		} else {
			if (itrFarmer.getRegistrationDate() != null) {
				Date sd = df.parse(startDate);
				Date ed = df.parse(endDate);
				if (FarmerLocalServiceUtil.inDateRange(itrFarmer.getRegistrationDate(), sd, ed)) {
					if (everywhere) {
						filterFarmers.add(itrFarmer);
					} else if (inArchive == itrFarmer.getInArchive()) {
						filterFarmers.add(itrFarmer);
					}
				}
			}
		}
	}
	
	
	for (Farmer itrFarmer : filterFarmers) {
		List<AreaSownField> areaSownFiled = AreaSownFieldLocalServiceUtil.getAreaSownFields(scopeGroupId, itrFarmer.getFarmerId());
		List<String> areaTitle = new ArrayList<String>();
		for (AreaSownField area : areaSownFiled) {
			areaTitle.add(AreaLocalServiceUtil.getArea(area.getAreaId()).getTitle());
		}
		areaMap.put(String.valueOf(itrFarmer.getFarmerId()), areaTitle);
	}
}


%>

<liferay-ui:search-container delta="10"
	emptyResultsMessage="no-farmers-were-found">
	<liferay-ui:search-container-results results="<%= filterFarmers %>"
		total="<%= filterFarmers.size() %>" />

	<liferay-ui:search-container-row
		className="com.register.serviceRF.model.Farmer" keyProperty="farmerId"
		modelVar="farmerForm" escapedModel="<%=true%>">

		<liferay-ui:search-container-column-text name="Название организации"
			property="nameOrganization" />
		<liferay-ui:search-container-column-text
			name="Организационно-правовая форма" property="organizationalLegalForm" />
		<liferay-ui:search-container-column-text name="ИНН" property="INN" />
		<liferay-ui:search-container-column-text name="КПП" property="KPP" />
		<liferay-ui:search-container-column-text name="ОГРН" property="OGRN" />
		<liferay-ui:search-container-column-text name="Район регистрации" value="<%= AreaLocalServiceUtil.getArea(Long.valueOf(farmerForm.getRegistrationArea())).getTitle() %>" />
		<liferay-ui:search-container-column-text name="Районы посевных полей" value="<%= areaMap.get(String.valueOf(farmerForm.getFarmerId())).toString() %>" />
		<liferay-ui:search-container-column-text name="Дата регистрации" property="registrationDate" value="<%= df.format(farmerForm.getRegistrationDate()) %>" />
		<liferay-ui:search-container-column-text name="В архиве"
			property="inArchive" />

		<liferay-ui:search-container-column-jsp
			path="/html/registerfarmers/farmer_actions.jsp" align="right" />
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>

<%
        if (Validator.isNotNull(keywords)) {
                String currentURL = PortalUtil.getCurrentURL(request);
                PortalUtil.addPortletBreadcrumbEntry(request, LanguageUtil.get(
                                pageContext, "search") + ": " + keywords, currentURL);
                
        }
%>

<%!private static Log _log = LogFactoryUtil.getLog("src.main.webapp.html.registerareas.view_search_jsp");%>