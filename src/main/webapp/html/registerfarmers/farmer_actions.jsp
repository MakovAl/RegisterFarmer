<%@include file="/html/init.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
String mvcPath = ParamUtil.getString(request, "mvcPath");

ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

Farmer farmer = (Farmer)row.getObject(); 
%>

<liferay-ui:icon-menu>

    <c:if
        test="<%= FarmerPermission.contains(permissionChecker, farmer.getFarmerId(), ActionKeys.UPDATE) %>">
        <portlet:renderURL var="editURL">
        
        
            <portlet:param name="farmerId"
                value="<%= String.valueOf(farmer.getFarmerId()) %>" />
            
            <portlet:param name="nameOrganization"
                value="<%= String.valueOf(farmer.getNameOrganization()) %>" />
            
            <portlet:param name="organizationalLegalForm"
                value="<%= String.valueOf(farmer.getOrganizationalLegalForm()) %>" />
            
            <portlet:param name="INN"
                value="<%= String.valueOf(farmer.getINN()) %>" />
            
            <portlet:param name="KPP"
                value="<%= String.valueOf(farmer.getKPP()) %>" />
            
            <portlet:param name="OGRN"
                value="<%= String.valueOf(farmer.getOGRN()) %>" />
            
            <portlet:param name="registrationArea"
                value="<%= String.valueOf(farmer.getRegistrationArea()) %>" />
            
            <portlet:param name="areasSownFields"
                value="<%= String.valueOf(farmer.getAreasSownFields()) %>" />
            
            <portlet:param name="registrationDate"
                value="<%= String.valueOf(farmer.getRegistrationDate()) %>" />
            
            <portlet:param name="inArchive"
                value="<%= String.valueOf(farmer.getInArchive()) %>" />
                
            <portlet:param name="mvcPath" value="/html/registerfarmers/edit_farmer.jsp" />
            
        </portlet:renderURL>

        <liferay-ui:icon image="edit" message="Изменить"
            url="<%=editURL.toString() %>" />
    </c:if>
    
    <c:if
    test="<%=FarmerPermission.contains(permissionChecker, farmer.getFarmerId(), ActionKeys.PERMISSIONS) %>">

    <liferay-security:permissionsURL
        modelResource="<%= Farmer.class.getName() %>"
        modelResourceDescription="<%= farmer.getNameOrganization() %>"
        resourcePrimKey="<%= String.valueOf(farmer.getFarmerId()) %>"
        var="permissionsURL" />

    <liferay-ui:icon image="permissions" url="<%= permissionsURL %>" message="Разрешения"/>

</c:if>

    <c:if
        test="<%=FarmerPermission.contains(permissionChecker, farmer.getFarmerId(), ActionKeys.DELETE) %>">

        <portlet:actionURL name="deleteFarmer" var="deleteURL">
            <portlet:param name="farmerId"
                value="<%= String.valueOf(farmer.getFarmerId()) %>" />
        </portlet:actionURL>

        <liferay-ui:icon-delete url="<%=deleteURL.toString() %>" message="Удалить"/>
    </c:if>
</liferay-ui:icon-menu>



