package com.register.serviceRF.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.register.serviceRF.model.Farmer;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Farmer in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Farmer
 * @generated
 */
public class FarmerCacheModel implements CacheModel<Farmer>, Externalizable {
    public String uuid;
    public long farmerId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String nameOrganization;
    public String organizationalLegalForm;
    public long INN;
    public long KPP;
    public long OGRN;
    public String registrationArea;
    public String areasSownFields;
    public long registrationDate;
    public boolean inArchive;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(35);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", farmerId=");
        sb.append(farmerId);
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
        sb.append(", nameOrganization=");
        sb.append(nameOrganization);
        sb.append(", organizationalLegalForm=");
        sb.append(organizationalLegalForm);
        sb.append(", INN=");
        sb.append(INN);
        sb.append(", KPP=");
        sb.append(KPP);
        sb.append(", OGRN=");
        sb.append(OGRN);
        sb.append(", registrationArea=");
        sb.append(registrationArea);
        sb.append(", areasSownFields=");
        sb.append(areasSownFields);
        sb.append(", registrationDate=");
        sb.append(registrationDate);
        sb.append(", inArchive=");
        sb.append(inArchive);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Farmer toEntityModel() {
        FarmerImpl farmerImpl = new FarmerImpl();

        if (uuid == null) {
            farmerImpl.setUuid(StringPool.BLANK);
        } else {
            farmerImpl.setUuid(uuid);
        }

        farmerImpl.setFarmerId(farmerId);
        farmerImpl.setGroupId(groupId);
        farmerImpl.setCompanyId(companyId);
        farmerImpl.setUserId(userId);

        if (userName == null) {
            farmerImpl.setUserName(StringPool.BLANK);
        } else {
            farmerImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            farmerImpl.setCreateDate(null);
        } else {
            farmerImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            farmerImpl.setModifiedDate(null);
        } else {
            farmerImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (nameOrganization == null) {
            farmerImpl.setNameOrganization(StringPool.BLANK);
        } else {
            farmerImpl.setNameOrganization(nameOrganization);
        }

        if (organizationalLegalForm == null) {
            farmerImpl.setOrganizationalLegalForm(StringPool.BLANK);
        } else {
            farmerImpl.setOrganizationalLegalForm(organizationalLegalForm);
        }

        farmerImpl.setINN(INN);
        farmerImpl.setKPP(KPP);
        farmerImpl.setOGRN(OGRN);

        if (registrationArea == null) {
            farmerImpl.setRegistrationArea(StringPool.BLANK);
        } else {
            farmerImpl.setRegistrationArea(registrationArea);
        }

        if (areasSownFields == null) {
            farmerImpl.setAreasSownFields(StringPool.BLANK);
        } else {
            farmerImpl.setAreasSownFields(areasSownFields);
        }

        if (registrationDate == Long.MIN_VALUE) {
            farmerImpl.setRegistrationDate(null);
        } else {
            farmerImpl.setRegistrationDate(new Date(registrationDate));
        }

        farmerImpl.setInArchive(inArchive);

        farmerImpl.resetOriginalValues();

        return farmerImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        farmerId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        nameOrganization = objectInput.readUTF();
        organizationalLegalForm = objectInput.readUTF();
        INN = objectInput.readLong();
        KPP = objectInput.readLong();
        OGRN = objectInput.readLong();
        registrationArea = objectInput.readUTF();
        areasSownFields = objectInput.readUTF();
        registrationDate = objectInput.readLong();
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

        objectOutput.writeLong(farmerId);
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

        if (nameOrganization == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(nameOrganization);
        }

        if (organizationalLegalForm == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(organizationalLegalForm);
        }

        objectOutput.writeLong(INN);
        objectOutput.writeLong(KPP);
        objectOutput.writeLong(OGRN);

        if (registrationArea == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(registrationArea);
        }

        if (areasSownFields == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(areasSownFields);
        }

        objectOutput.writeLong(registrationDate);
        objectOutput.writeBoolean(inArchive);
    }
}
