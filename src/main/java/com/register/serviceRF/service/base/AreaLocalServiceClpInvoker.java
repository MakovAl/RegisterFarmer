package com.register.serviceRF.service.base;

import com.register.serviceRF.service.AreaLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AreaLocalServiceClpInvoker {
    private String _methodName0;
    private String[] _methodParameterTypes0;
    private String _methodName1;
    private String[] _methodParameterTypes1;
    private String _methodName2;
    private String[] _methodParameterTypes2;
    private String _methodName3;
    private String[] _methodParameterTypes3;
    private String _methodName4;
    private String[] _methodParameterTypes4;
    private String _methodName5;
    private String[] _methodParameterTypes5;
    private String _methodName6;
    private String[] _methodParameterTypes6;
    private String _methodName7;
    private String[] _methodParameterTypes7;
    private String _methodName8;
    private String[] _methodParameterTypes8;
    private String _methodName9;
    private String[] _methodParameterTypes9;
    private String _methodName10;
    private String[] _methodParameterTypes10;
    private String _methodName11;
    private String[] _methodParameterTypes11;
    private String _methodName12;
    private String[] _methodParameterTypes12;
    private String _methodName13;
    private String[] _methodParameterTypes13;
    private String _methodName14;
    private String[] _methodParameterTypes14;
    private String _methodName15;
    private String[] _methodParameterTypes15;
    private String _methodName16;
    private String[] _methodParameterTypes16;
    private String _methodName17;
    private String[] _methodParameterTypes17;
    private String _methodName18;
    private String[] _methodParameterTypes18;
    private String _methodName19;
    private String[] _methodParameterTypes19;
    private String _methodName52;
    private String[] _methodParameterTypes52;
    private String _methodName53;
    private String[] _methodParameterTypes53;
    private String _methodName58;
    private String[] _methodParameterTypes58;
    private String _methodName59;
    private String[] _methodParameterTypes59;
    private String _methodName60;
    private String[] _methodParameterTypes60;
    private String _methodName61;
    private String[] _methodParameterTypes61;
    private String _methodName62;
    private String[] _methodParameterTypes62;
    private String _methodName63;
    private String[] _methodParameterTypes63;
    private String _methodName64;
    private String[] _methodParameterTypes64;
    private String _methodName65;
    private String[] _methodParameterTypes65;
    private String _methodName66;
    private String[] _methodParameterTypes66;
    private String _methodName67;
    private String[] _methodParameterTypes67;
    private String _methodName68;
    private String[] _methodParameterTypes68;
    private String _methodName70;
    private String[] _methodParameterTypes70;

    public AreaLocalServiceClpInvoker() {
        _methodName0 = "addArea";

        _methodParameterTypes0 = new String[] {
                "com.register.serviceRF.model.Area"
            };

        _methodName1 = "createArea";

        _methodParameterTypes1 = new String[] { "long" };

        _methodName2 = "deleteArea";

        _methodParameterTypes2 = new String[] { "long" };

        _methodName3 = "deleteArea";

        _methodParameterTypes3 = new String[] {
                "com.register.serviceRF.model.Area"
            };

        _methodName4 = "dynamicQuery";

        _methodParameterTypes4 = new String[] {  };

        _methodName5 = "dynamicQuery";

        _methodParameterTypes5 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName6 = "dynamicQuery";

        _methodParameterTypes6 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
            };

        _methodName7 = "dynamicQuery";

        _methodParameterTypes7 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName8 = "dynamicQueryCount";

        _methodParameterTypes8 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName9 = "dynamicQueryCount";

        _methodParameterTypes9 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery",
                "com.liferay.portal.kernel.dao.orm.Projection"
            };

        _methodName10 = "fetchArea";

        _methodParameterTypes10 = new String[] { "long" };

        _methodName11 = "fetchAreaByUuidAndCompanyId";

        _methodParameterTypes11 = new String[] { "java.lang.String", "long" };

        _methodName12 = "fetchAreaByUuidAndGroupId";

        _methodParameterTypes12 = new String[] { "java.lang.String", "long" };

        _methodName13 = "getArea";

        _methodParameterTypes13 = new String[] { "long" };

        _methodName14 = "getPersistedModel";

        _methodParameterTypes14 = new String[] { "java.io.Serializable" };

        _methodName15 = "getAreaByUuidAndCompanyId";

        _methodParameterTypes15 = new String[] { "java.lang.String", "long" };

        _methodName16 = "getAreaByUuidAndGroupId";

        _methodParameterTypes16 = new String[] { "java.lang.String", "long" };

        _methodName17 = "getAreas";

        _methodParameterTypes17 = new String[] { "int", "int" };

        _methodName18 = "getAreasCount";

        _methodParameterTypes18 = new String[] {  };

        _methodName19 = "updateArea";

        _methodParameterTypes19 = new String[] {
                "com.register.serviceRF.model.Area"
            };

        _methodName52 = "getBeanIdentifier";

        _methodParameterTypes52 = new String[] {  };

        _methodName53 = "setBeanIdentifier";

        _methodParameterTypes53 = new String[] { "java.lang.String" };

        _methodName58 = "addArea";

        _methodParameterTypes58 = new String[] {
                "long", "java.lang.String", "boolean",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName59 = "deleteArea";

        _methodParameterTypes59 = new String[] {
                "long", "com.liferay.portal.service.ServiceContext"
            };

        _methodName60 = "getAreas";

        _methodParameterTypes60 = new String[] { "long" };

        _methodName61 = "getAreas";

        _methodParameterTypes61 = new String[] { "long", "int", "int" };

        _methodName62 = "getAreas";

        _methodParameterTypes62 = new String[] { "long", "java.lang.Boolean" };

        _methodName63 = "getAreas";

        _methodParameterTypes63 = new String[] {
                "long", "java.lang.Boolean", "int", "int"
            };

        _methodName64 = "getArea";

        _methodParameterTypes64 = new String[] { "long", "java.lang.Boolean" };

        _methodName65 = "getAreas";

        _methodParameterTypes65 = new String[] { "long", "java.lang.String" };

        _methodName66 = "getAreas";

        _methodParameterTypes66 = new String[] { "java.lang.String" };

        _methodName67 = "getAreasCount";

        _methodParameterTypes67 = new String[] { "long" };

        _methodName68 = "getAreasCount";

        _methodParameterTypes68 = new String[] { "long", "java.lang.Boolean" };

        _methodName70 = "updateArea";

        _methodParameterTypes70 = new String[] {
                "long", "long", "java.lang.String", "java.lang.Boolean",
                "com.liferay.portal.service.ServiceContext"
            };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return AreaLocalServiceUtil.addArea((com.register.serviceRF.model.Area) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return AreaLocalServiceUtil.createArea(((Long) arguments[0]).longValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return AreaLocalServiceUtil.deleteArea(((Long) arguments[0]).longValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return AreaLocalServiceUtil.deleteArea((com.register.serviceRF.model.Area) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return AreaLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return AreaLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return AreaLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return AreaLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return AreaLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return AreaLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return AreaLocalServiceUtil.fetchArea(((Long) arguments[0]).longValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return AreaLocalServiceUtil.fetchAreaByUuidAndCompanyId((java.lang.String) arguments[0],
                ((Long) arguments[1]).longValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return AreaLocalServiceUtil.fetchAreaByUuidAndGroupId((java.lang.String) arguments[0],
                ((Long) arguments[1]).longValue());
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return AreaLocalServiceUtil.getArea(((Long) arguments[0]).longValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return AreaLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return AreaLocalServiceUtil.getAreaByUuidAndCompanyId((java.lang.String) arguments[0],
                ((Long) arguments[1]).longValue());
        }

        if (_methodName16.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes16, parameterTypes)) {
            return AreaLocalServiceUtil.getAreaByUuidAndGroupId((java.lang.String) arguments[0],
                ((Long) arguments[1]).longValue());
        }

        if (_methodName17.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes17, parameterTypes)) {
            return AreaLocalServiceUtil.getAreas(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName18.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes18, parameterTypes)) {
            return AreaLocalServiceUtil.getAreasCount();
        }

        if (_methodName19.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes19, parameterTypes)) {
            return AreaLocalServiceUtil.updateArea((com.register.serviceRF.model.Area) arguments[0]);
        }

        if (_methodName52.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes52, parameterTypes)) {
            return AreaLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName53.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes53, parameterTypes)) {
            AreaLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName58.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes58, parameterTypes)) {
            return AreaLocalServiceUtil.addArea(((Long) arguments[0]).longValue(),
                (java.lang.String) arguments[1],
                ((Boolean) arguments[2]).booleanValue(),
                (com.liferay.portal.service.ServiceContext) arguments[3]);
        }

        if (_methodName59.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes59, parameterTypes)) {
            return AreaLocalServiceUtil.deleteArea(((Long) arguments[0]).longValue(),
                (com.liferay.portal.service.ServiceContext) arguments[1]);
        }

        if (_methodName60.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes60, parameterTypes)) {
            return AreaLocalServiceUtil.getAreas(((Long) arguments[0]).longValue());
        }

        if (_methodName61.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes61, parameterTypes)) {
            return AreaLocalServiceUtil.getAreas(((Long) arguments[0]).longValue(),
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName62.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes62, parameterTypes)) {
            return AreaLocalServiceUtil.getAreas(((Long) arguments[0]).longValue(),
                (java.lang.Boolean) arguments[1]);
        }

        if (_methodName63.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes63, parameterTypes)) {
            return AreaLocalServiceUtil.getAreas(((Long) arguments[0]).longValue(),
                (java.lang.Boolean) arguments[1],
                ((Integer) arguments[2]).intValue(),
                ((Integer) arguments[3]).intValue());
        }

        if (_methodName64.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes64, parameterTypes)) {
            return AreaLocalServiceUtil.getArea(((Long) arguments[0]).longValue(),
                (java.lang.Boolean) arguments[1]);
        }

        if (_methodName65.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes65, parameterTypes)) {
            return AreaLocalServiceUtil.getAreas(((Long) arguments[0]).longValue(),
                (java.lang.String) arguments[1]);
        }

        if (_methodName66.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes66, parameterTypes)) {
            return AreaLocalServiceUtil.getAreas((java.lang.String) arguments[0]);
        }

        if (_methodName67.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes67, parameterTypes)) {
            return AreaLocalServiceUtil.getAreasCount(((Long) arguments[0]).longValue());
        }

        if (_methodName68.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes68, parameterTypes)) {
            return AreaLocalServiceUtil.getAreasCount(((Long) arguments[0]).longValue(),
                (java.lang.Boolean) arguments[1]);
        }

        if (_methodName70.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes70, parameterTypes)) {
            return AreaLocalServiceUtil.updateArea(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue(),
                (java.lang.String) arguments[2],
                (java.lang.Boolean) arguments[3],
                (com.liferay.portal.service.ServiceContext) arguments[4]);
        }

        throw new UnsupportedOperationException();
    }
}
