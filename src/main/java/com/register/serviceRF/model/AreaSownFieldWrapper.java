package com.register.serviceRF.model;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AreaSownField}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AreaSownField
 * @generated
 */
public class AreaSownFieldWrapper implements AreaSownField,
    ModelWrapper<AreaSownField> {
    private AreaSownField _areaSownField;

    public AreaSownFieldWrapper(AreaSownField areaSownField) {
        _areaSownField = areaSownField;
    }

    @Override
    public Class<?> getModelClass() {
        return AreaSownField.class;
    }

    @Override
    public String getModelClassName() {
        return AreaSownField.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("areaSownFieldsId", getAreaSownFieldsId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("farmerId", getFarmerId());
        attributes.put("areaId", getAreaId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long areaSownFieldsId = (Long) attributes.get("areaSownFieldsId");

        if (areaSownFieldsId != null) {
            setAreaSownFieldsId(areaSownFieldsId);
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

        Long farmerId = (Long) attributes.get("farmerId");

        if (farmerId != null) {
            setFarmerId(farmerId);
        }

        Long areaId = (Long) attributes.get("areaId");

        if (areaId != null) {
            setAreaId(areaId);
        }
    }

    /**
    * Returns the primary key of this area sown field.
    *
    * @return the primary key of this area sown field
    */
    @Override
    public long getPrimaryKey() {
        return _areaSownField.getPrimaryKey();
    }

    /**
    * Sets the primary key of this area sown field.
    *
    * @param primaryKey the primary key of this area sown field
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _areaSownField.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the uuid of this area sown field.
    *
    * @return the uuid of this area sown field
    */
    @Override
    public java.lang.String getUuid() {
        return _areaSownField.getUuid();
    }

    /**
    * Sets the uuid of this area sown field.
    *
    * @param uuid the uuid of this area sown field
    */
    @Override
    public void setUuid(java.lang.String uuid) {
        _areaSownField.setUuid(uuid);
    }

    /**
    * Returns the area sown fields ID of this area sown field.
    *
    * @return the area sown fields ID of this area sown field
    */
    @Override
    public long getAreaSownFieldsId() {
        return _areaSownField.getAreaSownFieldsId();
    }

    /**
    * Sets the area sown fields ID of this area sown field.
    *
    * @param areaSownFieldsId the area sown fields ID of this area sown field
    */
    @Override
    public void setAreaSownFieldsId(long areaSownFieldsId) {
        _areaSownField.setAreaSownFieldsId(areaSownFieldsId);
    }

    /**
    * Returns the group ID of this area sown field.
    *
    * @return the group ID of this area sown field
    */
    @Override
    public long getGroupId() {
        return _areaSownField.getGroupId();
    }

    /**
    * Sets the group ID of this area sown field.
    *
    * @param groupId the group ID of this area sown field
    */
    @Override
    public void setGroupId(long groupId) {
        _areaSownField.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this area sown field.
    *
    * @return the company ID of this area sown field
    */
    @Override
    public long getCompanyId() {
        return _areaSownField.getCompanyId();
    }

    /**
    * Sets the company ID of this area sown field.
    *
    * @param companyId the company ID of this area sown field
    */
    @Override
    public void setCompanyId(long companyId) {
        _areaSownField.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this area sown field.
    *
    * @return the user ID of this area sown field
    */
    @Override
    public long getUserId() {
        return _areaSownField.getUserId();
    }

    /**
    * Sets the user ID of this area sown field.
    *
    * @param userId the user ID of this area sown field
    */
    @Override
    public void setUserId(long userId) {
        _areaSownField.setUserId(userId);
    }

    /**
    * Returns the user uuid of this area sown field.
    *
    * @return the user uuid of this area sown field
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _areaSownField.getUserUuid();
    }

    /**
    * Sets the user uuid of this area sown field.
    *
    * @param userUuid the user uuid of this area sown field
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _areaSownField.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this area sown field.
    *
    * @return the user name of this area sown field
    */
    @Override
    public java.lang.String getUserName() {
        return _areaSownField.getUserName();
    }

    /**
    * Sets the user name of this area sown field.
    *
    * @param userName the user name of this area sown field
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _areaSownField.setUserName(userName);
    }

    /**
    * Returns the create date of this area sown field.
    *
    * @return the create date of this area sown field
    */
    @Override
    public java.util.Date getCreateDate() {
        return _areaSownField.getCreateDate();
    }

    /**
    * Sets the create date of this area sown field.
    *
    * @param createDate the create date of this area sown field
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _areaSownField.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this area sown field.
    *
    * @return the modified date of this area sown field
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _areaSownField.getModifiedDate();
    }

    /**
    * Sets the modified date of this area sown field.
    *
    * @param modifiedDate the modified date of this area sown field
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _areaSownField.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the farmer ID of this area sown field.
    *
    * @return the farmer ID of this area sown field
    */
    @Override
    public long getFarmerId() {
        return _areaSownField.getFarmerId();
    }

    /**
    * Sets the farmer ID of this area sown field.
    *
    * @param farmerId the farmer ID of this area sown field
    */
    @Override
    public void setFarmerId(long farmerId) {
        _areaSownField.setFarmerId(farmerId);
    }

    /**
    * Returns the area ID of this area sown field.
    *
    * @return the area ID of this area sown field
    */
    @Override
    public long getAreaId() {
        return _areaSownField.getAreaId();
    }

    /**
    * Sets the area ID of this area sown field.
    *
    * @param areaId the area ID of this area sown field
    */
    @Override
    public void setAreaId(long areaId) {
        _areaSownField.setAreaId(areaId);
    }

    @Override
    public boolean isNew() {
        return _areaSownField.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _areaSownField.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _areaSownField.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _areaSownField.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _areaSownField.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _areaSownField.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _areaSownField.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _areaSownField.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _areaSownField.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _areaSownField.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _areaSownField.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new AreaSownFieldWrapper((AreaSownField) _areaSownField.clone());
    }

    @Override
    public int compareTo(
        com.register.serviceRF.model.AreaSownField areaSownField) {
        return _areaSownField.compareTo(areaSownField);
    }

    @Override
    public int hashCode() {
        return _areaSownField.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.register.serviceRF.model.AreaSownField> toCacheModel() {
        return _areaSownField.toCacheModel();
    }

    @Override
    public com.register.serviceRF.model.AreaSownField toEscapedModel() {
        return new AreaSownFieldWrapper(_areaSownField.toEscapedModel());
    }

    @Override
    public com.register.serviceRF.model.AreaSownField toUnescapedModel() {
        return new AreaSownFieldWrapper(_areaSownField.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _areaSownField.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _areaSownField.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _areaSownField.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof AreaSownFieldWrapper)) {
            return false;
        }

        AreaSownFieldWrapper areaSownFieldWrapper = (AreaSownFieldWrapper) obj;

        if (Validator.equals(_areaSownField, areaSownFieldWrapper._areaSownField)) {
            return true;
        }

        return false;
    }

    @Override
    public StagedModelType getStagedModelType() {
        return _areaSownField.getStagedModelType();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public AreaSownField getWrappedAreaSownField() {
        return _areaSownField;
    }

    @Override
    public AreaSownField getWrappedModel() {
        return _areaSownField;
    }

    @Override
    public void resetOriginalValues() {
        _areaSownField.resetOriginalValues();
    }
}
