package com.register.serviceRF.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.register.serviceRF.service.http.FarmerServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.register.serviceRF.service.http.FarmerServiceSoap
 * @generated
 */
public class FarmerSoap implements Serializable {
    private String _uuid;
    private long _farmerId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _nameOrganization;
    private String _organizationalLegalForm;
    private long _INN;
    private long _KPP;
    private long _OGRN;
    private String _registrationArea;
    private String _areasSownFields;
    private Date _registrationDate;
    private boolean _inArchive;

    public FarmerSoap() {
    }

    public static FarmerSoap toSoapModel(Farmer model) {
        FarmerSoap soapModel = new FarmerSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setFarmerId(model.getFarmerId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setNameOrganization(model.getNameOrganization());
        soapModel.setOrganizationalLegalForm(model.getOrganizationalLegalForm());
        soapModel.setINN(model.getINN());
        soapModel.setKPP(model.getKPP());
        soapModel.setOGRN(model.getOGRN());
        soapModel.setRegistrationArea(model.getRegistrationArea());
        soapModel.setAreasSownFields(model.getAreasSownFields());
        soapModel.setRegistrationDate(model.getRegistrationDate());
        soapModel.setInArchive(model.getInArchive());

        return soapModel;
    }

    public static FarmerSoap[] toSoapModels(Farmer[] models) {
        FarmerSoap[] soapModels = new FarmerSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static FarmerSoap[][] toSoapModels(Farmer[][] models) {
        FarmerSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new FarmerSoap[models.length][models[0].length];
        } else {
            soapModels = new FarmerSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static FarmerSoap[] toSoapModels(List<Farmer> models) {
        List<FarmerSoap> soapModels = new ArrayList<FarmerSoap>(models.size());

        for (Farmer model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new FarmerSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _farmerId;
    }

    public void setPrimaryKey(long pk) {
        setFarmerId(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getFarmerId() {
        return _farmerId;
    }

    public void setFarmerId(long farmerId) {
        _farmerId = farmerId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public String getUserName() {
        return _userName;
    }

    public void setUserName(String userName) {
        _userName = userName;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public String getNameOrganization() {
        return _nameOrganization;
    }

    public void setNameOrganization(String nameOrganization) {
        _nameOrganization = nameOrganization;
    }

    public String getOrganizationalLegalForm() {
        return _organizationalLegalForm;
    }

    public void setOrganizationalLegalForm(String organizationalLegalForm) {
        _organizationalLegalForm = organizationalLegalForm;
    }

    public long getINN() {
        return _INN;
    }

    public void setINN(long INN) {
        _INN = INN;
    }

    public long getKPP() {
        return _KPP;
    }

    public void setKPP(long KPP) {
        _KPP = KPP;
    }

    public long getOGRN() {
        return _OGRN;
    }

    public void setOGRN(long OGRN) {
        _OGRN = OGRN;
    }

    public String getRegistrationArea() {
        return _registrationArea;
    }

    public void setRegistrationArea(String registrationArea) {
        _registrationArea = registrationArea;
    }

    public String getAreasSownFields() {
        return _areasSownFields;
    }

    public void setAreasSownFields(String areasSownFields) {
        _areasSownFields = areasSownFields;
    }

    public Date getRegistrationDate() {
        return _registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        _registrationDate = registrationDate;
    }

    public boolean getInArchive() {
        return _inArchive;
    }

    public boolean isInArchive() {
        return _inArchive;
    }

    public void setInArchive(boolean inArchive) {
        _inArchive = inArchive;
    }
}
