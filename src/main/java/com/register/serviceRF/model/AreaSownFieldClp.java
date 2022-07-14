package com.register.serviceRF.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.register.serviceRF.service.AreaSownFieldLocalServiceUtil;
import com.register.serviceRF.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class AreaSownFieldClp extends BaseModelImpl<AreaSownField>
    implements AreaSownField {
    private String _uuid;
    private long _areaSownFieldsId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private long _farmerId;
    private long _areaId;
    private BaseModel<?> _areaSownFieldRemoteModel;
    private Class<?> _clpSerializerClass = com.register.serviceRF.service.ClpSerializer.class;

    public AreaSownFieldClp() {
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
    public long getPrimaryKey() {
        return _areaSownFieldsId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setAreaSownFieldsId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _areaSownFieldsId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public String getUuid() {
        return _uuid;
    }

    @Override
    public void setUuid(String uuid) {
        _uuid = uuid;

        if (_areaSownFieldRemoteModel != null) {
            try {
                Class<?> clazz = _areaSownFieldRemoteModel.getClass();

                Method method = clazz.getMethod("setUuid", String.class);

                method.invoke(_areaSownFieldRemoteModel, uuid);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getAreaSownFieldsId() {
        return _areaSownFieldsId;
    }

    @Override
    public void setAreaSownFieldsId(long areaSownFieldsId) {
        _areaSownFieldsId = areaSownFieldsId;

        if (_areaSownFieldRemoteModel != null) {
            try {
                Class<?> clazz = _areaSownFieldRemoteModel.getClass();

                Method method = clazz.getMethod("setAreaSownFieldsId",
                        long.class);

                method.invoke(_areaSownFieldRemoteModel, areaSownFieldsId);
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

        if (_areaSownFieldRemoteModel != null) {
            try {
                Class<?> clazz = _areaSownFieldRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_areaSownFieldRemoteModel, groupId);
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

        if (_areaSownFieldRemoteModel != null) {
            try {
                Class<?> clazz = _areaSownFieldRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_areaSownFieldRemoteModel, companyId);
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

        if (_areaSownFieldRemoteModel != null) {
            try {
                Class<?> clazz = _areaSownFieldRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_areaSownFieldRemoteModel, userId);
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

        if (_areaSownFieldRemoteModel != null) {
            try {
                Class<?> clazz = _areaSownFieldRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_areaSownFieldRemoteModel, userName);
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

        if (_areaSownFieldRemoteModel != null) {
            try {
                Class<?> clazz = _areaSownFieldRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_areaSownFieldRemoteModel, createDate);
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

        if (_areaSownFieldRemoteModel != null) {
            try {
                Class<?> clazz = _areaSownFieldRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_areaSownFieldRemoteModel, modifiedDate);
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

        if (_areaSownFieldRemoteModel != null) {
            try {
                Class<?> clazz = _areaSownFieldRemoteModel.getClass();

                Method method = clazz.getMethod("setFarmerId", long.class);

                method.invoke(_areaSownFieldRemoteModel, farmerId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getAreaId() {
        return _areaId;
    }

    @Override
    public void setAreaId(long areaId) {
        _areaId = areaId;

        if (_areaSownFieldRemoteModel != null) {
            try {
                Class<?> clazz = _areaSownFieldRemoteModel.getClass();

                Method method = clazz.getMethod("setAreaId", long.class);

                method.invoke(_areaSownFieldRemoteModel, areaId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public StagedModelType getStagedModelType() {
        return new StagedModelType(PortalUtil.getClassNameId(
                AreaSownField.class.getName()));
    }

    public BaseModel<?> getAreaSownFieldRemoteModel() {
        return _areaSownFieldRemoteModel;
    }

    public void setAreaSownFieldRemoteModel(
        BaseModel<?> areaSownFieldRemoteModel) {
        _areaSownFieldRemoteModel = areaSownFieldRemoteModel;
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

        Class<?> remoteModelClass = _areaSownFieldRemoteModel.getClass();

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

        Object returnValue = method.invoke(_areaSownFieldRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            AreaSownFieldLocalServiceUtil.addAreaSownField(this);
        } else {
            AreaSownFieldLocalServiceUtil.updateAreaSownField(this);
        }
    }

    @Override
    public AreaSownField toEscapedModel() {
        return (AreaSownField) ProxyUtil.newProxyInstance(AreaSownField.class.getClassLoader(),
            new Class[] { AreaSownField.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        AreaSownFieldClp clone = new AreaSownFieldClp();

        clone.setUuid(getUuid());
        clone.setAreaSownFieldsId(getAreaSownFieldsId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setFarmerId(getFarmerId());
        clone.setAreaId(getAreaId());

        return clone;
    }

    @Override
    public int compareTo(AreaSownField areaSownField) {
        long primaryKey = areaSownField.getPrimaryKey();

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

        if (!(obj instanceof AreaSownFieldClp)) {
            return false;
        }

        AreaSownFieldClp areaSownField = (AreaSownFieldClp) obj;

        long primaryKey = areaSownField.getPrimaryKey();

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
        StringBundler sb = new StringBundler(21);

        sb.append("{uuid=");
        sb.append(getUuid());
        sb.append(", areaSownFieldsId=");
        sb.append(getAreaSownFieldsId());
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
        sb.append(", farmerId=");
        sb.append(getFarmerId());
        sb.append(", areaId=");
        sb.append(getAreaId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(34);

        sb.append("<model><model-name>");
        sb.append("com.register.serviceRF.model.AreaSownField");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>uuid</column-name><column-value><![CDATA[");
        sb.append(getUuid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>areaSownFieldsId</column-name><column-value><![CDATA[");
        sb.append(getAreaSownFieldsId());
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
            "<column><column-name>farmerId</column-name><column-value><![CDATA[");
        sb.append(getFarmerId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>areaId</column-name><column-value><![CDATA[");
        sb.append(getAreaId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
