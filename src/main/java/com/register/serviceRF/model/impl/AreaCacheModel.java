package com.register.serviceRF.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.register.serviceRF.model.Area;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Area in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Area
 * @generated
 */
public class AreaCacheModel implements CacheModel<Area>, Externalizable {
    public String uuid;
    public long areaId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String title;
    public long areaCode;
    public boolean inArchive;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(23);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", areaId=");
        sb.append(areaId);
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
        sb.append(", title=");
        sb.append(title);
        sb.append(", areaCode=");
        sb.append(areaCode);
        sb.append(", inArchive=");
        sb.append(inArchive);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Area toEntityModel() {
        AreaImpl areaImpl = new AreaImpl();

        if (uuid == null) {
            areaImpl.setUuid(StringPool.BLANK);
        } else {
            areaImpl.setUuid(uuid);
        }

        areaImpl.setAreaId(areaId);
        areaImpl.setGroupId(groupId);
        areaImpl.setCompanyId(companyId);
        areaImpl.setUserId(userId);

        if (userName == null) {
            areaImpl.setUserName(StringPool.BLANK);
        } else {
            areaImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            areaImpl.setCreateDate(null);
        } else {
            areaImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            areaImpl.setModifiedDate(null);
        } else {
            areaImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (title == null) {
            areaImpl.setTitle(StringPool.BLANK);
        } else {
            areaImpl.setTitle(title);
        }

        areaImpl.setAreaCode(areaCode);
        areaImpl.setInArchive(inArchive);

        areaImpl.resetOriginalValues();

        return areaImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        areaId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        title = objectInput.readUTF();
        areaCode = objectInput.readLong();
        inArchive = objectInput.readBoolean();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(areaId);
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

        if (title == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(title);
        }

        objectOutput.writeLong(areaCode);
        objectOutput.writeBoolean(inArchive);
    }
}
