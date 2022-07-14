package com.register.serviceRF.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.register.serviceRF.model.AreaSownField;

import java.util.List;

/**
 * The persistence utility for the area sown field service. This utility wraps {@link AreaSownFieldPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AreaSownFieldPersistence
 * @see AreaSownFieldPersistenceImpl
 * @generated
 */
public class AreaSownFieldUtil {
    private static AreaSownFieldPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(AreaSownField areaSownField) {
        getPersistence().clearCache(areaSownField);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<AreaSownField> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<AreaSownField> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<AreaSownField> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static AreaSownField update(AreaSownField areaSownField)
        throws SystemException {
        return getPersistence().update(areaSownField);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static AreaSownField update(AreaSownField areaSownField,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(areaSownField, serviceContext);
    }

    /**
    * Returns all the area sown fields where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching area sown fields
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.AreaSownField> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid);
    }

    /**
    * Returns a range of all the area sown fields where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaSownFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of area sown fields
    * @param end the upper bound of the range of area sown fields (not inclusive)
    * @return the range of matching area sown fields
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.AreaSownField> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end);
    }

    /**
    * Returns an ordered range of all the area sown fields where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaSownFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of area sown fields
    * @param end the upper bound of the range of area sown fields (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching area sown fields
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.AreaSownField> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end, orderByComparator);
    }

    /**
    * Returns the first area sown field in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area sown field
    * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.AreaSownField findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaSownFieldException {
        return getPersistence().findByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the first area sown field in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area sown field, or <code>null</code> if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.AreaSownField fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the last area sown field in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area sown field
    * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.AreaSownField findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaSownFieldException {
        return getPersistence().findByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the last area sown field in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area sown field, or <code>null</code> if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.AreaSownField fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the area sown fields before and after the current area sown field in the ordered set where uuid = &#63;.
    *
    * @param areaSownFieldsId the primary key of the current area sown field
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next area sown field
    * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a area sown field with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.AreaSownField[] findByUuid_PrevAndNext(
        long areaSownFieldsId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaSownFieldException {
        return getPersistence()
                   .findByUuid_PrevAndNext(areaSownFieldsId, uuid,
            orderByComparator);
    }

    /**
    * Removes all the area sown fields where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid(uuid);
    }

    /**
    * Returns the number of area sown fields where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching area sown fields
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid(uuid);
    }

    /**
    * Returns the area sown field where uuid = &#63; and groupId = &#63; or throws a {@link com.register.serviceRF.NoSuchAreaSownFieldException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching area sown field
    * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.AreaSownField findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaSownFieldException {
        return getPersistence().findByUUID_G(uuid, groupId);
    }

    /**
    * Returns the area sown field where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching area sown field, or <code>null</code> if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.AreaSownField fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUUID_G(uuid, groupId);
    }

    /**
    * Returns the area sown field where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching area sown field, or <code>null</code> if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.AreaSownField fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
    }

    /**
    * Removes the area sown field where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the area sown field that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.AreaSownField removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaSownFieldException {
        return getPersistence().removeByUUID_G(uuid, groupId);
    }

    /**
    * Returns the number of area sown fields where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching area sown fields
    * @throws SystemException if a system exception occurred
    */
    public static int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUUID_G(uuid, groupId);
    }

    /**
    * Returns all the area sown fields where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching area sown fields
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.AreaSownField> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_C(uuid, companyId);
    }

    /**
    * Returns a range of all the area sown fields where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaSownFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of area sown fields
    * @param end the upper bound of the range of area sown fields (not inclusive)
    * @return the range of matching area sown fields
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.AreaSownField> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_C(uuid, companyId, start, end);
    }

    /**
    * Returns an ordered range of all the area sown fields where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaSownFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of area sown fields
    * @param end the upper bound of the range of area sown fields (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching area sown fields
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.AreaSownField> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
    }

    /**
    * Returns the first area sown field in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area sown field
    * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.AreaSownField findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaSownFieldException {
        return getPersistence()
                   .findByUuid_C_First(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the first area sown field in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area sown field, or <code>null</code> if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.AreaSownField fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the last area sown field in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area sown field
    * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.AreaSownField findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaSownFieldException {
        return getPersistence()
                   .findByUuid_C_Last(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the last area sown field in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area sown field, or <code>null</code> if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.AreaSownField fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the area sown fields before and after the current area sown field in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param areaSownFieldsId the primary key of the current area sown field
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next area sown field
    * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a area sown field with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.AreaSownField[] findByUuid_C_PrevAndNext(
        long areaSownFieldsId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaSownFieldException {
        return getPersistence()
                   .findByUuid_C_PrevAndNext(areaSownFieldsId, uuid, companyId,
            orderByComparator);
    }

    /**
    * Removes all the area sown fields where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid_C(uuid, companyId);
    }

    /**
    * Returns the number of area sown fields where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching area sown fields
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid_C(uuid, companyId);
    }

    /**
    * Returns all the area sown fields where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching area sown fields
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.AreaSownField> findBygroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBygroupId(groupId);
    }

    /**
    * Returns a range of all the area sown fields where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaSownFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of area sown fields
    * @param end the upper bound of the range of area sown fields (not inclusive)
    * @return the range of matching area sown fields
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.AreaSownField> findBygroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBygroupId(groupId, start, end);
    }

    /**
    * Returns an ordered range of all the area sown fields where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaSownFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of area sown fields
    * @param end the upper bound of the range of area sown fields (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching area sown fields
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.AreaSownField> findBygroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBygroupId(groupId, start, end, orderByComparator);
    }

    /**
    * Returns the first area sown field in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area sown field
    * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.AreaSownField findBygroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaSownFieldException {
        return getPersistence().findBygroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the first area sown field in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area sown field, or <code>null</code> if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.AreaSownField fetchBygroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBygroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the last area sown field in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area sown field
    * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.AreaSownField findBygroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaSownFieldException {
        return getPersistence().findBygroupId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the last area sown field in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area sown field, or <code>null</code> if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.AreaSownField fetchBygroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBygroupId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the area sown fields before and after the current area sown field in the ordered set where groupId = &#63;.
    *
    * @param areaSownFieldsId the primary key of the current area sown field
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next area sown field
    * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a area sown field with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.AreaSownField[] findBygroupId_PrevAndNext(
        long areaSownFieldsId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaSownFieldException {
        return getPersistence()
                   .findBygroupId_PrevAndNext(areaSownFieldsId, groupId,
            orderByComparator);
    }

    /**
    * Removes all the area sown fields where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeBygroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeBygroupId(groupId);
    }

    /**
    * Returns the number of area sown fields where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching area sown fields
    * @throws SystemException if a system exception occurred
    */
    public static int countBygroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countBygroupId(groupId);
    }

    /**
    * Returns all the area sown fields where groupId = &#63; and farmerId = &#63;.
    *
    * @param groupId the group ID
    * @param farmerId the farmer ID
    * @return the matching area sown fields
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.AreaSownField> findByG_F(
        long groupId, long farmerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_F(groupId, farmerId);
    }

    /**
    * Returns a range of all the area sown fields where groupId = &#63; and farmerId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaSownFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param farmerId the farmer ID
    * @param start the lower bound of the range of area sown fields
    * @param end the upper bound of the range of area sown fields (not inclusive)
    * @return the range of matching area sown fields
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.AreaSownField> findByG_F(
        long groupId, long farmerId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_F(groupId, farmerId, start, end);
    }

    /**
    * Returns an ordered range of all the area sown fields where groupId = &#63; and farmerId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaSownFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param farmerId the farmer ID
    * @param start the lower bound of the range of area sown fields
    * @param end the upper bound of the range of area sown fields (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching area sown fields
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.AreaSownField> findByG_F(
        long groupId, long farmerId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_F(groupId, farmerId, start, end, orderByComparator);
    }

    /**
    * Returns the first area sown field in the ordered set where groupId = &#63; and farmerId = &#63;.
    *
    * @param groupId the group ID
    * @param farmerId the farmer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area sown field
    * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.AreaSownField findByG_F_First(
        long groupId, long farmerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaSownFieldException {
        return getPersistence()
                   .findByG_F_First(groupId, farmerId, orderByComparator);
    }

    /**
    * Returns the first area sown field in the ordered set where groupId = &#63; and farmerId = &#63;.
    *
    * @param groupId the group ID
    * @param farmerId the farmer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area sown field, or <code>null</code> if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.AreaSownField fetchByG_F_First(
        long groupId, long farmerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_F_First(groupId, farmerId, orderByComparator);
    }

    /**
    * Returns the last area sown field in the ordered set where groupId = &#63; and farmerId = &#63;.
    *
    * @param groupId the group ID
    * @param farmerId the farmer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area sown field
    * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.AreaSownField findByG_F_Last(
        long groupId, long farmerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaSownFieldException {
        return getPersistence()
                   .findByG_F_Last(groupId, farmerId, orderByComparator);
    }

    /**
    * Returns the last area sown field in the ordered set where groupId = &#63; and farmerId = &#63;.
    *
    * @param groupId the group ID
    * @param farmerId the farmer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area sown field, or <code>null</code> if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.AreaSownField fetchByG_F_Last(
        long groupId, long farmerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_F_Last(groupId, farmerId, orderByComparator);
    }

    /**
    * Returns the area sown fields before and after the current area sown field in the ordered set where groupId = &#63; and farmerId = &#63;.
    *
    * @param areaSownFieldsId the primary key of the current area sown field
    * @param groupId the group ID
    * @param farmerId the farmer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next area sown field
    * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a area sown field with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.AreaSownField[] findByG_F_PrevAndNext(
        long areaSownFieldsId, long groupId, long farmerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaSownFieldException {
        return getPersistence()
                   .findByG_F_PrevAndNext(areaSownFieldsId, groupId, farmerId,
            orderByComparator);
    }

    /**
    * Removes all the area sown fields where groupId = &#63; and farmerId = &#63; from the database.
    *
    * @param groupId the group ID
    * @param farmerId the farmer ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByG_F(long groupId, long farmerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByG_F(groupId, farmerId);
    }

    /**
    * Returns the number of area sown fields where groupId = &#63; and farmerId = &#63;.
    *
    * @param groupId the group ID
    * @param farmerId the farmer ID
    * @return the number of matching area sown fields
    * @throws SystemException if a system exception occurred
    */
    public static int countByG_F(long groupId, long farmerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByG_F(groupId, farmerId);
    }

    /**
    * Caches the area sown field in the entity cache if it is enabled.
    *
    * @param areaSownField the area sown field
    */
    public static void cacheResult(
        com.register.serviceRF.model.AreaSownField areaSownField) {
        getPersistence().cacheResult(areaSownField);
    }

    /**
    * Caches the area sown fields in the entity cache if it is enabled.
    *
    * @param areaSownFields the area sown fields
    */
    public static void cacheResult(
        java.util.List<com.register.serviceRF.model.AreaSownField> areaSownFields) {
        getPersistence().cacheResult(areaSownFields);
    }

    /**
    * Creates a new area sown field with the primary key. Does not add the area sown field to the database.
    *
    * @param areaSownFieldsId the primary key for the new area sown field
    * @return the new area sown field
    */
    public static com.register.serviceRF.model.AreaSownField create(
        long areaSownFieldsId) {
        return getPersistence().create(areaSownFieldsId);
    }

    /**
    * Removes the area sown field with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param areaSownFieldsId the primary key of the area sown field
    * @return the area sown field that was removed
    * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a area sown field with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.AreaSownField remove(
        long areaSownFieldsId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaSownFieldException {
        return getPersistence().remove(areaSownFieldsId);
    }

    public static com.register.serviceRF.model.AreaSownField updateImpl(
        com.register.serviceRF.model.AreaSownField areaSownField)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(areaSownField);
    }

    /**
    * Returns the area sown field with the primary key or throws a {@link com.register.serviceRF.NoSuchAreaSownFieldException} if it could not be found.
    *
    * @param areaSownFieldsId the primary key of the area sown field
    * @return the area sown field
    * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a area sown field with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.AreaSownField findByPrimaryKey(
        long areaSownFieldsId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaSownFieldException {
        return getPersistence().findByPrimaryKey(areaSownFieldsId);
    }

    /**
    * Returns the area sown field with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param areaSownFieldsId the primary key of the area sown field
    * @return the area sown field, or <code>null</code> if a area sown field with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.AreaSownField fetchByPrimaryKey(
        long areaSownFieldsId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(areaSownFieldsId);
    }

    /**
    * Returns all the area sown fields.
    *
    * @return the area sown fields
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.AreaSownField> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.register.serviceRF.model.AreaSownField> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the area sown fields.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaSownFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of area sown fields
    * @param end the upper bound of the range of area sown fields (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of area sown fields
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.AreaSownField> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the area sown fields from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of area sown fields.
    *
    * @return the number of area sown fields
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static AreaSownFieldPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (AreaSownFieldPersistence) PortletBeanLocatorUtil.locate(com.register.serviceRF.service.ClpSerializer.getServletContextName(),
                    AreaSownFieldPersistence.class.getName());

            ReferenceRegistry.registerReference(AreaSownFieldUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(AreaSownFieldPersistence persistence) {
    }
}
