package com.register.serviceRF.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.register.serviceRF.service.ClpSerializer;
import com.register.serviceRF.service.FarmerLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class FarmerClp extends BaseModelImpl<Farmer> implements Farmer {
    private String _uuid;
    private long _farmerId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
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
    private BaseModel<?> _farmerRemoteModel;
    private Class<?> _clpSerializerClass = com.register.serviceRF.service.ClpSerializer.class;

    public FarmerClp() {
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
    public long getPrimaryKey() {
        return _farmerId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setFarmerId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _farmerId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public String getUuid() {
        return _uuid;
    }

    @Override
    public void setUuid(String uuid) {
        _uuid = uuid;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setUuid", String.class);

                method.invoke(_farmerRemoteModel, uuid);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getFarmerId() {
        return _farmerId;
    }

    @Override
    public void setFarmerId(long farmerId) {
        _farmerId = farmerId;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setFarmerId", long.class);

                method.invoke(_farmerRemoteModel, farmerId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_farmerRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_farmerRemoteModel, companyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_farmerRemoteModel, userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public String getUserName() {
        return _userName;
    }

    @Override
    public void setUserName(String userName) {
        _userName = userName;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_farmerRemoteModel, userName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_farmerRemoteModel, createDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_farmerRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getNameOrganization() {
        return _nameOrganization;
    }

    @Override
    public void setNameOrganization(String nameOrganization) {
        _nameOrganization = nameOrganization;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setNameOrganization",
                        String.class);

                method.invoke(_farmerRemoteModel, nameOrganization);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getOrganizationalLegalForm() {
        return _organizationalLegalForm;
    }

    @Override
    public void setOrganizationalLegalForm(String organizationalLegalForm) {
        _organizationalLegalForm = organizationalLegalForm;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setOrganizationalLegalForm",
                        String.class);

                method.invoke(_farmerRemoteModel, organizationalLegalForm);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getINN() {
        return _INN;
    }

    @Override
    public void setINN(long INN) {
        _INN = INN;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setINN", long.class);

                method.invoke(_farmerRemoteModel, INN);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getKPP() {
        return _KPP;
    }

    @Override
    public void setKPP(long KPP) {
        _KPP = KPP;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setKPP", long.class);

                method.invoke(_farmerRemoteModel, KPP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getOGRN() {
        return _OGRN;
    }

    @Override
    public void setOGRN(long OGRN) {
        _OGRN = OGRN;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setOGRN", long.class);

                method.invoke(_farmerRemoteModel, OGRN);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getRegistrationArea() {
        return _registrationArea;
    }

    @Override
    public void setRegistrationArea(String registrationArea) {
        _registrationArea = registrationArea;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setRegistrationArea",
                        String.class);

                method.invoke(_farmerRemoteModel, registrationArea);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAreasSownFields() {
        return _areasSownFields;
    }

    @Override
    public void setAreasSownFields(String areasSownFields) {
        _areasSownFields = areasSownFields;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setAreasSownFields",
                        String.class);

                method.invoke(_farmerRemoteModel, areasSownFields);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getRegistrationDate() {
        return _registrationDate;
    }

    @Override
    public void setRegistrationDate(Date registrationDate) {
        _registrationDate = registrationDate;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setRegistrationDate",
                        Date.class);

                method.invoke(_farmerRemoteModel, registrationDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getInArchive() {
        return _inArchive;
    }

    @Override
    public boolean isInArchive() {
        return _inArchive;
    }

    @Override
    public void setInArchive(boolean inArchive) {
        _inArchive = inArchive;

        if (_farmerRemoteModel != null) {
            try {
                Class<?> clazz = _farmerRemoteModel.getClass();

                Method method = clazz.getMethod("setInArchive", boolean.class);

                method.invoke(_farmerRemoteModel, inArchive);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public StagedModelType getStagedModelType() {
        return new StagedModelType(PortalUtil.getClassNameId(
                Farmer.class.getName()));
    }

    public BaseModel<?> getFarmerRemoteModel() {
        return _farmerRemoteModel;
    }

    public void setFarmerRemoteModel(BaseModel<?> farmerRemoteModel) {
        _farmerRemoteModel = farmerRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _farmerRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_farmerRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            FarmerLocalServiceUtil.addFarmer(this);
        } else {
            FarmerLocalServiceUtil.updateFarmer(this);
        }
    }

    @Override
    public Farmer toEscapedModel() {
        return (Farmer) ProxyUtil.newProxyInstance(Farmer.class.getClassLoader(),
            new Class[] { Farmer.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        FarmerClp clone = new FarmerClp();

        clone.setUuid(getUuid());
        clone.setFarmerId(getFarmerId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setNameOrganization(getNameOrganization());
        clone.setOrganizationalLegalForm(getOrganizationalLegalForm());
        clone.setINN(getINN());
        clone.setKPP(getKPP());
        clone.setOGRN(getOGRN());
        clone.setRegistrationArea(getRegistrationArea());
        clone.setAreasSownFields(getAreasSownFields());
        clone.setRegistrationDate(getRegistrationDate());
        clone.setInArchive(getInArchive());

        return clone;
    }

    @Override
    public int compareTo(Farmer farmer) {
        long primaryKey = farmer.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof FarmerClp)) {
            return false;
        }

        FarmerClp farmer = (FarmerClp) obj;

        long primaryKey = farmer.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(35);

        sb.append("{uuid=");
        sb.append(getUuid());
        sb.append(", farmerId=");
        sb.append(getFarmerId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", userName=");
        sb.append(getUserName());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", nameOrganization=");
        sb.append(getNameOrganization());
        sb.append(", organizationalLegalForm=");
        sb.append(getOrganizationalLegalForm());
        sb.append(", INN=");
        sb.append(getINN());
        sb.append(", KPP=");
        sb.append(getKPP());
        sb.append(", OGRN=");
        sb.append(getOGRN());
        sb.append(", registrationArea=");
        sb.append(getRegistrationArea());
        sb.append(", areasSownFields=");
        sb.append(getAreasSownFields());
        sb.append(", registrationDate=");
        sb.append(getRegistrationDate());
        sb.append(", inArchive=");
        sb.append(getInArchive());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(55);

        sb.append("<model><model-name>");
        sb.append("com.register.serviceRF.model.Farmer");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>uuid</column-name><column-value><![CDATA[");
        sb.append(getUuid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>farmerId</column-name><column-value><![CDATA[");
        sb.append(getFarmerId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userName</column-name><column-value><![CDATA[");
        sb.append(getUserName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>nameOrganization</column-name><column-value><![CDATA[");
        sb.append(getNameOrganization());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>organizationalLegalForm</column-name><column-value><![CDATA[");
        sb.append(getOrganizationalLegalForm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>INN</column-name><column-value><![CDATA[");
        sb.append(getINN());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>KPP</column-name><column-value><![CDATA[");
        sb.append(getKPP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>OGRN</column-name><column-value><![CDATA[");
        sb.append(getOGRN());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>registrationArea</column-name><column-value><![CDATA[");
        sb.append(getRegistrationArea());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>areasSownFields</column-name><column-value><![CDATA[");
        sb.append(getAreasSownFields());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>registrationDate</column-name><column-value><![CDATA[");
        sb.append(getRegistrationDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>inArchive</column-name><column-value><![CDATA[");
        sb.append(getInArchive());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
