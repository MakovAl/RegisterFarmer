<%@include file="/html/init.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    long areaId = Long.valueOf((Long) renderRequest
            .getAttribute("areaId"));
%>

<liferay-portlet:renderURL varImpl="searchURL">
        <portlet:param name="mvcPath" value="/html/registerareas/view_search.jsp" />
</liferay-portlet:renderURL>

<aui:form action="<%= searchURL %>" method="get" name="fm">
    <liferay-portlet:renderURLParams varImpl="searchURL" />
    
    <div class="search-form">
        <span class="aui-search-bar">
            <aui:input inlineField="<%= true %>" label="Ключевоие слово" name="keywords" size="30" title="search-areas" type="text" />
			<aui:input inlineField="<%= true %>" label="Искать в архиве" name="inArchive" title="search-archive" type="checkbox"/>
			<aui:input inlineField="<%= true %>" label="Искать везде" name="everywhere" title="search-everywhere" type="checkbox" align="right" />
            <aui:button type="submit" value="Искать" />
        </span>
    </div>
</aui:form>


<liferay-ui:search-container
        total="<%=AreaLocalServiceUtil.getAreasCount(scopeGroupId, false)%>"
>
    <liferay-ui:search-container-results
        results="<%=AreaLocalServiceUtil.getAreas(scopeGroupId, false, 
        		searchContainer.getStart(), searchContainer.getEnd())%>" />

    <liferay-ui:search-container-row
        className="com.register.serviceRF.model.Area" modelVar="area">
        <liferay-ui:search-container-column-jsp name="Действия" path="/html/registerareas/area_actions.jsp" align="right" />

        <liferay-ui:search-container-column-text name="Название" property="title" />

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>


<aui:button-row cssClass="area-buttons">

	<c:if test='<%= AreaModelPermission.contains(permissionChecker, scopeGroupId, "ADD_AREA") %>'>

    	<portlet:renderURL var="addAreaURL">
        	<portlet:param name="mvcPath"
            	value="/html/registerareas/edit_area.jsp" />
    	</portlet:renderURL>


    	<aui:button onClick="<%=addAreaURL.toString()%>" value="Добавить область" />
        
    </c:if>
</aui:button-row>