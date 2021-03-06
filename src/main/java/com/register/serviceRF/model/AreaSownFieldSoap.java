package com.register.serviceRF.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.register.serviceRF.service.http.AreaSownFieldServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.register.serviceRF.service.http.AreaSownFieldServiceSoap
 * @generated
 */
public class AreaSownFieldSoap implements Serializable {
    private String _uuid;
    private long _areaSownFieldsId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private long _farmerId;
    private long _areaId;

    public AreaSownFieldSoap() {
    }

    public static AreaSownFieldSoap toSoapModel(AreaSownField model) {
        AreaSownFieldSoap soapModel = new AreaSownFieldSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setAreaSownFieldsId(model.getAreaSownFieldsId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setFarmerId(model.getFarmerId());
        soapModel.setAreaId(model.getAreaId());

        return soapModel;
    }

    public static AreaSownFieldSoap[] toSoapModels(AreaSownField[] models) {
        AreaSownFieldSoap[] soapModels = new AreaSownFieldSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static AreaSownFieldSoap[][] toSoapModels(AreaSownField[][] models) {
        AreaSownFieldSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new AreaSownFieldSoap[models.length][models[0].length];
        } else {
            soapModels = new AreaSownFieldSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static AreaSownFieldSoap[] toSoapModels(List<AreaSownField> models) {
        List<AreaSownFieldSoap> soapModels = new ArrayList<AreaSownFieldSoap>(models.size());

        for (AreaSownField model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new AreaSownFieldSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _areaSownFieldsId;
    }

    public void setPrimaryKey(long pk) {
        setAreaSownFieldsId(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getAreaSownFieldsId() {
        return _areaSownFieldsId;
    }

    public void setAreaSownFieldsId(long areaSownFieldsId) {
        _areaSownFieldsId = areaSownFieldsId;
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

    public long getFarmerId() {
        return _farmerId;
    }

    public void setFarmerId(long farmerId) {
        _farmerId = farmerId;
    }

    public long getAreaId() {
        return _areaId;
    }

    public void setAreaId(long areaId) {
        _areaId = areaId;
    }
}
