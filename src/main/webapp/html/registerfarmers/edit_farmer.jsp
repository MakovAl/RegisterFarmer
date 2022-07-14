<%@include file = "/html/init.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<portlet:renderURL var="viewURL">
<portlet:param name="mvcPath" value="/html/registerfarmers/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addFarmer" var="addFarmerURL" >

</portlet:actionURL>

<portlet:actionURL name="addField" var="addFieldURL" >

</portlet:actionURL>

<portlet:actionURL name="delField" var="delFieldURL" >

</portlet:actionURL>

<liferay-portlet:renderURL varImpl="editURL">
        <portlet:param name="mvcPath" value="/html/registerfarmers/edit_farmer.jsp" />
</liferay-portlet:renderURL>


<aui:script use="aui-base">
Liferay.provide(window, 'mysubmitForm', function(action) {
   if(action==0){
     A.one('#<portlet:namespace/>form').set('action','<%=addFarmerURL.toString()%>');  
  }
  	if(action==1) {
  	A.one('#<portlet:namespace/>form').set('action','<%=addFieldURL.toString()%>');
  	}
  	if(action==2) {
  	A.one('#<portlet:namespace/>form').set('action','<%=delFieldURL.toString()%>');
  	}
});
</aui:script>

<aui:script use="aui-min">
YUI({ lang: 'ru' }).use(
  'aui-datepicker',
  function(Y) {
    var datepicker = new Y.DatePicker(
      {
        trigger: '#<portlet:namespace />registrationDate',
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

<%
long farmerId = ParamUtil.getLong(renderRequest, "farmerId");
String nameOrganization = ParamUtil.getString(renderRequest, "nameOrganization");
String organizationalLegalForm = ParamUtil.getString(renderRequest, "organizationalLegalForm");

String stringDate = ParamUtil.getString(renderRequest, "registrationDate");
Date registrationDate = ParamUtil.getDate(request, "registrationDate", new SimpleDateFormat("EEE MMM dd HH:mm:ss z y", Locale.ENGLISH));

DateFormat df = new SimpleDateFormat("dd.MM.yyyy");

String rg = df.format(registrationDate);


long INN = ParamUtil.getLong(renderRequest, "INN");
long KPP = ParamUtil.getLong(renderRequest, "KPP");
long OGRN = ParamUtil.getLong(renderRequest, "OGRN");
long countFields = ParamUtil.getLong(renderRequest, "countFields");




Farmer farmer = null;
List<AreaSownField> areaSownFields = null;

if (farmerId > 0) {

    farmer = FarmerLocalServiceUtil.getFarmer(farmerId);
    areaSownFields = AreaSownFieldLocalServiceUtil.getAreaSownFields(scopeGroupId, farmerId);
    if(countFields == 0)
    countFields = areaSownFields.size();

    areaSownFields = AreaSownFieldLocalServiceUtil.getAreaSownFields(scopeGroupId, farmer.getFarmerId());

}

if (countFields == 0) {
	countFields = 1;
}


List<Area> listArea = AreaLocalServiceUtil.getAreas(scopeGroupId, false);


Area area = null;


%>

<aui:form action="<%= addFarmerURL %>" name="form" method="post">
<aui:model-context bean="<%= farmer %>" model="<%= Farmer.class %>" />


	<aui:input name="farmerId" type="hidden" />
	<aui:input label="Название организации"  name="nameOrganization" >
		<aui:validator name="required" />
		<aui:validator name="range">[2,20]</aui:validator>
	</aui:input>
    <aui:input label="Организационно-правовая форма" name="organizationalLegalForm"  >
       	<aui:validator name="alpha" />
       	<aui:validator name="range">[0,20]</aui:validator>
    </aui:input>
    <aui:input name="countFields" value="<%= countFields %>" type="hidden"/>
    <aui:input label="ИНН" name="INN" type="number" value="<%= INN %>" >
       	<aui:validator name="number" />
    </aui:input>
    <aui:input label="КПП" name="KPP" type="number" value="<%= KPP %>" >
       	<aui:validator name="number" />
    </aui:input>
    <aui:input label="ОГРН" name="OGRN" type="number" value="<%= OGRN %>" >
       	<aui:validator name="number" />
    </aui:input>
    <aui:input label="В архиве" name="inArchive" type="checkbox" />
	<aui:input label="Дата регистрации" name="registrationDate" type="text" placeholder="дд.мм.гггг" value="<%= rg %>" required="dd.MM.yyyy">
       	<aui:validator name="date">dd.MM.yyyy</aui:validator>
    </aui:input>
    
    
    <aui:select label="Район регистрации" name="registrationArea" >
    <%for(int i = 0; i < listArea.size(); i++){ 
        area = listArea.get(i);
        %>
        <aui:option label="<%= area.getTitle() %>" value="<%= area.getAreaId() %>" />
    <% } %>
    
	</aui:select>
    
   	<% for(int t = 0; t < countFields; t++) { %>
    <aui:select label="Районы посевных полей" name="sownArea" id="<% String.valueOf(t); %>" >
    <%for(int i = 0; i < listArea.size(); i++){ 
        area = listArea.get(i);
        %>
        <aui:option label="<%= area.getTitle() %>" value="<%= area.getAreaId() %>" />
    <% } %>
    
	</aui:select>
    <% } %>
    
    


<aui:button-row>
    <aui:button type="submit" value="Сохранить" onClick="mysubmitForm(0)"/>
    <aui:button type="submit" value="Добавить поле" onClick="mysubmitForm(1)"/>
    <aui:button type="submit" value="Удалить поле" onClick="mysubmitForm(2)"/>
<aui:button onClick="<%= viewURL.toString() %>" type="cancel"  value="Закрыть" ></aui:button>
</aui:button-row>
</aui:form>




