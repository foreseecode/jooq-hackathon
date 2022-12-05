/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables;


import com.verint.mpathy.db.live.Live;
import com.verint.mpathy.db.live.tables.records.Trafficstats31dRecord;

import java.math.BigDecimal;

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
public class Trafficstats31d extends TableImpl<Trafficstats31dRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>live.trafficstats31d</code>
     */
    public static final Trafficstats31d TRAFFICSTATS31D = new Trafficstats31d();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Trafficstats31dRecord> getRecordType() {
        return Trafficstats31dRecord.class;
    }

    /**
     * The column <code>live.trafficstats31d.day</code>.
     */
    public final TableField<Trafficstats31dRecord, Integer> DAY = createField(DSL.name("day"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>live.trafficstats31d.traffic</code>.
     */
    public final TableField<Trafficstats31dRecord, BigDecimal> TRAFFIC = createField(DSL.name("traffic"), SQLDataType.NUMERIC, this, "");

    private Trafficstats31d(Name alias, Table<Trafficstats31dRecord> aliased) {
        this(alias, aliased, null);
    }

    private Trafficstats31d(Name alias, Table<Trafficstats31dRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>live.trafficstats31d</code> table reference
     */
    public Trafficstats31d(String alias) {
        this(DSL.name(alias), TRAFFICSTATS31D);
    }

    /**
     * Create an aliased <code>live.trafficstats31d</code> table reference
     */
    public Trafficstats31d(Name alias) {
        this(alias, TRAFFICSTATS31D);
    }

    /**
     * Create a <code>live.trafficstats31d</code> table reference
     */
    public Trafficstats31d() {
        this(DSL.name("trafficstats31d"), null);
    }

    public <O extends Record> Trafficstats31d(Table<O> child, ForeignKey<O, Trafficstats31dRecord> key) {
        super(child, key, TRAFFICSTATS31D);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Live.LIVE;
    }

    @Override
    public Trafficstats31d as(String alias) {
        return new Trafficstats31d(DSL.name(alias), this);
    }

    @Override
    public Trafficstats31d as(Name alias) {
        return new Trafficstats31d(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Trafficstats31d rename(String name) {
        return new Trafficstats31d(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Trafficstats31d rename(Name name) {
        return new Trafficstats31d(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, BigDecimal> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
