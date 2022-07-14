package com.register.serviceRF.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AreaService}.
 *
 * @author Brian Wing Shun Chan
 * @see AreaService
 * @generated
 */
public class AreaServiceWrapper implements AreaService,
    ServiceWrapper<AreaService> {
    private AreaService _areaService;

    public AreaServiceWrapper(AreaService areaService) {
        _areaService = areaService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _areaService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _areaService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _areaService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public AreaService getWrappedAreaService() {
        return _areaService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedAreaService(AreaService areaService) {
        _areaService = areaService;
    }

    @Override
    public AreaService getWrappedService() {
        return _areaService;
    }

    @Override
    public void setWrappedService(AreaService areaService) {
        _areaService = areaService;
    }
}
