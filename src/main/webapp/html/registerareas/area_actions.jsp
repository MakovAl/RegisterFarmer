<%@include file="/html/init.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
String mvcPath = ParamUtil.getString(request, "mvcPath");

ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

Area area = (Area)row.getObject(); 
%>

<liferay-ui:icon-menu>

	<c:if
		test="<%= AreaPermission.contains(permissionChecker, area.getAreaId(), ActionKeys.UPDATE) %>">
		<portlet:renderURL var="editURL">
			<portlet:param name="areaId"
				value="<%= String.valueOf(area.getAreaId()) %>" />
			<portlet:param name="mvcPath"
				value="/html/registerareas/edit_area.jsp" />
			<portlet:param name="inArchive"
				value="<%= String.valueOf(area.getInArchive()) %>" />
			<portlet:param name="mvcPath"
				value="/html/registerareas/edit_area.jsp" />
		</portlet:renderURL>

		<liferay-ui:icon image="edit" message="Изменить"
			url="<%=editURL.toString() %>" />
	</c:if>

	<c:if
		test="<%=AreaPermission.contains(permissionChecker, area.getAreaId(), ActionKeys.PERMISSIONS) %>">

		<liferay-security:permissionsURL
			modelResource="<%= Area.class.getName() %>"
			modelResourceDescription="<%= area.getTitle() %>"
			resourcePrimKey="<%= String.valueOf(area.getAreaId()) %>"
			var="permissionsURL" />

		<liferay-ui:icon image="permissions" url="<%= permissionsURL %>" message="Разрешения"/>

	</c:if>

	<c:if
		test="<%=AreaPermission.contains(permissionChecker, area.getAreaId(), ActionKeys.DELETE) %>">

		<portlet:actionURL name="deleteArea" var="deleteURL" >
			<portlet:param name="areaId" 
				value="<%= String.valueOf(area.getAreaId()) %>" />
		</portlet:actionURL>

		<liferay-ui:icon-delete url="<%=deleteURL.toString() %>" message="Удалить" />
	</c:if>
</liferay-ui:icon-menu>



