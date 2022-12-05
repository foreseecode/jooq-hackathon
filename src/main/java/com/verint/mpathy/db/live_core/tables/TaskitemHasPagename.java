/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables;


import com.verint.mpathy.db.live_core.LiveCore;
import com.verint.mpathy.db.live_core.tables.records.TaskitemHasPagenameRecord;

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
 * Easy access to underlying table in other schemas.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TaskitemHasPagename extends TableImpl<TaskitemHasPagenameRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>live_core.taskitem_has_pagename</code>
     */
    public static final TaskitemHasPagename TASKITEM_HAS_PAGENAME = new TaskitemHasPagename();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TaskitemHasPagenameRecord> getRecordType() {
        return TaskitemHasPagenameRecord.class;
    }

    /**
     * The column <code>live_core.taskitem_has_pagename.idpage_name</code>.
     */
    public final TableField<TaskitemHasPagenameRecord, Long> IDPAGE_NAME = createField(DSL.name("idpage_name"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live_core.taskitem_has_pagename.idtaskitem</code>.
     */
    public final TableField<TaskitemHasPagenameRecord, BigDecimal> IDTASKITEM = createField(DSL.name("idtaskitem"), SQLDataType.NUMERIC, this, "");

    private TaskitemHasPagename(Name alias, Table<TaskitemHasPagenameRecord> aliased) {
        this(alias, aliased, null);
    }

    private TaskitemHasPagename(Name alias, Table<TaskitemHasPagenameRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Easy access to underlying table in other schemas."), TableOptions.view("create view \"taskitem_has_pagename\" as  SELECT taskitem_has_pagename.idpage_name,\n    taskitem_has_pagename.idtaskitem\n   FROM live.taskitem_has_pagename;"));
    }

    /**
     * Create an aliased <code>live_core.taskitem_has_pagename</code> table
     * reference
     */
    public TaskitemHasPagename(String alias) {
        this(DSL.name(alias), TASKITEM_HAS_PAGENAME);
    }

    /**
     * Create an aliased <code>live_core.taskitem_has_pagename</code> table
     * reference
     */
    public TaskitemHasPagename(Name alias) {
        this(alias, TASKITEM_HAS_PAGENAME);
    }

    /**
     * Create a <code>live_core.taskitem_has_pagename</code> table reference
     */
    public TaskitemHasPagename() {
        this(DSL.name("taskitem_has_pagename"), null);
    }

    public <O extends Record> TaskitemHasPagename(Table<O> child, ForeignKey<O, TaskitemHasPagenameRecord> key) {
        super(child, key, TASKITEM_HAS_PAGENAME);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : LiveCore.LIVE_CORE;
    }

    @Override
    public TaskitemHasPagename as(String alias) {
        return new TaskitemHasPagename(DSL.name(alias), this);
    }

    @Override
    public TaskitemHasPagename as(Name alias) {
        return new TaskitemHasPagename(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TaskitemHasPagename rename(String name) {
        return new TaskitemHasPagename(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TaskitemHasPagename rename(Name name) {
        return new TaskitemHasPagename(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, BigDecimal> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
