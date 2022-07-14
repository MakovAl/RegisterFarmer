package com.register.search;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

import javax.portlet.PortletURL;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.BaseIndexer;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.SearchEngineUtil;
import com.liferay.portal.kernel.search.Summary;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.security.permission.ActionKeys;
import com.liferay.portal.security.permission.PermissionChecker;
import com.register.serviceRF.model.Farmer;
import com.register.serviceRF.permission.FarmerPermission;
import com.register.serviceRF.service.FarmerLocalServiceUtil;
import com.register.serviceRF.service.persistence.FarmerActionableDynamicQuery;

public class FarmerIndexer  extends BaseIndexer {
    
    public static final String[] CLASS_NAMES = { Farmer.class.getName() };
    
    public static final String PORTLET_ID = "RegisterFarmers-portlet";
    
    public FarmerIndexer() {
            
            setPermissionAware(true);
    }

    @Override
    public String[] getClassNames() {
            
            return CLASS_NAMES;
    }

    @Override
    public String getPortletId() {
            
            return PORTLET_ID;
    }

    @Override
    public boolean hasPermission(PermissionChecker permissionChecker,
                    String farmerClassName, long farmerClassPK, String farmerId)
                    throws Exception {

            return FarmerPermission.contains(permissionChecker, farmerClassPK,
                            ActionKeys.VIEW);
    }

    @Override
    protected void doDelete(Object obj) throws Exception {
            
            Farmer farmer = (Farmer)obj;
            
            deleteDocument(farmer.getCompanyId(), farmer.getFarmerId());
    }

    @Override
    protected Document doGetDocument(Object obj) throws Exception {
            
    	Farmer farmer = (Farmer)obj;

            Document document = getBaseModelDocument(PORTLET_ID, farmer);

            document.addDate(Field.MODIFIED_DATE, farmer.getModifiedDate());
            document.addNumber(Field.CONTENT, farmer.getINN());
            document.addText(Field.TITLE, farmer.getNameOrganization());
            document.addText("inArchive", String.valueOf(farmer.getInArchive()));
            document.addText("registrationArea", farmer.getRegistrationArea());
            document.addDate("registrationDate", farmer.getRegistrationDate());
            document.addKeyword(Field.GROUP_ID, getSiteGroupId(farmer.getGroupId()));
            document.addKeyword(Field.SCOPE_GROUP_ID, farmer.getGroupId());
            
            return document;
    }

    @Override
    protected Summary doGetSummary(Document document, Locale locale,
                    String snippet, PortletURL portletURL) throws Exception {
            
            Summary summary = createSummary(document);

            summary.setMaxContentLength(200);

            return summary;
    }

    @Override
    protected void doReindex(Object obj) throws Exception {
            
            Farmer farmer = (Farmer)obj;

            Document document = getDocument(farmer);

            SearchEngineUtil.updateDocument(
                    getSearchEngineId(), farmer.getCompanyId(), document);
    }

    @Override
    protected void doReindex(String className, long classPK) throws Exception {

            Farmer farmer = FarmerLocalServiceUtil.getFarmer(classPK);

            doReindex(farmer);
    }

    @Override
    protected void doReindex(String[] ids) throws Exception {

            long companyId = GetterUtil.getLong(ids[0]);

            reindexFarmers(companyId);
    }

    @Override
    protected String getPortletId(SearchContext searchContext) {
            
            return PORTLET_ID;
    }
    
    protected void reindexFarmers(long companyId) throws PortalException,
                    SystemException {

            final Collection<Document> documents = new ArrayList<Document>();

            ActionableDynamicQuery actionableDynamicQuery = new FarmerActionableDynamicQuery() {

                    @Override
                    protected void addCriteria(DynamicQuery dynamicQuery) {
                    }

                    @Override
                    protected void performAction(Object object) throws PortalException {
                            Farmer farmer = (Farmer) object;

                            Document document = getDocument(farmer);

                            documents.add(document);
                    }

            };

            actionableDynamicQuery.setCompanyId(companyId);

            actionableDynamicQuery.performActions();

            SearchEngineUtil.updateDocuments(getSearchEngineId(), companyId,
                            documents);
    }

}
