/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables;


import com.verint.mpathy.db.live.Live;
import com.verint.mpathy.db.live.tables.records.Cp_2PageimpressionRecord;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
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
public class Cp_2Pageimpression extends TableImpl<Cp_2PageimpressionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>live.cp_2_pageimpression</code>
     */
    public static final Cp_2Pageimpression CP_2_PAGEIMPRESSION = new Cp_2Pageimpression();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Cp_2PageimpressionRecord> getRecordType() {
        return Cp_2PageimpressionRecord.class;
    }

    /**
     * The column <code>live.cp_2_pageimpression.idpage</code>.
     */
    public final TableField<Cp_2PageimpressionRecord, BigDecimal> IDPAGE = createField(DSL.name("idpage"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>live.cp_2_pageimpression.idcp</code>.
     */
    public final TableField<Cp_2PageimpressionRecord, Long> IDCP = createField(DSL.name("idcp"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live.cp_2_pageimpression.idvalue</code>.
     */
    public final TableField<Cp_2PageimpressionRecord, BigDecimal> IDVALUE = createField(DSL.name("idvalue"), SQLDataType.NUMERIC, this, "");

    private Cp_2Pageimpression(Name alias, Table<Cp_2PageimpressionRecord> aliased) {
        this(alias, aliased, null);
    }

    private Cp_2Pageimpression(Name alias, Table<Cp_2PageimpressionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>live.cp_2_pageimpression</code> table reference
     */
    public Cp_2Pageimpression(String alias) {
        this(DSL.name(alias), CP_2_PAGEIMPRESSION);
    }

    /**
     * Create an aliased <code>live.cp_2_pageimpression</code> table reference
     */
    public Cp_2Pageimpression(Name alias) {
        this(alias, CP_2_PAGEIMPRESSION);
    }

    /**
     * Create a <code>live.cp_2_pageimpression</code> table reference
     */
    public Cp_2Pageimpression() {
        this(DSL.name("cp_2_pageimpression"), null);
    }

    public <O extends Record> Cp_2Pageimpression(Table<O> child, ForeignKey<O, Cp_2PageimpressionRecord> key) {
        super(child, key, CP_2_PAGEIMPRESSION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Live.LIVE;
    }

    @Override
    public Cp_2Pageimpression as(String alias) {
        return new Cp_2Pageimpression(DSL.name(alias), this);
    }

    @Override
    public Cp_2Pageimpression as(Name alias) {
        return new Cp_2Pageimpression(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Cp_2Pageimpression rename(String name) {
        return new Cp_2Pageimpression(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Cp_2Pageimpression rename(Name name) {
        return new Cp_2Pageimpression(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<BigDecimal, Long, BigDecimal> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
