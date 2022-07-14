package com.register.serviceRF.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.asset.model.AssetEntry;
import com.liferay.portlet.asset.model.AssetLinkConstants;
import com.register.serviceRF.model.AreaSownField;
import com.register.serviceRF.service.base.AreaSownFieldLocalServiceBaseImpl;

/**
 * The implementation of the area sown field local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.register.serviceRF.service.AreaSownFieldLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.register.serviceRF.service.base.AreaSownFieldLocalServiceBaseImpl
 * @see com.register.serviceRF.service.AreaSownFieldLocalServiceUtil
 */
public class AreaSownFieldLocalServiceImpl
    extends AreaSownFieldLocalServiceBaseImpl {
	
	
	public List<AreaSownField> getAreaSownFields(long groupId, long farmerId) throws SystemException {

	    return areaSownFieldPersistence.findByG_F(groupId, farmerId);
	}

	public List<AreaSownField> getAreaSownFields(long groupId, long farmerId, int start, int end)
	     throws SystemException {

	    return areaSownFieldPersistence.findByG_F(groupId, farmerId, start, end);
	}
	
	
	public int getAreaSownFieldsCount(long goupeId, long farmerId) throws SystemException {
		return areaSownFieldPersistence.countByG_F(goupeId, farmerId);
	}
	
	public AreaSownField addAreaSownField(long userId, long farmerId, long areaId,
			ServiceContext serviceContext) throws PortalException, SystemException {
    
	long groupId = serviceContext.getScopeGroupId();
    
    User user = userPersistence.findByPrimaryKey(userId);
    
    Date now = new Date();
    
    long areaSownFieldId = counterLocalService.increment();
    
    AreaSownField areaSownField = areaSownFieldPersistence.create(areaSownFieldId);
    
    areaSownField.setUuid(serviceContext.getUuid());
    areaSownField.setUserId(userId);
    areaSownField.setGroupId(groupId);
    areaSownField.setCompanyId(user.getCompanyId());
    areaSownField.setUserName(user.getFullName());
    areaSownField.setCreateDate(serviceContext.getCreateDate(now));
    areaSownField.setModifiedDate(serviceContext.getModifiedDate(now));
    areaSownField.setExpandoBridgeAttributes(serviceContext);
    areaSownField.setFarmerId(farmerId);
    areaSownField.setAreaId(areaId);
    
	System.out.println("Sown field done");

    areaSownFieldPersistence.update(areaSownField);
	System.out.println("Sown update done");
    
    return areaSownField;
}
	
	public AreaSownField deleteAreaSownField(long areaSownFieldId, ServiceContext serviceContext)
            throws PortalException, SystemException {

	AreaSownField areaSownField = getAreaSownField(areaSownFieldId);

    
    areaSownField = deleteAreaSownField(areaSownFieldId);

    return areaSownField;
}
	
	
	public AreaSownField updateAreaSownField(long userId, long areaSownFieldId, long farmerId, long areaId,
			ServiceContext serviceContext) throws PortalException,
            SystemException {
		
    long groupId = serviceContext.getScopeGroupId();

    User user = userPersistence.findByPrimaryKey(userId);

    Date now = new Date();


    AreaSownField areaSownField = getAreaSownField(areaSownFieldId);

    areaSownField.setUserId(userId);
    areaSownField.setUserName(user.getFullName());
    areaSownField.setFarmerId(farmerId);
    areaSownField.setAreaId(areaId);
    areaSownField.setModifiedDate(serviceContext.getModifiedDate(now));
    areaSownField.setExpandoBridgeAttributes(serviceContext);

    areaSownFieldPersistence.update(areaSownField);



    return areaSownField;
	}
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.register.serviceRF.service.AreaSownFieldLocalServiceUtil} to access the area sown field local service.
     */
}
