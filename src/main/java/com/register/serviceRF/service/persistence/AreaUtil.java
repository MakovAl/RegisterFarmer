package com.register.serviceRF.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.register.serviceRF.model.Area;

import java.util.List;

/**
 * The persistence utility for the area service. This utility wraps {@link AreaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AreaPersistence
 * @see AreaPersistenceImpl
 * @generated
 */
public class AreaUtil {
    private static AreaPersistence _persistence;

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
    public static void clearCache(Area area) {
        getPersistence().clearCache(area);
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
    public static List<Area> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Area> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Area> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Area update(Area area) throws SystemException {
        return getPersistence().update(area);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Area update(Area area, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(area, serviceContext);
    }

    /**
    * Returns all the areas where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching areas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.Area> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid);
    }

    /**
    * Returns a range of all the areas where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of areas
    * @param end the upper bound of the range of areas (not inclusive)
    * @return the range of matching areas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.Area> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end);
    }

    /**
    * Returns an ordered range of all the areas where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of areas
    * @param end the upper bound of the range of areas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching areas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.Area> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end, orderByComparator);
    }

    /**
    * Returns the first area in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area
    * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException {
        return getPersistence().findByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the first area in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area, or <code>null</code> if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the last area in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area
    * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException {
        return getPersistence().findByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the last area in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area, or <code>null</code> if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the areas before and after the current area in the ordered set where uuid = &#63;.
    *
    * @param areaId the primary key of the current area
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next area
    * @throws com.register.serviceRF.NoSuchAreaException if a area with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area[] findByUuid_PrevAndNext(
        long areaId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException {
        return getPersistence()
                   .findByUuid_PrevAndNext(areaId, uuid, orderByComparator);
    }

    /**
    * Removes all the areas where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid(uuid);
    }

    /**
    * Returns the number of areas where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching areas
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid(uuid);
    }

    /**
    * Returns the area where uuid = &#63; and groupId = &#63; or throws a {@link com.register.serviceRF.NoSuchAreaException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching area
    * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException {
        return getPersistence().findByUUID_G(uuid, groupId);
    }

    /**
    * Returns the area where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching area, or <code>null</code> if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUUID_G(uuid, groupId);
    }

    /**
    * Returns the area where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching area, or <code>null</code> if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
    }

    /**
    * Removes the area where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the area that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException {
        return getPersistence().removeByUUID_G(uuid, groupId);
    }

    /**
    * Returns the number of areas where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching areas
    * @throws SystemException if a system exception occurred
    */
    public static int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUUID_G(uuid, groupId);
    }

    /**
    * Returns all the areas where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching areas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.Area> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_C(uuid, companyId);
    }

    /**
    * Returns a range of all the areas where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of areas
    * @param end the upper bound of the range of areas (not inclusive)
    * @return the range of matching areas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.Area> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_C(uuid, companyId, start, end);
    }

    /**
    * Returns an ordered range of all the areas where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of areas
    * @param end the upper bound of the range of areas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching areas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.Area> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
    }

    /**
    * Returns the first area in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area
    * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException {
        return getPersistence()
                   .findByUuid_C_First(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the first area in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area, or <code>null</code> if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the last area in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area
    * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException {
        return getPersistence()
                   .findByUuid_C_Last(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the last area in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area, or <code>null</code> if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the areas before and after the current area in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param areaId the primary key of the current area
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next area
    * @throws com.register.serviceRF.NoSuchAreaException if a area with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area[] findByUuid_C_PrevAndNext(
        long areaId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException {
        return getPersistence()
                   .findByUuid_C_PrevAndNext(areaId, uuid, companyId,
            orderByComparator);
    }

    /**
    * Removes all the areas where uuid = &#63; and companyId = &#63; from the database.
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
    * Returns the number of areas where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching areas
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid_C(uuid, companyId);
    }

    /**
    * Returns all the areas where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching areas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.Area> findBygroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBygroupId(groupId);
    }

    /**
    * Returns a range of all the areas where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of areas
    * @param end the upper bound of the range of areas (not inclusive)
    * @return the range of matching areas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.Area> findBygroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBygroupId(groupId, start, end);
    }

    /**
    * Returns an ordered range of all the areas where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of areas
    * @param end the upper bound of the range of areas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching areas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.Area> findBygroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBygroupId(groupId, start, end, orderByComparator);
    }

    /**
    * Returns the first area in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area
    * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area findBygroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException {
        return getPersistence().findBygroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the first area in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area, or <code>null</code> if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area fetchBygroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBygroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the last area in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area
    * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area findBygroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException {
        return getPersistence().findBygroupId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the last area in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area, or <code>null</code> if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area fetchBygroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBygroupId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the areas before and after the current area in the ordered set where groupId = &#63;.
    *
    * @param areaId the primary key of the current area
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next area
    * @throws com.register.serviceRF.NoSuchAreaException if a area with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area[] findBygroupId_PrevAndNext(
        long areaId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException {
        return getPersistence()
                   .findBygroupId_PrevAndNext(areaId, groupId, orderByComparator);
    }

    /**
    * Removes all the areas where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeBygroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeBygroupId(groupId);
    }

    /**
    * Returns the number of areas where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching areas
    * @throws SystemException if a system exception occurred
    */
    public static int countBygroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countBygroupId(groupId);
    }

    /**
    * Returns all the areas where groupId = &#63; and inArchive = &#63;.
    *
    * @param groupId the group ID
    * @param inArchive the in archive
    * @return the matching areas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.Area> findByG_I(
        long groupId, boolean inArchive)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_I(groupId, inArchive);
    }

    /**
    * Returns a range of all the areas where groupId = &#63; and inArchive = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param inArchive the in archive
    * @param start the lower bound of the range of areas
    * @param end the upper bound of the range of areas (not inclusive)
    * @return the range of matching areas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.Area> findByG_I(
        long groupId, boolean inArchive, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_I(groupId, inArchive, start, end);
    }

    /**
    * Returns an ordered range of all the areas where groupId = &#63; and inArchive = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param inArchive the in archive
    * @param start the lower bound of the range of areas
    * @param end the upper bound of the range of areas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching areas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.Area> findByG_I(
        long groupId, boolean inArchive, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_I(groupId, inArchive, start, end, orderByComparator);
    }

    /**
    * Returns the first area in the ordered set where groupId = &#63; and inArchive = &#63;.
    *
    * @param groupId the group ID
    * @param inArchive the in archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area
    * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area findByG_I_First(
        long groupId, boolean inArchive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException {
        return getPersistence()
                   .findByG_I_First(groupId, inArchive, orderByComparator);
    }

    /**
    * Returns the first area in the ordered set where groupId = &#63; and inArchive = &#63;.
    *
    * @param groupId the group ID
    * @param inArchive the in archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area, or <code>null</code> if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area fetchByG_I_First(
        long groupId, boolean inArchive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_I_First(groupId, inArchive, orderByComparator);
    }

    /**
    * Returns the last area in the ordered set where groupId = &#63; and inArchive = &#63;.
    *
    * @param groupId the group ID
    * @param inArchive the in archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area
    * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area findByG_I_Last(
        long groupId, boolean inArchive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException {
        return getPersistence()
                   .findByG_I_Last(groupId, inArchive, orderByComparator);
    }

    /**
    * Returns the last area in the ordered set where groupId = &#63; and inArchive = &#63;.
    *
    * @param groupId the group ID
    * @param inArchive the in archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area, or <code>null</code> if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area fetchByG_I_Last(
        long groupId, boolean inArchive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_I_Last(groupId, inArchive, orderByComparator);
    }

    /**
    * Returns the areas before and after the current area in the ordered set where groupId = &#63; and inArchive = &#63;.
    *
    * @param areaId the primary key of the current area
    * @param groupId the group ID
    * @param inArchive the in archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next area
    * @throws com.register.serviceRF.NoSuchAreaException if a area with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area[] findByG_I_PrevAndNext(
        long areaId, long groupId, boolean inArchive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException {
        return getPersistence()
                   .findByG_I_PrevAndNext(areaId, groupId, inArchive,
            orderByComparator);
    }

    /**
    * Removes all the areas where groupId = &#63; and inArchive = &#63; from the database.
    *
    * @param groupId the group ID
    * @param inArchive the in archive
    * @throws SystemException if a system exception occurred
    */
    public static void removeByG_I(long groupId, boolean inArchive)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByG_I(groupId, inArchive);
    }

    /**
    * Returns the number of areas where groupId = &#63; and inArchive = &#63;.
    *
    * @param groupId the group ID
    * @param inArchive the in archive
    * @return the number of matching areas
    * @throws SystemException if a system exception occurred
    */
    public static int countByG_I(long groupId, boolean inArchive)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByG_I(groupId, inArchive);
    }

    /**
    * Returns all the areas where areaId = &#63; and inArchive = &#63;.
    *
    * @param areaId the area ID
    * @param inArchive the in archive
    * @return the matching areas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.Area> findByA_I(
        long areaId, boolean inArchive)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByA_I(areaId, inArchive);
    }

    /**
    * Returns a range of all the areas where areaId = &#63; and inArchive = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param areaId the area ID
    * @param inArchive the in archive
    * @param start the lower bound of the range of areas
    * @param end the upper bound of the range of areas (not inclusive)
    * @return the range of matching areas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.Area> findByA_I(
        long areaId, boolean inArchive, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByA_I(areaId, inArchive, start, end);
    }

    /**
    * Returns an ordered range of all the areas where areaId = &#63; and inArchive = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param areaId the area ID
    * @param inArchive the in archive
    * @param start the lower bound of the range of areas
    * @param end the upper bound of the range of areas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching areas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.Area> findByA_I(
        long areaId, boolean inArchive, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByA_I(areaId, inArchive, start, end, orderByComparator);
    }

    /**
    * Returns the first area in the ordered set where areaId = &#63; and inArchive = &#63;.
    *
    * @param areaId the area ID
    * @param inArchive the in archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area
    * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area findByA_I_First(
        long areaId, boolean inArchive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException {
        return getPersistence()
                   .findByA_I_First(areaId, inArchive, orderByComparator);
    }

    /**
    * Returns the first area in the ordered set where areaId = &#63; and inArchive = &#63;.
    *
    * @param areaId the area ID
    * @param inArchive the in archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area, or <code>null</code> if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area fetchByA_I_First(
        long areaId, boolean inArchive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByA_I_First(areaId, inArchive, orderByComparator);
    }

    /**
    * Returns the last area in the ordered set where areaId = &#63; and inArchive = &#63;.
    *
    * @param areaId the area ID
    * @param inArchive the in archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area
    * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area findByA_I_Last(
        long areaId, boolean inArchive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException {
        return getPersistence()
                   .findByA_I_Last(areaId, inArchive, orderByComparator);
    }

    /**
    * Returns the last area in the ordered set where areaId = &#63; and inArchive = &#63;.
    *
    * @param areaId the area ID
    * @param inArchive the in archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area, or <code>null</code> if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area fetchByA_I_Last(
        long areaId, boolean inArchive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByA_I_Last(areaId, inArchive, orderByComparator);
    }

    /**
    * Removes all the areas where areaId = &#63; and inArchive = &#63; from the database.
    *
    * @param areaId the area ID
    * @param inArchive the in archive
    * @throws SystemException if a system exception occurred
    */
    public static void removeByA_I(long areaId, boolean inArchive)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByA_I(areaId, inArchive);
    }

    /**
    * Returns the number of areas where areaId = &#63; and inArchive = &#63;.
    *
    * @param areaId the area ID
    * @param inArchive the in archive
    * @return the number of matching areas
    * @throws SystemException if a system exception occurred
    */
    public static int countByA_I(long areaId, boolean inArchive)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByA_I(areaId, inArchive);
    }

    /**
    * Returns all the areas where groupId = &#63; and title = &#63;.
    *
    * @param groupId the group ID
    * @param title the title
    * @return the matching areas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.Area> findByG_T(
        long groupId, java.lang.String title)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_T(groupId, title);
    }

    /**
    * Returns a range of all the areas where groupId = &#63; and title = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param title the title
    * @param start the lower bound of the range of areas
    * @param end the upper bound of the range of areas (not inclusive)
    * @return the range of matching areas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.Area> findByG_T(
        long groupId, java.lang.String title, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_T(groupId, title, start, end);
    }

    /**
    * Returns an ordered range of all the areas where groupId = &#63; and title = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param title the title
    * @param start the lower bound of the range of areas
    * @param end the upper bound of the range of areas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching areas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.Area> findByG_T(
        long groupId, java.lang.String title, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_T(groupId, title, start, end, orderByComparator);
    }

    /**
    * Returns the first area in the ordered set where groupId = &#63; and title = &#63;.
    *
    * @param groupId the group ID
    * @param title the title
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area
    * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area findByG_T_First(
        long groupId, java.lang.String title,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException {
        return getPersistence()
                   .findByG_T_First(groupId, title, orderByComparator);
    }

    /**
    * Returns the first area in the ordered set where groupId = &#63; and title = &#63;.
    *
    * @param groupId the group ID
    * @param title the title
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area, or <code>null</code> if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area fetchByG_T_First(
        long groupId, java.lang.String title,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_T_First(groupId, title, orderByComparator);
    }

    /**
    * Returns the last area in the ordered set where groupId = &#63; and title = &#63;.
    *
    * @param groupId the group ID
    * @param title the title
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area
    * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area findByG_T_Last(
        long groupId, java.lang.String title,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException {
        return getPersistence().findByG_T_Last(groupId, title, orderByComparator);
    }

    /**
    * Returns the last area in the ordered set where groupId = &#63; and title = &#63;.
    *
    * @param groupId the group ID
    * @param title the title
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area, or <code>null</code> if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area fetchByG_T_Last(
        long groupId, java.lang.String title,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_T_Last(groupId, title, orderByComparator);
    }

    /**
    * Returns the areas before and after the current area in the ordered set where groupId = &#63; and title = &#63;.
    *
    * @param areaId the primary key of the current area
    * @param groupId the group ID
    * @param title the title
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next area
    * @throws com.register.serviceRF.NoSuchAreaException if a area with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area[] findByG_T_PrevAndNext(
        long areaId, long groupId, java.lang.String title,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException {
        return getPersistence()
                   .findByG_T_PrevAndNext(areaId, groupId, title,
            orderByComparator);
    }

    /**
    * Removes all the areas where groupId = &#63; and title = &#63; from the database.
    *
    * @param groupId the group ID
    * @param title the title
    * @throws SystemException if a system exception occurred
    */
    public static void removeByG_T(long groupId, java.lang.String title)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByG_T(groupId, title);
    }

    /**
    * Returns the number of areas where groupId = &#63; and title = &#63;.
    *
    * @param groupId the group ID
    * @param title the title
    * @return the number of matching areas
    * @throws SystemException if a system exception occurred
    */
    public static int countByG_T(long groupId, java.lang.String title)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByG_T(groupId, title);
    }

    /**
    * Returns all the areas where title = &#63;.
    *
    * @param title the title
    * @return the matching areas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.Area> findBytitle(
        java.lang.String title)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBytitle(title);
    }

    /**
    * Returns a range of all the areas where title = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param title the title
    * @param start the lower bound of the range of areas
    * @param end the upper bound of the range of areas (not inclusive)
    * @return the range of matching areas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.Area> findBytitle(
        java.lang.String title, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBytitle(title, start, end);
    }

    /**
    * Returns an ordered range of all the areas where title = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param title the title
    * @param start the lower bound of the range of areas
    * @param end the upper bound of the range of areas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching areas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.Area> findBytitle(
        java.lang.String title, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBytitle(title, start, end, orderByComparator);
    }

    /**
    * Returns the first area in the ordered set where title = &#63;.
    *
    * @param title the title
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area
    * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area findBytitle_First(
        java.lang.String title,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException {
        return getPersistence().findBytitle_First(title, orderByComparator);
    }

    /**
    * Returns the first area in the ordered set where title = &#63;.
    *
    * @param title the title
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area, or <code>null</code> if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area fetchBytitle_First(
        java.lang.String title,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBytitle_First(title, orderByComparator);
    }

    /**
    * Returns the last area in the ordered set where title = &#63;.
    *
    * @param title the title
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area
    * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area findBytitle_Last(
        java.lang.String title,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException {
        return getPersistence().findBytitle_Last(title, orderByComparator);
    }

    /**
    * Returns the last area in the ordered set where title = &#63;.
    *
    * @param title the title
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area, or <code>null</code> if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area fetchBytitle_Last(
        java.lang.String title,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBytitle_Last(title, orderByComparator);
    }

    /**
    * Returns the areas before and after the current area in the ordered set where title = &#63;.
    *
    * @param areaId the primary key of the current area
    * @param title the title
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next area
    * @throws com.register.serviceRF.NoSuchAreaException if a area with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area[] findBytitle_PrevAndNext(
        long areaId, java.lang.String title,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException {
        return getPersistence()
                   .findBytitle_PrevAndNext(areaId, title, orderByComparator);
    }

    /**
    * Removes all the areas where title = &#63; from the database.
    *
    * @param title the title
    * @throws SystemException if a system exception occurred
    */
    public static void removeBytitle(java.lang.String title)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeBytitle(title);
    }

    /**
    * Returns the number of areas where title = &#63;.
    *
    * @param title the title
    * @return the number of matching areas
    * @throws SystemException if a system exception occurred
    */
    public static int countBytitle(java.lang.String title)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countBytitle(title);
    }

    /**
    * Caches the area in the entity cache if it is enabled.
    *
    * @param area the area
    */
    public static void cacheResult(com.register.serviceRF.model.Area area) {
        getPersistence().cacheResult(area);
    }

    /**
    * Caches the areas in the entity cache if it is enabled.
    *
    * @param areas the areas
    */
    public static void cacheResult(
        java.util.List<com.register.serviceRF.model.Area> areas) {
        getPersistence().cacheResult(areas);
    }

    /**
    * Creates a new area with the primary key. Does not add the area to the database.
    *
    * @param areaId the primary key for the new area
    * @return the new area
    */
    public static com.register.serviceRF.model.Area create(long areaId) {
        return getPersistence().create(areaId);
    }

    /**
    * Removes the area with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param areaId the primary key of the area
    * @return the area that was removed
    * @throws com.register.serviceRF.NoSuchAreaException if a area with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area remove(long areaId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException {
        return getPersistence().remove(areaId);
    }

    public static com.register.serviceRF.model.Area updateImpl(
        com.register.serviceRF.model.Area area)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(area);
    }

    /**
    * Returns the area with the primary key or throws a {@link com.register.serviceRF.NoSuchAreaException} if it could not be found.
    *
    * @param areaId the primary key of the area
    * @return the area
    * @throws com.register.serviceRF.NoSuchAreaException if a area with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area findByPrimaryKey(
        long areaId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException {
        return getPersistence().findByPrimaryKey(areaId);
    }

    /**
    * Returns the area with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param areaId the primary key of the area
    * @return the area, or <code>null</code> if a area with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.register.serviceRF.model.Area fetchByPrimaryKey(
        long areaId) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(areaId);
    }

    /**
    * Returns all the areas.
    *
    * @return the areas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.Area> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the areas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of areas
    * @param end the upper bound of the range of areas (not inclusive)
    * @return the range of areas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.Area> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the areas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of areas
    * @param end the upper bound of the range of areas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of areas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.register.serviceRF.model.Area> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the areas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of areas.
    *
    * @return the number of areas
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static AreaPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (AreaPersistence) PortletBeanLocatorUtil.locate(com.register.serviceRF.service.ClpSerializer.getServletContextName(),
                    AreaPersistence.class.getName());

            ReferenceRegistry.registerReference(AreaUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(AreaPersistence persistence) {
    }
}
