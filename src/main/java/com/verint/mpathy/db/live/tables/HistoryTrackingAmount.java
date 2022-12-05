/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables;


import com.verint.mpathy.db.live.Live;
import com.verint.mpathy.db.live.tables.records.HistoryTrackingAmountRecord;

import java.time.LocalTime;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
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
public class HistoryTrackingAmount extends TableImpl<HistoryTrackingAmountRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>live.history_tracking_amount</code>
     */
    public static final HistoryTrackingAmount HISTORY_TRACKING_AMOUNT = new HistoryTrackingAmount();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HistoryTrackingAmountRecord> getRecordType() {
        return HistoryTrackingAmountRecord.class;
    }

    /**
     * The column <code>live.history_tracking_amount.idhta</code>.
     */
    public final TableField<HistoryTrackingAmountRecord, Long> IDHTA = createField(DSL.name("idhta"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>live.history_tracking_amount.date</code>. Timestamp of
     * check
     */
    public final TableField<HistoryTrackingAmountRecord, LocalTime> DATE = createField(DSL.name("date"), SQLDataType.LOCALTIME(6).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALTIME)), this, "Timestamp of check");

    /**
     * The column <code>live.history_tracking_amount.idsite</code>.
     */
    public final TableField<HistoryTrackingAmountRecord, Integer> IDSITE = createField(DSL.name("idsite"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>live.history_tracking_amount.idserver</code>.
     */
    public final TableField<HistoryTrackingAmountRecord, Short> IDSERVER = createField(DSL.name("idserver"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>live.history_tracking_amount.amount_desktop</code>.
     * Amount of desktop Pages since last check.
     */
    public final TableField<HistoryTrackingAmountRecord, Long> AMOUNT_DESKTOP = createField(DSL.name("amount_desktop"), SQLDataType.BIGINT, this, "Amount of desktop Pages since last check.");

    /**
     * The column <code>live.history_tracking_amount.amount_phone</code>. Amount
     * of phone Pages since last check.
     */
    public final TableField<HistoryTrackingAmountRecord, Long> AMOUNT_PHONE = createField(DSL.name("amount_phone"), SQLDataType.BIGINT, this, "Amount of phone Pages since last check.");

    /**
     * The column <code>live.history_tracking_amount.amount_tablet</code>.
     * Amount of tablet Pages since last check.
     */
    public final TableField<HistoryTrackingAmountRecord, Long> AMOUNT_TABLET = createField(DSL.name("amount_tablet"), SQLDataType.BIGINT, this, "Amount of tablet Pages since last check.");

    /**
     * The column <code>live.history_tracking_amount.recprob_desktop</code>.
     * Column for the desktop tracking rate.
     */
    public final TableField<HistoryTrackingAmountRecord, Double> RECPROB_DESKTOP = createField(DSL.name("recprob_desktop"), SQLDataType.DOUBLE.defaultValue(DSL.field("0", SQLDataType.DOUBLE)), this, "Column for the desktop tracking rate.");

    /**
     * The column <code>live.history_tracking_amount.recprob_phone</code>.
     * Column for the phone tracking rate.
     */
    public final TableField<HistoryTrackingAmountRecord, Double> RECPROB_PHONE = createField(DSL.name("recprob_phone"), SQLDataType.DOUBLE.defaultValue(DSL.field("0", SQLDataType.DOUBLE)), this, "Column for the phone tracking rate.");

    /**
     * The column <code>live.history_tracking_amount.recprob_tablet</code>.
     * Column for the tablet tracking rate.
     */
    public final TableField<HistoryTrackingAmountRecord, Double> RECPROB_TABLET = createField(DSL.name("recprob_tablet"), SQLDataType.DOUBLE.defaultValue(DSL.field("0", SQLDataType.DOUBLE)), this, "Column for the tablet tracking rate.");

    /**
     * The column <code>live.history_tracking_amount.pilimit_desktop</code>.
     * Page impression limit for desktop devices.
     */
    public final TableField<HistoryTrackingAmountRecord, Long> PILIMIT_DESKTOP = createField(DSL.name("pilimit_desktop"), SQLDataType.BIGINT.defaultValue(DSL.field("0", SQLDataType.BIGINT)), this, "Page impression limit for desktop devices.");

    /**
     * The column <code>live.history_tracking_amount.pilimit_phone</code>. Page
     * impression limit for phone devices.
     */
    public final TableField<HistoryTrackingAmountRecord, Long> PILIMIT_PHONE = createField(DSL.name("pilimit_phone"), SQLDataType.BIGINT.defaultValue(DSL.field("0", SQLDataType.BIGINT)), this, "Page impression limit for phone devices.");

    /**
     * The column <code>live.history_tracking_amount.pilimit_tablet</code>. Page
     * impression limit for tablet devices.
     */
    public final TableField<HistoryTrackingAmountRecord, Long> PILIMIT_TABLET = createField(DSL.name("pilimit_tablet"), SQLDataType.BIGINT.defaultValue(DSL.field("0", SQLDataType.BIGINT)), this, "Page impression limit for tablet devices.");

    /**
     * The column <code>live.history_tracking_amount.type</code>. Type of
     * recording rate (tracking or survey).
     */
    public final TableField<HistoryTrackingAmountRecord, String> TYPE = createField(DSL.name("type"), SQLDataType.CLOB.defaultValue(DSL.field("'tracking'::text", SQLDataType.CLOB)), this, "Type of recording rate (tracking or survey).");

    /**
     * The column <code>live.history_tracking_amount.range</code>. Time range of
     * represented data in minutes.
     */
    public final TableField<HistoryTrackingAmountRecord, Long> RANGE = createField(DSL.name("range"), SQLDataType.BIGINT.defaultValue(DSL.field("60", SQLDataType.BIGINT)), this, "Time range of represented data in minutes.");

    /**
     * The column <code>live.history_tracking_amount.avg_desktop</code>. Average
     * of compressed desktop data.
     */
    public final TableField<HistoryTrackingAmountRecord, Double> AVG_DESKTOP = createField(DSL.name("avg_desktop"), SQLDataType.DOUBLE.defaultValue(DSL.field("0", SQLDataType.DOUBLE)), this, "Average of compressed desktop data.");

    /**
     * The column <code>live.history_tracking_amount.avg_phone</code>. Average
     * of compressed phone data.
     */
    public final TableField<HistoryTrackingAmountRecord, Double> AVG_PHONE = createField(DSL.name("avg_phone"), SQLDataType.DOUBLE.defaultValue(DSL.field("0", SQLDataType.DOUBLE)), this, "Average of compressed phone data.");

    /**
     * The column <code>live.history_tracking_amount.avg_tablet</code>. Average
     * of compressed tablet data.
     */
    public final TableField<HistoryTrackingAmountRecord, Double> AVG_TABLET = createField(DSL.name("avg_tablet"), SQLDataType.DOUBLE.defaultValue(DSL.field("0", SQLDataType.DOUBLE)), this, "Average of compressed tablet data.");

    /**
     * The column <code>live.history_tracking_amount.min_desktop</code>. Minimum
     * of compressed desktop data.
     */
    public final TableField<HistoryTrackingAmountRecord, Double> MIN_DESKTOP = createField(DSL.name("min_desktop"), SQLDataType.DOUBLE.defaultValue(DSL.field("0", SQLDataType.DOUBLE)), this, "Minimum of compressed desktop data.");

    /**
     * The column <code>live.history_tracking_amount.min_phone</code>. Minimum
     * of compressed phone data.
     */
    public final TableField<HistoryTrackingAmountRecord, Double> MIN_PHONE = createField(DSL.name("min_phone"), SQLDataType.DOUBLE.defaultValue(DSL.field("0", SQLDataType.DOUBLE)), this, "Minimum of compressed phone data.");

    /**
     * The column <code>live.history_tracking_amount.min_tablet</code>. Minimum
     * of compressed tablet data.
     */
    public final TableField<HistoryTrackingAmountRecord, Double> MIN_TABLET = createField(DSL.name("min_tablet"), SQLDataType.DOUBLE.defaultValue(DSL.field("0", SQLDataType.DOUBLE)), this, "Minimum of compressed tablet data.");

    /**
     * The column <code>live.history_tracking_amount.max_desktop</code>. Maximum
     * of compressed desktop data.
     */
    public final TableField<HistoryTrackingAmountRecord, Double> MAX_DESKTOP = createField(DSL.name("max_desktop"), SQLDataType.DOUBLE.defaultValue(DSL.field("0", SQLDataType.DOUBLE)), this, "Maximum of compressed desktop data.");

    /**
     * The column <code>live.history_tracking_amount.max_phone</code>. Maximum
     * of compressed phone data.
     */
    public final TableField<HistoryTrackingAmountRecord, Double> MAX_PHONE = createField(DSL.name("max_phone"), SQLDataType.DOUBLE.defaultValue(DSL.field("0", SQLDataType.DOUBLE)), this, "Maximum of compressed phone data.");

    /**
     * The column <code>live.history_tracking_amount.max_tablet</code>. Maximum
     * of compressed tablet data.
     */
    public final TableField<HistoryTrackingAmountRecord, Double> MAX_TABLET = createField(DSL.name("max_tablet"), SQLDataType.DOUBLE.defaultValue(DSL.field("0", SQLDataType.DOUBLE)), this, "Maximum of compressed tablet data.");

    private HistoryTrackingAmount(Name alias, Table<HistoryTrackingAmountRecord> aliased) {
        this(alias, aliased, null);
    }

    private HistoryTrackingAmount(Name alias, Table<HistoryTrackingAmountRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>live.history_tracking_amount</code> table
     * reference
     */
    public HistoryTrackingAmount(String alias) {
        this(DSL.name(alias), HISTORY_TRACKING_AMOUNT);
    }

    /**
     * Create an aliased <code>live.history_tracking_amount</code> table
     * reference
     */
    public HistoryTrackingAmount(Name alias) {
        this(alias, HISTORY_TRACKING_AMOUNT);
    }

    /**
     * Create a <code>live.history_tracking_amount</code> table reference
     */
    public HistoryTrackingAmount() {
        this(DSL.name("history_tracking_amount"), null);
    }

    public <O extends Record> HistoryTrackingAmount(Table<O> child, ForeignKey<O, HistoryTrackingAmountRecord> key) {
        super(child, key, HISTORY_TRACKING_AMOUNT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Live.LIVE;
    }

    @Override
    public Identity<HistoryTrackingAmountRecord, Long> getIdentity() {
        return (Identity<HistoryTrackingAmountRecord, Long>) super.getIdentity();
    }

    @Override
    public HistoryTrackingAmount as(String alias) {
        return new HistoryTrackingAmount(DSL.name(alias), this);
    }

    @Override
    public HistoryTrackingAmount as(Name alias) {
        return new HistoryTrackingAmount(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HistoryTrackingAmount rename(String name) {
        return new HistoryTrackingAmount(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public HistoryTrackingAmount rename(Name name) {
        return new HistoryTrackingAmount(name, null);
    }
}
