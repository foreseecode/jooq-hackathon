/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables;


import com.verint.mpathy.db.live.Live;
import com.verint.mpathy.db.live.tables.records.Movement_3t4Record;

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
public class Movement_3t4 extends TableImpl<Movement_3t4Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>live.movement_3t4</code>
     */
    public static final Movement_3t4 MOVEMENT_3T4 = new Movement_3t4();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Movement_3t4Record> getRecordType() {
        return Movement_3t4Record.class;
    }

    /**
     * The column <code>live.movement_3t4.idsite</code>. Technical foreign key
     * to the "site" table and a foreign key to "site".
     */
    public final TableField<Movement_3t4Record, Integer> IDSITE = createField(DSL.name("idsite"), SQLDataType.INTEGER.nullable(false), this, "Technical foreign key to the \"site\" table and a foreign key to \"site\".");

    /**
     * The column <code>live.movement_3t4.idpage</code>. Technical foreign key
     * to the "page" table and a foreign key to "page".
     */
    public final TableField<Movement_3t4Record, BigDecimal> IDPAGE = createField(DSL.name("idpage"), SQLDataType.NUMERIC.nullable(false), this, "Technical foreign key to the \"page\" table and a foreign key to \"page\".");

    /**
     * The column <code>live.movement_3t4.move</code>. Accumulated moves from
     * "map_move between 3 and 4 seconds.
     */
    public final TableField<Movement_3t4Record, String> MOVE = createField(DSL.name("move"), SQLDataType.CLOB, this, "Accumulated moves from \"map_move between 3 and 4 seconds.");

    private Movement_3t4(Name alias, Table<Movement_3t4Record> aliased) {
        this(alias, aliased, null);
    }

    private Movement_3t4(Name alias, Table<Movement_3t4Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>live.movement_3t4</code> table reference
     */
    public Movement_3t4(String alias) {
        this(DSL.name(alias), MOVEMENT_3T4);
    }

    /**
     * Create an aliased <code>live.movement_3t4</code> table reference
     */
    public Movement_3t4(Name alias) {
        this(alias, MOVEMENT_3T4);
    }

    /**
     * Create a <code>live.movement_3t4</code> table reference
     */
    public Movement_3t4() {
        this(DSL.name("movement_3t4"), null);
    }

    public <O extends Record> Movement_3t4(Table<O> child, ForeignKey<O, Movement_3t4Record> key) {
        super(child, key, MOVEMENT_3T4);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Live.LIVE;
    }

    @Override
    public Movement_3t4 as(String alias) {
        return new Movement_3t4(DSL.name(alias), this);
    }

    @Override
    public Movement_3t4 as(Name alias) {
        return new Movement_3t4(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Movement_3t4 rename(String name) {
        return new Movement_3t4(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Movement_3t4 rename(Name name) {
        return new Movement_3t4(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, BigDecimal, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
