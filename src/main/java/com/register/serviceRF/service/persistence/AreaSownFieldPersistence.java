package com.register.serviceRF.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.register.serviceRF.model.AreaSownField;

/**
 * The persistence interface for the area sown field service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AreaSownFieldPersistenceImpl
 * @see AreaSownFieldUtil
 * @generated
 */
public interface AreaSownFieldPersistence extends BasePersistence<AreaSownField> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link AreaSownFieldUtil} to access the area sown field persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the area sown fields where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching area sown fields
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.register.serviceRF.model.AreaSownField> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.register.serviceRF.model.AreaSownField> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.register.serviceRF.model.AreaSownField> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first area sown field in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area sown field
    * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.AreaSownField findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaSownFieldException;

    /**
    * Returns the first area sown field in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area sown field, or <code>null</code> if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.AreaSownField fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last area sown field in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area sown field
    * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.AreaSownField findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaSownFieldException;

    /**
    * Returns the last area sown field in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area sown field, or <code>null</code> if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.AreaSownField fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.register.serviceRF.model.AreaSownField[] findByUuid_PrevAndNext(
        long areaSownFieldsId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaSownFieldException;

    /**
    * Removes all the area sown fields where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of area sown fields where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching area sown fields
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the area sown field where uuid = &#63; and groupId = &#63; or throws a {@link com.register.serviceRF.NoSuchAreaSownFieldException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching area sown field
    * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.AreaSownField findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaSownFieldException;

    /**
    * Returns the area sown field where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching area sown field, or <code>null</code> if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.AreaSownField fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the area sown field where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching area sown field, or <code>null</code> if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.AreaSownField fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the area sown field where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the area sown field that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.AreaSownField removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaSownFieldException;

    /**
    * Returns the number of area sown fields where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching area sown fields
    * @throws SystemException if a system exception occurred
    */
    public int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the area sown fields where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching area sown fields
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.register.serviceRF.model.AreaSownField> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.register.serviceRF.model.AreaSownField> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.register.serviceRF.model.AreaSownField> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.register.serviceRF.model.AreaSownField findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaSownFieldException;

    /**
    * Returns the first area sown field in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area sown field, or <code>null</code> if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.AreaSownField fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.register.serviceRF.model.AreaSownField findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaSownFieldException;

    /**
    * Returns the last area sown field in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area sown field, or <code>null</code> if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.AreaSownField fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.register.serviceRF.model.AreaSownField[] findByUuid_C_PrevAndNext(
        long areaSownFieldsId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaSownFieldException;

    /**
    * Removes all the area sown fields where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of area sown fields where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching area sown fields
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the area sown fields where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching area sown fields
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.register.serviceRF.model.AreaSownField> findBygroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.register.serviceRF.model.AreaSownField> findBygroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.register.serviceRF.model.AreaSownField> findBygroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first area sown field in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area sown field
    * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.AreaSownField findBygroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaSownFieldException;

    /**
    * Returns the first area sown field in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area sown field, or <code>null</code> if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.AreaSownField fetchBygroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last area sown field in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area sown field
    * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.AreaSownField findBygroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaSownFieldException;

    /**
    * Returns the last area sown field in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area sown field, or <code>null</code> if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.AreaSownField fetchBygroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.register.serviceRF.model.AreaSownField[] findBygroupId_PrevAndNext(
        long areaSownFieldsId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaSownFieldException;

    /**
    * Removes all the area sown fields where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public void removeBygroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of area sown fields where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching area sown fields
    * @throws SystemException if a system exception occurred
    */
    public int countBygroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the area sown fields where groupId = &#63; and farmerId = &#63;.
    *
    * @param groupId the group ID
    * @param farmerId the farmer ID
    * @return the matching area sown fields
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.register.serviceRF.model.AreaSownField> findByG_F(
        long groupId, long farmerId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.register.serviceRF.model.AreaSownField> findByG_F(
        long groupId, long farmerId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.register.serviceRF.model.AreaSownField> findByG_F(
        long groupId, long farmerId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.register.serviceRF.model.AreaSownField findByG_F_First(
        long groupId, long farmerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaSownFieldException;

    /**
    * Returns the first area sown field in the ordered set where groupId = &#63; and farmerId = &#63;.
    *
    * @param groupId the group ID
    * @param farmerId the farmer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching area sown field, or <code>null</code> if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.AreaSownField fetchByG_F_First(
        long groupId, long farmerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.register.serviceRF.model.AreaSownField findByG_F_Last(
        long groupId, long farmerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaSownFieldException;

    /**
    * Returns the last area sown field in the ordered set where groupId = &#63; and farmerId = &#63;.
    *
    * @param groupId the group ID
    * @param farmerId the farmer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching area sown field, or <code>null</code> if a matching area sown field could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.AreaSownField fetchByG_F_Last(
        long groupId, long farmerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.register.serviceRF.model.AreaSownField[] findByG_F_PrevAndNext(
        long areaSownFieldsId, long groupId, long farmerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaSownFieldException;

    /**
    * Removes all the area sown fields where groupId = &#63; and farmerId = &#63; from the database.
    *
    * @param groupId the group ID
    * @param farmerId the farmer ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByG_F(long groupId, long farmerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of area sown fields where groupId = &#63; and farmerId = &#63;.
    *
    * @param groupId the group ID
    * @param farmerId the farmer ID
    * @return the number of matching area sown fields
    * @throws SystemException if a system exception occurred
    */
    public int countByG_F(long groupId, long farmerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the area sown field in the entity cache if it is enabled.
    *
    * @param areaSownField the area sown field
    */
    public void cacheResult(
        com.register.serviceRF.model.AreaSownField areaSownField);

    /**
    * Caches the area sown fields in the entity cache if it is enabled.
    *
    * @param areaSownFields the area sown fields
    */
    public void cacheResult(
        java.util.List<com.register.serviceRF.model.AreaSownField> areaSownFields);

    /**
    * Creates a new area sown field with the primary key. Does not add the area sown field to the database.
    *
    * @param areaSownFieldsId the primary key for the new area sown field
    * @return the new area sown field
    */
    public com.register.serviceRF.model.AreaSownField create(
        long areaSownFieldsId);

    /**
    * Removes the area sown field with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param areaSownFieldsId the primary key of the area sown field
    * @return the area sown field that was removed
    * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a area sown field with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.AreaSownField remove(
        long areaSownFieldsId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaSownFieldException;

    public com.register.serviceRF.model.AreaSownField updateImpl(
        com.register.serviceRF.model.AreaSownField areaSownField)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the area sown field with the primary key or throws a {@link com.register.serviceRF.NoSuchAreaSownFieldException} if it could not be found.
    *
    * @param areaSownFieldsId the primary key of the area sown field
    * @return the area sown field
    * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a area sown field with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.AreaSownField findByPrimaryKey(
        long areaSownFieldsId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.register.serviceRF.NoSuchAreaSownFieldException;

    /**
    * Returns the area sown field with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param areaSownFieldsId the primary key of the area sown field
    * @return the area sown field, or <code>null</code> if a area sown field with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.register.serviceRF.model.AreaSownField fetchByPrimaryKey(
        long areaSownFieldsId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the area sown fields.
    *
    * @return the area sown fields
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.register.serviceRF.model.AreaSownField> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.register.serviceRF.model.AreaSownField> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.register.serviceRF.model.AreaSownField> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the area sown fields from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of area sown fields.
    *
    * @return the number of area sown fields
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
