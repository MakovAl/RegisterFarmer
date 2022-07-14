package com.register.serviceRF.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.register.serviceRF.TitleException;
import com.register.serviceRF.model.Area;
import com.register.serviceRF.service.base.AreaLocalServiceBaseImpl;

/**
 * The implementation of the area local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.register.serviceRF.service.AreaLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.register.serviceRF.service.base.AreaLocalServiceBaseImpl
 * @see com.register.serviceRF.service.AreaLocalServiceUtil
 */
public class AreaLocalServiceImpl extends AreaLocalServiceBaseImpl {

	public Area addArea(long userId, String title, boolean inArchive,
		    ServiceContext serviceContext) throws SystemException, PortalException {
		 long groupId = serviceContext.getScopeGroupId();

		 User user = userPersistence.findByPrimaryKey(userId);

		 Date now = new Date();

		 validate(title);
		 

		 long areaId = counterLocalService.increment();

		 Area area = areaPersistence.create(areaId);

		 area.setUuid(serviceContext.getUuid());
		 area.setUserId(userId);
		 area.setGroupId(groupId);
		 area.setCompanyId(user.getCompanyId());
		 area.setUserName(user.getFullName());
		 area.setCreateDate(serviceContext.getCreateDate(now));
		 area.setModifiedDate(serviceContext.getModifiedDate(now));
		 area.setTitle(title);
		 area.setInArchive(inArchive);
		 area.setExpandoBridgeAttributes(serviceContext);

		 areaPersistence.update(area);
		 
		 resourceLocalService.addResources(user.getCompanyId(), groupId, userId,
					Area.class.getName(), areaId, false, true, true);
		 
		 Indexer indexer = IndexerRegistryUtil.nullSafeGetIndexer(
	                Area.class);

		 indexer.reindex(area);
		 

		 return area;
	}
	
	public Area deleteArea(long areaId, ServiceContext serviceContext)
		    throws PortalException, SystemException {

		    Area area = getArea(areaId);

		    resourceLocalService.deleteResource(
		        serviceContext.getCompanyId(), Area.class.getName(),
		        ResourceConstants.SCOPE_INDIVIDUAL, areaId);

		        area = deleteArea(areaId);
		        
		        
		        Indexer indexer = IndexerRegistryUtil.nullSafeGetIndexer(
		                Area.class);

		        indexer.delete(area);

		        return area;
	}
	
	public List<Area> getAreas(long groupId) throws SystemException {
		return areaPersistence.findBygroupId(groupId);
	}
	
	public List<Area> getAreas(long groupId, int start, int end) throws SystemException {
		return areaPersistence.findBygroupId(groupId, start, end);
	}
	
	public List<Area> getAreas(long groupId, Boolean inArchive) throws SystemException {
		return  areaPersistence.findByG_I(groupId, inArchive);
	}
	
	public List<Area> getAreas(long groupId, Boolean inArchive, int start, int end) throws SystemException {
		return areaPersistence.findByG_I(groupId, inArchive, start, end);
	}
	
	public Area getArea(long areaId, Boolean inArchive) throws SystemException {
		return areaPersistence.findByA_I(areaId, inArchive).get(0);
	}

	public List<Area> getAreas(long groupId, String title) throws SystemException{
		return areaPersistence.findByG_T(groupId, title);
	}
	public List<Area> getAreas(String title) throws SystemException{
		return areaPersistence.findBytitle(title);
	}
	
	public int getAreasCount(long goupeId) throws SystemException {
		return areaPersistence.countBygroupId(goupeId);
	}
	
	public int getAreasCount(long goupeId, Boolean inArchive) throws SystemException {
		return areaPersistence.countByG_I(goupeId, inArchive);
	}
	
	
	protected void validate(String title) throws PortalException{
		if (Validator.isNull(title)) {
			throw new TitleException();
		}
	}
	
	public Area updateArea(
	        long userId, long areaId, String title,
	        Boolean inArchive, ServiceContext serviceContext)
	    throws PortalException, SystemException {

	    long groupId = serviceContext.getScopeGroupId();

	    User user = userPersistence.findByPrimaryKey(userId);

	    Date now = new Date();

	    validate(title);

	    Area area = getArea(areaId);

	    area.setUserId(userId);
	    area.setUserName(user.getFullName());
	    area.setTitle(title);
	    area.setInArchive(inArchive);
	    area.setModifiedDate(serviceContext.getModifiedDate(now));
	    area.setExpandoBridgeAttributes(serviceContext);

	    areaPersistence.update(area);

	    resourceLocalService.updateResources(
	        user.getCompanyId(), groupId, Area.class.getName(), areaId,
	        serviceContext.getGroupPermissions(),
	        serviceContext.getGuestPermissions());
	    
	    Indexer indexer = IndexerRegistryUtil.nullSafeGetIndexer(
                Area.class);

	    indexer.reindex(area);

		return area;
	}
	
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.register.serviceRF.service.AreaLocalServiceUtil} to access the area local service.
     */
}
