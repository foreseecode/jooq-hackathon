/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables;


import com.verint.mpathy.db.live.Live;
import com.verint.mpathy.db.live.tables.records.MovementmapRecord;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
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
public class Movementmap extends TableImpl<MovementmapRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>live.movementmap</code>
     */
    public static final Movementmap MOVEMENTMAP = new Movementmap();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MovementmapRecord> getRecordType() {
        return MovementmapRecord.class;
    }

    /**
     * The column <code>live.movementmap.idsite</code>.
     */
    public final TableField<MovementmapRecord, Integer> IDSITE = createField(DSL.name("idsite"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>live.movementmap.idpage</code>.
     */
    public final TableField<MovementmapRecord, BigDecimal> IDPAGE = createField(DSL.name("idpage"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>live.movementmap.time_0</code>.
     */
    public final TableField<MovementmapRecord, String> TIME_0 = createField(DSL.name("time_0"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live.movementmap.time_3</code>.
     */
    public final TableField<MovementmapRecord, String> TIME_3 = createField(DSL.name("time_3"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live.movementmap.time_5</code>.
     */
    public final TableField<MovementmapRecord, String> TIME_5 = createField(DSL.name("time_5"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live.movementmap.time_10</code>.
     */
    public final TableField<MovementmapRecord, String> TIME_10 = createField(DSL.name("time_10"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live.movementmap.time_15</code>.
     */
    public final TableField<MovementmapRecord, String> TIME_15 = createField(DSL.name("time_15"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live.movementmap.time_20</code>.
     */
    public final TableField<MovementmapRecord, String> TIME_20 = createField(DSL.name("time_20"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live.movementmap.time_40</code>.
     */
    public final TableField<MovementmapRecord, String> TIME_40 = createField(DSL.name("time_40"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live.movementmap.time_60</code>.
     */
    public final TableField<MovementmapRecord, String> TIME_60 = createField(DSL.name("time_60"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live.movementmap.time_120</code>.
     */
    public final TableField<MovementmapRecord, String> TIME_120 = createField(DSL.name("time_120"), SQLDataType.CLOB, this, "");

    private Movementmap(Name alias, Table<MovementmapRecord> aliased) {
        this(alias, aliased, null);
    }

    private Movementmap(Name alias, Table<MovementmapRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>live.movementmap</code> table reference
     */
    public Movementmap(String alias) {
        this(DSL.name(alias), MOVEMENTMAP);
    }

    /**
     * Create an aliased <code>live.movementmap</code> table reference
     */
    public Movementmap(Name alias) {
        this(alias, MOVEMENTMAP);
    }

    /**
     * Create a <code>live.movementmap</code> table reference
     */
    public Movementmap() {
        this(DSL.name("movementmap"), null);
    }

    public <O extends Record> Movementmap(Table<O> child, ForeignKey<O, MovementmapRecord> key) {
        super(child, key, MOVEMENTMAP);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Live.LIVE;
    }

    @Override
    public Movementmap as(String alias) {
        return new Movementmap(DSL.name(alias), this);
    }

    @Override
    public Movementmap as(Name alias) {
        return new Movementmap(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Movementmap rename(String name) {
        return new Movementmap(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Movementmap rename(Name name) {
        return new Movementmap(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, BigDecimal, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}
