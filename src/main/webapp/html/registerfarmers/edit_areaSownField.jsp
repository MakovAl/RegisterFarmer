
<%@include file="/html/init.jsp" %>




<portlet:renderURL var="viewURL">
<portlet:param name="mvcPath" value="/html/registerfarmers/edit_farmer.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addAreaSownField" var="addAreaSownFieldURL" >

</portlet:actionURL>

<%
long areaSownFieldId = ParamUtil.getLong(renderRequest, "areaSownFieldId");


AreaSownField areaSownField = null;

if (areaSownFieldId > 0) {

	areaSownField = AreaSownFieldLocalServiceUtil.getAreaSownField(areaSownFieldId);

}

long farmerId = ParamUtil.getLong(renderRequest, "farmerId");
System.out.println("farmerId: " + farmerId);
List<Area> listArea = AreaLocalServiceUtil.getAreas(scopeGroupId);
Area area = null;
 

%>

<aui:form action="<%= addAreaSownFieldURL %>" name="<portlet:namespace/>fm">

<aui:model-context bean="<%= areaSownField %>" model="<%= AreaSownField.class %>" />

<aui:fieldset>

<aui:select name="title">
    <%for(int i = 0; i < listArea.size(); i++){ 
        area = listArea.get(i);
        %>
        <aui:option label="<%= area.getTitle() %>" />
    <% } %>
    
    <aui:input name="farmerId" ></aui:input>
	<aui:input name="areaId"  value="<%= area.getAreaId() %>"></aui:input>
</aui:select>

    

</aui:fieldset>
<aui:button-row>
<aui:button type="submit">
</aui:button>
<aui:button onClick="<%= viewURL.toString() %>" type="cancel"></aui:button>
</aui:button-row>
</aui:form>