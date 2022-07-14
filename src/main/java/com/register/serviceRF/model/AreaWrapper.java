package com.register.serviceRF.model;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Area}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Area
 * @generated
 */
public class AreaWrapper implements Area, ModelWrapper<Area> {
    private Area _area;

    public AreaWrapper(Area area) {
        _area = area;
    }

    @Override
    public Class<?> getModelClass() {
        return Area.class;
    }

    @Override
    public String getModelClassName() {
        return Area.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("areaId", getAreaId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("title", getTitle());
        attributes.put("areaCode", getAreaCode());
        attributes.put("inArchive", getInArchive());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long areaId = (Long) attributes.get("areaId");

        if (areaId != null) {
            setAreaId(areaId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        String title = (String) attributes.get("title");

        if (title != null) {
            setTitle(title);
        }

        Long areaCode = (Long) attributes.get("areaCode");

        if (areaCode != null) {
            setAreaCode(areaCode);
        }

        Boolean inArchive = (Boolean) attributes.get("inArchive");

        if (inArchive != null) {
            setInArchive(inArchive);
        }
    }

    /**
    * Returns the primary key of this area.
    *
    * @return the primary key of this area
    */
    @Override
    public long getPrimaryKey() {
        return _area.getPrimaryKey();
    }

    /**
    * Sets the primary key of this area.
    *
    * @param primaryKey the primary key of this area
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _area.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the uuid of this area.
    *
    * @return the uuid of this area
    */
    @Override
    public java.lang.String getUuid() {
        return _area.getUuid();
    }

    /**
    * Sets the uuid of this area.
    *
    * @param uuid the uuid of this area
    */
    @Override
    public void setUuid(java.lang.String uuid) {
        _area.setUuid(uuid);
    }

    /**
    * Returns the area ID of this area.
    *
    * @return the area ID of this area
    */
    @Override
    public long getAreaId() {
        return _area.getAreaId();
    }

    /**
    * Sets the area ID of this area.
    *
    * @param areaId the area ID of this area
    */
    @Override
    public void setAreaId(long areaId) {
        _area.setAreaId(areaId);
    }

    /**
    * Returns the group ID of this area.
    *
    * @return the group ID of this area
    */
    @Override
    public long getGroupId() {
        return _area.getGroupId();
    }

    /**
    * Sets the group ID of this area.
    *
    * @param groupId the group ID of this area
    */
    @Override
    public void setGroupId(long groupId) {
        _area.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this area.
    *
    * @return the company ID of this area
    */
    @Override
    public long getCompanyId() {
        return _area.getCompanyId();
    }

    /**
    * Sets the company ID of this area.
    *
    * @param companyId the company ID of this area
    */
    @Override
    public void setCompanyId(long companyId) {
        _area.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this area.
    *
    * @return the user ID of this area
    */
    @Override
    public long getUserId() {
        return _area.getUserId();
    }

    /**
    * Sets the user ID of this area.
    *
    * @param userId the user ID of this area
    */
    @Override
    public void setUserId(long userId) {
        _area.setUserId(userId);
    }

    /**
    * Returns the user uuid of this area.
    *
    * @return the user uuid of this area
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _area.getUserUuid();
    }

    /**
    * Sets the user uuid of this area.
    *
    * @param userUuid the user uuid of this area
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _area.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this area.
    *
    * @return the user name of this area
    */
    @Override
    public java.lang.String getUserName() {
        return _area.getUserName();
    }

    /**
    * Sets the user name of this area.
    *
    * @param userName the user name of this area
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _area.setUserName(userName);
    }

    /**
    * Returns the create date of this area.
    *
    * @return the create date of this area
    */
    @Override
    public java.util.Date getCreateDate() {
        return _area.getCreateDate();
    }

    /**
    * Sets the create date of this area.
    *
    * @param createDate the create date of this area
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _area.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this area.
    *
    * @return the modified date of this area
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _area.getModifiedDate();
    }

    /**
    * Sets the modified date of this area.
    *
    * @param modifiedDate the modified date of this area
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _area.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the title of this area.
    *
    * @return the title of this area
    */
    @Override
    public java.lang.String getTitle() {
        return _area.getTitle();
    }

    /**
    * Sets the title of this area.
    *
    * @param title the title of this area
    */
    @Override
    public void setTitle(java.lang.String title) {
        _area.setTitle(title);
    }

    /**
    * Returns the area code of this area.
    *
    * @return the area code of this area
    */
    @Override
    public long getAreaCode() {
        return _area.getAreaCode();
    }

    /**
    * Sets the area code of this area.
    *
    * @param areaCode the area code of this area
    */
    @Override
    public void setAreaCode(long areaCode) {
        _area.setAreaCode(areaCode);
    }

    /**
    * Returns the in archive of this area.
    *
    * @return the in archive of this area
    */
    @Override
    public boolean getInArchive() {
        return _area.getInArchive();
    }

    /**
    * Returns <code>true</code> if this area is in archive.
    *
    * @return <code>true</code> if this area is in archive; <code>false</code> otherwise
    */
    @Override
    public boolean isInArchive() {
        return _area.isInArchive();
    }

    /**
    * Sets whether this area is in archive.
    *
    * @param inArchive the in archive of this area
    */
    @Override
    public void setInArchive(boolean inArchive) {
        _area.setInArchive(inArchive);
    }

    @Override
    public boolean isNew() {
        return _area.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _area.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _area.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _area.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _area.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _area.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _area.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _area.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _area.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _area.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _area.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new AreaWrapper((Area) _area.clone());
    }

    @Override
    public int compareTo(com.register.serviceRF.model.Area area) {
        return _area.compareTo(area);
    }

    @Override
    public int hashCode() {
        return _area.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.register.serviceRF.model.Area> toCacheModel() {
        return _area.toCacheModel();
    }

    @Override
    public com.register.serviceRF.model.Area toEscapedModel() {
        return new AreaWrapper(_area.toEscapedModel());
    }

    @Override
    public com.register.serviceRF.model.Area toUnescapedModel() {
        return new AreaWrapper(_area.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _area.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _area.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _area.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof AreaWrapper)) {
            return false;
        }

        AreaWrapper areaWrapper = (AreaWrapper) obj;

        if (Validator.equals(_area, areaWrapper._area)) {
            return true;
        }

        return false;
    }

    @Override
    public StagedModelType getStagedModelType() {
        return _area.getStagedModelType();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Area getWrappedArea() {
        return _area;
    }

    @Override
    public Area getWrappedModel() {
        return _area;
    }

    @Override
    public void resetOriginalValues() {
        _area.resetOriginalValues();
    }
}
