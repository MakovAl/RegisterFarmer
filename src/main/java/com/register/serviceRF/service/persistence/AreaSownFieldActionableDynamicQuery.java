package com.register.serviceRF.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.register.serviceRF.model.AreaSownField;
import com.register.serviceRF.service.AreaSownFieldLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class AreaSownFieldActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public AreaSownFieldActionableDynamicQuery() throws SystemException {
        setBaseLocalService(AreaSownFieldLocalServiceUtil.getService());
        setClass(AreaSownField.class);

        setClassLoader(com.register.serviceRF.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("areaSownFieldsId");
    }
}
