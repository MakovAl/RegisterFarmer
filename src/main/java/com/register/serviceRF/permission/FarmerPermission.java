package com.register.serviceRF.permission;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.register.serviceRF.model.Farmer;
import com.register.serviceRF.service.FarmerLocalServiceUtil;

public class FarmerPermission {
	
    public static void check(PermissionChecker permissionChecker,
            long farmerId, String actionId) throws PortalException,
            SystemException {

        if (!contains(permissionChecker, farmerId, actionId)) {
            throw new PrincipalException();
        }
    }

    public static boolean contains(PermissionChecker permissionChecker,
            long farmerId, String actionId) throws PortalException,
            SystemException {

        Farmer farmer = FarmerLocalServiceUtil
                .getFarmer(farmerId);

        return permissionChecker
                .hasPermission(farmer.getGroupId(),
                        Farmer.class.getName(), farmer.getFarmerId(),
                        actionId);

    }
}
