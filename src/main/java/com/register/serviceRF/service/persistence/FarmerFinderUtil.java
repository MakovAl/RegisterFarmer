package com.register.serviceRF.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class FarmerFinderUtil {
    private static FarmerFinder _finder;

    public static FarmerFinder getFinder() {
        if (_finder == null) {
            _finder = (FarmerFinder) PortletBeanLocatorUtil.locate(com.register.serviceRF.service.ClpSerializer.getServletContextName(),
                    FarmerFinder.class.getName());

            ReferenceRegistry.registerReference(FarmerFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(FarmerFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(FarmerFinderUtil.class, "_finder");
    }
}
