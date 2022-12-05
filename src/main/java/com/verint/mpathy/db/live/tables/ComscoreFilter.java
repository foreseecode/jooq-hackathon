/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables;


import com.verint.mpathy.db.live.Live;
import com.verint.mpathy.db.live.tables.records.ComscoreFilterRecord;

import java.math.BigDecimal;

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
public class ComscoreFilter extends TableImpl<ComscoreFilterRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>live.comscore_filter</code>
     */
    public static final ComscoreFilter COMSCORE_FILTER = new ComscoreFilter();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ComscoreFilterRecord> getRecordType() {
        return ComscoreFilterRecord.class;
    }

    /**
     * The column <code>live.comscore_filter.idclient</code>.
     */
    public final TableField<ComscoreFilterRecord, BigDecimal> IDCLIENT = createField(DSL.name("idclient"), SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>live.comscore_filter.idfilter</code>.
     */
    public final TableField<ComscoreFilterRecord, BigDecimal> IDFILTER = createField(DSL.name("idfilter"), SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>live.comscore_filter.name</code>.
     */
    public final TableField<ComscoreFilterRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live.comscore_filter.scope</code>.
     */
    public final TableField<ComscoreFilterRecord, String> SCOPE = createField(DSL.name("scope"), SQLDataType.CLOB, this, "");

    private ComscoreFilter(Name alias, Table<ComscoreFilterRecord> aliased) {
        this(alias, aliased, null);
    }

    private ComscoreFilter(Name alias, Table<ComscoreFilterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>live.comscore_filter</code> table reference
     */
    public ComscoreFilter(String alias) {
        this(DSL.name(alias), COMSCORE_FILTER);
    }

    /**
     * Create an aliased <code>live.comscore_filter</code> table reference
     */
    public ComscoreFilter(Name alias) {
        this(alias, COMSCORE_FILTER);
    }

    /**
     * Create a <code>live.comscore_filter</code> table reference
     */
    public ComscoreFilter() {
        this(DSL.name("comscore_filter"), null);
    }

    public <O extends Record> ComscoreFilter(Table<O> child, ForeignKey<O, ComscoreFilterRecord> key) {
        super(child, key, COMSCORE_FILTER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Live.LIVE;
    }

    @Override
    public ComscoreFilter as(String alias) {
        return new ComscoreFilter(DSL.name(alias), this);
    }

    @Override
    public ComscoreFilter as(Name alias) {
        return new ComscoreFilter(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ComscoreFilter rename(String name) {
        return new ComscoreFilter(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ComscoreFilter rename(Name name) {
        return new ComscoreFilter(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<BigDecimal, BigDecimal, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
