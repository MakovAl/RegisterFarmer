create index IX_F89E5873 on RF_Area (areaId, inArchive);
create index IX_936FC4CC on RF_Area (groupId);
create index IX_7EABF001 on RF_Area (groupId, inArchive);
create index IX_299E00BC on RF_Area (groupId, title);
create index IX_644673AA on RF_Area (title);
create index IX_AD081A56 on RF_Area (uuid_);
create index IX_DBEB3812 on RF_Area (uuid_, companyId);
create unique index IX_A4A69B14 on RF_Area (uuid_, groupId);

create index IX_CF5DAEB5 on RF_AreaSownField (groupId);
create index IX_178597C7 on RF_AreaSownField (groupId, farmerId);
create index IX_A4096A7F on RF_AreaSownField (uuid_);
create index IX_E96B6449 on RF_AreaSownField (uuid_, companyId);
create unique index IX_11E2690B on RF_AreaSownField (uuid_, groupId);

create index IX_7BA81C60 on RF_AreaSownFields (groupId);

create index IX_CDFC2F6 on RF_Farmer (groupId);
create index IX_9F165397 on RF_Farmer (groupId, inArchive);
create index IX_F91F1D0 on RF_Farmer (groupId, registrationArea);
create index IX_A3D59B00 on RF_Farmer (uuid_);
create index IX_81A58928 on RF_Farmer (uuid_, companyId);
create unique index IX_F5CE39AA on RF_Farmer (uuid_, groupId);