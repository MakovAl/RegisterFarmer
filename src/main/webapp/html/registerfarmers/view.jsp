<%@include file="/html/init.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    long farmerId = Long.valueOf((Long) renderRequest
            .getAttribute("farmerId"));
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
        <portlet:param name="mvcPath" value="/html/registerfarmers/view_search.jsp" />
</liferay-portlet:renderURL>

<aui:form action="<%= searchURL %>" method="get" name="fm">
    <liferay-portlet:renderURLParams varImpl="searchURL" />
    
    <div class="search-form">
        <span class="aui-search-bar">
			<aui:input label="Начальная дата" name="startDate" type="text" placeholder="дд.мм.гггг" required="dd.MM.yyyy"/>
			<aui:input label="Конечная дата" name="endDate" type="text" placeholder="дд.мм.гггг" required="dd.MM.yyyy"/>
            <aui:input inlineField="<%= true %>" label="Ключевое слово" name="keywords" size="30" title="search-farmers" type="text" />
        	<aui:input label="Искать в архиве" name="inArchive" title="search-archive" type="checkbox" align="right" />
        	<aui:input label="Искать везде" name="everywhere" title="search-everywhere" type="checkbox" align="right" />
            <aui:button type="submit" value="Искать" />
        </span>
    </div>
</aui:form>



<liferay-ui:search-container
        total="<%=FarmerLocalServiceUtil.getFarmersCount(scopeGroupId, false)%>" >
    <liferay-ui:search-container-results
        results="<%=FarmerLocalServiceUtil.getFarmers(scopeGroupId, false,
        		searchContainer.getStart(), searchContainer.getEnd())%>" />

    <liferay-ui:search-container-row
        className="com.register.serviceRF.model.Farmer" modelVar="farmer">
        <liferay-ui:search-container-column-jsp path="/html/registerfarmers/farmer_actions.jsp" align="right" />

        <liferay-ui:search-container-column-text property="nameOrganization" name="Название организации" />
        <liferay-ui:search-container-column-text property="organizationalLegalForm" name="Организационно-правовая форма" />
        <liferay-ui:search-container-column-text property="INN" name="ИНН" />
        <liferay-ui:search-container-column-text property="KPP" name="КПП" />
        <liferay-ui:search-container-column-text property="OGRN" name="ОГРН" />



    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>


<aui:button-row cssClass="farmer-buttons">

	<c:if test='<%= FarmerModelPermission.contains(permissionChecker, scopeGroupId, "ADD_FARMER") %>'>

    	<portlet:renderURL var="addFarmerURL">
        	<portlet:param name="mvcPath"
            	value="/html/registerfarmers/edit_farmer.jsp" />
    	</portlet:renderURL>


    	<aui:button onClick="<%=addFarmerURL.toString()%>" value="Добавить фермера" />
        
    </c:if>
</aui:button-row>