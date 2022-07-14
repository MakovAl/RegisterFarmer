<%@include file = "/html/init.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<portlet:renderURL var="viewURL">
<portlet:param name="mvcPath" value="/html/registerareas/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addArea" var="addAreaURL" >

</portlet:actionURL>

<%
long areaId = ParamUtil.getLong(renderRequest, "areaId");

Area area = null;

if (areaId > 0) {

    area = AreaLocalServiceUtil.getArea(areaId);

}
%>

<aui:form action="<%= addAreaURL %>" name="<portlet:namespace/>fm">

<aui:model-context bean="<%= area %>" model="<%= Area.class %>" />

	<aui:input name="areaId" type="hidden" />
    <aui:input label="Название" name="title" />
    <aui:input label="В архиве" name="inArchive" type="checkbox"/>

<aui:button-row>
<aui:button type="submit" value="Сохранить"></aui:button>
<aui:button onClick="<%= viewURL.toString() %>" type="cancel" value="Закрыть"></aui:button>
</aui:button-row>
</aui:form>