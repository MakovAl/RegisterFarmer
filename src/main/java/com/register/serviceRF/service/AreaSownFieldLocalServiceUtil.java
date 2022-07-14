package com.register.serviceRF.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for AreaSownField. This utility wraps
 * {@link com.register.serviceRF.service.impl.AreaSownFieldLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AreaSownFieldLocalService
 * @see com.register.serviceRF.service.base.AreaSownFieldLocalServiceBaseImpl
 * @see com.register.serviceRF.service.impl.AreaSownFieldLocalServiceImpl
 * @generated
 */
public class AreaSownFieldLocalServiceUtil {
    private static AreaSownFieldLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.register.serviceRF.service.impl.AreaSownFieldLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the area sown field to the database. Also notifies the appropriate model listeners.
    *
    * @param areaSownField the area sown field
    * @return the area sown field that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.AreaSownField addAreaSownField(
        com.register.serviceRF.model.AreaSownField areaSownField)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addAreaSownField(areaSownField);
    }

    /**
    * Creates a new area sown field with the primary key. Does not add the area sown field to the database.
    *
    * @param areaSownFieldsId the primary key for the new area sown field
    * @return the new area sown field
    */
    public static com.register.serviceRF.model.AreaSownField createAreaSownField(
        long areaSownFieldsId) {
        return getService().createAreaSownField(areaSownFieldsId);
    }

    /**
    * Deletes the area sown field with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param areaSownFieldsId the primary key of the area sown field
    * @return the area sown field that was removed
    * @throws PortalException if a area sown field with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.AreaSownField deleteAreaSownField(
        long areaSownFieldsId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteAreaSownField(areaSownFieldsId);
    }

    /**
    * Deletes the area sown field from the database. Also notifies the appropriate model listeners.
    *
    * @param areaSownField the area sown field
    * @return the area sown field that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.AreaSownField deleteAreaSownField(
        com.register.serviceRF.model.AreaSownField areaSownField)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteAreaSownField(areaSownField);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaSownFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaSownFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.register.serviceRF.model.AreaSownField fetchAreaSownField(
        long areaSownFieldsId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchAreaSownField(areaSownFieldsId);
    }

    /**
    * Returns the area sown field with the matching UUID and company.
    *
    * @param uuid the area sown field's UUID
    * @param companyId the primary key of the company
    * @return the matching area sown field, or <code>null</code> if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.AreaSownField fetchAreaSownFieldByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchAreaSownFieldByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the area sown field matching the UUID and group.
    *
    * @param uuid the area sown field's UUID
    * @param groupId the primary key of the group
    * @return the matching area sown field, or <code>null</code> if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.AreaSownField fetchAreaSownFieldByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchAreaSownFieldByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns the area sown field with the primary key.
    *
    * @param areaSownFieldsId the primary key of the area sown field
    * @return the area sown field
    * @throws PortalException if a area sown field with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.AreaSownField getAreaSownField(
        long areaSownFieldsId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getAreaSownField(areaSownFieldsId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns the area sown field with the matching UUID and company.
    *
    * @param uuid the area sown field's UUID
    * @param companyId the primary key of the company
    * @return the matching area sown field
    * @throws PortalException if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.AreaSownField getAreaSownFieldByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getAreaSownFieldByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the area sown field matching the UUID and group.
    *
    * @param uuid the area sown field's UUID
    * @param groupId the primary key of the group
    * @return the matching area sown field
    * @throws PortalException if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.AreaSownField getAreaSownFieldByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getAreaSownFieldByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns a range of all the area sown fields.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaSownFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of area sown fields
    * @param end the upper bound of the range of area sown fields (not inclusive)
    * @return the range of area sown fields
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.AreaSownField> getAreaSownFields(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getAreaSownFields(start, end);
    }

    /**
    * Returns the number of area sown fields.
    *
    * @return the number of area sown fields
    * @throws SystemException if a system exception occurred
    */
    public static int getAreaSownFieldsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getAreaSownFieldsCount();
    }

    /**
    * Updates the area sown field in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param areaSownField the area sown field
    * @return the area sown field that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.AreaSownField updateAreaSownField(
        com.register.serviceRF.model.AreaSownField areaSownField)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateAreaSownField(areaSownField);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static java.util.List<com.register.serviceRF.model.AreaSownField> getAreaSownFields(
        long groupId, long farmerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getAreaSownFields(groupId, farmerId);
    }

    public static java.util.List<com.register.serviceRF.model.AreaSownField> getAreaSownFields(
        long groupId, long farmerId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getAreaSownFields(groupId, farmerId, start, end);
    }

    public static int getAreaSownFieldsCount(long goupeId, long farmerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getAreaSownFieldsCount(goupeId, farmerId);
    }

    public static com.register.serviceRF.model.AreaSownField addAreaSownField(
        long userId, long farmerId, long areaId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .addAreaSownField(userId, farmerId, areaId, serviceContext);
    }

    public static com.register.serviceRF.model.AreaSownField deleteAreaSownField(
        long areaSownFieldId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteAreaSownField(areaSownFieldId, serviceContext);
    }

    public static com.register.serviceRF.model.AreaSownField updateAreaSownField(
        long userId, long areaSownFieldId, long farmerId, long areaId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .updateAreaSownField(userId, areaSownFieldId, farmerId,
            areaId, serviceContext);
    }

    public static void clearService() {
        _service = null;
    }

    public static AreaSownFieldLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    AreaSownFieldLocalService.class.getName());

            if (invokableLocalService instanceof AreaSownFieldLocalService) {
                _service = (AreaSownFieldLocalService) invokableLocalService;
            } else {
                _service = new AreaSownFieldLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(AreaSownFieldLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(AreaSownFieldLocalService service) {
    }
}
