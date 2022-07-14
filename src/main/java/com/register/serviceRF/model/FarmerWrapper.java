package com.register.serviceRF.model;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Farmer}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Farmer
 * @generated
 */
public class FarmerWrapper implements Farmer, ModelWrapper<Farmer> {
    private Farmer _farmer;

    public FarmerWrapper(Farmer farmer) {
        _farmer = farmer;
    }

    @Override
    public Class<?> getModelClass() {
        return Farmer.class;
    }

    @Override
    public String getModelClassName() {
        return Farmer.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("farmerId", getFarmerId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("nameOrganization", getNameOrganization());
        attributes.put("organizationalLegalForm", getOrganizationalLegalForm());
        attributes.put("INN", getINN());
        attributes.put("KPP", getKPP());
        attributes.put("OGRN", getOGRN());
        attributes.put("registrationArea", getRegistrationArea());
        attributes.put("areasSownFields", getAreasSownFields());
        attributes.put("registrationDate", getRegistrationDate());
        attributes.put("inArchive", getInArchive());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long farmerId = (Long) attributes.get("farmerId");

        if (farmerId != null) {
            setFarmerId(farmerId);
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

        String nameOrganization = (String) attributes.get("nameOrganization");

        if (nameOrganization != null) {
            setNameOrganization(nameOrganization);
        }

        String organizationalLegalForm = (String) attributes.get(
                "organizationalLegalForm");

        if (organizationalLegalForm != null) {
            setOrganizationalLegalForm(organizationalLegalForm);
        }

        Long INN = (Long) attributes.get("INN");

        if (INN != null) {
            setINN(INN);
        }

        Long KPP = (Long) attributes.get("KPP");

        if (KPP != null) {
            setKPP(KPP);
        }

        Long OGRN = (Long) attributes.get("OGRN");

        if (OGRN != null) {
            setOGRN(OGRN);
        }

        String registrationArea = (String) attributes.get("registrationArea");

        if (registrationArea != null) {
            setRegistrationArea(registrationArea);
        }

        String areasSownFields = (String) attributes.get("areasSownFields");

        if (areasSownFields != null) {
            setAreasSownFields(areasSownFields);
        }

        Date registrationDate = (Date) attributes.get("registrationDate");

        if (registrationDate != null) {
            setRegistrationDate(registrationDate);
        }

        Boolean inArchive = (Boolean) attributes.get("inArchive");

        if (inArchive != null) {
            setInArchive(inArchive);
        }
    }

    /**
    * Returns the primary key of this farmer.
    *
    * @return the primary key of this farmer
    */
    @Override
    public long getPrimaryKey() {
        return _farmer.getPrimaryKey();
    }

    /**
    * Sets the primary key of this farmer.
    *
    * @param primaryKey the primary key of this farmer
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _farmer.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the uuid of this farmer.
    *
    * @return the uuid of this farmer
    */
    @Override
    public java.lang.String getUuid() {
        return _farmer.getUuid();
    }

    /**
    * Sets the uuid of this farmer.
    *
    * @param uuid the uuid of this farmer
    */
    @Override
    public void setUuid(java.lang.String uuid) {
        _farmer.setUuid(uuid);
    }

    /**
    * Returns the farmer ID of this farmer.
    *
    * @return the farmer ID of this farmer
    */
    @Override
    public long getFarmerId() {
        return _farmer.getFarmerId();
    }

    /**
    * Sets the farmer ID of this farmer.
    *
    * @param farmerId the farmer ID of this farmer
    */
    @Override
    public void setFarmerId(long farmerId) {
        _farmer.setFarmerId(farmerId);
    }

    /**
    * Returns the group ID of this farmer.
    *
    * @return the group ID of this farmer
    */
    @Override
    public long getGroupId() {
        return _farmer.getGroupId();
    }

    /**
    * Sets the group ID of this farmer.
    *
    * @param groupId the group ID of this farmer
    */
    @Override
    public void setGroupId(long groupId) {
        _farmer.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this farmer.
    *
    * @return the company ID of this farmer
    */
    @Override
    public long getCompanyId() {
        return _farmer.getCompanyId();
    }

    /**
    * Sets the company ID of this farmer.
    *
    * @param companyId the company ID of this farmer
    */
    @Override
    public void setCompanyId(long companyId) {
        _farmer.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this farmer.
    *
    * @return the user ID of this farmer
    */
    @Override
    public long getUserId() {
        return _farmer.getUserId();
    }

    /**
    * Sets the user ID of this farmer.
    *
    * @param userId the user ID of this farmer
    */
    @Override
    public void setUserId(long userId) {
        _farmer.setUserId(userId);
    }

    /**
    * Returns the user uuid of this farmer.
    *
    * @return the user uuid of this farmer
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _farmer.getUserUuid();
    }

    /**
    * Sets the user uuid of this farmer.
    *
    * @param userUuid the user uuid of this farmer
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _farmer.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this farmer.
    *
    * @return the user name of this farmer
    */
    @Override
    public java.lang.String getUserName() {
        return _farmer.getUserName();
    }

    /**
    * Sets the user name of this farmer.
    *
    * @param userName the user name of this farmer
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _farmer.setUserName(userName);
    }

    /**
    * Returns the create date of this farmer.
    *
    * @return the create date of this farmer
    */
    @Override
    public java.util.Date getCreateDate() {
        return _farmer.getCreateDate();
    }

    /**
    * Sets the create date of this farmer.
    *
    * @param createDate the create date of this farmer
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _farmer.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this farmer.
    *
    * @return the modified date of this farmer
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _farmer.getModifiedDate();
    }

    /**
    * Sets the modified date of this farmer.
    *
    * @param modifiedDate the modified date of this farmer
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _farmer.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the name organization of this farmer.
    *
    * @return the name organization of this farmer
    */
    @Override
    public java.lang.String getNameOrganization() {
        return _farmer.getNameOrganization();
    }

    /**
    * Sets the name organization of this farmer.
    *
    * @param nameOrganization the name organization of this farmer
    */
    @Override
    public void setNameOrganization(java.lang.String nameOrganization) {
        _farmer.setNameOrganization(nameOrganization);
    }

    /**
    * Returns the organizational legal form of this farmer.
    *
    * @return the organizational legal form of this farmer
    */
    @Override
    public java.lang.String getOrganizationalLegalForm() {
        return _farmer.getOrganizationalLegalForm();
    }

    /**
    * Sets the organizational legal form of this farmer.
    *
    * @param organizationalLegalForm the organizational legal form of this farmer
    */
    @Override
    public void setOrganizationalLegalForm(
        java.lang.String organizationalLegalForm) {
        _farmer.setOrganizationalLegalForm(organizationalLegalForm);
    }

    /**
    * Returns the i n n of this farmer.
    *
    * @return the i n n of this farmer
    */
    @Override
    public long getINN() {
        return _farmer.getINN();
    }

    /**
    * Sets the i n n of this farmer.
    *
    * @param INN the i n n of this farmer
    */
    @Override
    public void setINN(long INN) {
        _farmer.setINN(INN);
    }

    /**
    * Returns the k p p of this farmer.
    *
    * @return the k p p of this farmer
    */
    @Override
    public long getKPP() {
        return _farmer.getKPP();
    }

    /**
    * Sets the k p p of this farmer.
    *
    * @param KPP the k p p of this farmer
    */
    @Override
    public void setKPP(long KPP) {
        _farmer.setKPP(KPP);
    }

    /**
    * Returns the o g r n of this farmer.
    *
    * @return the o g r n of this farmer
    */
    @Override
    public long getOGRN() {
        return _farmer.getOGRN();
    }

    /**
    * Sets the o g r n of this farmer.
    *
    * @param OGRN the o g r n of this farmer
    */
    @Override
    public void setOGRN(long OGRN) {
        _farmer.setOGRN(OGRN);
    }

    /**
    * Returns the registration area of this farmer.
    *
    * @return the registration area of this farmer
    */
    @Override
    public java.lang.String getRegistrationArea() {
        return _farmer.getRegistrationArea();
    }

    /**
    * Sets the registration area of this farmer.
    *
    * @param registrationArea the registration area of this farmer
    */
    @Override
    public void setRegistrationArea(java.lang.String registrationArea) {
        _farmer.setRegistrationArea(registrationArea);
    }

    /**
    * Returns the areas sown fields of this farmer.
    *
    * @return the areas sown fields of this farmer
    */
    @Override
    public java.lang.String getAreasSownFields() {
        return _farmer.getAreasSownFields();
    }

    /**
    * Sets the areas sown fields of this farmer.
    *
    * @param areasSownFields the areas sown fields of this farmer
    */
    @Override
    public void setAreasSownFields(java.lang.String areasSownFields) {
        _farmer.setAreasSownFields(areasSownFields);
    }

    /**
    * Returns the registration date of this farmer.
    *
    * @return the registration date of this farmer
    */
    @Override
    public java.util.Date getRegistrationDate() {
        return _farmer.getRegistrationDate();
    }

    /**
    * Sets the registration date of this farmer.
    *
    * @param registrationDate the registration date of this farmer
    */
    @Override
    public void setRegistrationDate(java.util.Date registrationDate) {
        _farmer.setRegistrationDate(registrationDate);
    }

    /**
    * Returns the in archive of this farmer.
    *
    * @return the in archive of this farmer
    */
    @Override
    public boolean getInArchive() {
        return _farmer.getInArchive();
    }

    /**
    * Returns <code>true</code> if this farmer is in archive.
    *
    * @return <code>true</code> if this farmer is in archive; <code>false</code> otherwise
    */
    @Override
    public boolean isInArchive() {
        return _farmer.isInArchive();
    }

    /**
    * Sets whether this farmer is in archive.
    *
    * @param inArchive the in archive of this farmer
    */
    @Override
    public void setInArchive(boolean inArchive) {
        _farmer.setInArchive(inArchive);
    }

    @Override
    public boolean isNew() {
        return _farmer.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _farmer.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _farmer.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _farmer.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _farmer.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _farmer.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _farmer.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _farmer.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _farmer.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _farmer.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _farmer.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new FarmerWrapper((Farmer) _farmer.clone());
    }

    @Override
    public int compareTo(com.register.serviceRF.model.Farmer farmer) {
        return _farmer.compareTo(farmer);
    }

    @Override
    public int hashCode() {
        return _farmer.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.register.serviceRF.model.Farmer> toCacheModel() {
        return _farmer.toCacheModel();
    }

    @Override
    public com.register.serviceRF.model.Farmer toEscapedModel() {
        return new FarmerWrapper(_farmer.toEscapedModel());
    }

    @Override
    public com.register.serviceRF.model.Farmer toUnescapedModel() {
        return new FarmerWrapper(_farmer.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _farmer.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _farmer.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _farmer.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof FarmerWrapper)) {
            return false;
        }

        FarmerWrapper farmerWrapper = (FarmerWrapper) obj;

        if (Validator.equals(_farmer, farmerWrapper._farmer)) {
            return true;
        }

        return false;
    }

    @Override
    public StagedModelType getStagedModelType() {
        return _farmer.getStagedModelType();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Farmer getWrappedFarmer() {
        return _farmer;
    }

    @Override
    public Farmer getWrappedModel() {
        return _farmer;
    }

    @Override
    public void resetOriginalValues() {
        _farmer.resetOriginalValues();
    }
}
