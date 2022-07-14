<%@include file="/html/init.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String keywords = ParamUtil.getString(request, "keywords");
	Boolean inArchive = ParamUtil.getBoolean(request, "inArchive");
	Boolean everywhere = ParamUtil.getBoolean(request, "everywhere");
%>

<liferay-portlet:renderURL varImpl="searchURL">
        <portlet:param name="mvcPath" value="/html/registerareas/view_search.jsp" />
</liferay-portlet:renderURL>

<liferay-portlet:renderURL varImpl="viewURL">
        <portlet:param name="mvcPath" value="/html/registerareas/view.jsp" />
</liferay-portlet:renderURL>

<aui:form action="<%= searchURL %>" method="get" name="fm">
    <liferay-portlet:renderURLParams varImpl="searchURL" />

    <liferay-ui:header
        backURL="<%= viewURL.toString() %>"
        title="Поиск"
    />
    
    <div class="search-form">
        <span class="aui-search-bar">
            <aui:input inlineField="<%= true %>" label="Ключевое слово" name="keywords" size="30" title="search-areas" type="text" />
        	<aui:input label="Искать в архиве" name="inArchive" title="search-archive" type="checkbox" align="right" />
        	<aui:input label="Искать везде" name="everywhere" title="search-everywhere" type="checkbox" align="right" />
            <aui:button type="submit" value="Искать" />
        </span>
    </div>
</aui:form>

<%
        SearchContext searchContext = SearchContextFactory
        .getInstance(request);

        searchContext.setKeywords(keywords);
        searchContext.setAttribute("paginationType", "more");
        searchContext.setStart(0);
        searchContext.setEnd(10);
        
        Indexer indexer = IndexerRegistryUtil.getIndexer(Area.class);

        Hits hits = indexer.search(searchContext);
        
        List<Area> areas = new ArrayList<Area>();

        for (int i = 0; i < hits.getDocs().length; i++) {
                Document doc = hits.doc(i);

                long areaId = GetterUtil
                .getLong(doc.get(Field.ENTRY_CLASS_PK));
                

               
                Area area = null;
                
                
                try {
                	area = AreaLocalServiceUtil.getArea(areaId);
            } catch (PortalException pe) {
                    _log.error(pe.getLocalizedMessage());
            } catch (SystemException se) {
                    _log.error(se.getLocalizedMessage());
            }
                if (everywhere) {
                	areas.add(area);
                } else if (inArchive == area.getInArchive()){
                areas.add(area);
                }
        }
%>

<liferay-ui:search-container delta="10" emptyResultsMessage="Не найдено ни одной области">
        <liferay-ui:search-container-results
                results="<%= areas %>"
                total="<%= areas.size() %>"
        />

        <liferay-ui:search-container-row
                className="com.register.serviceRF.model.Area"
                keyProperty="areaId" modelVar="area" escapedModel="<%=true%>">

                <liferay-ui:search-container-column-text name="Название" property="title" />
                
                <liferay-ui:search-container-column-jsp
            path="/html/registerareas/area_actions.jsp"
            align="right" />
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

<%!
        private static Log _log = LogFactoryUtil.getLog("src.main.webapp.html.registerareas.view_search_jsp");
%>