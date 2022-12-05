/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables;


import com.verint.mpathy.db.live.Live;
import com.verint.mpathy.db.live.tables.records.BucketCountVuxuvm8wekRecord;

import java.math.BigDecimal;
import java.time.LocalTime;

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
public class BucketCountVuxuvm8wek extends TableImpl<BucketCountVuxuvm8wekRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>live.bucket_count_vUxuVm8wek</code>
     */
    public static final BucketCountVuxuvm8wek BUCKET_COUNT_VUXUVM8WEK = new BucketCountVuxuvm8wek();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BucketCountVuxuvm8wekRecord> getRecordType() {
        return BucketCountVuxuvm8wekRecord.class;
    }

    /**
     * The column <code>live.bucket_count_vUxuVm8wek.idsite</code>.
     */
    public final TableField<BucketCountVuxuvm8wekRecord, Integer> IDSITE = createField(DSL.name("idsite"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>live.bucket_count_vUxuVm8wek.idbucket</code>.
     */
    public final TableField<BucketCountVuxuvm8wekRecord, BigDecimal> IDBUCKET = createField(DSL.name("idbucket"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>live.bucket_count_vUxuVm8wek.start_date</code>.
     */
    public final TableField<BucketCountVuxuvm8wekRecord, LocalTime> START_DATE = createField(DSL.name("start_date"), SQLDataType.LOCALTIME(6), this, "");

    /**
     * The column <code>live.bucket_count_vUxuVm8wek.stop_date</code>.
     */
    public final TableField<BucketCountVuxuvm8wekRecord, LocalTime> STOP_DATE = createField(DSL.name("stop_date"), SQLDataType.LOCALTIME(6), this, "");

    private BucketCountVuxuvm8wek(Name alias, Table<BucketCountVuxuvm8wekRecord> aliased) {
        this(alias, aliased, null);
    }

    private BucketCountVuxuvm8wek(Name alias, Table<BucketCountVuxuvm8wekRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>live.bucket_count_vUxuVm8wek</code> table
     * reference
     */
    public BucketCountVuxuvm8wek(String alias) {
        this(DSL.name(alias), BUCKET_COUNT_VUXUVM8WEK);
    }

    /**
     * Create an aliased <code>live.bucket_count_vUxuVm8wek</code> table
     * reference
     */
    public BucketCountVuxuvm8wek(Name alias) {
        this(alias, BUCKET_COUNT_VUXUVM8WEK);
    }

    /**
     * Create a <code>live.bucket_count_vUxuVm8wek</code> table reference
     */
    public BucketCountVuxuvm8wek() {
        this(DSL.name("bucket_count_vUxuVm8wek"), null);
    }

    public <O extends Record> BucketCountVuxuvm8wek(Table<O> child, ForeignKey<O, BucketCountVuxuvm8wekRecord> key) {
        super(child, key, BUCKET_COUNT_VUXUVM8WEK);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Live.LIVE;
    }

    @Override
    public BucketCountVuxuvm8wek as(String alias) {
        return new BucketCountVuxuvm8wek(DSL.name(alias), this);
    }

    @Override
    public BucketCountVuxuvm8wek as(Name alias) {
        return new BucketCountVuxuvm8wek(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BucketCountVuxuvm8wek rename(String name) {
        return new BucketCountVuxuvm8wek(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BucketCountVuxuvm8wek rename(Name name) {
        return new BucketCountVuxuvm8wek(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, BigDecimal, LocalTime, LocalTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
