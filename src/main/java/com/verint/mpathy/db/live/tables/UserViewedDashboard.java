/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables;


import com.verint.mpathy.db.live.Live;
import com.verint.mpathy.db.live.tables.records.UserViewedDashboardRecord;

import java.time.LocalTime;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserViewedDashboard extends TableImpl<UserViewedDashboardRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>live.user_viewed_dashboard</code>
     */
    public static final UserViewedDashboard USER_VIEWED_DASHBOARD = new UserViewedDashboard();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserViewedDashboardRecord> getRecordType() {
        return UserViewedDashboardRecord.class;
    }

    /**
     * The column <code>live.user_viewed_dashboard.iduser</code>.
     */
    public final TableField<UserViewedDashboardRecord, Long> IDUSER = createField(DSL.name("iduser"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>live.user_viewed_dashboard.timestamp</code>.
     */
    public final TableField<UserViewedDashboardRecord, LocalTime> TIMESTAMP = createField(DSL.name("timestamp"), SQLDataType.LOCALTIME(6).nullable(false), this, "");

    private UserViewedDashboard(Name alias, Table<UserViewedDashboardRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserViewedDashboard(Name alias, Table<UserViewedDashboardRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>live.user_viewed_dashboard</code> table reference
     */
    public UserViewedDashboard(String alias) {
        this(DSL.name(alias), USER_VIEWED_DASHBOARD);
    }

    /**
     * Create an aliased <code>live.user_viewed_dashboard</code> table reference
     */
    public UserViewedDashboard(Name alias) {
        this(alias, USER_VIEWED_DASHBOARD);
    }

    /**
     * Create a <code>live.user_viewed_dashboard</code> table reference
     */
    public UserViewedDashboard() {
        this(DSL.name("user_viewed_dashboard"), null);
    }

    public <O extends Record> UserViewedDashboard(Table<O> child, ForeignKey<O, UserViewedDashboardRecord> key) {
        super(child, key, USER_VIEWED_DASHBOARD);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Live.LIVE;
    }

    @Override
    public UserViewedDashboard as(String alias) {
        return new UserViewedDashboard(DSL.name(alias), this);
    }

    @Override
    public UserViewedDashboard as(Name alias) {
        return new UserViewedDashboard(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserViewedDashboard rename(String name) {
        return new UserViewedDashboard(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserViewedDashboard rename(Name name) {
        return new UserViewedDashboard(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, LocalTime> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
