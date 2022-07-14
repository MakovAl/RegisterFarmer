create table RF_Area (
	uuid_ VARCHAR(75) null,
	areaId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	title VARCHAR(75) null,
	areaCode LONG,
	inArchive BOOLEAN
);

create table RF_AreaSownField (
	uuid_ VARCHAR(75) null,
	areaSownFieldsId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	farmerId LONG,
	areaId LONG
);

create table RF_AreaSownFields (
	areaSownFieldsId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	farmerId LONG,
	areaId LONG
);

create table RF_Farmer (
	uuid_ VARCHAR(75) null,
	farmerId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nameOrganization VARCHAR(75) null,
	organizationalLegalForm VARCHAR(75) null,
	INN LONG,
	KPP LONG,
	OGRN LONG,
	registrationArea VARCHAR(75) null,
	areasSownFields VARCHAR(75) null,
	registrationDate DATE null,
	inArchive BOOLEAN
);