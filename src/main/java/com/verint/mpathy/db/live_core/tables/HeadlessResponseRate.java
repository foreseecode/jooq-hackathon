/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables;


import com.verint.mpathy.db.live_core.LiveCore;
import com.verint.mpathy.db.live_core.tables.records.HeadlessResponseRateRecord;

import java.time.LocalTime;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
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
public class HeadlessResponseRate extends TableImpl<HeadlessResponseRateRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>live_core.headless_response_rate</code>
     */
    public static final HeadlessResponseRate HEADLESS_RESPONSE_RATE = new HeadlessResponseRate();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HeadlessResponseRateRecord> getRecordType() {
        return HeadlessResponseRateRecord.class;
    }

    /**
     * The column <code>live_core.headless_response_rate.idsite</code>.
     */
    public final TableField<HeadlessResponseRateRecord, Integer> IDSITE = createField(DSL.name("idsite"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>live_core.headless_response_rate.idquestion</code>.
     */
    public final TableField<HeadlessResponseRateRecord, Long> IDQUESTION = createField(DSL.name("idquestion"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live_core.headless_response_rate.delivered</code>.
     */
    public final TableField<HeadlessResponseRateRecord, Long> DELIVERED = createField(DSL.name("delivered"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live_core.headless_response_rate.answered</code>.
     */
    public final TableField<HeadlessResponseRateRecord, Long> ANSWERED = createField(DSL.name("answered"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live_core.headless_response_rate.limit_start</code>.
     */
    public final TableField<HeadlessResponseRateRecord, LocalTime> LIMIT_START = createField(DSL.name("limit_start"), SQLDataType.LOCALTIME(6), this, "");

    private HeadlessResponseRate(Name alias, Table<HeadlessResponseRateRecord> aliased) {
        this(alias, aliased, null);
    }

    private HeadlessResponseRate(Name alias, Table<HeadlessResponseRateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Easy access to underlying table in other schemas."), TableOptions.view("create view \"headless_response_rate\" as  SELECT headless_response_rate.idsite,\n    headless_response_rate.idquestion,\n    headless_response_rate.delivered,\n    headless_response_rate.answered,\n    headless_response_rate.limit_start\n   FROM live.headless_response_rate;"));
    }

    /**
     * Create an aliased <code>live_core.headless_response_rate</code> table
     * reference
     */
    public HeadlessResponseRate(String alias) {
        this(DSL.name(alias), HEADLESS_RESPONSE_RATE);
    }

    /**
     * Create an aliased <code>live_core.headless_response_rate</code> table
     * reference
     */
    public HeadlessResponseRate(Name alias) {
        this(alias, HEADLESS_RESPONSE_RATE);
    }

    /**
     * Create a <code>live_core.headless_response_rate</code> table reference
     */
    public HeadlessResponseRate() {
        this(DSL.name("headless_response_rate"), null);
    }

    public <O extends Record> HeadlessResponseRate(Table<O> child, ForeignKey<O, HeadlessResponseRateRecord> key) {
        super(child, key, HEADLESS_RESPONSE_RATE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : LiveCore.LIVE_CORE;
    }

    @Override
    public HeadlessResponseRate as(String alias) {
        return new HeadlessResponseRate(DSL.name(alias), this);
    }

    @Override
    public HeadlessResponseRate as(Name alias) {
        return new HeadlessResponseRate(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HeadlessResponseRate rename(String name) {
        return new HeadlessResponseRate(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public HeadlessResponseRate rename(Name name) {
        return new HeadlessResponseRate(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Long, Long, Long, LocalTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
