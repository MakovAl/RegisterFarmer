package com.register.serviceRF.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.register.serviceRF.model.Farmer;

/**
 * The persistence interface for the farmer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerPersistenceImpl
 * @see FarmerUtil
 * @generated
 */
public interface FarmerPersistence extends BasePersistence<Farmer> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link FarmerUtil} to access the farmer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the farmers where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.register.serviceRF.model.Farmer> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the farmers where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @return the range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.register.serviceRF.model.Farmer> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the farmers where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.register.serviceRF.model.Farmer> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first farmer in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer
    * @throws com.register.serviceRF.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Farmer findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchFarmerException;

    /**
    * Returns the first farmer in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Farmer fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last farmer in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer
    * @throws com.register.serviceRF.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Farmer findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchFarmerException;

    /**
    * Returns the last farmer in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Farmer fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the farmers before and after the current farmer in the ordered set where uuid = &#63;.
    *
    * @param farmerId the primary key of the current farmer
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next farmer
    * @throws com.register.serviceRF.NoSuchFarmerException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Farmer[] findByUuid_PrevAndNext(
        long farmerId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchFarmerException;

    /**
    * Removes all the farmers where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of farmers where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the farmer where uuid = &#63; and groupId = &#63; or throws a {@link com.register.serviceRF.NoSuchFarmerException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching farmer
    * @throws com.register.serviceRF.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Farmer findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchFarmerException;

    /**
    * Returns the farmer where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Farmer fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the farmer where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Farmer fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the farmer where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the farmer that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Farmer removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchFarmerException;

    /**
    * Returns the number of farmers where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the farmers where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.register.serviceRF.model.Farmer> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the farmers where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @return the range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.register.serviceRF.model.Farmer> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the farmers where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.register.serviceRF.model.Farmer> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first farmer in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer
    * @throws com.register.serviceRF.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Farmer findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchFarmerException;

    /**
    * Returns the first farmer in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Farmer fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last farmer in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer
    * @throws com.register.serviceRF.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Farmer findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchFarmerException;

    /**
    * Returns the last farmer in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Farmer fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the farmers before and after the current farmer in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param farmerId the primary key of the current farmer
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next farmer
    * @throws com.register.serviceRF.NoSuchFarmerException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Farmer[] findByUuid_C_PrevAndNext(
        long farmerId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchFarmerException;

    /**
    * Removes all the farmers where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of farmers where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the farmers where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.register.serviceRF.model.Farmer> findBygroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the farmers where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @return the range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.register.serviceRF.model.Farmer> findBygroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the farmers where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.register.serviceRF.model.Farmer> findBygroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first farmer in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer
    * @throws com.register.serviceRF.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Farmer findBygroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchFarmerException;

    /**
    * Returns the first farmer in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Farmer fetchBygroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last farmer in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer
    * @throws com.register.serviceRF.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Farmer findBygroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchFarmerException;

    /**
    * Returns the last farmer in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Farmer fetchBygroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the farmers before and after the current farmer in the ordered set where groupId = &#63;.
    *
    * @param farmerId the primary key of the current farmer
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next farmer
    * @throws com.register.serviceRF.NoSuchFarmerException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Farmer[] findBygroupId_PrevAndNext(
        long farmerId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchFarmerException;

    /**
    * Removes all the farmers where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public void removeBygroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of farmers where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public int countBygroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the farmers where groupId = &#63; and inArchive = &#63;.
    *
    * @param groupId the group ID
    * @param inArchive the in archive
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.register.serviceRF.model.Farmer> findByG_I(
        long groupId, boolean inArchive)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the farmers where groupId = &#63; and inArchive = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param inArchive the in archive
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @return the range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.register.serviceRF.model.Farmer> findByG_I(
        long groupId, boolean inArchive, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the farmers where groupId = &#63; and inArchive = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param inArchive the in archive
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.register.serviceRF.model.Farmer> findByG_I(
        long groupId, boolean inArchive, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first farmer in the ordered set where groupId = &#63; and inArchive = &#63;.
    *
    * @param groupId the group ID
    * @param inArchive the in archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer
    * @throws com.register.serviceRF.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Farmer findByG_I_First(long groupId,
        boolean inArchive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchFarmerException;

    /**
    * Returns the first farmer in the ordered set where groupId = &#63; and inArchive = &#63;.
    *
    * @param groupId the group ID
    * @param inArchive the in archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Farmer fetchByG_I_First(long groupId,
        boolean inArchive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last farmer in the ordered set where groupId = &#63; and inArchive = &#63;.
    *
    * @param groupId the group ID
    * @param inArchive the in archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer
    * @throws com.register.serviceRF.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Farmer findByG_I_Last(long groupId,
        boolean inArchive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchFarmerException;

    /**
    * Returns the last farmer in the ordered set where groupId = &#63; and inArchive = &#63;.
    *
    * @param groupId the group ID
    * @param inArchive the in archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Farmer fetchByG_I_Last(long groupId,
        boolean inArchive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the farmers before and after the current farmer in the ordered set where groupId = &#63; and inArchive = &#63;.
    *
    * @param farmerId the primary key of the current farmer
    * @param groupId the group ID
    * @param inArchive the in archive
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next farmer
    * @throws com.register.serviceRF.NoSuchFarmerException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Farmer[] findByG_I_PrevAndNext(
        long farmerId, long groupId, boolean inArchive,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchFarmerException;

    /**
    * Removes all the farmers where groupId = &#63; and inArchive = &#63; from the database.
    *
    * @param groupId the group ID
    * @param inArchive the in archive
    * @throws SystemException if a system exception occurred
    */
    public void removeByG_I(long groupId, boolean inArchive)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of farmers where groupId = &#63; and inArchive = &#63;.
    *
    * @param groupId the group ID
    * @param inArchive the in archive
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public int countByG_I(long groupId, boolean inArchive)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the farmers where groupId = &#63; and registrationArea = &#63;.
    *
    * @param groupId the group ID
    * @param registrationArea the registration area
    * @return the matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.register.serviceRF.model.Farmer> findByG_R(
        long groupId, java.lang.String registrationArea)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the farmers where groupId = &#63; and registrationArea = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param registrationArea the registration area
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @return the range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.register.serviceRF.model.Farmer> findByG_R(
        long groupId, java.lang.String registrationArea, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the farmers where groupId = &#63; and registrationArea = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param registrationArea the registration area
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.register.serviceRF.model.Farmer> findByG_R(
        long groupId, java.lang.String registrationArea, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first farmer in the ordered set where groupId = &#63; and registrationArea = &#63;.
    *
    * @param groupId the group ID
    * @param registrationArea the registration area
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer
    * @throws com.register.serviceRF.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Farmer findByG_R_First(long groupId,
        java.lang.String registrationArea,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchFarmerException;

    /**
    * Returns the first farmer in the ordered set where groupId = &#63; and registrationArea = &#63;.
    *
    * @param groupId the group ID
    * @param registrationArea the registration area
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Farmer fetchByG_R_First(long groupId,
        java.lang.String registrationArea,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last farmer in the ordered set where groupId = &#63; and registrationArea = &#63;.
    *
    * @param groupId the group ID
    * @param registrationArea the registration area
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer
    * @throws com.register.serviceRF.NoSuchFarmerException if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Farmer findByG_R_Last(long groupId,
        java.lang.String registrationArea,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchFarmerException;

    /**
    * Returns the last farmer in the ordered set where groupId = &#63; and registrationArea = &#63;.
    *
    * @param groupId the group ID
    * @param registrationArea the registration area
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching farmer, or <code>null</code> if a matching farmer could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Farmer fetchByG_R_Last(long groupId,
        java.lang.String registrationArea,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the farmers before and after the current farmer in the ordered set where groupId = &#63; and registrationArea = &#63;.
    *
    * @param farmerId the primary key of the current farmer
    * @param groupId the group ID
    * @param registrationArea the registration area
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next farmer
    * @throws com.register.serviceRF.NoSuchFarmerException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Farmer[] findByG_R_PrevAndNext(
        long farmerId, long groupId, java.lang.String registrationArea,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchFarmerException;

    /**
    * Removes all the farmers where groupId = &#63; and registrationArea = &#63; from the database.
    *
    * @param groupId the group ID
    * @param registrationArea the registration area
    * @throws SystemException if a system exception occurred
    */
    public void removeByG_R(long groupId, java.lang.String registrationArea)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of farmers where groupId = &#63; and registrationArea = &#63;.
    *
    * @param groupId the group ID
    * @param registrationArea the registration area
    * @return the number of matching farmers
    * @throws SystemException if a system exception occurred
    */
    public int countByG_R(long groupId, java.lang.String registrationArea)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the farmer in the entity cache if it is enabled.
    *
    * @param farmer the farmer
    */
    public void cacheResult(com.register.serviceRF.model.Farmer farmer);

    /**
    * Caches the farmers in the entity cache if it is enabled.
    *
    * @param farmers the farmers
    */
    public void cacheResult(
        java.util.List<com.register.serviceRF.model.Farmer> farmers);

    /**
    * Creates a new farmer with the primary key. Does not add the farmer to the database.
    *
    * @param farmerId the primary key for the new farmer
    * @return the new farmer
    */
    public com.register.serviceRF.model.Farmer create(long farmerId);

    /**
    * Removes the farmer with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param farmerId the primary key of the farmer
    * @return the farmer that was removed
    * @throws com.register.serviceRF.NoSuchFarmerException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Farmer remove(long farmerId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchFarmerException;

    public com.register.serviceRF.model.Farmer updateImpl(
        com.register.serviceRF.model.Farmer farmer)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the farmer with the primary key or throws a {@link com.register.serviceRF.NoSuchFarmerException} if it could not be found.
    *
    * @param farmerId the primary key of the farmer
    * @return the farmer
    * @throws com.register.serviceRF.NoSuchFarmerException if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Farmer findByPrimaryKey(long farmerId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchFarmerException;

    /**
    * Returns the farmer with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param farmerId the primary key of the farmer
    * @return the farmer, or <code>null</code> if a farmer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.Farmer fetchByPrimaryKey(long farmerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the farmers.
    *
    * @return the farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.register.serviceRF.model.Farmer> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.register.serviceRF.model.Farmer> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the farmers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.FarmerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of farmers
    * @param end the upper bound of the range of farmers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of farmers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.register.serviceRF.model.Farmer> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the farmers from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of farmers.
    *
    * @return the number of farmers
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
