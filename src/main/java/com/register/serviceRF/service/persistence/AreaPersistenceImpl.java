package com.register.serviceRF.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.register.serviceRF.NoSuchAreaException;
import com.register.serviceRF.model.Area;
import com.register.serviceRF.model.impl.AreaImpl;
import com.register.serviceRF.model.impl.AreaModelImpl;
import com.register.serviceRF.service.persistence.AreaPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the area service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AreaPersistence
 * @see AreaUtil
 * @generated
 */
public class AreaPersistenceImpl extends BasePersistenceImpl<Area>
    implements AreaPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link AreaUtil} to access the area persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = AreaImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaModelImpl.FINDER_CACHE_ENABLED, AreaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaModelImpl.FINDER_CACHE_ENABLED, AreaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaModelImpl.FINDER_CACHE_ENABLED, AreaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaModelImpl.FINDER_CACHE_ENABLED, AreaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
            new String[] { String.class.getName() },
            AreaModelImpl.UUID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_UUID_UUID_1 = "area.uuid IS NULL";
    private static final String _FINDER_COLUMN_UUID_UUID_2 = "area.uuid = ?";
    private static final String _FINDER_COLUMN_UUID_UUID_3 = "(area.uuid IS NULL OR area.uuid = '')";
    public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaModelImpl.FINDER_CACHE_ENABLED, AreaImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
            new String[] { String.class.getName(), Long.class.getName() },
            AreaModelImpl.UUID_COLUMN_BITMASK |
            AreaModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "area.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "area.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(area.uuid IS NULL OR area.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "area.groupId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaModelImpl.FINDER_CACHE_ENABLED, AreaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
            new String[] {
                String.class.getName(), Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
        new FinderPath(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaModelImpl.FINDER_CACHE_ENABLED, AreaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
            new String[] { String.class.getName(), Long.class.getName() },
            AreaModelImpl.UUID_COLUMN_BITMASK |
            AreaModelImpl.COMPANYID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "area.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "area.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(area.uuid IS NULL OR area.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "area.companyId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaModelImpl.FINDER_CACHE_ENABLED, AreaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygroupId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
        new FinderPath(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaModelImpl.FINDER_CACHE_ENABLED, AreaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygroupId",
            new String[] { Long.class.getName() },
            AreaModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygroupId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "area.groupId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_I = new FinderPath(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaModelImpl.FINDER_CACHE_ENABLED, AreaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_I",
            new String[] {
                Long.class.getName(), Boolean.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_I = new FinderPath(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaModelImpl.FINDER_CACHE_ENABLED, AreaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_I",
            new String[] { Long.class.getName(), Boolean.class.getName() },
            AreaModelImpl.GROUPID_COLUMN_BITMASK |
            AreaModelImpl.INARCHIVE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_G_I = new FinderPath(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_I",
            new String[] { Long.class.getName(), Boolean.class.getName() });
    private static final String _FINDER_COLUMN_G_I_GROUPID_2 = "area.groupId = ? AND ";
    private static final String _FINDER_COLUMN_G_I_INARCHIVE_2 = "area.inArchive = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_A_I = new FinderPath(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaModelImpl.FINDER_CACHE_ENABLED, AreaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByA_I",
            new String[] {
                Long.class.getName(), Boolean.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_I = new FinderPath(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaModelImpl.FINDER_CACHE_ENABLED, AreaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByA_I",
            new String[] { Long.class.getName(), Boolean.class.getName() },
            AreaModelImpl.AREAID_COLUMN_BITMASK |
            AreaModelImpl.INARCHIVE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_A_I = new FinderPath(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByA_I",
            new String[] { Long.class.getName(), Boolean.class.getName() });
    private static final String _FINDER_COLUMN_A_I_AREAID_2 = "area.areaId = ? AND ";
    private static final String _FINDER_COLUMN_A_I_INARCHIVE_2 = "area.inArchive = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_T = new FinderPath(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaModelImpl.FINDER_CACHE_ENABLED, AreaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_T",
            new String[] {
                Long.class.getName(), String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_T = new FinderPath(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaModelImpl.FINDER_CACHE_ENABLED, AreaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_T",
            new String[] { Long.class.getName(), String.class.getName() },
            AreaModelImpl.GROUPID_COLUMN_BITMASK |
            AreaModelImpl.TITLE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_G_T = new FinderPath(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_T",
            new String[] { Long.class.getName(), String.class.getName() });
    private static final String _FINDER_COLUMN_G_T_GROUPID_2 = "area.groupId = ? AND ";
    private static final String _FINDER_COLUMN_G_T_TITLE_1 = "area.title IS NULL";
    private static final String _FINDER_COLUMN_G_T_TITLE_2 = "area.title = ?";
    private static final String _FINDER_COLUMN_G_T_TITLE_3 = "(area.title IS NULL OR area.title = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TITLE = new FinderPath(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaModelImpl.FINDER_CACHE_ENABLED, AreaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBytitle",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TITLE = new FinderPath(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaModelImpl.FINDER_CACHE_ENABLED, AreaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBytitle",
            new String[] { String.class.getName() },
            AreaModelImpl.TITLE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_TITLE = new FinderPath(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBytitle",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_TITLE_TITLE_1 = "area.title IS NULL";
    private static final String _FINDER_COLUMN_TITLE_TITLE_2 = "area.title = ?";
    private static final String _FINDER_COLUMN_TITLE_TITLE_3 = "(area.title IS NULL OR area.title = '')";
    private static final String _SQL_SELECT_AREA = "SELECT area FROM Area area";
    private static final String _SQL_SELECT_AREA_WHERE = "SELECT area FROM Area area WHERE ";
    private static final String _SQL_COUNT_AREA = "SELECT COUNT(area) FROM Area area";
    private static final String _SQL_COUNT_AREA_WHERE = "SELECT COUNT(area) FROM Area area WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "area.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Area exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Area exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(AreaPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "uuid"
            });
    private static Area _nullArea = new AreaImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Area> toCacheModel() {
                return _nullAreaCacheModel;
            }
        };

    private static CacheModel<Area> _nullAreaCacheModel = new CacheModel<Area>() {
            @Override
            public Area toEntityModel() {
                return _nullArea;
            }
        };

    public AreaPersistenceImpl() {
        setModelClass(Area.class);
    }

    /**
     * Returns all the areas where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the matching areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Area> findByUuid(String uuid) throws SystemException {
        return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the areas where uuid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param start the lower bound of the range of areas
     * @param end the upper bound of the range of areas (not inclusive)
     * @return the range of matching areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Area> findByUuid(String uuid, int start, int end)
        throws SystemException {
        return findByUuid(uuid, start, end, null);
    }

    /**
     * Returns an ordered range of all the areas where uuid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param start the lower bound of the range of areas
     * @param end the upper bound of the range of areas (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Area> findByUuid(String uuid, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
            finderArgs = new Object[] { uuid };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
            finderArgs = new Object[] { uuid, start, end, orderByComparator };
        }

        List<Area> list = (List<Area>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Area area : list) {
                if (!Validator.equals(uuid, area.getUuid())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_AREA_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_UUID_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(AreaModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                if (!pagination) {
                    list = (List<Area>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Area>(list);
                } else {
                    list = (List<Area>) QueryUtil.list(q, getDialect(), start,
                            end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first area in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching area
     * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area findByUuid_First(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchAreaException, SystemException {
        Area area = fetchByUuid_First(uuid, orderByComparator);

        if (area != null) {
            return area;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAreaException(msg.toString());
    }

    /**
     * Returns the first area in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching area, or <code>null</code> if a matching area could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area fetchByUuid_First(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        List<Area> list = findByUuid(uuid, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last area in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching area
     * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area findByUuid_Last(String uuid, OrderByComparator orderByComparator)
        throws NoSuchAreaException, SystemException {
        Area area = fetchByUuid_Last(uuid, orderByComparator);

        if (area != null) {
            return area;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAreaException(msg.toString());
    }

    /**
     * Returns the last area in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching area, or <code>null</code> if a matching area could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area fetchByUuid_Last(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid(uuid);

        if (count == 0) {
            return null;
        }

        List<Area> list = findByUuid(uuid, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the areas before and after the current area in the ordered set where uuid = &#63;.
     *
     * @param areaId the primary key of the current area
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next area
     * @throws com.register.serviceRF.NoSuchAreaException if a area with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area[] findByUuid_PrevAndNext(long areaId, String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchAreaException, SystemException {
        Area area = findByPrimaryKey(areaId);

        Session session = null;

        try {
            session = openSession();

            Area[] array = new AreaImpl[3];

            array[0] = getByUuid_PrevAndNext(session, area, uuid,
                    orderByComparator, true);

            array[1] = area;

            array[2] = getByUuid_PrevAndNext(session, area, uuid,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Area getByUuid_PrevAndNext(Session session, Area area,
        String uuid, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_AREA_WHERE);

        boolean bindUuid = false;

        if (uuid == null) {
            query.append(_FINDER_COLUMN_UUID_UUID_1);
        } else if (uuid.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_UUID_UUID_3);
        } else {
            bindUuid = true;

            query.append(_FINDER_COLUMN_UUID_UUID_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(AreaModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindUuid) {
            qPos.add(uuid);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(area);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Area> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the areas where uuid = &#63; from the database.
     *
     * @param uuid the uuid
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid(String uuid) throws SystemException {
        for (Area area : findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
                null)) {
            remove(area);
        }
    }

    /**
     * Returns the number of areas where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the number of matching areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUuid(String uuid) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

        Object[] finderArgs = new Object[] { uuid };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_AREA_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_UUID_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the area where uuid = &#63; and groupId = &#63; or throws a {@link com.register.serviceRF.NoSuchAreaException} if it could not be found.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the matching area
     * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area findByUUID_G(String uuid, long groupId)
        throws NoSuchAreaException, SystemException {
        Area area = fetchByUUID_G(uuid, groupId);

        if (area == null) {
            StringBundler msg = new StringBundler(6);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("uuid=");
            msg.append(uuid);

            msg.append(", groupId=");
            msg.append(groupId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchAreaException(msg.toString());
        }

        return area;
    }

    /**
     * Returns the area where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the matching area, or <code>null</code> if a matching area could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area fetchByUUID_G(String uuid, long groupId)
        throws SystemException {
        return fetchByUUID_G(uuid, groupId, true);
    }

    /**
     * Returns the area where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching area, or <code>null</code> if a matching area could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area fetchByUUID_G(String uuid, long groupId,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { uuid, groupId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
                    finderArgs, this);
        }

        if (result instanceof Area) {
            Area area = (Area) result;

            if (!Validator.equals(uuid, area.getUuid()) ||
                    (groupId != area.getGroupId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_SELECT_AREA_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_G_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(groupId);

                List<Area> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
                        finderArgs, list);
                } else {
                    Area area = list.get(0);

                    result = area;

                    cacheResult(area);

                    if ((area.getUuid() == null) ||
                            !area.getUuid().equals(uuid) ||
                            (area.getGroupId() != groupId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
                            finderArgs, area);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (Area) result;
        }
    }

    /**
     * Removes the area where uuid = &#63; and groupId = &#63; from the database.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the area that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area removeByUUID_G(String uuid, long groupId)
        throws NoSuchAreaException, SystemException {
        Area area = findByUUID_G(uuid, groupId);

        return remove(area);
    }

    /**
     * Returns the number of areas where uuid = &#63; and groupId = &#63;.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the number of matching areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUUID_G(String uuid, long groupId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

        Object[] finderArgs = new Object[] { uuid, groupId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_AREA_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_G_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(groupId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the areas where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @return the matching areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Area> findByUuid_C(String uuid, long companyId)
        throws SystemException {
        return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the areas where uuid = &#63; and companyId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param start the lower bound of the range of areas
     * @param end the upper bound of the range of areas (not inclusive)
     * @return the range of matching areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Area> findByUuid_C(String uuid, long companyId, int start,
        int end) throws SystemException {
        return findByUuid_C(uuid, companyId, start, end, null);
    }

    /**
     * Returns an ordered range of all the areas where uuid = &#63; and companyId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param start the lower bound of the range of areas
     * @param end the upper bound of the range of areas (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Area> findByUuid_C(String uuid, long companyId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
            finderArgs = new Object[] { uuid, companyId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
            finderArgs = new Object[] {
                    uuid, companyId,
                    
                    start, end, orderByComparator
                };
        }

        List<Area> list = (List<Area>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Area area : list) {
                if (!Validator.equals(uuid, area.getUuid()) ||
                        (companyId != area.getCompanyId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_AREA_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_C_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(AreaModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(companyId);

                if (!pagination) {
                    list = (List<Area>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Area>(list);
                } else {
                    list = (List<Area>) QueryUtil.list(q, getDialect(), start,
                            end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first area in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching area
     * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area findByUuid_C_First(String uuid, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchAreaException, SystemException {
        Area area = fetchByUuid_C_First(uuid, companyId, orderByComparator);

        if (area != null) {
            return area;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAreaException(msg.toString());
    }

    /**
     * Returns the first area in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching area, or <code>null</code> if a matching area could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area fetchByUuid_C_First(String uuid, long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Area> list = findByUuid_C(uuid, companyId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last area in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching area
     * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area findByUuid_C_Last(String uuid, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchAreaException, SystemException {
        Area area = fetchByUuid_C_Last(uuid, companyId, orderByComparator);

        if (area != null) {
            return area;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAreaException(msg.toString());
    }

    /**
     * Returns the last area in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching area, or <code>null</code> if a matching area could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area fetchByUuid_C_Last(String uuid, long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid_C(uuid, companyId);

        if (count == 0) {
            return null;
        }

        List<Area> list = findByUuid_C(uuid, companyId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the areas before and after the current area in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param areaId the primary key of the current area
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next area
     * @throws com.register.serviceRF.NoSuchAreaException if a area with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area[] findByUuid_C_PrevAndNext(long areaId, String uuid,
        long companyId, OrderByComparator orderByComparator)
        throws NoSuchAreaException, SystemException {
        Area area = findByPrimaryKey(areaId);

        Session session = null;

        try {
            session = openSession();

            Area[] array = new AreaImpl[3];

            array[0] = getByUuid_C_PrevAndNext(session, area, uuid, companyId,
                    orderByComparator, true);

            array[1] = area;

            array[2] = getByUuid_C_PrevAndNext(session, area, uuid, companyId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Area getByUuid_C_PrevAndNext(Session session, Area area,
        String uuid, long companyId, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_AREA_WHERE);

        boolean bindUuid = false;

        if (uuid == null) {
            query.append(_FINDER_COLUMN_UUID_C_UUID_1);
        } else if (uuid.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_UUID_C_UUID_3);
        } else {
            bindUuid = true;

            query.append(_FINDER_COLUMN_UUID_C_UUID_2);
        }

        query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(AreaModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindUuid) {
            qPos.add(uuid);
        }

        qPos.add(companyId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(area);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Area> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the areas where uuid = &#63; and companyId = &#63; from the database.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid_C(String uuid, long companyId)
        throws SystemException {
        for (Area area : findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(area);
        }
    }

    /**
     * Returns the number of areas where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @return the number of matching areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUuid_C(String uuid, long companyId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

        Object[] finderArgs = new Object[] { uuid, companyId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_AREA_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_C_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(companyId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the areas where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the matching areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Area> findBygroupId(long groupId) throws SystemException {
        return findBygroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the areas where groupId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param start the lower bound of the range of areas
     * @param end the upper bound of the range of areas (not inclusive)
     * @return the range of matching areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Area> findBygroupId(long groupId, int start, int end)
        throws SystemException {
        return findBygroupId(groupId, start, end, null);
    }

    /**
     * Returns an ordered range of all the areas where groupId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param start the lower bound of the range of areas
     * @param end the upper bound of the range of areas (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Area> findBygroupId(long groupId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
            finderArgs = new Object[] { groupId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
            finderArgs = new Object[] { groupId, start, end, orderByComparator };
        }

        List<Area> list = (List<Area>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Area area : list) {
                if ((groupId != area.getGroupId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_AREA_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(AreaModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (!pagination) {
                    list = (List<Area>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Area>(list);
                } else {
                    list = (List<Area>) QueryUtil.list(q, getDialect(), start,
                            end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first area in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching area
     * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area findBygroupId_First(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchAreaException, SystemException {
        Area area = fetchBygroupId_First(groupId, orderByComparator);

        if (area != null) {
            return area;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAreaException(msg.toString());
    }

    /**
     * Returns the first area in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching area, or <code>null</code> if a matching area could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area fetchBygroupId_First(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Area> list = findBygroupId(groupId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last area in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching area
     * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area findBygroupId_Last(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchAreaException, SystemException {
        Area area = fetchBygroupId_Last(groupId, orderByComparator);

        if (area != null) {
            return area;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAreaException(msg.toString());
    }

    /**
     * Returns the last area in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching area, or <code>null</code> if a matching area could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area fetchBygroupId_Last(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countBygroupId(groupId);

        if (count == 0) {
            return null;
        }

        List<Area> list = findBygroupId(groupId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the areas before and after the current area in the ordered set where groupId = &#63;.
     *
     * @param areaId the primary key of the current area
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next area
     * @throws com.register.serviceRF.NoSuchAreaException if a area with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area[] findBygroupId_PrevAndNext(long areaId, long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchAreaException, SystemException {
        Area area = findByPrimaryKey(areaId);

        Session session = null;

        try {
            session = openSession();

            Area[] array = new AreaImpl[3];

            array[0] = getBygroupId_PrevAndNext(session, area, groupId,
                    orderByComparator, true);

            array[1] = area;

            array[2] = getBygroupId_PrevAndNext(session, area, groupId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Area getBygroupId_PrevAndNext(Session session, Area area,
        long groupId, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_AREA_WHERE);

        query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(AreaModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(area);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Area> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the areas where groupId = &#63; from the database.
     *
     * @param groupId the group ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeBygroupId(long groupId) throws SystemException {
        for (Area area : findBygroupId(groupId, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(area);
        }
    }

    /**
     * Returns the number of areas where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the number of matching areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countBygroupId(long groupId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

        Object[] finderArgs = new Object[] { groupId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_AREA_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the areas where groupId = &#63; and inArchive = &#63;.
     *
     * @param groupId the group ID
     * @param inArchive the in archive
     * @return the matching areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Area> findByG_I(long groupId, boolean inArchive)
        throws SystemException {
        return findByG_I(groupId, inArchive, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the areas where groupId = &#63; and inArchive = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param inArchive the in archive
     * @param start the lower bound of the range of areas
     * @param end the upper bound of the range of areas (not inclusive)
     * @return the range of matching areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Area> findByG_I(long groupId, boolean inArchive, int start,
        int end) throws SystemException {
        return findByG_I(groupId, inArchive, start, end, null);
    }

    /**
     * Returns an ordered range of all the areas where groupId = &#63; and inArchive = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param inArchive the in archive
     * @param start the lower bound of the range of areas
     * @param end the upper bound of the range of areas (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Area> findByG_I(long groupId, boolean inArchive, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_I;
            finderArgs = new Object[] { groupId, inArchive };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_I;
            finderArgs = new Object[] {
                    groupId, inArchive,
                    
                    start, end, orderByComparator
                };
        }

        List<Area> list = (List<Area>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Area area : list) {
                if ((groupId != area.getGroupId()) ||
                        (inArchive != area.getInArchive())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_AREA_WHERE);

            query.append(_FINDER_COLUMN_G_I_GROUPID_2);

            query.append(_FINDER_COLUMN_G_I_INARCHIVE_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(AreaModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                qPos.add(inArchive);

                if (!pagination) {
                    list = (List<Area>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Area>(list);
                } else {
                    list = (List<Area>) QueryUtil.list(q, getDialect(), start,
                            end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first area in the ordered set where groupId = &#63; and inArchive = &#63;.
     *
     * @param groupId the group ID
     * @param inArchive the in archive
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching area
     * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area findByG_I_First(long groupId, boolean inArchive,
        OrderByComparator orderByComparator)
        throws NoSuchAreaException, SystemException {
        Area area = fetchByG_I_First(groupId, inArchive, orderByComparator);

        if (area != null) {
            return area;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", inArchive=");
        msg.append(inArchive);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAreaException(msg.toString());
    }

    /**
     * Returns the first area in the ordered set where groupId = &#63; and inArchive = &#63;.
     *
     * @param groupId the group ID
     * @param inArchive the in archive
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching area, or <code>null</code> if a matching area could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area fetchByG_I_First(long groupId, boolean inArchive,
        OrderByComparator orderByComparator) throws SystemException {
        List<Area> list = findByG_I(groupId, inArchive, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last area in the ordered set where groupId = &#63; and inArchive = &#63;.
     *
     * @param groupId the group ID
     * @param inArchive the in archive
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching area
     * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area findByG_I_Last(long groupId, boolean inArchive,
        OrderByComparator orderByComparator)
        throws NoSuchAreaException, SystemException {
        Area area = fetchByG_I_Last(groupId, inArchive, orderByComparator);

        if (area != null) {
            return area;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", inArchive=");
        msg.append(inArchive);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAreaException(msg.toString());
    }

    /**
     * Returns the last area in the ordered set where groupId = &#63; and inArchive = &#63;.
     *
     * @param groupId the group ID
     * @param inArchive the in archive
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching area, or <code>null</code> if a matching area could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area fetchByG_I_Last(long groupId, boolean inArchive,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByG_I(groupId, inArchive);

        if (count == 0) {
            return null;
        }

        List<Area> list = findByG_I(groupId, inArchive, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the areas before and after the current area in the ordered set where groupId = &#63; and inArchive = &#63;.
     *
     * @param areaId the primary key of the current area
     * @param groupId the group ID
     * @param inArchive the in archive
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next area
     * @throws com.register.serviceRF.NoSuchAreaException if a area with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area[] findByG_I_PrevAndNext(long areaId, long groupId,
        boolean inArchive, OrderByComparator orderByComparator)
        throws NoSuchAreaException, SystemException {
        Area area = findByPrimaryKey(areaId);

        Session session = null;

        try {
            session = openSession();

            Area[] array = new AreaImpl[3];

            array[0] = getByG_I_PrevAndNext(session, area, groupId, inArchive,
                    orderByComparator, true);

            array[1] = area;

            array[2] = getByG_I_PrevAndNext(session, area, groupId, inArchive,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Area getByG_I_PrevAndNext(Session session, Area area,
        long groupId, boolean inArchive, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_AREA_WHERE);

        query.append(_FINDER_COLUMN_G_I_GROUPID_2);

        query.append(_FINDER_COLUMN_G_I_INARCHIVE_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(AreaModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        qPos.add(inArchive);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(area);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Area> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the areas where groupId = &#63; and inArchive = &#63; from the database.
     *
     * @param groupId the group ID
     * @param inArchive the in archive
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByG_I(long groupId, boolean inArchive)
        throws SystemException {
        for (Area area : findByG_I(groupId, inArchive, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(area);
        }
    }

    /**
     * Returns the number of areas where groupId = &#63; and inArchive = &#63;.
     *
     * @param groupId the group ID
     * @param inArchive the in archive
     * @return the number of matching areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByG_I(long groupId, boolean inArchive)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_G_I;

        Object[] finderArgs = new Object[] { groupId, inArchive };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_AREA_WHERE);

            query.append(_FINDER_COLUMN_G_I_GROUPID_2);

            query.append(_FINDER_COLUMN_G_I_INARCHIVE_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                qPos.add(inArchive);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the areas where areaId = &#63; and inArchive = &#63;.
     *
     * @param areaId the area ID
     * @param inArchive the in archive
     * @return the matching areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Area> findByA_I(long areaId, boolean inArchive)
        throws SystemException {
        return findByA_I(areaId, inArchive, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the areas where areaId = &#63; and inArchive = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param areaId the area ID
     * @param inArchive the in archive
     * @param start the lower bound of the range of areas
     * @param end the upper bound of the range of areas (not inclusive)
     * @return the range of matching areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Area> findByA_I(long areaId, boolean inArchive, int start,
        int end) throws SystemException {
        return findByA_I(areaId, inArchive, start, end, null);
    }

    /**
     * Returns an ordered range of all the areas where areaId = &#63; and inArchive = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param areaId the area ID
     * @param inArchive the in archive
     * @param start the lower bound of the range of areas
     * @param end the upper bound of the range of areas (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Area> findByA_I(long areaId, boolean inArchive, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_I;
            finderArgs = new Object[] { areaId, inArchive };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_A_I;
            finderArgs = new Object[] {
                    areaId, inArchive,
                    
                    start, end, orderByComparator
                };
        }

        List<Area> list = (List<Area>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Area area : list) {
                if ((areaId != area.getAreaId()) ||
                        (inArchive != area.getInArchive())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_AREA_WHERE);

            query.append(_FINDER_COLUMN_A_I_AREAID_2);

            query.append(_FINDER_COLUMN_A_I_INARCHIVE_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(AreaModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(areaId);

                qPos.add(inArchive);

                if (!pagination) {
                    list = (List<Area>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Area>(list);
                } else {
                    list = (List<Area>) QueryUtil.list(q, getDialect(), start,
                            end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first area in the ordered set where areaId = &#63; and inArchive = &#63;.
     *
     * @param areaId the area ID
     * @param inArchive the in archive
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching area
     * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area findByA_I_First(long areaId, boolean inArchive,
        OrderByComparator orderByComparator)
        throws NoSuchAreaException, SystemException {
        Area area = fetchByA_I_First(areaId, inArchive, orderByComparator);

        if (area != null) {
            return area;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("areaId=");
        msg.append(areaId);

        msg.append(", inArchive=");
        msg.append(inArchive);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAreaException(msg.toString());
    }

    /**
     * Returns the first area in the ordered set where areaId = &#63; and inArchive = &#63;.
     *
     * @param areaId the area ID
     * @param inArchive the in archive
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching area, or <code>null</code> if a matching area could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area fetchByA_I_First(long areaId, boolean inArchive,
        OrderByComparator orderByComparator) throws SystemException {
        List<Area> list = findByA_I(areaId, inArchive, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last area in the ordered set where areaId = &#63; and inArchive = &#63;.
     *
     * @param areaId the area ID
     * @param inArchive the in archive
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching area
     * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area findByA_I_Last(long areaId, boolean inArchive,
        OrderByComparator orderByComparator)
        throws NoSuchAreaException, SystemException {
        Area area = fetchByA_I_Last(areaId, inArchive, orderByComparator);

        if (area != null) {
            return area;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("areaId=");
        msg.append(areaId);

        msg.append(", inArchive=");
        msg.append(inArchive);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAreaException(msg.toString());
    }

    /**
     * Returns the last area in the ordered set where areaId = &#63; and inArchive = &#63;.
     *
     * @param areaId the area ID
     * @param inArchive the in archive
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching area, or <code>null</code> if a matching area could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area fetchByA_I_Last(long areaId, boolean inArchive,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByA_I(areaId, inArchive);

        if (count == 0) {
            return null;
        }

        List<Area> list = findByA_I(areaId, inArchive, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Removes all the areas where areaId = &#63; and inArchive = &#63; from the database.
     *
     * @param areaId the area ID
     * @param inArchive the in archive
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByA_I(long areaId, boolean inArchive)
        throws SystemException {
        for (Area area : findByA_I(areaId, inArchive, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(area);
        }
    }

    /**
     * Returns the number of areas where areaId = &#63; and inArchive = &#63;.
     *
     * @param areaId the area ID
     * @param inArchive the in archive
     * @return the number of matching areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByA_I(long areaId, boolean inArchive)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_A_I;

        Object[] finderArgs = new Object[] { areaId, inArchive };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_AREA_WHERE);

            query.append(_FINDER_COLUMN_A_I_AREAID_2);

            query.append(_FINDER_COLUMN_A_I_INARCHIVE_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(areaId);

                qPos.add(inArchive);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the areas where groupId = &#63; and title = &#63;.
     *
     * @param groupId the group ID
     * @param title the title
     * @return the matching areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Area> findByG_T(long groupId, String title)
        throws SystemException {
        return findByG_T(groupId, title, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the areas where groupId = &#63; and title = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param title the title
     * @param start the lower bound of the range of areas
     * @param end the upper bound of the range of areas (not inclusive)
     * @return the range of matching areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Area> findByG_T(long groupId, String title, int start, int end)
        throws SystemException {
        return findByG_T(groupId, title, start, end, null);
    }

    /**
     * Returns an ordered range of all the areas where groupId = &#63; and title = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param title the title
     * @param start the lower bound of the range of areas
     * @param end the upper bound of the range of areas (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Area> findByG_T(long groupId, String title, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_T;
            finderArgs = new Object[] { groupId, title };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_T;
            finderArgs = new Object[] {
                    groupId, title,
                    
                    start, end, orderByComparator
                };
        }

        List<Area> list = (List<Area>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Area area : list) {
                if ((groupId != area.getGroupId()) ||
                        !Validator.equals(title, area.getTitle())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_AREA_WHERE);

            query.append(_FINDER_COLUMN_G_T_GROUPID_2);

            boolean bindTitle = false;

            if (title == null) {
                query.append(_FINDER_COLUMN_G_T_TITLE_1);
            } else if (title.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_G_T_TITLE_3);
            } else {
                bindTitle = true;

                query.append(_FINDER_COLUMN_G_T_TITLE_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(AreaModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (bindTitle) {
                    qPos.add(title);
                }

                if (!pagination) {
                    list = (List<Area>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Area>(list);
                } else {
                    list = (List<Area>) QueryUtil.list(q, getDialect(), start,
                            end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first area in the ordered set where groupId = &#63; and title = &#63;.
     *
     * @param groupId the group ID
     * @param title the title
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching area
     * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area findByG_T_First(long groupId, String title,
        OrderByComparator orderByComparator)
        throws NoSuchAreaException, SystemException {
        Area area = fetchByG_T_First(groupId, title, orderByComparator);

        if (area != null) {
            return area;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", title=");
        msg.append(title);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAreaException(msg.toString());
    }

    /**
     * Returns the first area in the ordered set where groupId = &#63; and title = &#63;.
     *
     * @param groupId the group ID
     * @param title the title
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching area, or <code>null</code> if a matching area could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area fetchByG_T_First(long groupId, String title,
        OrderByComparator orderByComparator) throws SystemException {
        List<Area> list = findByG_T(groupId, title, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last area in the ordered set where groupId = &#63; and title = &#63;.
     *
     * @param groupId the group ID
     * @param title the title
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching area
     * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area findByG_T_Last(long groupId, String title,
        OrderByComparator orderByComparator)
        throws NoSuchAreaException, SystemException {
        Area area = fetchByG_T_Last(groupId, title, orderByComparator);

        if (area != null) {
            return area;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", title=");
        msg.append(title);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAreaException(msg.toString());
    }

    /**
     * Returns the last area in the ordered set where groupId = &#63; and title = &#63;.
     *
     * @param groupId the group ID
     * @param title the title
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching area, or <code>null</code> if a matching area could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area fetchByG_T_Last(long groupId, String title,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByG_T(groupId, title);

        if (count == 0) {
            return null;
        }

        List<Area> list = findByG_T(groupId, title, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the areas before and after the current area in the ordered set where groupId = &#63; and title = &#63;.
     *
     * @param areaId the primary key of the current area
     * @param groupId the group ID
     * @param title the title
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next area
     * @throws com.register.serviceRF.NoSuchAreaException if a area with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area[] findByG_T_PrevAndNext(long areaId, long groupId,
        String title, OrderByComparator orderByComparator)
        throws NoSuchAreaException, SystemException {
        Area area = findByPrimaryKey(areaId);

        Session session = null;

        try {
            session = openSession();

            Area[] array = new AreaImpl[3];

            array[0] = getByG_T_PrevAndNext(session, area, groupId, title,
                    orderByComparator, true);

            array[1] = area;

            array[2] = getByG_T_PrevAndNext(session, area, groupId, title,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Area getByG_T_PrevAndNext(Session session, Area area,
        long groupId, String title, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_AREA_WHERE);

        query.append(_FINDER_COLUMN_G_T_GROUPID_2);

        boolean bindTitle = false;

        if (title == null) {
            query.append(_FINDER_COLUMN_G_T_TITLE_1);
        } else if (title.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_G_T_TITLE_3);
        } else {
            bindTitle = true;

            query.append(_FINDER_COLUMN_G_T_TITLE_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(AreaModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (bindTitle) {
            qPos.add(title);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(area);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Area> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the areas where groupId = &#63; and title = &#63; from the database.
     *
     * @param groupId the group ID
     * @param title the title
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByG_T(long groupId, String title)
        throws SystemException {
        for (Area area : findByG_T(groupId, title, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(area);
        }
    }

    /**
     * Returns the number of areas where groupId = &#63; and title = &#63;.
     *
     * @param groupId the group ID
     * @param title the title
     * @return the number of matching areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByG_T(long groupId, String title) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_G_T;

        Object[] finderArgs = new Object[] { groupId, title };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_AREA_WHERE);

            query.append(_FINDER_COLUMN_G_T_GROUPID_2);

            boolean bindTitle = false;

            if (title == null) {
                query.append(_FINDER_COLUMN_G_T_TITLE_1);
            } else if (title.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_G_T_TITLE_3);
            } else {
                bindTitle = true;

                query.append(_FINDER_COLUMN_G_T_TITLE_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (bindTitle) {
                    qPos.add(title);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the areas where title = &#63;.
     *
     * @param title the title
     * @return the matching areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Area> findBytitle(String title) throws SystemException {
        return findBytitle(title, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the areas where title = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param title the title
     * @param start the lower bound of the range of areas
     * @param end the upper bound of the range of areas (not inclusive)
     * @return the range of matching areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Area> findBytitle(String title, int start, int end)
        throws SystemException {
        return findBytitle(title, start, end, null);
    }

    /**
     * Returns an ordered range of all the areas where title = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param title the title
     * @param start the lower bound of the range of areas
     * @param end the upper bound of the range of areas (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Area> findBytitle(String title, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TITLE;
            finderArgs = new Object[] { title };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TITLE;
            finderArgs = new Object[] { title, start, end, orderByComparator };
        }

        List<Area> list = (List<Area>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Area area : list) {
                if (!Validator.equals(title, area.getTitle())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_AREA_WHERE);

            boolean bindTitle = false;

            if (title == null) {
                query.append(_FINDER_COLUMN_TITLE_TITLE_1);
            } else if (title.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_TITLE_TITLE_3);
            } else {
                bindTitle = true;

                query.append(_FINDER_COLUMN_TITLE_TITLE_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(AreaModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindTitle) {
                    qPos.add(title);
                }

                if (!pagination) {
                    list = (List<Area>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Area>(list);
                } else {
                    list = (List<Area>) QueryUtil.list(q, getDialect(), start,
                            end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first area in the ordered set where title = &#63;.
     *
     * @param title the title
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching area
     * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area findBytitle_First(String title,
        OrderByComparator orderByComparator)
        throws NoSuchAreaException, SystemException {
        Area area = fetchBytitle_First(title, orderByComparator);

        if (area != null) {
            return area;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("title=");
        msg.append(title);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAreaException(msg.toString());
    }

    /**
     * Returns the first area in the ordered set where title = &#63;.
     *
     * @param title the title
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching area, or <code>null</code> if a matching area could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area fetchBytitle_First(String title,
        OrderByComparator orderByComparator) throws SystemException {
        List<Area> list = findBytitle(title, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last area in the ordered set where title = &#63;.
     *
     * @param title the title
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching area
     * @throws com.register.serviceRF.NoSuchAreaException if a matching area could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area findBytitle_Last(String title,
        OrderByComparator orderByComparator)
        throws NoSuchAreaException, SystemException {
        Area area = fetchBytitle_Last(title, orderByComparator);

        if (area != null) {
            return area;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("title=");
        msg.append(title);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAreaException(msg.toString());
    }

    /**
     * Returns the last area in the ordered set where title = &#63;.
     *
     * @param title the title
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching area, or <code>null</code> if a matching area could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area fetchBytitle_Last(String title,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countBytitle(title);

        if (count == 0) {
            return null;
        }

        List<Area> list = findBytitle(title, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the areas before and after the current area in the ordered set where title = &#63;.
     *
     * @param areaId the primary key of the current area
     * @param title the title
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next area
     * @throws com.register.serviceRF.NoSuchAreaException if a area with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area[] findBytitle_PrevAndNext(long areaId, String title,
        OrderByComparator orderByComparator)
        throws NoSuchAreaException, SystemException {
        Area area = findByPrimaryKey(areaId);

        Session session = null;

        try {
            session = openSession();

            Area[] array = new AreaImpl[3];

            array[0] = getBytitle_PrevAndNext(session, area, title,
                    orderByComparator, true);

            array[1] = area;

            array[2] = getBytitle_PrevAndNext(session, area, title,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Area getBytitle_PrevAndNext(Session session, Area area,
        String title, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_AREA_WHERE);

        boolean bindTitle = false;

        if (title == null) {
            query.append(_FINDER_COLUMN_TITLE_TITLE_1);
        } else if (title.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_TITLE_TITLE_3);
        } else {
            bindTitle = true;

            query.append(_FINDER_COLUMN_TITLE_TITLE_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(AreaModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindTitle) {
            qPos.add(title);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(area);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Area> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the areas where title = &#63; from the database.
     *
     * @param title the title
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeBytitle(String title) throws SystemException {
        for (Area area : findBytitle(title, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(area);
        }
    }

    /**
     * Returns the number of areas where title = &#63;.
     *
     * @param title the title
     * @return the number of matching areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countBytitle(String title) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_TITLE;

        Object[] finderArgs = new Object[] { title };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_AREA_WHERE);

            boolean bindTitle = false;

            if (title == null) {
                query.append(_FINDER_COLUMN_TITLE_TITLE_1);
            } else if (title.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_TITLE_TITLE_3);
            } else {
                bindTitle = true;

                query.append(_FINDER_COLUMN_TITLE_TITLE_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindTitle) {
                    qPos.add(title);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the area in the entity cache if it is enabled.
     *
     * @param area the area
     */
    @Override
    public void cacheResult(Area area) {
        EntityCacheUtil.putResult(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaImpl.class, area.getPrimaryKey(), area);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
            new Object[] { area.getUuid(), area.getGroupId() }, area);

        area.resetOriginalValues();
    }

    /**
     * Caches the areas in the entity cache if it is enabled.
     *
     * @param areas the areas
     */
    @Override
    public void cacheResult(List<Area> areas) {
        for (Area area : areas) {
            if (EntityCacheUtil.getResult(AreaModelImpl.ENTITY_CACHE_ENABLED,
                        AreaImpl.class, area.getPrimaryKey()) == null) {
                cacheResult(area);
            } else {
                area.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all areas.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(AreaImpl.class.getName());
        }

        EntityCacheUtil.clearCache(AreaImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the area.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Area area) {
        EntityCacheUtil.removeResult(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaImpl.class, area.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(area);
    }

    @Override
    public void clearCache(List<Area> areas) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Area area : areas) {
            EntityCacheUtil.removeResult(AreaModelImpl.ENTITY_CACHE_ENABLED,
                AreaImpl.class, area.getPrimaryKey());

            clearUniqueFindersCache(area);
        }
    }

    protected void cacheUniqueFindersCache(Area area) {
        if (area.isNew()) {
            Object[] args = new Object[] { area.getUuid(), area.getGroupId() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args, area);
        } else {
            AreaModelImpl areaModelImpl = (AreaModelImpl) area;

            if ((areaModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { area.getUuid(), area.getGroupId() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
                    area);
            }
        }
    }

    protected void clearUniqueFindersCache(Area area) {
        AreaModelImpl areaModelImpl = (AreaModelImpl) area;

        Object[] args = new Object[] { area.getUuid(), area.getGroupId() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

        if ((areaModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
            args = new Object[] {
                    areaModelImpl.getOriginalUuid(),
                    areaModelImpl.getOriginalGroupId()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
        }
    }

    /**
     * Creates a new area with the primary key. Does not add the area to the database.
     *
     * @param areaId the primary key for the new area
     * @return the new area
     */
    @Override
    public Area create(long areaId) {
        Area area = new AreaImpl();

        area.setNew(true);
        area.setPrimaryKey(areaId);

        String uuid = PortalUUIDUtil.generate();

        area.setUuid(uuid);

        return area;
    }

    /**
     * Removes the area with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param areaId the primary key of the area
     * @return the area that was removed
     * @throws com.register.serviceRF.NoSuchAreaException if a area with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area remove(long areaId) throws NoSuchAreaException, SystemException {
        return remove((Serializable) areaId);
    }

    /**
     * Removes the area with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the area
     * @return the area that was removed
     * @throws com.register.serviceRF.NoSuchAreaException if a area with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area remove(Serializable primaryKey)
        throws NoSuchAreaException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Area area = (Area) session.get(AreaImpl.class, primaryKey);

            if (area == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchAreaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(area);
        } catch (NoSuchAreaException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Area removeImpl(Area area) throws SystemException {
        area = toUnwrappedModel(area);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(area)) {
                area = (Area) session.get(AreaImpl.class,
                        area.getPrimaryKeyObj());
            }

            if (area != null) {
                session.delete(area);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (area != null) {
            clearCache(area);
        }

        return area;
    }

    @Override
    public Area updateImpl(com.register.serviceRF.model.Area area)
        throws SystemException {
        area = toUnwrappedModel(area);

        boolean isNew = area.isNew();

        AreaModelImpl areaModelImpl = (AreaModelImpl) area;

        if (Validator.isNull(area.getUuid())) {
            String uuid = PortalUUIDUtil.generate();

            area.setUuid(uuid);
        }

        Session session = null;

        try {
            session = openSession();

            if (area.isNew()) {
                session.save(area);

                area.setNew(false);
            } else {
                session.merge(area);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !AreaModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((areaModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { areaModelImpl.getOriginalUuid() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);

                args = new Object[] { areaModelImpl.getUuid() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);
            }

            if ((areaModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        areaModelImpl.getOriginalUuid(),
                        areaModelImpl.getOriginalCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
                    args);

                args = new Object[] {
                        areaModelImpl.getUuid(), areaModelImpl.getCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
                    args);
            }

            if ((areaModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { areaModelImpl.getOriginalGroupId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);

                args = new Object[] { areaModelImpl.getGroupId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);
            }

            if ((areaModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_I.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        areaModelImpl.getOriginalGroupId(),
                        areaModelImpl.getOriginalInArchive()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_I, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_I,
                    args);

                args = new Object[] {
                        areaModelImpl.getGroupId(), areaModelImpl.getInArchive()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_I, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_I,
                    args);
            }

            if ((areaModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_I.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        areaModelImpl.getOriginalAreaId(),
                        areaModelImpl.getOriginalInArchive()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_A_I, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_I,
                    args);

                args = new Object[] {
                        areaModelImpl.getAreaId(), areaModelImpl.getInArchive()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_A_I, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_A_I,
                    args);
            }

            if ((areaModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_T.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        areaModelImpl.getOriginalGroupId(),
                        areaModelImpl.getOriginalTitle()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_T, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_T,
                    args);

                args = new Object[] {
                        areaModelImpl.getGroupId(), areaModelImpl.getTitle()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_T, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_T,
                    args);
            }

            if ((areaModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TITLE.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { areaModelImpl.getOriginalTitle() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TITLE, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TITLE,
                    args);

                args = new Object[] { areaModelImpl.getTitle() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TITLE, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TITLE,
                    args);
            }
        }

        EntityCacheUtil.putResult(AreaModelImpl.ENTITY_CACHE_ENABLED,
            AreaImpl.class, area.getPrimaryKey(), area);

        clearUniqueFindersCache(area);
        cacheUniqueFindersCache(area);

        return area;
    }

    protected Area toUnwrappedModel(Area area) {
        if (area instanceof AreaImpl) {
            return area;
        }

        AreaImpl areaImpl = new AreaImpl();

        areaImpl.setNew(area.isNew());
        areaImpl.setPrimaryKey(area.getPrimaryKey());

        areaImpl.setUuid(area.getUuid());
        areaImpl.setAreaId(area.getAreaId());
        areaImpl.setGroupId(area.getGroupId());
        areaImpl.setCompanyId(area.getCompanyId());
        areaImpl.setUserId(area.getUserId());
        areaImpl.setUserName(area.getUserName());
        areaImpl.setCreateDate(area.getCreateDate());
        areaImpl.setModifiedDate(area.getModifiedDate());
        areaImpl.setTitle(area.getTitle());
        areaImpl.setAreaCode(area.getAreaCode());
        areaImpl.setInArchive(area.isInArchive());

        return areaImpl;
    }

    /**
     * Returns the area with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the area
     * @return the area
     * @throws com.register.serviceRF.NoSuchAreaException if a area with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area findByPrimaryKey(Serializable primaryKey)
        throws NoSuchAreaException, SystemException {
        Area area = fetchByPrimaryKey(primaryKey);

        if (area == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchAreaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return area;
    }

    /**
     * Returns the area with the primary key or throws a {@link com.register.serviceRF.NoSuchAreaException} if it could not be found.
     *
     * @param areaId the primary key of the area
     * @return the area
     * @throws com.register.serviceRF.NoSuchAreaException if a area with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area findByPrimaryKey(long areaId)
        throws NoSuchAreaException, SystemException {
        return findByPrimaryKey((Serializable) areaId);
    }

    /**
     * Returns the area with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the area
     * @return the area, or <code>null</code> if a area with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Area area = (Area) EntityCacheUtil.getResult(AreaModelImpl.ENTITY_CACHE_ENABLED,
                AreaImpl.class, primaryKey);

        if (area == _nullArea) {
            return null;
        }

        if (area == null) {
            Session session = null;

            try {
                session = openSession();

                area = (Area) session.get(AreaImpl.class, primaryKey);

                if (area != null) {
                    cacheResult(area);
                } else {
                    EntityCacheUtil.putResult(AreaModelImpl.ENTITY_CACHE_ENABLED,
                        AreaImpl.class, primaryKey, _nullArea);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(AreaModelImpl.ENTITY_CACHE_ENABLED,
                    AreaImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return area;
    }

    /**
     * Returns the area with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param areaId the primary key of the area
     * @return the area, or <code>null</code> if a area with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Area fetchByPrimaryKey(long areaId) throws SystemException {
        return fetchByPrimaryKey((Serializable) areaId);
    }

    /**
     * Returns all the areas.
     *
     * @return the areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Area> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the areas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of areas
     * @param end the upper bound of the range of areas (not inclusive)
     * @return the range of areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Area> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the areas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of areas
     * @param end the upper bound of the range of areas (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Area> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Area> list = (List<Area>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_AREA);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_AREA;

                if (pagination) {
                    sql = sql.concat(AreaModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Area>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Area>(list);
                } else {
                    list = (List<Area>) QueryUtil.list(q, getDialect(), start,
                            end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the areas from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Area area : findAll()) {
            remove(area);
        }
    }

    /**
     * Returns the number of areas.
     *
     * @return the number of areas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_AREA);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the area persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.register.serviceRF.model.Area")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Area>> listenersList = new ArrayList<ModelListener<Area>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Area>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(AreaImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
