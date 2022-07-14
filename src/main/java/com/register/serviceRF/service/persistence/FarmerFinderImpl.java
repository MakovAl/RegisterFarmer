package com.register.serviceRF.service.persistence;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Order;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.register.serviceRF.model.Farmer;
import com.register.serviceRF.service.FarmerLocalServiceUtil;

public class FarmerFinderImpl extends BasePersistenceImpl<Farmer> implements FarmerFinder{
	List<Farmer> findByDateRangeAndGroupeId(long groupId, 
			Date startDate, Date endDate) {
	    Session session = null;
	    try {
	        session = openSession();

	        ClassLoader classLoader = getClass().getClassLoader();



	        DynamicQuery farmerQuery = DynamicQueryFactoryUtil.forClass(Farmer.class, classLoader)
	            .add(RestrictionsFactoryUtil.between("registrationDate", startDate, endDate))
	            .setProjection(ProjectionFactoryUtil.property("farmerId"));


	        List<Farmer> farmer = FarmerLocalServiceUtil.dynamicQuery(farmerQuery);


	        return farmer;
	    }
	    catch (Exception e) {
	        try {
	            throw new SystemException(e);
	        }
	        catch (SystemException se) {
	            se.printStackTrace();
	        }
	    }
	    finally {
	        closeSession(session);
	    }
		return null;
	}
}
