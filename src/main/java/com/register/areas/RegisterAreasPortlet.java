package com.register.areas;

import java.io.IOException;
import java.util.List;

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
import com.register.serviceRF.model.Area;
import com.register.serviceRF.service.AreaLocalServiceUtil;

/**
 * Portlet implementation class RegisterAreasPortlet
 */
public class RegisterAreasPortlet extends MVCPortlet {
	
	
	public void addArea(ActionRequest request, ActionResponse response)
	         throws PortalException, SystemException {


		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				Area.class.getName(), request);

		String title = ParamUtil.getString(request, "title");
		Boolean inArchive = ParamUtil.getBoolean(request, "inArchive");
		long areaId = ParamUtil.getLong(request, "areaId");

		if (areaId > 0) {

			try {

				AreaLocalServiceUtil.updateArea(serviceContext.getUserId(),
						areaId, title, inArchive,
						serviceContext);

				SessionMessages.add(request, "areaAdded");

				//response.setRenderParameter("areaId",
						//Long.toString(areaId));

			} catch (Exception e) {

				SessionErrors.add(request, e.getClass().getName());

	                            PortalUtil.copyRequestParameters(request, response);

				response.setRenderParameter("mvcPath",
						"/html/registerareas/edit_area.jsp");
			}

		}
	            else {

			try {
				AreaLocalServiceUtil.addArea(serviceContext.getUserId(),
						title, inArchive, serviceContext);

				SessionMessages.add(request, "areaAdded");

				//response.setRenderParameter("areaId",
						//Long.toString(areaId));

			} catch (Exception e) {
				SessionErrors.add(request, e.getClass().getName());

	                            PortalUtil.copyRequestParameters(request, response);

				response.setRenderParameter("mvcPath",
						"/html/registerareas/edit_area.jsp");
			}
		}

	 }
	
	public void deleteArea (ActionRequest request, ActionResponse response) {
		
		long areaId = ParamUtil.getLong(request, "areaId");
		
		try {

			ServiceContext serviceContext = ServiceContextFactory.getInstance(
				Area.class.getName(), request);

	        //response.setRenderParameter("areaId", Long.toString(areaId));

			AreaLocalServiceUtil.deleteArea(areaId, serviceContext);
			
		} catch (Exception e) {
			
			SessionErrors.add(request, e.getClass().getName());
		}
	}
	
	 @Override
	 public void render(RenderRequest renderRequest,
	         RenderResponse renderResponse) throws PortletException, IOException {

	     try {
	         ServiceContext serviceContext = ServiceContextFactory.getInstance(
	                 Area.class.getName(), renderRequest);

	         long groupId = serviceContext.getScopeGroupId();

	         long areaId = ParamUtil.getLong(renderRequest, "areaId");

	         List<Area> areas = AreaLocalServiceUtil
	                 .getAreas(groupId);

	         if (areas.size() == 0) {
	             Area area = AreaLocalServiceUtil.addArea(
	                     serviceContext.getUserId(), "Null", false, serviceContext);

	             areaId = area.getAreaId();

	         }

	         if (!(areaId > 0 )) {
	        	 areaId = areas.get(0).getAreaId();
	         }

	         renderRequest.setAttribute("areaId", areaId);

	     } catch (Exception e) {

	         throw new PortletException(e);
	     }

	     super.render(renderRequest, renderResponse);

	 }
	

}
