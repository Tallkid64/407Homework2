package com.example.lucas.homework2;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoConfig;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.IdentityScopeType;

import com.example.lucas.homework2.Event;

import com.example.lucas.homework2.EventDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 *
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig EventDaoConfig;

    private final EventDao EventDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        EventDaoConfig = daoConfigMap.get(EventDao.class).clone();
        EventDaoConfig.initIdentityScope(type);

        EventDao = new EventDao(EventDaoConfig, this);

        registerDao(Event.class, EventDao);
    }

    public void clear() {
        EventDaoConfig.getIdentityScope().clear();
    }

    public EventDao getCalEventDao() {
        return EventDao;
    }

}
