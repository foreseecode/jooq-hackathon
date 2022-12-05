/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables;


import com.verint.mpathy.db.live_core.LiveCore;
import com.verint.mpathy.db.live_core.tables.records.SessionRecord;

import java.math.BigDecimal;
import java.time.LocalTime;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row20;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * Easy access to underlying table in other schemas.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Session extends TableImpl<SessionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>live_core.session</code>
     */
    public static final Session SESSION = new Session();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SessionRecord> getRecordType() {
        return SessionRecord.class;
    }

    /**
     * The column <code>live_core.session.idsession</code>.
     */
    public final TableField<SessionRecord, Long> IDSESSION = createField(DSL.name("idsession"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live_core.session.idsite</code>.
     */
    public final TableField<SessionRecord, Integer> IDSITE = createField(DSL.name("idsite"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>live_core.session.idvisitor</code>.
     */
    public final TableField<SessionRecord, BigDecimal> IDVISITOR = createField(DSL.name("idvisitor"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>live_core.session.idurl</code>.
     */
    public final TableField<SessionRecord, Long> IDURL = createField(DSL.name("idurl"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live_core.session.idreferer</code>.
     */
    public final TableField<SessionRecord, Long> IDREFERER = createField(DSL.name("idreferer"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live_core.session.iduseragent</code>.
     */
    public final TableField<SessionRecord, Long> IDUSERAGENT = createField(DSL.name("iduseragent"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live_core.session.date</code>.
     */
    public final TableField<SessionRecord, LocalTime> DATE = createField(DSL.name("date"), SQLDataType.LOCALTIME(6), this, "");

    /**
     * The column <code>live_core.session.updated_at</code>.
     */
    public final TableField<SessionRecord, LocalTime> UPDATED_AT = createField(DSL.name("updated_at"), SQLDataType.LOCALTIME(6), this, "");

    /**
     * The column <code>live_core.session.length_active</code>.
     */
    public final TableField<SessionRecord, Long> LENGTH_ACTIVE = createField(DSL.name("length_active"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live_core.session.length_visible</code>.
     */
    public final TableField<SessionRecord, Long> LENGTH_VISIBLE = createField(DSL.name("length_visible"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live_core.session.length_loaded</code>.
     */
    public final TableField<SessionRecord, Long> LENGTH_LOADED = createField(DSL.name("length_loaded"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live_core.session.locale</code>.
     */
    public final TableField<SessionRecord, String> LOCALE = createField(DSL.name("locale"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live_core.session.mpathy_enabled</code>.
     */
    public final TableField<SessionRecord, Short> MPATHY_ENABLED = createField(DSL.name("mpathy_enabled"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>live_core.session.flashver</code>.
     */
    public final TableField<SessionRecord, Short> FLASHVER = createField(DSL.name("flashver"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>live_core.session.num_pi</code>.
     */
    public final TableField<SessionRecord, Long> NUM_PI = createField(DSL.name("num_pi"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live_core.session.imported</code>.
     */
    public final TableField<SessionRecord, Short> IMPORTED = createField(DSL.name("imported"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>live_core.session.script_versions</code>.
     */
    public final TableField<SessionRecord, String> SCRIPT_VERSIONS = createField(DSL.name("script_versions"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live_core.session.successor</code>.
     */
    public final TableField<SessionRecord, BigDecimal> SUCCESSOR = createField(DSL.name("successor"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>live_core.session.idbucket</code>.
     */
    public final TableField<SessionRecord, BigDecimal> IDBUCKET = createField(DSL.name("idbucket"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>live_core.session.sdk_type</code>.
     */
    public final TableField<SessionRecord, String> SDK_TYPE = createField(DSL.name("sdk_type"), SQLDataType.CLOB, this, "");

    private Session(Name alias, Table<SessionRecord> aliased) {
        this(alias, aliased, null);
    }

    private Session(Name alias, Table<SessionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Easy access to underlying table in other schemas."), TableOptions.view("create view \"session\" as  SELECT session.idsession,\n    session.idsite,\n    session.idvisitor,\n    session.idurl,\n    session.idreferer,\n    session.iduseragent,\n    session.date,\n    session.updated_at,\n    session.length_active,\n    session.length_visible,\n    session.length_loaded,\n    session.locale,\n    session.mpathy_enabled,\n    session.flashver,\n    session.num_pi,\n    session.imported,\n    session.script_versions,\n    session.successor,\n    session.idbucket,\n    session.sdk_type\n   FROM live.session;"));
    }

    /**
     * Create an aliased <code>live_core.session</code> table reference
     */
    public Session(String alias) {
        this(DSL.name(alias), SESSION);
    }

    /**
     * Create an aliased <code>live_core.session</code> table reference
     */
    public Session(Name alias) {
        this(alias, SESSION);
    }

    /**
     * Create a <code>live_core.session</code> table reference
     */
    public Session() {
        this(DSL.name("session"), null);
    }

    public <O extends Record> Session(Table<O> child, ForeignKey<O, SessionRecord> key) {
        super(child, key, SESSION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : LiveCore.LIVE_CORE;
    }

    @Override
    public Session as(String alias) {
        return new Session(DSL.name(alias), this);
    }

    @Override
    public Session as(Name alias) {
        return new Session(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Session rename(String name) {
        return new Session(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Session rename(Name name) {
        return new Session(name, null);
    }

    // -------------------------------------------------------------------------
    // Row20 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row20<Long, Integer, BigDecimal, Long, Long, Long, LocalTime, LocalTime, Long, Long, Long, String, Short, Short, Long, Short, String, BigDecimal, BigDecimal, String> fieldsRow() {
        return (Row20) super.fieldsRow();
    }
}
