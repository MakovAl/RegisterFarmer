package com.register.serviceRF.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AreaSownFieldService}.
 *
 * @author Brian Wing Shun Chan
 * @see AreaSownFieldService
 * @generated
 */
public class AreaSownFieldServiceWrapper implements AreaSownFieldService,
    ServiceWrapper<AreaSownFieldService> {
    private AreaSownFieldService _areaSownFieldService;

    public AreaSownFieldServiceWrapper(
        AreaSownFieldService areaSownFieldService) {
        _areaSownFieldService = areaSownFieldService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _areaSownFieldService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _areaSownFieldService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _areaSownFieldService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public AreaSownFieldService getWrappedAreaSownFieldService() {
        return _areaSownFieldService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedAreaSownFieldService(
        AreaSownFieldService areaSownFieldService) {
        _areaSownFieldService = areaSownFieldService;
    }

    @Override
    public AreaSownFieldService getWrappedService() {
        return _areaSownFieldService;
    }

    @Override
    public void setWrappedService(AreaSownFieldService areaSownFieldService) {
        _areaSownFieldService = areaSownFieldService;
    }
}
