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

import com.register.serviceRF.model.Farmer;
import com.register.serviceRF.model.FarmerModel;
import com.register.serviceRF.model.FarmerSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Farmer service. Represents a row in the &quot;RF_Farmer&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.register.serviceRF.model.FarmerModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FarmerImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerImpl
 * @see com.register.serviceRF.model.Farmer
 * @see com.register.serviceRF.model.FarmerModel
 * @generated
 */
@JSON(strict = true)
public class FarmerModelImpl extends BaseModelImpl<Farmer>
    implements FarmerModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a farmer model instance should use the {@link com.register.serviceRF.model.Farmer} interface instead.
     */
    public static final String TABLE_NAME = "RF_Farmer";
    public static final Object[][] TABLE_COLUMNS = {
            { "uuid_", Types.VARCHAR },
            { "farmerId", Types.BIGINT },
            { "groupId", Types.BIGINT },
            { "companyId", Types.BIGINT },
            { "userId", Types.BIGINT },
            { "userName", Types.VARCHAR },
            { "createDate", Types.TIMESTAMP },
            { "modifiedDate", Types.TIMESTAMP },
            { "nameOrganization", Types.VARCHAR },
            { "organizationalLegalForm", Types.VARCHAR },
            { "INN", Types.BIGINT },
            { "KPP", Types.BIGINT },
            { "OGRN", Types.BIGINT },
            { "registrationArea", Types.VARCHAR },
            { "areasSownFields", Types.VARCHAR },
            { "registrationDate", Types.TIMESTAMP },
            { "inArchive", Types.BOOLEAN }
        };
    public static final String TABLE_SQL_CREATE = "create table RF_Farmer (uuid_ VARCHAR(75) null,farmerId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,nameOrganization VARCHAR(75) null,organizationalLegalForm VARCHAR(75) null,INN LONG,KPP LONG,OGRN LONG,registrationArea VARCHAR(75) null,areasSownFields VARCHAR(75) null,registrationDate DATE null,inArchive BOOLEAN)";
    public static final String TABLE_SQL_DROP = "drop table RF_Farmer";
    public static final String ORDER_BY_JPQL = " ORDER BY farmer.farmerId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY RF_Farmer.farmerId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.register.serviceRF.model.Farmer"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.register.serviceRF.model.Farmer"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.register.serviceRF.model.Farmer"),
            true);
    public static long COMPANYID_COLUMN_BITMASK = 1L;
    public static long GROUPID_COLUMN_BITMASK = 2L;
    public static long INARCHIVE_COLUMN_BITMASK = 4L;
    public static long REGISTRATIONAREA_COLUMN_BITMASK = 8L;
    public static long UUID_COLUMN_BITMASK = 16L;
    public static long FARMERID_COLUMN_BITMASK = 32L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.register.serviceRF.model.Farmer"));
    private static ClassLoader _classLoader = Farmer.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] { Farmer.class };
    private String _uuid;
    private String _originalUuid;
    private long _farmerId;
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
    private String _nameOrganization;
    private String _organizationalLegalForm;
    private long _INN;
    private long _KPP;
    private long _OGRN;
    private String _registrationArea;
    private String _originalRegistrationArea;
    private String _areasSownFields;
    private Date _registrationDate;
    private boolean _inArchive;
    private boolean _originalInArchive;
    private boolean _setOriginalInArchive;
    private long _columnBitmask;
    private Farmer _escapedModel;

    public FarmerModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static Farmer toModel(FarmerSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        Farmer model = new FarmerImpl();

        model.setUuid(soapModel.getUuid());
        model.setFarmerId(soapModel.getFarmerId());
        model.setGroupId(soapModel.getGroupId());
        model.setCompanyId(soapModel.getCompanyId());
        model.setUserId(soapModel.getUserId());
        model.setUserName(soapModel.getUserName());
        model.setCreateDate(soapModel.getCreateDate());
        model.setModifiedDate(soapModel.getModifiedDate());
        model.setNameOrganization(soapModel.getNameOrganization());
        model.setOrganizationalLegalForm(soapModel.getOrganizationalLegalForm());
        model.setINN(soapModel.getINN());
        model.setKPP(soapModel.getKPP());
        model.setOGRN(soapModel.getOGRN());
        model.setRegistrationArea(soapModel.getRegistrationArea());
        model.setAreasSownFields(soapModel.getAreasSownFields());
        model.setRegistrationDate(soapModel.getRegistrationDate());
        model.setInArchive(soapModel.getInArchive());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<Farmer> toModels(FarmerSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<Farmer> models = new ArrayList<Farmer>(soapModels.length);

        for (FarmerSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
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
    public long getFarmerId() {
        return _farmerId;
    }

    @Override
    public void setFarmerId(long farmerId) {
        _farmerId = farmerId;
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
    public String getNameOrganization() {
        if (_nameOrganization == null) {
            return StringPool.BLANK;
        } else {
            return _nameOrganization;
        }
    }

    @Override
    public void setNameOrganization(String nameOrganization) {
        _nameOrganization = nameOrganization;
    }

    @JSON
    @Override
    public String getOrganizationalLegalForm() {
        if (_organizationalLegalForm == null) {
            return StringPool.BLANK;
        } else {
            return _organizationalLegalForm;
        }
    }

    @Override
    public void setOrganizationalLegalForm(String organizationalLegalForm) {
        _organizationalLegalForm = organizationalLegalForm;
    }

    @JSON
    @Override
    public long getINN() {
        return _INN;
    }

    @Override
    public void setINN(long INN) {
        _INN = INN;
    }

    @JSON
    @Override
    public long getKPP() {
        return _KPP;
    }

    @Override
    public void setKPP(long KPP) {
        _KPP = KPP;
    }

    @JSON
    @Override
    public long getOGRN() {
        return _OGRN;
    }

    @Override
    public void setOGRN(long OGRN) {
        _OGRN = OGRN;
    }

    @JSON
    @Override
    public String getRegistrationArea() {
        if (_registrationArea == null) {
            return StringPool.BLANK;
        } else {
            return _registrationArea;
        }
    }

    @Override
    public void setRegistrationArea(String registrationArea) {
        _columnBitmask |= REGISTRATIONAREA_COLUMN_BITMASK;

        if (_originalRegistrationArea == null) {
            _originalRegistrationArea = _registrationArea;
        }

        _registrationArea = registrationArea;
    }

    public String getOriginalRegistrationArea() {
        return GetterUtil.getString(_originalRegistrationArea);
    }

    @JSON
    @Override
    public String getAreasSownFields() {
        if (_areasSownFields == null) {
            return StringPool.BLANK;
        } else {
            return _areasSownFields;
        }
    }

    @Override
    public void setAreasSownFields(String areasSownFields) {
        _areasSownFields = areasSownFields;
    }

    @JSON
    @Override
    public Date getRegistrationDate() {
        return _registrationDate;
    }

    @Override
    public void setRegistrationDate(Date registrationDate) {
        _registrationDate = registrationDate;
    }

    @JSON
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
        _columnBitmask |= INARCHIVE_COLUMN_BITMASK;

        if (!_setOriginalInArchive) {
            _setOriginalInArchive = true;

            _originalInArchive = _inArchive;
        }

        _inArchive = inArchive;
    }

    public boolean getOriginalInArchive() {
        return _originalInArchive;
    }

    @Override
    public StagedModelType getStagedModelType() {
        return new StagedModelType(PortalUtil.getClassNameId(
                Farmer.class.getName()));
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
            Farmer.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Farmer toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Farmer) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        FarmerImpl farmerImpl = new FarmerImpl();

        farmerImpl.setUuid(getUuid());
        farmerImpl.setFarmerId(getFarmerId());
        farmerImpl.setGroupId(getGroupId());
        farmerImpl.setCompanyId(getCompanyId());
        farmerImpl.setUserId(getUserId());
        farmerImpl.setUserName(getUserName());
        farmerImpl.setCreateDate(getCreateDate());
        farmerImpl.setModifiedDate(getModifiedDate());
        farmerImpl.setNameOrganization(getNameOrganization());
        farmerImpl.setOrganizationalLegalForm(getOrganizationalLegalForm());
        farmerImpl.setINN(getINN());
        farmerImpl.setKPP(getKPP());
        farmerImpl.setOGRN(getOGRN());
        farmerImpl.setRegistrationArea(getRegistrationArea());
        farmerImpl.setAreasSownFields(getAreasSownFields());
        farmerImpl.setRegistrationDate(getRegistrationDate());
        farmerImpl.setInArchive(getInArchive());

        farmerImpl.resetOriginalValues();

        return farmerImpl;
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

        if (!(obj instanceof Farmer)) {
            return false;
        }

        Farmer farmer = (Farmer) obj;

        long primaryKey = farmer.getPrimaryKey();

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
        FarmerModelImpl farmerModelImpl = this;

        farmerModelImpl._originalUuid = farmerModelImpl._uuid;

        farmerModelImpl._originalGroupId = farmerModelImpl._groupId;

        farmerModelImpl._setOriginalGroupId = false;

        farmerModelImpl._originalCompanyId = farmerModelImpl._companyId;

        farmerModelImpl._setOriginalCompanyId = false;

        farmerModelImpl._originalRegistrationArea = farmerModelImpl._registrationArea;

        farmerModelImpl._originalInArchive = farmerModelImpl._inArchive;

        farmerModelImpl._setOriginalInArchive = false;

        farmerModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<Farmer> toCacheModel() {
        FarmerCacheModel farmerCacheModel = new FarmerCacheModel();

        farmerCacheModel.uuid = getUuid();

        String uuid = farmerCacheModel.uuid;

        if ((uuid != null) && (uuid.length() == 0)) {
            farmerCacheModel.uuid = null;
        }

        farmerCacheModel.farmerId = getFarmerId();

        farmerCacheModel.groupId = getGroupId();

        farmerCacheModel.companyId = getCompanyId();

        farmerCacheModel.userId = getUserId();

        farmerCacheModel.userName = getUserName();

        String userName = farmerCacheModel.userName;

        if ((userName != null) && (userName.length() == 0)) {
            farmerCacheModel.userName = null;
        }

        Date createDate = getCreateDate();

        if (createDate != null) {
            farmerCacheModel.createDate = createDate.getTime();
        } else {
            farmerCacheModel.createDate = Long.MIN_VALUE;
        }

        Date modifiedDate = getModifiedDate();

        if (modifiedDate != null) {
            farmerCacheModel.modifiedDate = modifiedDate.getTime();
        } else {
            farmerCacheModel.modifiedDate = Long.MIN_VALUE;
        }

        farmerCacheModel.nameOrganization = getNameOrganization();

        String nameOrganization = farmerCacheModel.nameOrganization;

        if ((nameOrganization != null) && (nameOrganization.length() == 0)) {
            farmerCacheModel.nameOrganization = null;
        }

        farmerCacheModel.organizationalLegalForm = getOrganizationalLegalForm();

        String organizationalLegalForm = farmerCacheModel.organizationalLegalForm;

        if ((organizationalLegalForm != null) &&
                (organizationalLegalForm.length() == 0)) {
            farmerCacheModel.organizationalLegalForm = null;
        }

        farmerCacheModel.INN = getINN();

        farmerCacheModel.KPP = getKPP();

        farmerCacheModel.OGRN = getOGRN();

        farmerCacheModel.registrationArea = getRegistrationArea();

        String registrationArea = farmerCacheModel.registrationArea;

        if ((registrationArea != null) && (registrationArea.length() == 0)) {
            farmerCacheModel.registrationArea = null;
        }

        farmerCacheModel.areasSownFields = getAreasSownFields();

        String areasSownFields = farmerCacheModel.areasSownFields;

        if ((areasSownFields != null) && (areasSownFields.length() == 0)) {
            farmerCacheModel.areasSownFields = null;
        }

        Date registrationDate = getRegistrationDate();

        if (registrationDate != null) {
            farmerCacheModel.registrationDate = registrationDate.getTime();
        } else {
            farmerCacheModel.registrationDate = Long.MIN_VALUE;
        }

        farmerCacheModel.inArchive = getInArchive();

        return farmerCacheModel;
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
