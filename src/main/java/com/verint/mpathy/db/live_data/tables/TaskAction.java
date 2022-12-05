/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_data.tables;


import com.verint.mpathy.db.live_data.LiveData;
import com.verint.mpathy.db.live_data.tables.records.TaskActionRecord;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row12;
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
public class TaskAction extends TableImpl<TaskActionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>live_data.task_action</code>
     */
    public static final TaskAction TASK_ACTION = new TaskAction();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TaskActionRecord> getRecordType() {
        return TaskActionRecord.class;
    }

    /**
     * The column <code>live_data.task_action.idtask</code>.
     */
    public final TableField<TaskActionRecord, Long> IDTASK = createField(DSL.name("idtask"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live_data.task_action.idsession</code>.
     */
    public final TableField<TaskActionRecord, BigDecimal> IDSESSION = createField(DSL.name("idsession"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>live_data.task_action.timestamp</code>.
     */
    public final TableField<TaskActionRecord, BigDecimal> TIMESTAMP = createField(DSL.name("timestamp"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>live_data.task_action.idsite</code>.
     */
    public final TableField<TaskActionRecord, Integer> IDSITE = createField(DSL.name("idsite"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>live_data.task_action.last_taskitem</code>.
     */
    public final TableField<TaskActionRecord, BigDecimal> LAST_TASKITEM = createField(DSL.name("last_taskitem"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>live_data.task_action.last_pi</code>.
     */
    public final TableField<TaskActionRecord, BigDecimal> LAST_PI = createField(DSL.name("last_pi"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>live_data.task_action.length_loaded</code>.
     */
    public final TableField<TaskActionRecord, Long> LENGTH_LOADED = createField(DSL.name("length_loaded"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live_data.task_action.length_active</code>.
     */
    public final TableField<TaskActionRecord, Long> LENGTH_ACTIVE = createField(DSL.name("length_active"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live_data.task_action.length_visible</code>.
     */
    public final TableField<TaskActionRecord, Long> LENGTH_VISIBLE = createField(DSL.name("length_visible"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live_data.task_action.num_pi</code>.
     */
    public final TableField<TaskActionRecord, Long> NUM_PI = createField(DSL.name("num_pi"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live_data.task_action.num_clicks</code>.
     */
    public final TableField<TaskActionRecord, Long> NUM_CLICKS = createField(DSL.name("num_clicks"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live_data.task_action.completed</code>.
     */
    public final TableField<TaskActionRecord, Short> COMPLETED = createField(DSL.name("completed"), SQLDataType.SMALLINT, this, "");

    private TaskAction(Name alias, Table<TaskActionRecord> aliased) {
        this(alias, aliased, null);
    }

    private TaskAction(Name alias, Table<TaskActionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>live_data.task_action</code> table reference
     */
    public TaskAction(String alias) {
        this(DSL.name(alias), TASK_ACTION);
    }

    /**
     * Create an aliased <code>live_data.task_action</code> table reference
     */
    public TaskAction(Name alias) {
        this(alias, TASK_ACTION);
    }

    /**
     * Create a <code>live_data.task_action</code> table reference
     */
    public TaskAction() {
        this(DSL.name("task_action"), null);
    }

    public <O extends Record> TaskAction(Table<O> child, ForeignKey<O, TaskActionRecord> key) {
        super(child, key, TASK_ACTION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : LiveData.LIVE_DATA;
    }

    @Override
    public TaskAction as(String alias) {
        return new TaskAction(DSL.name(alias), this);
    }

    @Override
    public TaskAction as(Name alias) {
        return new TaskAction(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TaskAction rename(String name) {
        return new TaskAction(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TaskAction rename(Name name) {
        return new TaskAction(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Long, BigDecimal, BigDecimal, Integer, BigDecimal, BigDecimal, Long, Long, Long, Long, Long, Short> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
}
