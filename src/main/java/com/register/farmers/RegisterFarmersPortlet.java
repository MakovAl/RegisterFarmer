package com.register.farmers;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.register.serviceRF.model.AreaSownField;
import com.register.serviceRF.model.Farmer;
import com.register.serviceRF.service.AreaSownFieldLocalServiceUtil;
import com.register.serviceRF.service.FarmerLocalServiceUtil;

public class RegisterFarmersPortlet extends MVCPortlet {
	

	public void addFarmer(ActionRequest request, ActionResponse response)
	         throws PortalException, SystemException, ParseException {


		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				Farmer.class.getName(), request);

		String nameOrganization = ParamUtil.getString(request, "nameOrganization");
		String organizationalLegalForm = ParamUtil.getString(request, "organizationalLegalForm");
		String registrationArea = ParamUtil.getString(request, "registrationArea");
		String stringDate = ParamUtil.getString(request,"registrationDate");
		Date registrationDate = ParamUtil.getDate(request, "registrationDate", new SimpleDateFormat("dd.MM.yyyy"));
		
		System.out.println(registrationDate);
		System.out.println(stringDate);
		
		
		Boolean inArchive = ParamUtil.getBoolean(request, "inArchive");
		long farmerId = ParamUtil.getLong(request, "farmerId");
		long INN = ParamUtil.getLong(request, "INN");
		long KPP = ParamUtil.getLong(request, "KPP");
		long OGRN = ParamUtil.getLong(request, "OGRN");
		long countFields = ParamUtil.getLong(request, "countFields");
		long[] listArea = ParamUtil.getLongValues(request, "sownArea");

		List<AreaSownField> areaSownFields = AreaSownFieldLocalServiceUtil.getAreaSownFields(serviceContext.getScopeGroupId(), farmerId);
		
		int areaSownFieldsSize = areaSownFields.size();

		if (farmerId > 0) {

			try {

				FarmerLocalServiceUtil.updateFarmer(serviceContext.getUserId(), farmerId, nameOrganization,
						organizationalLegalForm, INN, KPP, OGRN,
						registrationArea, registrationDate,
						inArchive,
						serviceContext);
				

				if (areaSownFieldsSize <= countFields) {
					for (int i = 0; i < countFields; i++) {
						AreaSownFieldLocalServiceUtil.updateAreaSownField(serviceContext.getUserId(),
								areaSownFields.get(i).getAreaSownFieldsId(), farmerId, listArea[i],
								serviceContext);
					}
				} else {
					for (int i = areaSownFieldsSize; i > countFields; i--) {
					 AreaSownFieldLocalServiceUtil.deleteAreaSownField(areaSownFields.get(i).getAreaSownFieldsId(), serviceContext);
					}
				}
			

				SessionMessages.add(request, "farmerAdded");

			} catch (Exception e) {

				SessionErrors.add(request, e.getClass().getName());

	                            PortalUtil.copyRequestParameters(request, response);

				response.setRenderParameter("mvcPath",
						"/html/registerfarmers/edit_farmer.jsp");
			}

		}
	            else {

			try {
				long idFarmer = FarmerLocalServiceUtil.addFarmer(serviceContext.getUserId(), nameOrganization,
						organizationalLegalForm, INN, KPP, OGRN,
						registrationArea, registrationDate,
						inArchive,
						serviceContext).getFarmerId();
				
				
				for (int i = 0; i < countFields; i++) {
					AreaSownFieldLocalServiceUtil.addAreaSownField(serviceContext.getUserId(), 
							idFarmer, listArea[i],
							serviceContext);
				}
				SessionMessages.add(request, "farmerAdded");


			} catch (Exception e) {
				SessionErrors.add(request, e.getClass().getName());

	                            PortalUtil.copyRequestParameters(request, response);

				response.setRenderParameter("mvcPath",
						"/html/registerfarmers/edit_farmer.jsp");
			}
		}

	 }
	
	public void deleteFarmer (ActionRequest request, ActionResponse response) {
		
		long farmerId = ParamUtil.getLong(request, "farmerId");
		
		try {

			ServiceContext serviceContext = ServiceContextFactory.getInstance(
				Farmer.class.getName(), request);
			
			List<AreaSownField> areaSownFields = AreaSownFieldLocalServiceUtil.getAreaSownFields(serviceContext.getScopeGroupId(), farmerId);

			for(int i = 0; i < areaSownFields.size(); i++) {
				AreaSownFieldLocalServiceUtil.deleteAreaSownField(areaSownFields.get(i).getAreaSownFieldsId(), serviceContext);
			}

			FarmerLocalServiceUtil.deleteFarmer(farmerId, serviceContext);
			
		} catch (Exception e) {
			
			SessionErrors.add(request, e.getClass().getName());
		}
	}
	
	 @Override
	 public void render(RenderRequest renderRequest,
	         RenderResponse renderResponse) throws PortletException, IOException {

	     try {
	         ServiceContext serviceContext = ServiceContextFactory.getInstance(
	                 Farmer.class.getName(), renderRequest);

	         long groupId = serviceContext.getScopeGroupId();

	         long farmerId = ParamUtil.getLong(renderRequest, "farmerId");;

	         List<Farmer> farmers = FarmerLocalServiceUtil
	                 .getFarmers(groupId);
	         
	         Date now = new Date();

	         if (farmers.size() == 0) {
	             Farmer area = FarmerLocalServiceUtil.addFarmer(
	                     serviceContext.getUserId(), "Null", "Null", 123, 123, 123, "Null", now, false, serviceContext);

	            farmerId = area.getFarmerId();

	         }

	         if (!(farmerId > 0)) {
	        	 farmerId = farmers.get(0).getFarmerId();
	         }

	         renderRequest.setAttribute("farmerId", farmerId);

	     } catch (Exception e) {

	         throw new PortletException(e);
	     }

	     super.render(renderRequest, renderResponse);

	 }
	 
	 
	 
		
	 public void addAreaSownField(ActionRequest request, ActionResponse response)
				throws PortalException, SystemException {

			ServiceContext serviceContext = ServiceContextFactory.getInstance(
					AreaSownField.class.getName(), request);

			long areaId = ParamUtil.getLong(request, "areaId");
			long farmerId = ParamUtil.getLong(request, "farmerId");
			long areaSownFieldId = ParamUtil.getLong(request, "areaSownFieldId");

			if (areaSownFieldId > 0) {

				try {

					AreaSownFieldLocalServiceUtil.updateAreaSownField(serviceContext.getUserId(),
							areaSownFieldId, farmerId, areaId,
							serviceContext);

					SessionMessages.add(request, "areaSownFieldAdded");

					response.setRenderParameter("farmerId",
							Long.toString(farmerId));

				} catch (Exception e) {

					SessionErrors.add(request, e.getClass().getName());

		                            PortalUtil.copyRequestParameters(request, response);

					response.setRenderParameter("mvcPath",
							"/html/registerfarmers/edit_areaSownField.jsp");
				}

			}
		            else {

				try {
					AreaSownFieldLocalServiceUtil.addAreaSownField(serviceContext.getUserId(),
							farmerId, areaId, serviceContext);

					SessionMessages.add(request, "areaSownFieldAdded");

					response.setRenderParameter("farmerId",
							Long.toString(farmerId));

				} catch (Exception e) {
					SessionErrors.add(request, e.getClass().getName());

		                            PortalUtil.copyRequestParameters(request, response);

					response.setRenderParameter("mvcPath",
							"/html/registerfarmers/edit_areaSownField.jsp");
				}
			}

		}
	 
	 
	 public void deleteAreaSownField (ActionRequest request, ActionResponse response) {
			
			long areaSownFieldId = ParamUtil.getLong(request, "areaSownFieldId");
			long farmerId = ParamUtil.getLong(request, "farmerId");
			
			try {

				ServiceContext serviceContext = ServiceContextFactory.getInstance(
						AreaSownField.class.getName(), request);

		                    response.setRenderParameter("farmerId", Long.toString(farmerId));

		                    AreaSownFieldLocalServiceUtil.deleteAreaSownField(areaSownFieldId, serviceContext);
				
			} catch (Exception e) {
				
				SessionErrors.add(request, e.getClass().getName());
			}
		}
	 
	 
	 public void addField(ActionRequest request, ActionResponse response)
				throws PortalException, SystemException {

			long countFields = ParamUtil.getLong(request, "countFields");


				try {
					SessionMessages.add(request, "fieldAdded");

                    PortalUtil.copyRequestParameters(request, response);
					
					response.setRenderParameter("countFields",
							Long.toString(countFields + 1));
	
					response.setRenderParameter("mvcPath",
							"/html/registerfarmers/edit_farmer.jsp");

				} catch (Exception e) {
					SessionErrors.add(request, e.getClass().getName());

		                            PortalUtil.copyRequestParameters(request, response);

					response.setRenderParameter("mvcPath",
							"/html/registerfarmers/edit_farmer.jsp");
				}
	 }
	 
	 public void delField(ActionRequest request, ActionResponse response)
				throws PortalException, SystemException {

			long countFields = ParamUtil.getLong(request, "countFields");


				try {
					SessionMessages.add(request, "fieldDeleted");

                 PortalUtil.copyRequestParameters(request, response);
					
                 if (countFields > 1) {
					response.setRenderParameter("countFields",
							Long.toString(countFields - 1));
                 }
					
					response.setRenderParameter("mvcPath",
							"/html/registerfarmers/edit_farmer.jsp");

				} catch (Exception e) {
					SessionErrors.add(request, e.getClass().getName());

		                            PortalUtil.copyRequestParameters(request, response);

					response.setRenderParameter("mvcPath",
							"/html/registerfarmers/edit_farmer.jsp");
				}
	 }
	 
	
	
}
