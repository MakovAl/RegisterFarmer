package com.register.serviceRF.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.register.serviceRF.service.AreaLocalServiceUtil;
import com.register.serviceRF.service.AreaServiceUtil;
import com.register.serviceRF.service.AreaSownFieldLocalServiceUtil;
import com.register.serviceRF.service.AreaSownFieldServiceUtil;
import com.register.serviceRF.service.ClpSerializer;
import com.register.serviceRF.service.FarmerLocalServiceUtil;
import com.register.serviceRF.service.FarmerServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            AreaLocalServiceUtil.clearService();

            AreaServiceUtil.clearService();
            AreaSownFieldLocalServiceUtil.clearService();

            AreaSownFieldServiceUtil.clearService();
            FarmerLocalServiceUtil.clearService();

            FarmerServiceUtil.clearService();
        }
    }
}
