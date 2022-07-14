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
import com.register.serviceRF.INNException;
import com.register.serviceRF.NameOrganizationException;
import com.register.serviceRF.model.Farmer;
import com.register.serviceRF.service.base.FarmerLocalServiceBaseImpl;


/**
 * The implementation of the farmer local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.register.serviceRF.service.FarmerLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.register.serviceRF.service.base.FarmerLocalServiceBaseImpl
 * @see com.register.serviceRF.service.FarmerLocalServiceUtil
 */
public class FarmerLocalServiceImpl extends FarmerLocalServiceBaseImpl {
	
	public Farmer addFarmer(long userId, String nameOrganization,
			String organizationalLegalForm, long INN, long KPP, long OGRN,
			String registrationArea, Date registrationDate,
			Boolean inArchive,
		    ServiceContext serviceContext) throws SystemException, PortalException {
		

		
		 long groupId = serviceContext.getScopeGroupId();

		 User user = userPersistence.findByPrimaryKey(userId);

		 Date now = new Date();

		 validate(nameOrganization, INN);
		 
		 

		 long farmerId = counterLocalService.increment();

		 Farmer farmer = farmerPersistence.create(farmerId);

		 farmer.setUuid(serviceContext.getUuid());
		 farmer.setUserId(userId);
		 farmer.setGroupId(groupId);
		 farmer.setCompanyId(user.getCompanyId());
		 farmer.setUserName(user.getFullName());
		 farmer.setNameOrganization(nameOrganization);
		 farmer.setOrganizationalLegalForm(organizationalLegalForm);
		 farmer.setINN(INN);
		 farmer.setRegistrationDate(registrationDate);
		 farmer.setKPP(KPP);
		 farmer.setOGRN(OGRN);
		 farmer.setRegistrationArea(registrationArea);
		 farmer.setInArchive(inArchive);
		 farmer.setCreateDate(serviceContext.getCreateDate(now));
		 farmer.setModifiedDate(serviceContext.getModifiedDate(now));
		 farmer.setExpandoBridgeAttributes(serviceContext);
		 

		 farmerPersistence.update(farmer);
		 

		 
		 resourceLocalService.addResources(user.getCompanyId(), groupId, userId,
					Farmer.class.getName(), farmerId, false, true, true);
		 

		 
		 Indexer indexer = IndexerRegistryUtil.nullSafeGetIndexer(
	                Farmer.class);

		 indexer.reindex(farmer);
		 

		 
		 

		 return farmer;
	}
	
	public Farmer deleteFarmer(long farmerId, ServiceContext serviceContext)
		    throws PortalException, SystemException {

		    Farmer farmer = getFarmer(farmerId);

		    resourceLocalService.deleteResource(
		        serviceContext.getCompanyId(), Farmer.class.getName(),
		        ResourceConstants.SCOPE_INDIVIDUAL, farmerId);

		    farmer = deleteFarmer(farmerId);
		    
	        Indexer indexer = IndexerRegistryUtil.nullSafeGetIndexer(
	                Farmer.class);

	        indexer.delete(farmer);

		        return farmer;
	}
	
	public List<Farmer> getFarmers(long groupId) throws SystemException {
		return farmerPersistence.findBygroupId(groupId);
	}
	
	public List<Farmer> getFarmers(long groupId, int start, int end) throws SystemException {
		return farmerPersistence.findBygroupId(groupId, start, end);
	}
	
	public int getFarmersCount(long goupeId) throws SystemException {
		return farmerPersistence.countBygroupId(goupeId);
	}
	
	public List<Farmer> getFarmers(long groupId, Boolean inArchive) throws SystemException {
		return  farmerPersistence.findByG_I(groupId, inArchive);
	}
	
	public List<Farmer> getFarmers(long groupId, Boolean inArchive, int start, int end) throws SystemException {
		return farmerPersistence.findByG_I(groupId, inArchive, start, end);
	}
	
	public int getFarmersCount(long goupeId, Boolean inArchive) throws SystemException {
		return farmerPersistence.countByG_I(goupeId, inArchive);
	}
	
	public int getFarmersCount(long goupeId, String registrationArea) throws SystemException {
		return farmerPersistence.countByG_R(goupeId, registrationArea);
	}
	
	public List<Farmer> getFarmers(long groupId, String registrationArea) throws SystemException {
		return  farmerPersistence.findByG_R(groupId, registrationArea);
	}
	
	
	public List<Farmer> findByDateRangeAndGroupId(long groupId, Date startDate, Date endDate) throws SystemException {
		return findByDateRangeAndGroupId(groupId, startDate, endDate);
	}
	
	
	protected void validate(String nameOrganization, long INN) throws PortalException{
		if (Validator.isNull(nameOrganization)) {
			throw new NameOrganizationException();
		}
		if (Validator.isNull(INN)) {
			throw new INNException();
		}
	}
	
	
	public boolean inDateRange (Date curDate, Date startDate, Date endDate){
		return !(curDate.before(startDate) || curDate.after(endDate)); 
	}
	
	
	public Farmer updateFarmer(
	        long userId, long farmerId, String nameOrganization,
			String organizationalLegalForm, long INN, long KPP, long OGRN,
			String registrationArea, Date registrationDate,
			Boolean inArchive, ServiceContext serviceContext)
	    throws PortalException, SystemException {

	    long groupId = serviceContext.getScopeGroupId();

	    User user = userPersistence.findByPrimaryKey(userId);

	    Date now = new Date();

	    validate(nameOrganization, INN);

	    Farmer farmer = getFarmer(farmerId);

	    farmer.setUserId(userId);
	    farmer.setUserName(user.getFullName());
		farmer.setNameOrganization(nameOrganization);
		farmer.setOrganizationalLegalForm(organizationalLegalForm);
		farmer.setINN(INN);
		farmer.setKPP(KPP);
		farmer.setOGRN(OGRN);
		farmer.setRegistrationDate(registrationDate);
		farmer.setRegistrationArea(registrationArea);
		farmer.setInArchive(inArchive);
	    farmer.setModifiedDate(serviceContext.getModifiedDate(now));
	    farmer.setExpandoBridgeAttributes(serviceContext);

	    farmerPersistence.update(farmer);

	    resourceLocalService.updateResources(
	        user.getCompanyId(), groupId, Farmer.class.getName(), farmerId,
	        serviceContext.getGroupPermissions(),
	        serviceContext.getGuestPermissions());
	    
	    Indexer indexer = IndexerRegistryUtil.nullSafeGetIndexer(
                Farmer.class);

	    indexer.reindex(farmer);
	    
		 

		return farmer;
	}
	
	
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.register.serviceRF.service.FarmerLocalServiceUtil} to access the farmer local service.
     */
}
