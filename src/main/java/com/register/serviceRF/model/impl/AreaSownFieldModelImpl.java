package com.register.serviceRF.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.register.serviceRF.model.AreaSownField;
import com.register.serviceRF.model.AreaSownFieldModel;
import com.register.serviceRF.model.AreaSownFieldSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the AreaSownField service. Represents a row in the &quot;RF_AreaSownField&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.register.serviceRF.model.AreaSownFieldModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AreaSownFieldImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AreaSownFieldImpl
 * @see com.register.serviceRF.model.AreaSownField
 * @see com.register.serviceRF.model.AreaSownFieldModel
 * @generated
 */
@JSON(strict = true)
public class AreaSownFieldModelImpl extends BaseModelImpl<AreaSownField>
    implements AreaSownFieldModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a area sown field model instance should use the {@link com.register.serviceRF.model.AreaSownField} interface instead.
     */
    public static final String TABLE_NAME = "RF_AreaSownField";
    public static final Object[][] TABLE_COLUMNS = {
            { "uuid_", Types.VARCHAR },
            { "areaSownFieldsId", Types.BIGINT },
            { "groupId", Types.BIGINT },
            { "companyId", Types.BIGINT },
            { "userId", Types.BIGINT },
            { "userName", Types.VARCHAR },
            { "createDate", Types.TIMESTAMP },
            { "modifiedDate", Types.TIMESTAMP },
            { "farmerId", Types.BIGINT },
            { "areaId", Types.BIGINT }
        };
    public static final String TABLE_SQL_CREATE = "create table RF_AreaSownField (uuid_ VARCHAR(75) null,areaSownFieldsId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,farmerId LONG,areaId LONG)";
    public static final String TABLE_SQL_DROP = "drop table RF_AreaSownField";
    public static final String ORDER_BY_JPQL = " ORDER BY areaSownField.areaSownFieldsId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY RF_AreaSownField.areaSownFieldsId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.register.serviceRF.model.AreaSownField"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.register.serviceRF.model.AreaSownField"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.register.serviceRF.model.AreaSownField"),
            true);
    public static long COMPANYID_COLUMN_BITMASK = 1L;
    public static long FARMERID_COLUMN_BITMASK = 2L;
    public static long GROUPID_COLUMN_BITMASK = 4L;
    public static long UUID_COLUMN_BITMASK = 8L;
    public static long AREASOWNFIELDSID_COLUMN_BITMASK = 16L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.register.serviceRF.model.AreaSownField"));
    private static ClassLoader _classLoader = AreaSownField.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            AreaSownField.class
        };
    private String _uuid;
    private String _originalUuid;
    private long _areaSownFieldsId;
    private long _groupId;
    private long _originalGroupId;
    private boolean _setOriginalGroupId;
    private long _companyId;
    private long _originalCompanyId;
    private boolean _setOriginalCompanyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private long _farmerId;
    private long _originalFarmerId;
    private boolean _setOriginalFarmerId;
    private long _areaId;
    private long _columnBitmask;
    private AreaSownField _escapedModel;

    public AreaSownFieldModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static AreaSownField toModel(AreaSownFieldSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        AreaSownField model = new AreaSownFieldImpl();

        model.setUuid(soapModel.getUuid());
        model.setAreaSownFieldsId(soapModel.getAreaSownFieldsId());
        model.setGroupId(soapModel.getGroupId());
        model.setCompanyId(soapModel.getCompanyId());
        model.setUserId(soapModel.getUserId());
        model.setUserName(soapModel.getUserName());
        model.setCreateDate(soapModel.getCreateDate());
        model.setModifiedDate(soapModel.getModifiedDate());
        model.setFarmerId(soapModel.getFarmerId());
        model.setAreaId(soapModel.getAreaId());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<AreaSownField> toModels(AreaSownFieldSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<AreaSownField> models = new ArrayList<AreaSownField>(soapModels.length);

        for (AreaSownFieldSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
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

    @JSON
    @Override
    public String getUuid() {
        if (_uuid == null) {
            return StringPool.BLANK;
        } else {
            return _uuid;
        }
    }

    @Override
    public void setUuid(String uuid) {
        if (_originalUuid == null) {
            _originalUuid = _uuid;
        }

        _uuid = uuid;
    }

    public String getOriginalUuid() {
        return GetterUtil.getString(_originalUuid);
    }

    @JSON
    @Override
    public long getAreaSownFieldsId() {
        return _areaSownFieldsId;
    }

    @Override
    public void setAreaSownFieldsId(long areaSownFieldsId) {
        _areaSownFieldsId = areaSownFieldsId;
    }

    @JSON
    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _columnBitmask |= GROUPID_COLUMN_BITMASK;

        if (!_setOriginalGroupId) {
            _setOriginalGroupId = true;

            _originalGroupId = _groupId;
        }

        _groupId = groupId;
    }

    public long getOriginalGroupId() {
        return _originalGroupId;
    }

    @JSON
    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _columnBitmask |= COMPANYID_COLUMN_BITMASK;

        if (!_setOriginalCompanyId) {
            _setOriginalCompanyId = true;

            _originalCompanyId = _companyId;
        }

        _companyId = companyId;
    }

    public long getOriginalCompanyId() {
        return _originalCompanyId;
    }

    @JSON
    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @JSON
    @Override
    public String getUserName() {
        if (_userName == null) {
            return StringPool.BLANK;
        } else {
            return _userName;
        }
    }

    @Override
    public void setUserName(String userName) {
        _userName = userName;
    }

    @JSON
    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    @JSON
    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    @JSON
    @Override
    public long getFarmerId() {
        return _farmerId;
    }

    @Override
    public void setFarmerId(long farmerId) {
        _columnBitmask |= FARMERID_COLUMN_BITMASK;

        if (!_setOriginalFarmerId) {
            _setOriginalFarmerId = true;

            _originalFarmerId = _farmerId;
        }

        _farmerId = farmerId;
    }

    public long getOriginalFarmerId() {
        return _originalFarmerId;
    }

    @JSON
    @Override
    public long getAreaId() {
        return _areaId;
    }

    @Override
    public void setAreaId(long areaId) {
        _areaId = areaId;
    }

    @Override
    public StagedModelType getStagedModelType() {
        return new StagedModelType(PortalUtil.getClassNameId(
                AreaSownField.class.getName()));
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
            AreaSownField.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public AreaSownField toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (AreaSownField) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        AreaSownFieldImpl areaSownFieldImpl = new AreaSownFieldImpl();

        areaSownFieldImpl.setUuid(getUuid());
        areaSownFieldImpl.setAreaSownFieldsId(getAreaSownFieldsId());
        areaSownFieldImpl.setGroupId(getGroupId());
        areaSownFieldImpl.setCompanyId(getCompanyId());
        areaSownFieldImpl.setUserId(getUserId());
        areaSownFieldImpl.setUserName(getUserName());
        areaSownFieldImpl.setCreateDate(getCreateDate());
        areaSownFieldImpl.setModifiedDate(getModifiedDate());
        areaSownFieldImpl.setFarmerId(getFarmerId());
        areaSownFieldImpl.setAreaId(getAreaId());

        areaSownFieldImpl.resetOriginalValues();

        return areaSownFieldImpl;
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

        if (!(obj instanceof AreaSownField)) {
            return false;
        }

        AreaSownField areaSownField = (AreaSownField) obj;

        long primaryKey = areaSownField.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
        AreaSownFieldModelImpl areaSownFieldModelImpl = this;

        areaSownFieldModelImpl._originalUuid = areaSownFieldModelImpl._uuid;

        areaSownFieldModelImpl._originalGroupId = areaSownFieldModelImpl._groupId;

        areaSownFieldModelImpl._setOriginalGroupId = false;

        areaSownFieldModelImpl._originalCompanyId = areaSownFieldModelImpl._companyId;

        areaSownFieldModelImpl._setOriginalCompanyId = false;

        areaSownFieldModelImpl._originalFarmerId = areaSownFieldModelImpl._farmerId;

        areaSownFieldModelImpl._setOriginalFarmerId = false;

        areaSownFieldModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<AreaSownField> toCacheModel() {
        AreaSownFieldCacheModel areaSownFieldCacheModel = new AreaSownFieldCacheModel();

        areaSownFieldCacheModel.uuid = getUuid();

        String uuid = areaSownFieldCacheModel.uuid;

        if ((uuid != null) && (uuid.length() == 0)) {
            areaSownFieldCacheModel.uuid = null;
        }

        areaSownFieldCacheModel.areaSownFieldsId = getAreaSownFieldsId();

        areaSownFieldCacheModel.groupId = getGroupId();

        areaSownFieldCacheModel.companyId = getCompanyId();

        areaSownFieldCacheModel.userId = getUserId();

        areaSownFieldCacheModel.userName = getUserName();

        String userName = areaSownFieldCacheModel.userName;

        if ((userName != null) && (userName.length() == 0)) {
            areaSownFieldCacheModel.userName = null;
        }

        Date createDate = getCreateDate();

        if (createDate != null) {
            areaSownFieldCacheModel.createDate = createDate.getTime();
        } else {
            areaSownFieldCacheModel.createDate = Long.MIN_VALUE;
        }

        Date modifiedDate = getModifiedDate();

        if (modifiedDate != null) {
            areaSownFieldCacheModel.modifiedDate = modifiedDate.getTime();
        } else {
            areaSownFieldCacheModel.modifiedDate = Long.MIN_VALUE;
        }

        areaSownFieldCacheModel.farmerId = getFarmerId();

        areaSownFieldCacheModel.areaId = getAreaId();

        return areaSownFieldCacheModel;
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
