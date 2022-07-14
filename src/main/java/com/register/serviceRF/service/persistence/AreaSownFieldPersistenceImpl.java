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

import com.register.serviceRF.NoSuchAreaSownFieldException;
import com.register.serviceRF.model.AreaSownField;
import com.register.serviceRF.model.impl.AreaSownFieldImpl;
import com.register.serviceRF.model.impl.AreaSownFieldModelImpl;
import com.register.serviceRF.service.persistence.AreaSownFieldPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the area sown field service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AreaSownFieldPersistence
 * @see AreaSownFieldUtil
 * @generated
 */
public class AreaSownFieldPersistenceImpl extends BasePersistenceImpl<AreaSownField>
    implements AreaSownFieldPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link AreaSownFieldUtil} to access the area sown field persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = AreaSownFieldImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AreaSownFieldModelImpl.ENTITY_CACHE_ENABLED,
            AreaSownFieldModelImpl.FINDER_CACHE_ENABLED,
            AreaSownFieldImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AreaSownFieldModelImpl.ENTITY_CACHE_ENABLED,
            AreaSownFieldModelImpl.FINDER_CACHE_ENABLED,
            AreaSownFieldImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AreaSownFieldModelImpl.ENTITY_CACHE_ENABLED,
            AreaSownFieldModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(AreaSownFieldModelImpl.ENTITY_CACHE_ENABLED,
            AreaSownFieldModelImpl.FINDER_CACHE_ENABLED,
            AreaSownFieldImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByUuid",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(AreaSownFieldModelImpl.ENTITY_CACHE_ENABLED,
            AreaSownFieldModelImpl.FINDER_CACHE_ENABLED,
            AreaSownFieldImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByUuid", new String[] { String.class.getName() },
            AreaSownFieldModelImpl.UUID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(AreaSownFieldModelImpl.ENTITY_CACHE_ENABLED,
            AreaSownFieldModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_UUID_UUID_1 = "areaSownField.uuid IS NULL";
    private static final String _FINDER_COLUMN_UUID_UUID_2 = "areaSownField.uuid = ?";
    private static final String _FINDER_COLUMN_UUID_UUID_3 = "(areaSownField.uuid IS NULL OR areaSownField.uuid = '')";
    public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(AreaSownFieldModelImpl.ENTITY_CACHE_ENABLED,
            AreaSownFieldModelImpl.FINDER_CACHE_ENABLED,
            AreaSownFieldImpl.class, FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
            new String[] { String.class.getName(), Long.class.getName() },
            AreaSownFieldModelImpl.UUID_COLUMN_BITMASK |
            AreaSownFieldModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(AreaSownFieldModelImpl.ENTITY_CACHE_ENABLED,
            AreaSownFieldModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "areaSownField.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "areaSownField.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(areaSownField.uuid IS NULL OR areaSownField.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "areaSownField.groupId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(AreaSownFieldModelImpl.ENTITY_CACHE_ENABLED,
            AreaSownFieldModelImpl.FINDER_CACHE_ENABLED,
            AreaSownFieldImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByUuid_C",
            new String[] {
                String.class.getName(), Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
        new FinderPath(AreaSownFieldModelImpl.ENTITY_CACHE_ENABLED,
            AreaSownFieldModelImpl.FINDER_CACHE_ENABLED,
            AreaSownFieldImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByUuid_C",
            new String[] { String.class.getName(), Long.class.getName() },
            AreaSownFieldModelImpl.UUID_COLUMN_BITMASK |
            AreaSownFieldModelImpl.COMPANYID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(AreaSownFieldModelImpl.ENTITY_CACHE_ENABLED,
            AreaSownFieldModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "areaSownField.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "areaSownField.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(areaSownField.uuid IS NULL OR areaSownField.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "areaSownField.companyId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(AreaSownFieldModelImpl.ENTITY_CACHE_ENABLED,
            AreaSownFieldModelImpl.FINDER_CACHE_ENABLED,
            AreaSownFieldImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findBygroupId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
        new FinderPath(AreaSownFieldModelImpl.ENTITY_CACHE_ENABLED,
            AreaSownFieldModelImpl.FINDER_CACHE_ENABLED,
            AreaSownFieldImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findBygroupId", new String[] { Long.class.getName() },
            AreaSownFieldModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(AreaSownFieldModelImpl.ENTITY_CACHE_ENABLED,
            AreaSownFieldModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygroupId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "areaSownField.groupId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_F = new FinderPath(AreaSownFieldModelImpl.ENTITY_CACHE_ENABLED,
            AreaSownFieldModelImpl.FINDER_CACHE_ENABLED,
            AreaSownFieldImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByG_F",
            new String[] {
                Long.class.getName(), Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_F = new FinderPath(AreaSownFieldModelImpl.ENTITY_CACHE_ENABLED,
            AreaSownFieldModelImpl.FINDER_CACHE_ENABLED,
            AreaSownFieldImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByG_F",
            new String[] { Long.class.getName(), Long.class.getName() },
            AreaSownFieldModelImpl.GROUPID_COLUMN_BITMASK |
            AreaSownFieldModelImpl.FARMERID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_G_F = new FinderPath(AreaSownFieldModelImpl.ENTITY_CACHE_ENABLED,
            AreaSownFieldModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_F",
            new String[] { Long.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_G_F_GROUPID_2 = "areaSownField.groupId = ? AND ";
    private static final String _FINDER_COLUMN_G_F_FARMERID_2 = "areaSownField.farmerId = ?";
    private static final String _SQL_SELECT_AREASOWNFIELD = "SELECT areaSownField FROM AreaSownField areaSownField";
    private static final String _SQL_SELECT_AREASOWNFIELD_WHERE = "SELECT areaSownField FROM AreaSownField areaSownField WHERE ";
    private static final String _SQL_COUNT_AREASOWNFIELD = "SELECT COUNT(areaSownField) FROM AreaSownField areaSownField";
    private static final String _SQL_COUNT_AREASOWNFIELD_WHERE = "SELECT COUNT(areaSownField) FROM AreaSownField areaSownField WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "areaSownField.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AreaSownField exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AreaSownField exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(AreaSownFieldPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "uuid"
            });
    private static AreaSownField _nullAreaSownField = new AreaSownFieldImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<AreaSownField> toCacheModel() {
                return _nullAreaSownFieldCacheModel;
            }
        };

    private static CacheModel<AreaSownField> _nullAreaSownFieldCacheModel = new CacheModel<AreaSownField>() {
            @Override
            public AreaSownField toEntityModel() {
                return _nullAreaSownField;
            }
        };

    public AreaSownFieldPersistenceImpl() {
        setModelClass(AreaSownField.class);
    }

    /**
     * Returns all the area sown fields where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the matching area sown fields
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AreaSownField> findByUuid(String uuid)
        throws SystemException {
        return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the area sown fields where uuid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaSownFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param start the lower bound of the range of area sown fields
     * @param end the upper bound of the range of area sown fields (not inclusive)
     * @return the range of matching area sown fields
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AreaSownField> findByUuid(String uuid, int start, int end)
        throws SystemException {
        return findByUuid(uuid, start, end, null);
    }

    /**
     * Returns an ordered range of all the area sown fields where uuid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaSownFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param start the lower bound of the range of area sown fields
     * @param end the upper bound of the range of area sown fields (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching area sown fields
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AreaSownField> findByUuid(String uuid, int start, int end,
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

        List<AreaSownField> list = (List<AreaSownField>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (AreaSownField areaSownField : list) {
                if (!Validator.equals(uuid, areaSownField.getUuid())) {
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

            query.append(_SQL_SELECT_AREASOWNFIELD_WHERE);

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
                query.append(AreaSownFieldModelImpl.ORDER_BY_JPQL);
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
                    list = (List<AreaSownField>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<AreaSownField>(list);
                } else {
                    list = (List<AreaSownField>) QueryUtil.list(q,
                            getDialect(), start, end);
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
     * Returns the first area sown field in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching area sown field
     * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a matching area sown field could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AreaSownField findByUuid_First(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchAreaSownFieldException, SystemException {
        AreaSownField areaSownField = fetchByUuid_First(uuid, orderByComparator);

        if (areaSownField != null) {
            return areaSownField;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAreaSownFieldException(msg.toString());
    }

    /**
     * Returns the first area sown field in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching area sown field, or <code>null</code> if a matching area sown field could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AreaSownField fetchByUuid_First(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        List<AreaSownField> list = findByUuid(uuid, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last area sown field in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching area sown field
     * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a matching area sown field could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AreaSownField findByUuid_Last(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchAreaSownFieldException, SystemException {
        AreaSownField areaSownField = fetchByUuid_Last(uuid, orderByComparator);

        if (areaSownField != null) {
            return areaSownField;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAreaSownFieldException(msg.toString());
    }

    /**
     * Returns the last area sown field in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching area sown field, or <code>null</code> if a matching area sown field could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AreaSownField fetchByUuid_Last(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid(uuid);

        if (count == 0) {
            return null;
        }

        List<AreaSownField> list = findByUuid(uuid, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the area sown fields before and after the current area sown field in the ordered set where uuid = &#63;.
     *
     * @param areaSownFieldsId the primary key of the current area sown field
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next area sown field
     * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a area sown field with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AreaSownField[] findByUuid_PrevAndNext(long areaSownFieldsId,
        String uuid, OrderByComparator orderByComparator)
        throws NoSuchAreaSownFieldException, SystemException {
        AreaSownField areaSownField = findByPrimaryKey(areaSownFieldsId);

        Session session = null;

        try {
            session = openSession();

            AreaSownField[] array = new AreaSownFieldImpl[3];

            array[0] = getByUuid_PrevAndNext(session, areaSownField, uuid,
                    orderByComparator, true);

            array[1] = areaSownField;

            array[2] = getByUuid_PrevAndNext(session, areaSownField, uuid,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected AreaSownField getByUuid_PrevAndNext(Session session,
        AreaSownField areaSownField, String uuid,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_AREASOWNFIELD_WHERE);

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
            query.append(AreaSownFieldModelImpl.ORDER_BY_JPQL);
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
            Object[] values = orderByComparator.getOrderByConditionValues(areaSownField);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<AreaSownField> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the area sown fields where uuid = &#63; from the database.
     *
     * @param uuid the uuid
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid(String uuid) throws SystemException {
        for (AreaSownField areaSownField : findByUuid(uuid, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(areaSownField);
        }
    }

    /**
     * Returns the number of area sown fields where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the number of matching area sown fields
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

            query.append(_SQL_COUNT_AREASOWNFIELD_WHERE);

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
     * Returns the area sown field where uuid = &#63; and groupId = &#63; or throws a {@link com.register.serviceRF.NoSuchAreaSownFieldException} if it could not be found.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the matching area sown field
     * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a matching area sown field could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AreaSownField findByUUID_G(String uuid, long groupId)
        throws NoSuchAreaSownFieldException, SystemException {
        AreaSownField areaSownField = fetchByUUID_G(uuid, groupId);

        if (areaSownField == null) {
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

            throw new NoSuchAreaSownFieldException(msg.toString());
        }

        return areaSownField;
    }

    /**
     * Returns the area sown field where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the matching area sown field, or <code>null</code> if a matching area sown field could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AreaSownField fetchByUUID_G(String uuid, long groupId)
        throws SystemException {
        return fetchByUUID_G(uuid, groupId, true);
    }

    /**
     * Returns the area sown field where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching area sown field, or <code>null</code> if a matching area sown field could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AreaSownField fetchByUUID_G(String uuid, long groupId,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { uuid, groupId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
                    finderArgs, this);
        }

        if (result instanceof AreaSownField) {
            AreaSownField areaSownField = (AreaSownField) result;

            if (!Validator.equals(uuid, areaSownField.getUuid()) ||
                    (groupId != areaSownField.getGroupId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_SELECT_AREASOWNFIELD_WHERE);

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

                List<AreaSownField> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
                        finderArgs, list);
                } else {
                    AreaSownField areaSownField = list.get(0);

                    result = areaSownField;

                    cacheResult(areaSownField);

                    if ((areaSownField.getUuid() == null) ||
                            !areaSownField.getUuid().equals(uuid) ||
                            (areaSownField.getGroupId() != groupId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
                            finderArgs, areaSownField);
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
            return (AreaSownField) result;
        }
    }

    /**
     * Removes the area sown field where uuid = &#63; and groupId = &#63; from the database.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the area sown field that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AreaSownField removeByUUID_G(String uuid, long groupId)
        throws NoSuchAreaSownFieldException, SystemException {
        AreaSownField areaSownField = findByUUID_G(uuid, groupId);

        return remove(areaSownField);
    }

    /**
     * Returns the number of area sown fields where uuid = &#63; and groupId = &#63;.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the number of matching area sown fields
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

            query.append(_SQL_COUNT_AREASOWNFIELD_WHERE);

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
     * Returns all the area sown fields where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @return the matching area sown fields
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AreaSownField> findByUuid_C(String uuid, long companyId)
        throws SystemException {
        return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the area sown fields where uuid = &#63; and companyId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaSownFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param start the lower bound of the range of area sown fields
     * @param end the upper bound of the range of area sown fields (not inclusive)
     * @return the range of matching area sown fields
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AreaSownField> findByUuid_C(String uuid, long companyId,
        int start, int end) throws SystemException {
        return findByUuid_C(uuid, companyId, start, end, null);
    }

    /**
     * Returns an ordered range of all the area sown fields where uuid = &#63; and companyId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaSownFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param start the lower bound of the range of area sown fields
     * @param end the upper bound of the range of area sown fields (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching area sown fields
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AreaSownField> findByUuid_C(String uuid, long companyId,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
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

        List<AreaSownField> list = (List<AreaSownField>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (AreaSownField areaSownField : list) {
                if (!Validator.equals(uuid, areaSownField.getUuid()) ||
                        (companyId != areaSownField.getCompanyId())) {
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

            query.append(_SQL_SELECT_AREASOWNFIELD_WHERE);

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
                query.append(AreaSownFieldModelImpl.ORDER_BY_JPQL);
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
                    list = (List<AreaSownField>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<AreaSownField>(list);
                } else {
                    list = (List<AreaSownField>) QueryUtil.list(q,
                            getDialect(), start, end);
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
     * Returns the first area sown field in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching area sown field
     * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a matching area sown field could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AreaSownField findByUuid_C_First(String uuid, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchAreaSownFieldException, SystemException {
        AreaSownField areaSownField = fetchByUuid_C_First(uuid, companyId,
                orderByComparator);

        if (areaSownField != null) {
            return areaSownField;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAreaSownFieldException(msg.toString());
    }

    /**
     * Returns the first area sown field in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching area sown field, or <code>null</code> if a matching area sown field could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AreaSownField fetchByUuid_C_First(String uuid, long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        List<AreaSownField> list = findByUuid_C(uuid, companyId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last area sown field in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching area sown field
     * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a matching area sown field could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AreaSownField findByUuid_C_Last(String uuid, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchAreaSownFieldException, SystemException {
        AreaSownField areaSownField = fetchByUuid_C_Last(uuid, companyId,
                orderByComparator);

        if (areaSownField != null) {
            return areaSownField;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAreaSownFieldException(msg.toString());
    }

    /**
     * Returns the last area sown field in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching area sown field, or <code>null</code> if a matching area sown field could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AreaSownField fetchByUuid_C_Last(String uuid, long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid_C(uuid, companyId);

        if (count == 0) {
            return null;
        }

        List<AreaSownField> list = findByUuid_C(uuid, companyId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the area sown fields before and after the current area sown field in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param areaSownFieldsId the primary key of the current area sown field
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next area sown field
     * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a area sown field with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AreaSownField[] findByUuid_C_PrevAndNext(long areaSownFieldsId,
        String uuid, long companyId, OrderByComparator orderByComparator)
        throws NoSuchAreaSownFieldException, SystemException {
        AreaSownField areaSownField = findByPrimaryKey(areaSownFieldsId);

        Session session = null;

        try {
            session = openSession();

            AreaSownField[] array = new AreaSownFieldImpl[3];

            array[0] = getByUuid_C_PrevAndNext(session, areaSownField, uuid,
                    companyId, orderByComparator, true);

            array[1] = areaSownField;

            array[2] = getByUuid_C_PrevAndNext(session, areaSownField, uuid,
                    companyId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected AreaSownField getByUuid_C_PrevAndNext(Session session,
        AreaSownField areaSownField, String uuid, long companyId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_AREASOWNFIELD_WHERE);

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
            query.append(AreaSownFieldModelImpl.ORDER_BY_JPQL);
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
            Object[] values = orderByComparator.getOrderByConditionValues(areaSownField);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<AreaSownField> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the area sown fields where uuid = &#63; and companyId = &#63; from the database.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid_C(String uuid, long companyId)
        throws SystemException {
        for (AreaSownField areaSownField : findByUuid_C(uuid, companyId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(areaSownField);
        }
    }

    /**
     * Returns the number of area sown fields where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @return the number of matching area sown fields
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

            query.append(_SQL_COUNT_AREASOWNFIELD_WHERE);

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
     * Returns all the area sown fields where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the matching area sown fields
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AreaSownField> findBygroupId(long groupId)
        throws SystemException {
        return findBygroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the area sown fields where groupId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaSownFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param start the lower bound of the range of area sown fields
     * @param end the upper bound of the range of area sown fields (not inclusive)
     * @return the range of matching area sown fields
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AreaSownField> findBygroupId(long groupId, int start, int end)
        throws SystemException {
        return findBygroupId(groupId, start, end, null);
    }

    /**
     * Returns an ordered range of all the area sown fields where groupId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaSownFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param start the lower bound of the range of area sown fields
     * @param end the upper bound of the range of area sown fields (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching area sown fields
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AreaSownField> findBygroupId(long groupId, int start, int end,
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

        List<AreaSownField> list = (List<AreaSownField>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (AreaSownField areaSownField : list) {
                if ((groupId != areaSownField.getGroupId())) {
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

            query.append(_SQL_SELECT_AREASOWNFIELD_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(AreaSownFieldModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (!pagination) {
                    list = (List<AreaSownField>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<AreaSownField>(list);
                } else {
                    list = (List<AreaSownField>) QueryUtil.list(q,
                            getDialect(), start, end);
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
     * Returns the first area sown field in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching area sown field
     * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a matching area sown field could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AreaSownField findBygroupId_First(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchAreaSownFieldException, SystemException {
        AreaSownField areaSownField = fetchBygroupId_First(groupId,
                orderByComparator);

        if (areaSownField != null) {
            return areaSownField;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAreaSownFieldException(msg.toString());
    }

    /**
     * Returns the first area sown field in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching area sown field, or <code>null</code> if a matching area sown field could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AreaSownField fetchBygroupId_First(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        List<AreaSownField> list = findBygroupId(groupId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last area sown field in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching area sown field
     * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a matching area sown field could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AreaSownField findBygroupId_Last(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchAreaSownFieldException, SystemException {
        AreaSownField areaSownField = fetchBygroupId_Last(groupId,
                orderByComparator);

        if (areaSownField != null) {
            return areaSownField;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAreaSownFieldException(msg.toString());
    }

    /**
     * Returns the last area sown field in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching area sown field, or <code>null</code> if a matching area sown field could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AreaSownField fetchBygroupId_Last(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countBygroupId(groupId);

        if (count == 0) {
            return null;
        }

        List<AreaSownField> list = findBygroupId(groupId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the area sown fields before and after the current area sown field in the ordered set where groupId = &#63;.
     *
     * @param areaSownFieldsId the primary key of the current area sown field
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next area sown field
     * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a area sown field with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AreaSownField[] findBygroupId_PrevAndNext(long areaSownFieldsId,
        long groupId, OrderByComparator orderByComparator)
        throws NoSuchAreaSownFieldException, SystemException {
        AreaSownField areaSownField = findByPrimaryKey(areaSownFieldsId);

        Session session = null;

        try {
            session = openSession();

            AreaSownField[] array = new AreaSownFieldImpl[3];

            array[0] = getBygroupId_PrevAndNext(session, areaSownField,
                    groupId, orderByComparator, true);

            array[1] = areaSownField;

            array[2] = getBygroupId_PrevAndNext(session, areaSownField,
                    groupId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected AreaSownField getBygroupId_PrevAndNext(Session session,
        AreaSownField areaSownField, long groupId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_AREASOWNFIELD_WHERE);

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
            query.append(AreaSownFieldModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(areaSownField);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<AreaSownField> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the area sown fields where groupId = &#63; from the database.
     *
     * @param groupId the group ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeBygroupId(long groupId) throws SystemException {
        for (AreaSownField areaSownField : findBygroupId(groupId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(areaSownField);
        }
    }

    /**
     * Returns the number of area sown fields where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the number of matching area sown fields
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

            query.append(_SQL_COUNT_AREASOWNFIELD_WHERE);

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
     * Returns all the area sown fields where groupId = &#63; and farmerId = &#63;.
     *
     * @param groupId the group ID
     * @param farmerId the farmer ID
     * @return the matching area sown fields
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AreaSownField> findByG_F(long groupId, long farmerId)
        throws SystemException {
        return findByG_F(groupId, farmerId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the area sown fields where groupId = &#63; and farmerId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaSownFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param farmerId the farmer ID
     * @param start the lower bound of the range of area sown fields
     * @param end the upper bound of the range of area sown fields (not inclusive)
     * @return the range of matching area sown fields
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AreaSownField> findByG_F(long groupId, long farmerId,
        int start, int end) throws SystemException {
        return findByG_F(groupId, farmerId, start, end, null);
    }

    /**
     * Returns an ordered range of all the area sown fields where groupId = &#63; and farmerId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaSownFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param farmerId the farmer ID
     * @param start the lower bound of the range of area sown fields
     * @param end the upper bound of the range of area sown fields (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching area sown fields
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AreaSownField> findByG_F(long groupId, long farmerId,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_F;
            finderArgs = new Object[] { groupId, farmerId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_F;
            finderArgs = new Object[] {
                    groupId, farmerId,
                    
                    start, end, orderByComparator
                };
        }

        List<AreaSownField> list = (List<AreaSownField>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (AreaSownField areaSownField : list) {
                if ((groupId != areaSownField.getGroupId()) ||
                        (farmerId != areaSownField.getFarmerId())) {
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

            query.append(_SQL_SELECT_AREASOWNFIELD_WHERE);

            query.append(_FINDER_COLUMN_G_F_GROUPID_2);

            query.append(_FINDER_COLUMN_G_F_FARMERID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(AreaSownFieldModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                qPos.add(farmerId);

                if (!pagination) {
                    list = (List<AreaSownField>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<AreaSownField>(list);
                } else {
                    list = (List<AreaSownField>) QueryUtil.list(q,
                            getDialect(), start, end);
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
     * Returns the first area sown field in the ordered set where groupId = &#63; and farmerId = &#63;.
     *
     * @param groupId the group ID
     * @param farmerId the farmer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching area sown field
     * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a matching area sown field could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AreaSownField findByG_F_First(long groupId, long farmerId,
        OrderByComparator orderByComparator)
        throws NoSuchAreaSownFieldException, SystemException {
        AreaSownField areaSownField = fetchByG_F_First(groupId, farmerId,
                orderByComparator);

        if (areaSownField != null) {
            return areaSownField;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", farmerId=");
        msg.append(farmerId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAreaSownFieldException(msg.toString());
    }

    /**
     * Returns the first area sown field in the ordered set where groupId = &#63; and farmerId = &#63;.
     *
     * @param groupId the group ID
     * @param farmerId the farmer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching area sown field, or <code>null</code> if a matching area sown field could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AreaSownField fetchByG_F_First(long groupId, long farmerId,
        OrderByComparator orderByComparator) throws SystemException {
        List<AreaSownField> list = findByG_F(groupId, farmerId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last area sown field in the ordered set where groupId = &#63; and farmerId = &#63;.
     *
     * @param groupId the group ID
     * @param farmerId the farmer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching area sown field
     * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a matching area sown field could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AreaSownField findByG_F_Last(long groupId, long farmerId,
        OrderByComparator orderByComparator)
        throws NoSuchAreaSownFieldException, SystemException {
        AreaSownField areaSownField = fetchByG_F_Last(groupId, farmerId,
                orderByComparator);

        if (areaSownField != null) {
            return areaSownField;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", farmerId=");
        msg.append(farmerId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAreaSownFieldException(msg.toString());
    }

    /**
     * Returns the last area sown field in the ordered set where groupId = &#63; and farmerId = &#63;.
     *
     * @param groupId the group ID
     * @param farmerId the farmer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching area sown field, or <code>null</code> if a matching area sown field could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AreaSownField fetchByG_F_Last(long groupId, long farmerId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByG_F(groupId, farmerId);

        if (count == 0) {
            return null;
        }

        List<AreaSownField> list = findByG_F(groupId, farmerId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the area sown fields before and after the current area sown field in the ordered set where groupId = &#63; and farmerId = &#63;.
     *
     * @param areaSownFieldsId the primary key of the current area sown field
     * @param groupId the group ID
     * @param farmerId the farmer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next area sown field
     * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a area sown field with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AreaSownField[] findByG_F_PrevAndNext(long areaSownFieldsId,
        long groupId, long farmerId, OrderByComparator orderByComparator)
        throws NoSuchAreaSownFieldException, SystemException {
        AreaSownField areaSownField = findByPrimaryKey(areaSownFieldsId);

        Session session = null;

        try {
            session = openSession();

            AreaSownField[] array = new AreaSownFieldImpl[3];

            array[0] = getByG_F_PrevAndNext(session, areaSownField, groupId,
                    farmerId, orderByComparator, true);

            array[1] = areaSownField;

            array[2] = getByG_F_PrevAndNext(session, areaSownField, groupId,
                    farmerId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected AreaSownField getByG_F_PrevAndNext(Session session,
        AreaSownField areaSownField, long groupId, long farmerId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_AREASOWNFIELD_WHERE);

        query.append(_FINDER_COLUMN_G_F_GROUPID_2);

        query.append(_FINDER_COLUMN_G_F_FARMERID_2);

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
            query.append(AreaSownFieldModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        qPos.add(farmerId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(areaSownField);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<AreaSownField> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the area sown fields where groupId = &#63; and farmerId = &#63; from the database.
     *
     * @param groupId the group ID
     * @param farmerId the farmer ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByG_F(long groupId, long farmerId)
        throws SystemException {
        for (AreaSownField areaSownField : findByG_F(groupId, farmerId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(areaSownField);
        }
    }

    /**
     * Returns the number of area sown fields where groupId = &#63; and farmerId = &#63;.
     *
     * @param groupId the group ID
     * @param farmerId the farmer ID
     * @return the number of matching area sown fields
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByG_F(long groupId, long farmerId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_G_F;

        Object[] finderArgs = new Object[] { groupId, farmerId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_AREASOWNFIELD_WHERE);

            query.append(_FINDER_COLUMN_G_F_GROUPID_2);

            query.append(_FINDER_COLUMN_G_F_FARMERID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                qPos.add(farmerId);

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
     * Caches the area sown field in the entity cache if it is enabled.
     *
     * @param areaSownField the area sown field
     */
    @Override
    public void cacheResult(AreaSownField areaSownField) {
        EntityCacheUtil.putResult(AreaSownFieldModelImpl.ENTITY_CACHE_ENABLED,
            AreaSownFieldImpl.class, areaSownField.getPrimaryKey(),
            areaSownField);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
            new Object[] { areaSownField.getUuid(), areaSownField.getGroupId() },
            areaSownField);

        areaSownField.resetOriginalValues();
    }

    /**
     * Caches the area sown fields in the entity cache if it is enabled.
     *
     * @param areaSownFields the area sown fields
     */
    @Override
    public void cacheResult(List<AreaSownField> areaSownFields) {
        for (AreaSownField areaSownField : areaSownFields) {
            if (EntityCacheUtil.getResult(
                        AreaSownFieldModelImpl.ENTITY_CACHE_ENABLED,
                        AreaSownFieldImpl.class, areaSownField.getPrimaryKey()) == null) {
                cacheResult(areaSownField);
            } else {
                areaSownField.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all area sown fields.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(AreaSownFieldImpl.class.getName());
        }

        EntityCacheUtil.clearCache(AreaSownFieldImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the area sown field.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(AreaSownField areaSownField) {
        EntityCacheUtil.removeResult(AreaSownFieldModelImpl.ENTITY_CACHE_ENABLED,
            AreaSownFieldImpl.class, areaSownField.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(areaSownField);
    }

    @Override
    public void clearCache(List<AreaSownField> areaSownFields) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (AreaSownField areaSownField : areaSownFields) {
            EntityCacheUtil.removeResult(AreaSownFieldModelImpl.ENTITY_CACHE_ENABLED,
                AreaSownFieldImpl.class, areaSownField.getPrimaryKey());

            clearUniqueFindersCache(areaSownField);
        }
    }

    protected void cacheUniqueFindersCache(AreaSownField areaSownField) {
        if (areaSownField.isNew()) {
            Object[] args = new Object[] {
                    areaSownField.getUuid(), areaSownField.getGroupId()
                };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
                areaSownField);
        } else {
            AreaSownFieldModelImpl areaSownFieldModelImpl = (AreaSownFieldModelImpl) areaSownField;

            if ((areaSownFieldModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        areaSownField.getUuid(), areaSownField.getGroupId()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
                    areaSownField);
            }
        }
    }

    protected void clearUniqueFindersCache(AreaSownField areaSownField) {
        AreaSownFieldModelImpl areaSownFieldModelImpl = (AreaSownFieldModelImpl) areaSownField;

        Object[] args = new Object[] {
                areaSownField.getUuid(), areaSownField.getGroupId()
            };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

        if ((areaSownFieldModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
            args = new Object[] {
                    areaSownFieldModelImpl.getOriginalUuid(),
                    areaSownFieldModelImpl.getOriginalGroupId()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
        }
    }

    /**
     * Creates a new area sown field with the primary key. Does not add the area sown field to the database.
     *
     * @param areaSownFieldsId the primary key for the new area sown field
     * @return the new area sown field
     */
    @Override
    public AreaSownField create(long areaSownFieldsId) {
        AreaSownField areaSownField = new AreaSownFieldImpl();

        areaSownField.setNew(true);
        areaSownField.setPrimaryKey(areaSownFieldsId);

        String uuid = PortalUUIDUtil.generate();

        areaSownField.setUuid(uuid);

        return areaSownField;
    }

    /**
     * Removes the area sown field with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param areaSownFieldsId the primary key of the area sown field
     * @return the area sown field that was removed
     * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a area sown field with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AreaSownField remove(long areaSownFieldsId)
        throws NoSuchAreaSownFieldException, SystemException {
        return remove((Serializable) areaSownFieldsId);
    }

    /**
     * Removes the area sown field with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the area sown field
     * @return the area sown field that was removed
     * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a area sown field with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AreaSownField remove(Serializable primaryKey)
        throws NoSuchAreaSownFieldException, SystemException {
        Session session = null;

        try {
            session = openSession();

            AreaSownField areaSownField = (AreaSownField) session.get(AreaSownFieldImpl.class,
                    primaryKey);

            if (areaSownField == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchAreaSownFieldException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(areaSownField);
        } catch (NoSuchAreaSownFieldException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected AreaSownField removeImpl(AreaSownField areaSownField)
        throws SystemException {
        areaSownField = toUnwrappedModel(areaSownField);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(areaSownField)) {
                areaSownField = (AreaSownField) session.get(AreaSownFieldImpl.class,
                        areaSownField.getPrimaryKeyObj());
            }

            if (areaSownField != null) {
                session.delete(areaSownField);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (areaSownField != null) {
            clearCache(areaSownField);
        }

        return areaSownField;
    }

    @Override
    public AreaSownField updateImpl(
        com.register.serviceRF.model.AreaSownField areaSownField)
        throws SystemException {
        areaSownField = toUnwrappedModel(areaSownField);

        boolean isNew = areaSownField.isNew();

        AreaSownFieldModelImpl areaSownFieldModelImpl = (AreaSownFieldModelImpl) areaSownField;

        if (Validator.isNull(areaSownField.getUuid())) {
            String uuid = PortalUUIDUtil.generate();

            areaSownField.setUuid(uuid);
        }

        Session session = null;

        try {
            session = openSession();

            if (areaSownField.isNew()) {
                session.save(areaSownField);

                areaSownField.setNew(false);
            } else {
                session.merge(areaSownField);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !AreaSownFieldModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((areaSownFieldModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        areaSownFieldModelImpl.getOriginalUuid()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);

                args = new Object[] { areaSownFieldModelImpl.getUuid() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);
            }

            if ((areaSownFieldModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        areaSownFieldModelImpl.getOriginalUuid(),
                        areaSownFieldModelImpl.getOriginalCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
                    args);

                args = new Object[] {
                        areaSownFieldModelImpl.getUuid(),
                        areaSownFieldModelImpl.getCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
                    args);
            }

            if ((areaSownFieldModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        areaSownFieldModelImpl.getOriginalGroupId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);

                args = new Object[] { areaSownFieldModelImpl.getGroupId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);
            }

            if ((areaSownFieldModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_F.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        areaSownFieldModelImpl.getOriginalGroupId(),
                        areaSownFieldModelImpl.getOriginalFarmerId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_F, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_F,
                    args);

                args = new Object[] {
                        areaSownFieldModelImpl.getGroupId(),
                        areaSownFieldModelImpl.getFarmerId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_F, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_F,
                    args);
            }
        }

        EntityCacheUtil.putResult(AreaSownFieldModelImpl.ENTITY_CACHE_ENABLED,
            AreaSownFieldImpl.class, areaSownField.getPrimaryKey(),
            areaSownField);

        clearUniqueFindersCache(areaSownField);
        cacheUniqueFindersCache(areaSownField);

        return areaSownField;
    }

    protected AreaSownField toUnwrappedModel(AreaSownField areaSownField) {
        if (areaSownField instanceof AreaSownFieldImpl) {
            return areaSownField;
        }

        AreaSownFieldImpl areaSownFieldImpl = new AreaSownFieldImpl();

        areaSownFieldImpl.setNew(areaSownField.isNew());
        areaSownFieldImpl.setPrimaryKey(areaSownField.getPrimaryKey());

        areaSownFieldImpl.setUuid(areaSownField.getUuid());
        areaSownFieldImpl.setAreaSownFieldsId(areaSownField.getAreaSownFieldsId());
        areaSownFieldImpl.setGroupId(areaSownField.getGroupId());
        areaSownFieldImpl.setCompanyId(areaSownField.getCompanyId());
        areaSownFieldImpl.setUserId(areaSownField.getUserId());
        areaSownFieldImpl.setUserName(areaSownField.getUserName());
        areaSownFieldImpl.setCreateDate(areaSownField.getCreateDate());
        areaSownFieldImpl.setModifiedDate(areaSownField.getModifiedDate());
        areaSownFieldImpl.setFarmerId(areaSownField.getFarmerId());
        areaSownFieldImpl.setAreaId(areaSownField.getAreaId());

        return areaSownFieldImpl;
    }

    /**
     * Returns the area sown field with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the area sown field
     * @return the area sown field
     * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a area sown field with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AreaSownField findByPrimaryKey(Serializable primaryKey)
        throws NoSuchAreaSownFieldException, SystemException {
        AreaSownField areaSownField = fetchByPrimaryKey(primaryKey);

        if (areaSownField == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchAreaSownFieldException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return areaSownField;
    }

    /**
     * Returns the area sown field with the primary key or throws a {@link com.register.serviceRF.NoSuchAreaSownFieldException} if it could not be found.
     *
     * @param areaSownFieldsId the primary key of the area sown field
     * @return the area sown field
     * @throws com.register.serviceRF.NoSuchAreaSownFieldException if a area sown field with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AreaSownField findByPrimaryKey(long areaSownFieldsId)
        throws NoSuchAreaSownFieldException, SystemException {
        return findByPrimaryKey((Serializable) areaSownFieldsId);
    }

    /**
     * Returns the area sown field with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the area sown field
     * @return the area sown field, or <code>null</code> if a area sown field with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AreaSownField fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        AreaSownField areaSownField = (AreaSownField) EntityCacheUtil.getResult(AreaSownFieldModelImpl.ENTITY_CACHE_ENABLED,
                AreaSownFieldImpl.class, primaryKey);

        if (areaSownField == _nullAreaSownField) {
            return null;
        }

        if (areaSownField == null) {
            Session session = null;

            try {
                session = openSession();

                areaSownField = (AreaSownField) session.get(AreaSownFieldImpl.class,
                        primaryKey);

                if (areaSownField != null) {
                    cacheResult(areaSownField);
                } else {
                    EntityCacheUtil.putResult(AreaSownFieldModelImpl.ENTITY_CACHE_ENABLED,
                        AreaSownFieldImpl.class, primaryKey, _nullAreaSownField);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(AreaSownFieldModelImpl.ENTITY_CACHE_ENABLED,
                    AreaSownFieldImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return areaSownField;
    }

    /**
     * Returns the area sown field with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param areaSownFieldsId the primary key of the area sown field
     * @return the area sown field, or <code>null</code> if a area sown field with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AreaSownField fetchByPrimaryKey(long areaSownFieldsId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) areaSownFieldsId);
    }

    /**
     * Returns all the area sown fields.
     *
     * @return the area sown fields
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AreaSownField> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the area sown fields.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaSownFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of area sown fields
     * @param end the upper bound of the range of area sown fields (not inclusive)
     * @return the range of area sown fields
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AreaSownField> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the area sown fields.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.register.serviceRF.model.impl.AreaSownFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of area sown fields
     * @param end the upper bound of the range of area sown fields (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of area sown fields
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AreaSownField> findAll(int start, int end,
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

        List<AreaSownField> list = (List<AreaSownField>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_AREASOWNFIELD);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_AREASOWNFIELD;

                if (pagination) {
                    sql = sql.concat(AreaSownFieldModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<AreaSownField>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<AreaSownField>(list);
                } else {
                    list = (List<AreaSownField>) QueryUtil.list(q,
                            getDialect(), start, end);
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
     * Removes all the area sown fields from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (AreaSownField areaSownField : findAll()) {
            remove(areaSownField);
        }
    }

    /**
     * Returns the number of area sown fields.
     *
     * @return the number of area sown fields
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

                Query q = session.createQuery(_SQL_COUNT_AREASOWNFIELD);

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
     * Initializes the area sown field persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.register.serviceRF.model.AreaSownField")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<AreaSownField>> listenersList = new ArrayList<ModelListener<AreaSownField>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<AreaSownField>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(AreaSownFieldImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
