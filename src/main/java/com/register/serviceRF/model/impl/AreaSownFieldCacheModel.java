package com.register.serviceRF.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.register.serviceRF.model.AreaSownField;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AreaSownField in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see AreaSownField
 * @generated
 */
public class AreaSownFieldCacheModel implements CacheModel<AreaSownField>,
    Externalizable {
    public String uuid;
    public long areaSownFieldsId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public long farmerId;
    public long areaId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", areaSownFieldsId=");
        sb.append(areaSownFieldsId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", userName=");
        sb.append(userName);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", farmerId=");
        sb.append(farmerId);
        sb.append(", areaId=");
        sb.append(areaId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public AreaSownField toEntityModel() {
        AreaSownFieldImpl areaSownFieldImpl = new AreaSownFieldImpl();

        if (uuid == null) {
            areaSownFieldImpl.setUuid(StringPool.BLANK);
        } else {
            areaSownFieldImpl.setUuid(uuid);
        }

        areaSownFieldImpl.setAreaSownFieldsId(areaSownFieldsId);
        areaSownFieldImpl.setGroupId(groupId);
        areaSownFieldImpl.setCompanyId(companyId);
        areaSownFieldImpl.setUserId(userId);

        if (userName == null) {
            areaSownFieldImpl.setUserName(StringPool.BLANK);
        } else {
            areaSownFieldImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            areaSownFieldImpl.setCreateDate(null);
        } else {
            areaSownFieldImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            areaSownFieldImpl.setModifiedDate(null);
        } else {
            areaSownFieldImpl.setModifiedDate(new Date(modifiedDate));
        }

        areaSownFieldImpl.setFarmerId(farmerId);
        areaSownFieldImpl.setAreaId(areaId);

        areaSownFieldImpl.resetOriginalValues();

        return areaSownFieldImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        areaSownFieldsId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        farmerId = objectInput.readLong();
        areaId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(areaSownFieldsId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);
        objectOutput.writeLong(farmerId);
        objectOutput.writeLong(areaId);
    }
}
