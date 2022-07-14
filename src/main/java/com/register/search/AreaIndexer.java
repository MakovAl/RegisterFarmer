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
import com.register.serviceRF.model.Area;
import com.register.serviceRF.permission.AreaPermission;
import com.register.serviceRF.service.AreaLocalServiceUtil;
import com.register.serviceRF.service.persistence.AreaActionableDynamicQuery;

public class AreaIndexer  extends BaseIndexer {
    
    public static final String[] CLASS_NAMES = { Area.class.getName() };
    
    public static final String PORTLET_ID = "register-areas-portlet";
    
    public AreaIndexer() {
            
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
                    String areaClassName, long areaClassPK, String actionId)
                    throws Exception {

            return AreaPermission.contains(permissionChecker, areaClassPK,
                            ActionKeys.VIEW);
    }

    @Override
    protected void doDelete(Object obj) throws Exception {
            
            Area area = (Area)obj;
            
            deleteDocument(area.getCompanyId(), area.getAreaId());
    }

    @Override
    protected Document doGetDocument(Object obj) throws Exception {
            
    	Area area = (Area)obj;

            Document document = getBaseModelDocument(PORTLET_ID, area);

            document.addDate(Field.MODIFIED_DATE, area.getModifiedDate());
            document.addText(Field.CONTENT, String.valueOf(area.getInArchive()));
            document.addText(Field.TITLE, area.getTitle());
            document.addKeyword(Field.GROUP_ID, getSiteGroupId(area.getGroupId()));
            document.addKeyword(Field.SCOPE_GROUP_ID, area.getGroupId());
            
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
            
            Area area = (Area)obj;

            Document document = getDocument(area);

            SearchEngineUtil.updateDocument(
                    getSearchEngineId(), area.getCompanyId(), document);
    }

    @Override
    protected void doReindex(String className, long classPK) throws Exception {

            Area area = AreaLocalServiceUtil.getArea(classPK);

            doReindex(area);
    }

    @Override
    protected void doReindex(String[] ids) throws Exception {

            long companyId = GetterUtil.getLong(ids[0]);

            reindexAreas(companyId);
    }

    @Override
    protected String getPortletId(SearchContext searchContext) {
            
            return PORTLET_ID;
    }
    
    protected void reindexAreas(long companyId) throws PortalException,
                    SystemException {

            final Collection<Document> documents = new ArrayList<Document>();

            ActionableDynamicQuery actionableDynamicQuery = new AreaActionableDynamicQuery() {

                    @Override
                    protected void addCriteria(DynamicQuery dynamicQuery) {
                    }

                    @Override
                    protected void performAction(Object object) throws PortalException {
                            Area area = (Area) object;

                            Document document = getDocument(area);

                            documents.add(document);
                    }

            };

            actionableDynamicQuery.setCompanyId(companyId);

            actionableDynamicQuery.performActions();

            SearchEngineUtil.updateDocuments(getSearchEngineId(), companyId,
                            documents);
    }

}
