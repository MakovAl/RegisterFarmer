package com.register.serviceRF.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.register.serviceRF.model.Area;
import com.register.serviceRF.service.AreaLocalServiceUtil;

/**
 * The extended model base implementation for the Area service. Represents a row in the &quot;RF_Area&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AreaImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AreaImpl
 * @see com.register.serviceRF.model.Area
 * @generated
 */
public abstract class AreaBaseImpl extends AreaModelImpl implements Area {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a area model instance should use the {@link Area} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            AreaLocalServiceUtil.addArea(this);
        } else {
            AreaLocalServiceUtil.updateArea(this);
        }
    }
}
