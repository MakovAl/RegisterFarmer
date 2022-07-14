package com.register.serviceRF.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.register.serviceRF.model.Area;

/**
 * The persistence interface for the area service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AreaPersistenceImpl
 * @see AreaUtil
 * @generated
 */
public interface AreaPersistence extends BasePersistence<Area> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link AreaUtil} to access the area persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the areas where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching areas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.register.serviceRF.model.Area> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.register.serviceRF.model.Area> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.register.serviceRF.model.Area> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first area in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area
    * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Area findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException;

    /**
    * Returns the first area in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area, or <code>null</code> if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Area fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last area in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area
    * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Area findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException;

    /**
    * Returns the last area in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area, or <code>null</code> if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Area fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.register.serviceRF.model.Area[] findByUuid_PrevAndNext(
        long areaId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException;

    /**
    * Removes all the areas where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of areas where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching areas
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the area where uuid = &#63; and groupId = &#63; or throws a {@link com.register.serviceRF.NoSuchAreaException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching area
    * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Area findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException;

    /**
    * Returns the area where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching area, or <code>null</code> if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Area fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the area where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching area, or <code>null</code> if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Area fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the area where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the area that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Area removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException;

    /**
    * Returns the number of areas where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching areas
    * @throws SystemException if a system exception occurred
    */
    public int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the areas where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching areas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.register.serviceRF.model.Area> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.register.serviceRF.model.Area> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.register.serviceRF.model.Area> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.register.serviceRF.model.Area findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException;

    /**
    * Returns the first area in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area, or <code>null</code> if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Area fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.register.serviceRF.model.Area findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException;

    /**
    * Returns the last area in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area, or <code>null</code> if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Area fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.register.serviceRF.model.Area[] findByUuid_C_PrevAndNext(
        long areaId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException;

    /**
    * Removes all the areas where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of areas where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching areas
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the areas where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching areas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.register.serviceRF.model.Area> findBygroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.register.serviceRF.model.Area> findBygroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.register.serviceRF.model.Area> findBygroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first area in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area
    * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Area findBygroupId_First(long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException;

    /**
    * Returns the first area in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area, or <code>null</code> if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Area fetchBygroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last area in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area
    * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Area findBygroupId_Last(long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException;

    /**
    * Returns the last area in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area, or <code>null</code> if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Area fetchBygroupId_Last(long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.register.serviceRF.model.Area[] findBygroupId_PrevAndNext(
        long areaId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException;

    /**
    * Removes all the areas where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public void removeBygroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of areas where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching areas
    * @throws SystemException if a system exception occurred
    */
    public int countBygroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the areas where groupId = &#63; and inArchive = &#63;.
    *
    * @param groupId the group ID
    * @param inArchive the in archive
    * @return the matching areas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.register.serviceRF.model.Area> findByG_I(
        long groupId, boolean inArchive)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.register.serviceRF.model.Area> findByG_I(
        long groupId, boolean inArchive, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.register.serviceRF.model.Area> findByG_I(
        long groupId, boolean inArchive, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.register.serviceRF.model.Area findByG_I_First(long groupId,
        boolean inArchive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException;

    /**
    * Returns the first area in the ordered set where groupId = &#63; and inArchive = &#63;.
    *
    * @param groupId the group ID
    * @param inArchive the in archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area, or <code>null</code> if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Area fetchByG_I_First(long groupId,
        boolean inArchive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.register.serviceRF.model.Area findByG_I_Last(long groupId,
        boolean inArchive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException;

    /**
    * Returns the last area in the ordered set where groupId = &#63; and inArchive = &#63;.
    *
    * @param groupId the group ID
    * @param inArchive the in archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area, or <code>null</code> if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Area fetchByG_I_Last(long groupId,
        boolean inArchive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.register.serviceRF.model.Area[] findByG_I_PrevAndNext(
        long areaId, long groupId, boolean inArchive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException;

    /**
    * Removes all the areas where groupId = &#63; and inArchive = &#63; from the database.
    *
    * @param groupId the group ID
    * @param inArchive the in archive
    * @throws SystemException if a system exception occurred
    */
    public void removeByG_I(long groupId, boolean inArchive)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of areas where groupId = &#63; and inArchive = &#63;.
    *
    * @param groupId the group ID
    * @param inArchive the in archive
    * @return the number of matching areas
    * @throws SystemException if a system exception occurred
    */
    public int countByG_I(long groupId, boolean inArchive)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the areas where areaId = &#63; and inArchive = &#63;.
    *
    * @param areaId the area ID
    * @param inArchive the in archive
    * @return the matching areas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.register.serviceRF.model.Area> findByA_I(
        long areaId, boolean inArchive)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.register.serviceRF.model.Area> findByA_I(
        long areaId, boolean inArchive, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.register.serviceRF.model.Area> findByA_I(
        long areaId, boolean inArchive, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.register.serviceRF.model.Area findByA_I_First(long areaId,
        boolean inArchive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException;

    /**
    * Returns the first area in the ordered set where areaId = &#63; and inArchive = &#63;.
    *
    * @param areaId the area ID
    * @param inArchive the in archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area, or <code>null</code> if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Area fetchByA_I_First(long areaId,
        boolean inArchive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.register.serviceRF.model.Area findByA_I_Last(long areaId,
        boolean inArchive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException;

    /**
    * Returns the last area in the ordered set where areaId = &#63; and inArchive = &#63;.
    *
    * @param areaId the area ID
    * @param inArchive the in archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area, or <code>null</code> if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Area fetchByA_I_Last(long areaId,
        boolean inArchive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the areas where areaId = &#63; and inArchive = &#63; from the database.
    *
    * @param areaId the area ID
    * @param inArchive the in archive
    * @throws SystemException if a system exception occurred
    */
    public void removeByA_I(long areaId, boolean inArchive)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of areas where areaId = &#63; and inArchive = &#63;.
    *
    * @param areaId the area ID
    * @param inArchive the in archive
    * @return the number of matching areas
    * @throws SystemException if a system exception occurred
    */
    public int countByA_I(long areaId, boolean inArchive)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the areas where groupId = &#63; and title = &#63;.
    *
    * @param groupId the group ID
    * @param title the title
    * @return the matching areas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.register.serviceRF.model.Area> findByG_T(
        long groupId, java.lang.String title)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.register.serviceRF.model.Area> findByG_T(
        long groupId, java.lang.String title, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.register.serviceRF.model.Area> findByG_T(
        long groupId, java.lang.String title, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.register.serviceRF.model.Area findByG_T_First(long groupId,
        java.lang.String title,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException;

    /**
    * Returns the first area in the ordered set where groupId = &#63; and title = &#63;.
    *
    * @param groupId the group ID
    * @param title the title
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area, or <code>null</code> if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Area fetchByG_T_First(long groupId,
        java.lang.String title,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.register.serviceRF.model.Area findByG_T_Last(long groupId,
        java.lang.String title,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException;

    /**
    * Returns the last area in the ordered set where groupId = &#63; and title = &#63;.
    *
    * @param groupId the group ID
    * @param title the title
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area, or <code>null</code> if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Area fetchByG_T_Last(long groupId,
        java.lang.String title,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.register.serviceRF.model.Area[] findByG_T_PrevAndNext(
        long areaId, long groupId, java.lang.String title,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException;

    /**
    * Removes all the areas where groupId = &#63; and title = &#63; from the database.
    *
    * @param groupId the group ID
    * @param title the title
    * @throws SystemException if a system exception occurred
    */
    public void removeByG_T(long groupId, java.lang.String title)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of areas where groupId = &#63; and title = &#63;.
    *
    * @param groupId the group ID
    * @param title the title
    * @return the number of matching areas
    * @throws SystemException if a system exception occurred
    */
    public int countByG_T(long groupId, java.lang.String title)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the areas where title = &#63;.
    *
    * @param title the title
    * @return the matching areas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.register.serviceRF.model.Area> findBytitle(
        java.lang.String title)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.register.serviceRF.model.Area> findBytitle(
        java.lang.String title, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.register.serviceRF.model.Area> findBytitle(
        java.lang.String title, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first area in the ordered set where title = &#63;.
    *
    * @param title the title
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area
    * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Area findBytitle_First(
        java.lang.String title,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException;

    /**
    * Returns the first area in the ordered set where title = &#63;.
    *
    * @param title the title
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area, or <code>null</code> if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Area fetchBytitle_First(
        java.lang.String title,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last area in the ordered set where title = &#63;.
    *
    * @param title the title
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area
    * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Area findBytitle_Last(
        java.lang.String title,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException;

    /**
    * Returns the last area in the ordered set where title = &#63;.
    *
    * @param title the title
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area, or <code>null</code> if a matching area could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Area fetchBytitle_Last(
        java.lang.String title,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.register.serviceRF.model.Area[] findBytitle_PrevAndNext(
        long areaId, java.lang.String title,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException;

    /**
    * Removes all the areas where title = &#63; from the database.
    *
    * @param title the title
    * @throws SystemException if a system exception occurred
    */
    public void removeBytitle(java.lang.String title)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of areas where title = &#63;.
    *
    * @param title the title
    * @return the number of matching areas
    * @throws SystemException if a system exception occurred
    */
    public int countBytitle(java.lang.String title)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the area in the entity cache if it is enabled.
    *
    * @param area the area
    */
    public void cacheResult(com.register.serviceRF.model.Area area);

    /**
    * Caches the areas in the entity cache if it is enabled.
    *
    * @param areas the areas
    */
    public void cacheResult(
        java.util.List<com.register.serviceRF.model.Area> areas);

    /**
    * Creates a new area with the primary key. Does not add the area to the database.
    *
    * @param areaId the primary key for the new area
    * @return the new area
    */
    public com.register.serviceRF.model.Area create(long areaId);

    /**
    * Removes the area with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param areaId the primary key of the area
    * @return the area that was removed
    * @throws com.register.serviceRF.NoSuchAreaException if a area with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Area remove(long areaId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException;

    public com.register.serviceRF.model.Area updateImpl(
        com.register.serviceRF.model.Area area)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the area with the primary key or throws a {@link com.register.serviceRF.NoSuchAreaException} if it could not be found.
    *
    * @param areaId the primary key of the area
    * @return the area
    * @throws com.register.serviceRF.NoSuchAreaException if a area with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Area findByPrimaryKey(long areaId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaException;

    /**
    * Returns the area with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param areaId the primary key of the area
    * @return the area, or <code>null</code> if a area with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Area fetchByPrimaryKey(long areaId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the areas.
    *
    * @return the areas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.register.serviceRF.model.Area> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.register.serviceRF.model.Area> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.register.serviceRF.model.Area> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the areas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of areas.
    *
    * @return the number of areas
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
