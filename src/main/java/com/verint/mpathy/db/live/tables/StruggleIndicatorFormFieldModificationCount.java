/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables;


import com.verint.mpathy.db.live.Live;
import com.verint.mpathy.db.live.tables.records.StruggleIndicatorFormFieldModificationCountRecord;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
 * Indicator definition: Repeated interactions (focus) and edits (i.e. content
 * changes, min. 1 char or status changes) in the same form field during a page
 * view.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StruggleIndicatorFormFieldModificationCount extends TableImpl<StruggleIndicatorFormFieldModificationCountRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>live.struggle_indicator_form_field_modification_count</code>
     */
    public static final StruggleIndicatorFormFieldModificationCount STRUGGLE_INDICATOR_FORM_FIELD_MODIFICATION_COUNT = new StruggleIndicatorFormFieldModificationCount();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StruggleIndicatorFormFieldModificationCountRecord> getRecordType() {
        return StruggleIndicatorFormFieldModificationCountRecord.class;
    }

    /**
     * The column
     * <code>live.struggle_indicator_form_field_modification_count.idstruggle_indicator_form_field_modification_count</code>.
     * The primary key for identifying rows of this table.
     */
    public final TableField<StruggleIndicatorFormFieldModificationCountRecord, Long> IDSTRUGGLE_INDICATOR_FORM_FIELD_MODIFICATION_COUNT = createField(DSL.name("idstruggle_indicator_form_field_modification_count"), SQLDataType.BIGINT.nullable(false).identity(true), this, "The primary key for identifying rows of this table.");

    /**
     * The column
     * <code>live.struggle_indicator_form_field_modification_count.idpage</code>.
     * The FK for reference to the ID column of the "page" table.
     */
    public final TableField<StruggleIndicatorFormFieldModificationCountRecord, BigDecimal> IDPAGE = createField(DSL.name("idpage"), SQLDataType.NUMERIC, this, "The FK for reference to the ID column of the \"page\" table.");

    /**
     * The column
     * <code>live.struggle_indicator_form_field_modification_count.value</code>.
     * The amount of times, a form field is focussed/modified within the page
     * associated with "idpage".
     */
    public final TableField<StruggleIndicatorFormFieldModificationCountRecord, Long> VALUE = createField(DSL.name("value"), SQLDataType.BIGINT, this, "The amount of times, a form field is focussed/modified within the page associated with \"idpage\".");

    /**
     * The column
     * <code>live.struggle_indicator_form_field_modification_count.node_id</code>.
     * The mpathy node id, for the DOM node, this indicator associated with. It
     * serves as identifier for DOM nodes within the page associated with
     * "idpage".
     */
    public final TableField<StruggleIndicatorFormFieldModificationCountRecord, Long> NODE_ID = createField(DSL.name("node_id"), SQLDataType.BIGINT.nullable(false), this, "The mpathy node id, for the DOM node, this indicator associated with. It serves as identifier for DOM nodes within the page associated with \"idpage\".");

    /**
     * The column
     * <code>live.struggle_indicator_form_field_modification_count.relative_time</code>.
     */
    public final TableField<StruggleIndicatorFormFieldModificationCountRecord, Long> RELATIVE_TIME = createField(DSL.name("relative_time"), SQLDataType.BIGINT, this, "");

    private StruggleIndicatorFormFieldModificationCount(Name alias, Table<StruggleIndicatorFormFieldModificationCountRecord> aliased) {
        this(alias, aliased, null);
    }

    private StruggleIndicatorFormFieldModificationCount(Name alias, Table<StruggleIndicatorFormFieldModificationCountRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Indicator definition: Repeated interactions (focus) and edits (i.e. content changes, min. 1 char or status changes) in the same form field during a page view."), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>live.struggle_indicator_form_field_modification_count</code> table
     * reference
     */
    public StruggleIndicatorFormFieldModificationCount(String alias) {
        this(DSL.name(alias), STRUGGLE_INDICATOR_FORM_FIELD_MODIFICATION_COUNT);
    }

    /**
     * Create an aliased
     * <code>live.struggle_indicator_form_field_modification_count</code> table
     * reference
     */
    public StruggleIndicatorFormFieldModificationCount(Name alias) {
        this(alias, STRUGGLE_INDICATOR_FORM_FIELD_MODIFICATION_COUNT);
    }

    /**
     * Create a
     * <code>live.struggle_indicator_form_field_modification_count</code> table
     * reference
     */
    public StruggleIndicatorFormFieldModificationCount() {
        this(DSL.name("struggle_indicator_form_field_modification_count"), null);
    }

    public <O extends Record> StruggleIndicatorFormFieldModificationCount(Table<O> child, ForeignKey<O, StruggleIndicatorFormFieldModificationCountRecord> key) {
        super(child, key, STRUGGLE_INDICATOR_FORM_FIELD_MODIFICATION_COUNT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Live.LIVE;
    }

    @Override
    public Identity<StruggleIndicatorFormFieldModificationCountRecord, Long> getIdentity() {
        return (Identity<StruggleIndicatorFormFieldModificationCountRecord, Long>) super.getIdentity();
    }

    @Override
    public StruggleIndicatorFormFieldModificationCount as(String alias) {
        return new StruggleIndicatorFormFieldModificationCount(DSL.name(alias), this);
    }

    @Override
    public StruggleIndicatorFormFieldModificationCount as(Name alias) {
        return new StruggleIndicatorFormFieldModificationCount(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public StruggleIndicatorFormFieldModificationCount rename(String name) {
        return new StruggleIndicatorFormFieldModificationCount(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public StruggleIndicatorFormFieldModificationCount rename(Name name) {
        return new StruggleIndicatorFormFieldModificationCount(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, BigDecimal, Long, Long, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
