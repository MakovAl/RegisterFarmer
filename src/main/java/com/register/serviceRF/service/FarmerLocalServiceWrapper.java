package com.register.serviceRF.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FarmerLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FarmerLocalService
 * @generated
 */
public class FarmerLocalServiceWrapper implements FarmerLocalService,
    ServiceWrapper<FarmerLocalService> {
    private FarmerLocalService _farmerLocalService;

    public FarmerLocalServiceWrapper(FarmerLocalService farmerLocalService) {
        _farmerLocalService = farmerLocalService;
    }

    /**
    * Adds the farmer to the database. Also notifies the appropriate model listeners.
    *
    * @param farmer the farmer
    * @return the farmer that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.register.serviceRF.model.Farmer addFarmer(
        com.register.serviceRF.model.Farmer farmer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.addFarmer(farmer);
    }

    /**
    * Creates a new farmer with the primary key. Does not add the farmer to the database.
    *
    * @param farmerId the primary key for the new farmer
    * @return the new farmer
    */
    @Override
    public com.register.serviceRF.model.Farmer createFarmer(long farmerId) {
        return _farmerLocalService.createFarmer(farmerId);
    }

    /**
    * Deletes the farmer with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param farmerId the primary key of the farmer
    * @return the farmer that was removed
    * @throws PortalException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.register.serviceRF.model.Farmer deleteFarmer(long farmerId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.deleteFarmer(farmerId);
    }

    /**
    * Deletes the farmer from the database. Also notifies the appropriate model listeners.
    *
    * @param farmer the farmer
    * @return the farmer that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.register.serviceRF.model.Farmer deleteFarmer(
        com.register.serviceRF.model.Farmer farmer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.deleteFarmer(farmer);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _farmerLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.register.serviceRF.model.Farmer fetchFarmer(long farmerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.fetchFarmer(farmerId);
    }

    /**
    * Returns the farmer with the matching UUID and company.
    *
    * @param uuid the farmer's UUID
    * @param companyId the primary key of the company
    * @return the matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.register.serviceRF.model.Farmer fetchFarmerByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.fetchFarmerByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the farmer matching the UUID and group.
    *
    * @param uuid the farmer's UUID
    * @param groupId the primary key of the group
    * @return the matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.register.serviceRF.model.Farmer fetchFarmerByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.fetchFarmerByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns the farmer with the primary key.
    *
    * @param farmerId the primary key of the farmer
    * @return the farmer
    * @throws PortalException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.register.serviceRF.model.Farmer getFarmer(long farmerId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.getFarmer(farmerId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns the farmer with the matching UUID and company.
    *
    * @param uuid the farmer's UUID
    * @param companyId the primary key of the company
    * @return the matching farmer
    * @throws PortalException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.register.serviceRF.model.Farmer getFarmerByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.getFarmerByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the farmer matching the UUID and group.
    *
    * @param uuid the farmer's UUID
    * @param groupId the primary key of the group
    * @return the matching farmer
    * @throws PortalException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.register.serviceRF.model.Farmer getFarmerByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.getFarmerByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns a range of all the farmers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @return the range of farmers
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.register.serviceRF.model.Farmer> getFarmers(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.getFarmers(start, end);
    }

    /**
    * Returns the number of farmers.
    *
    * @return the number of farmers
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getFarmersCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.getFarmersCount();
    }

    /**
    * Updates the farmer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param farmer the farmer
    * @return the farmer that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.register.serviceRF.model.Farmer updateFarmer(
        com.register.serviceRF.model.Farmer farmer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.updateFarmer(farmer);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _farmerLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _farmerLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _farmerLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public com.register.serviceRF.model.Farmer addFarmer(long userId,
        java.lang.String nameOrganization,
        java.lang.String organizationalLegalForm, long INN, long KPP,
        long OGRN, java.lang.String registrationArea,
        java.util.Date registrationDate, java.lang.Boolean inArchive,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.addFarmer(userId, nameOrganization,
            organizationalLegalForm, INN, KPP, OGRN, registrationArea,
            registrationDate, inArchive, serviceContext);
    }

    @Override
    public com.register.serviceRF.model.Farmer deleteFarmer(long farmerId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.deleteFarmer(farmerId, serviceContext);
    }

    @Override
    public java.util.List<com.register.serviceRF.model.Farmer> getFarmers(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.getFarmers(groupId);
    }

    @Override
    public java.util.List<com.register.serviceRF.model.Farmer> getFarmers(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.getFarmers(groupId, start, end);
    }

    @Override
    public int getFarmersCount(long goupeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.getFarmersCount(goupeId);
    }

    @Override
    public java.util.List<com.register.serviceRF.model.Farmer> getFarmers(
        long groupId, java.lang.Boolean inArchive)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.getFarmers(groupId, inArchive);
    }

    @Override
    public java.util.List<com.register.serviceRF.model.Farmer> getFarmers(
        long groupId, java.lang.Boolean inArchive, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.getFarmers(groupId, inArchive, start, end);
    }

    @Override
    public int getFarmersCount(long goupeId, java.lang.Boolean inArchive)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.getFarmersCount(goupeId, inArchive);
    }

    @Override
    public int getFarmersCount(long goupeId, java.lang.String registrationArea)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.getFarmersCount(goupeId, registrationArea);
    }

    @Override
    public java.util.List<com.register.serviceRF.model.Farmer> getFarmers(
        long groupId, java.lang.String registrationArea)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.getFarmers(groupId, registrationArea);
    }

    @Override
    public java.util.List<com.register.serviceRF.model.Farmer> findByDateRangeAndGroupId(
        long groupId, java.util.Date startDate, java.util.Date endDate)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.findByDateRangeAndGroupId(groupId,
            startDate, endDate);
    }

    @Override
    public boolean inDateRange(java.util.Date curDate,
        java.util.Date startDate, java.util.Date endDate) {
        return _farmerLocalService.inDateRange(curDate, startDate, endDate);
    }

    @Override
    public com.register.serviceRF.model.Farmer updateFarmer(long userId,
        long farmerId, java.lang.String nameOrganization,
        java.lang.String organizationalLegalForm, long INN, long KPP,
        long OGRN, java.lang.String registrationArea,
        java.util.Date registrationDate, java.lang.Boolean inArchive,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _farmerLocalService.updateFarmer(userId, farmerId,
            nameOrganization, organizationalLegalForm, INN, KPP, OGRN,
            registrationArea, registrationDate, inArchive, serviceContext);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public FarmerLocalService getWrappedFarmerLocalService() {
        return _farmerLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedFarmerLocalService(
        FarmerLocalService farmerLocalService) {
        _farmerLocalService = farmerLocalService;
    }

    @Override
    public FarmerLocalService getWrappedService() {
        return _farmerLocalService;
    }

    @Override
    public void setWrappedService(FarmerLocalService farmerLocalService) {
        _farmerLocalService = farmerLocalService;
    }
}