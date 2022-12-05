/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables;


import com.verint.mpathy.db.live.Live;
import com.verint.mpathy.db.live.tables.records.Sessionstats24hRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
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
public class Sessionstats24h extends TableImpl<Sessionstats24hRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>live.sessionstats24h</code>
     */
    public static final Sessionstats24h SESSIONSTATS24H = new Sessionstats24h();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Sessionstats24hRecord> getRecordType() {
        return Sessionstats24hRecord.class;
    }

    /**
     * The column <code>live.sessionstats24h.idsite</code>.
     */
    public final TableField<Sessionstats24hRecord, Integer> IDSITE = createField(DSL.name("idsite"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>live.sessionstats24h.hour</code>.
     */
    public final TableField<Sessionstats24hRecord, Short> HOUR = createField(DSL.name("hour"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>live.sessionstats24h.sessions</code>.
     */
    public final TableField<Sessionstats24hRecord, Long> SESSIONS = createField(DSL.name("sessions"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live.sessionstats24h.statsrequests</code>.
     */
    public final TableField<Sessionstats24hRecord, Long> STATSREQUESTS = createField(DSL.name("statsrequests"), SQLDataType.BIGINT, this, "");

    private Sessionstats24h(Name alias, Table<Sessionstats24hRecord> aliased) {
        this(alias, aliased, null);
    }

    private Sessionstats24h(Name alias, Table<Sessionstats24hRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>live.sessionstats24h</code> table reference
     */
    public Sessionstats24h(String alias) {
        this(DSL.name(alias), SESSIONSTATS24H);
    }

    /**
     * Create an aliased <code>live.sessionstats24h</code> table reference
     */
    public Sessionstats24h(Name alias) {
        this(alias, SESSIONSTATS24H);
    }

    /**
     * Create a <code>live.sessionstats24h</code> table reference
     */
    public Sessionstats24h() {
        this(DSL.name("sessionstats24h"), null);
    }

    public <O extends Record> Sessionstats24h(Table<O> child, ForeignKey<O, Sessionstats24hRecord> key) {
        super(child, key, SESSIONSTATS24H);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Live.LIVE;
    }

    @Override
    public Sessionstats24h as(String alias) {
        return new Sessionstats24h(DSL.name(alias), this);
    }

    @Override
    public Sessionstats24h as(Name alias) {
        return new Sessionstats24h(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Sessionstats24h rename(String name) {
        return new Sessionstats24h(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Sessionstats24h rename(Name name) {
        return new Sessionstats24h(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Short, Long, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
