/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables;


import com.verint.mpathy.db.live.Live;
import com.verint.mpathy.db.live.tables.records.SessionRecord;

import java.math.BigDecimal;
import java.time.LocalTime;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Session extends TableImpl<SessionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>live.session</code>
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
     * The column <code>live.session.idsession</code>.
     */
    public final TableField<SessionRecord, Long> IDSESSION = createField(DSL.name("idsession"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>live.session.idsite</code>.
     */
    public final TableField<SessionRecord, Integer> IDSITE = createField(DSL.name("idsite"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>live.session.idvisitor</code>.
     */
    public final TableField<SessionRecord, BigDecimal> IDVISITOR = createField(DSL.name("idvisitor"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>live.session.idurl</code>.
     */
    public final TableField<SessionRecord, Long> IDURL = createField(DSL.name("idurl"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live.session.idreferer</code>.
     */
    public final TableField<SessionRecord, Long> IDREFERER = createField(DSL.name("idreferer"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live.session.iduseragent</code>.
     */
    public final TableField<SessionRecord, Long> IDUSERAGENT = createField(DSL.name("iduseragent"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live.session.date</code>.
     */
    public final TableField<SessionRecord, LocalTime> DATE = createField(DSL.name("date"), SQLDataType.LOCALTIME(6), this, "");

    /**
     * The column <code>live.session.updated_at</code>.
     */
    public final TableField<SessionRecord, LocalTime> UPDATED_AT = createField(DSL.name("updated_at"), SQLDataType.LOCALTIME(6), this, "");

    /**
     * The column <code>live.session.length_active</code>.
     */
    public final TableField<SessionRecord, Long> LENGTH_ACTIVE = createField(DSL.name("length_active"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live.session.length_visible</code>.
     */
    public final TableField<SessionRecord, Long> LENGTH_VISIBLE = createField(DSL.name("length_visible"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live.session.length_loaded</code>.
     */
    public final TableField<SessionRecord, Long> LENGTH_LOADED = createField(DSL.name("length_loaded"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live.session.locale</code>.
     */
    public final TableField<SessionRecord, String> LOCALE = createField(DSL.name("locale"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live.session.mpathy_enabled</code>.
     */
    public final TableField<SessionRecord, Short> MPATHY_ENABLED = createField(DSL.name("mpathy_enabled"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>live.session.flashver</code>.
     */
    public final TableField<SessionRecord, Short> FLASHVER = createField(DSL.name("flashver"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>live.session.num_pi</code>.
     */
    public final TableField<SessionRecord, Long> NUM_PI = createField(DSL.name("num_pi"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live.session.imported</code>.
     */
    public final TableField<SessionRecord, Short> IMPORTED = createField(DSL.name("imported"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>live.session.script_versions</code>. Different tracking
     * script version information separated by pipe.
     */
    public final TableField<SessionRecord, String> SCRIPT_VERSIONS = createField(DSL.name("script_versions"), SQLDataType.CLOB, this, "Different tracking script version information separated by pipe.");

    /**
     * The column <code>live.session.successor</code>.
     */
    public final TableField<SessionRecord, BigDecimal> SUCCESSOR = createField(DSL.name("successor"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>live.session.idbucket</code>. foreign key to bucket
     * table
     */
    public final TableField<SessionRecord, BigDecimal> IDBUCKET = createField(DSL.name("idbucket"), SQLDataType.NUMERIC, this, "foreign key to bucket table");

    /**
     * The column <code>live.session.sdk_type</code>. The column contains the
     * tracking sdk type of the sessions
     */
    public final TableField<SessionRecord, String> SDK_TYPE = createField(DSL.name("sdk_type"), SQLDataType.CLOB, this, "The column contains the tracking sdk type of the sessions");

    private Session(Name alias, Table<SessionRecord> aliased) {
        this(alias, aliased, null);
    }

    private Session(Name alias, Table<SessionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>live.session</code> table reference
     */
    public Session(String alias) {
        this(DSL.name(alias), SESSION);
    }

    /**
     * Create an aliased <code>live.session</code> table reference
     */
    public Session(Name alias) {
        this(alias, SESSION);
    }

    /**
     * Create a <code>live.session</code> table reference
     */
    public Session() {
        this(DSL.name("session"), null);
    }

    public <O extends Record> Session(Table<O> child, ForeignKey<O, SessionRecord> key) {
        super(child, key, SESSION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Live.LIVE;
    }

    @Override
    public Identity<SessionRecord, Long> getIdentity() {
        return (Identity<SessionRecord, Long>) super.getIdentity();
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
