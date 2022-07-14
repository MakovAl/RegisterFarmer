package com.register.serviceRF.permission;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.register.serviceRF.model.Area;
import com.register.serviceRF.service.AreaLocalServiceUtil;

public class AreaPermission {
	
    public static void check(PermissionChecker permissionChecker,
            long areaId, String actionId) throws PortalException,
            SystemException {

        if (!contains(permissionChecker, areaId, actionId)) {
            throw new PrincipalException();
        }
    }

    public static boolean contains(PermissionChecker permissionChecker,
            long areaId, String actionId) throws PortalException,
            SystemException {

        Area area = AreaLocalServiceUtil
                .getArea(areaId);

        return permissionChecker
                .hasPermission(area.getGroupId(),
                        Area.class.getName(), area.getAreaId(),
                        actionId);

    }
}
