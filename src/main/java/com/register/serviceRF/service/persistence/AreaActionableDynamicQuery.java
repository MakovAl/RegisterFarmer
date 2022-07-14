package com.register.serviceRF.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.register.serviceRF.model.Area;
import com.register.serviceRF.service.AreaLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class AreaActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public AreaActionableDynamicQuery() throws SystemException {
        setBaseLocalService(AreaLocalServiceUtil.getService());
        setClass(Area.class);

        setClassLoader(com.register.serviceRF.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("areaId");
    }
}
