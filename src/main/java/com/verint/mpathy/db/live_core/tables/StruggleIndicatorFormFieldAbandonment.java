/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables;


import com.verint.mpathy.db.live_core.LiveCore;
import com.verint.mpathy.db.live_core.tables.records.StruggleIndicatorFormFieldAbandonmentRecord;

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
 * Easy access to underlying table in other schemas.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StruggleIndicatorFormFieldAbandonment extends TableImpl<StruggleIndicatorFormFieldAbandonmentRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>live_core.struggle_indicator_form_field_abandonment</code>
     */
    public static final StruggleIndicatorFormFieldAbandonment STRUGGLE_INDICATOR_FORM_FIELD_ABANDONMENT = new StruggleIndicatorFormFieldAbandonment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StruggleIndicatorFormFieldAbandonmentRecord> getRecordType() {
        return StruggleIndicatorFormFieldAbandonmentRecord.class;
    }

    /**
     * The column
     * <code>live_core.struggle_indicator_form_field_abandonment.idstruggle_indicator_form_field_abandonment</code>.
     */
    public final TableField<StruggleIndicatorFormFieldAbandonmentRecord, Long> IDSTRUGGLE_INDICATOR_FORM_FIELD_ABANDONMENT = createField(DSL.name("idstruggle_indicator_form_field_abandonment"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>live_core.struggle_indicator_form_field_abandonment.idpage</code>.
     */
    public final TableField<StruggleIndicatorFormFieldAbandonmentRecord, BigDecimal> IDPAGE = createField(DSL.name("idpage"), SQLDataType.NUMERIC, this, "");

    /**
     * The column
     * <code>live_core.struggle_indicator_form_field_abandonment.value</code>.
     */
    public final TableField<StruggleIndicatorFormFieldAbandonmentRecord, Short> VALUE = createField(DSL.name("value"), SQLDataType.SMALLINT, this, "");

    /**
     * The column
     * <code>live_core.struggle_indicator_form_field_abandonment.idtaskitem</code>.
     */
    public final TableField<StruggleIndicatorFormFieldAbandonmentRecord, BigDecimal> IDTASKITEM = createField(DSL.name("idtaskitem"), SQLDataType.NUMERIC, this, "");

    private StruggleIndicatorFormFieldAbandonment(Name alias, Table<StruggleIndicatorFormFieldAbandonmentRecord> aliased) {
        this(alias, aliased, null);
    }

    private StruggleIndicatorFormFieldAbandonment(Name alias, Table<StruggleIndicatorFormFieldAbandonmentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Easy access to underlying table in other schemas."), TableOptions.view("create view \"struggle_indicator_form_field_abandonment\" as  SELECT struggle_indicator_form_field_abandonment.idstruggle_indicator_form_field_abandonment,\n    struggle_indicator_form_field_abandonment.idpage,\n    struggle_indicator_form_field_abandonment.value,\n    struggle_indicator_form_field_abandonment.idtaskitem\n   FROM live.struggle_indicator_form_field_abandonment;"));
    }

    /**
     * Create an aliased
     * <code>live_core.struggle_indicator_form_field_abandonment</code> table
     * reference
     */
    public StruggleIndicatorFormFieldAbandonment(String alias) {
        this(DSL.name(alias), STRUGGLE_INDICATOR_FORM_FIELD_ABANDONMENT);
    }

    /**
     * Create an aliased
     * <code>live_core.struggle_indicator_form_field_abandonment</code> table
     * reference
     */
    public StruggleIndicatorFormFieldAbandonment(Name alias) {
        this(alias, STRUGGLE_INDICATOR_FORM_FIELD_ABANDONMENT);
    }

    /**
     * Create a <code>live_core.struggle_indicator_form_field_abandonment</code>
     * table reference
     */
    public StruggleIndicatorFormFieldAbandonment() {
        this(DSL.name("struggle_indicator_form_field_abandonment"), null);
    }

    public <O extends Record> StruggleIndicatorFormFieldAbandonment(Table<O> child, ForeignKey<O, StruggleIndicatorFormFieldAbandonmentRecord> key) {
        super(child, key, STRUGGLE_INDICATOR_FORM_FIELD_ABANDONMENT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : LiveCore.LIVE_CORE;
    }

    @Override
    public StruggleIndicatorFormFieldAbandonment as(String alias) {
        return new StruggleIndicatorFormFieldAbandonment(DSL.name(alias), this);
    }

    @Override
    public StruggleIndicatorFormFieldAbandonment as(Name alias) {
        return new StruggleIndicatorFormFieldAbandonment(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public StruggleIndicatorFormFieldAbandonment rename(String name) {
        return new StruggleIndicatorFormFieldAbandonment(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public StruggleIndicatorFormFieldAbandonment rename(Name name) {
        return new StruggleIndicatorFormFieldAbandonment(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, BigDecimal, Short, BigDecimal> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
