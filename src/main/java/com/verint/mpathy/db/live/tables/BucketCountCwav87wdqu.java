/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables;


import com.verint.mpathy.db.live.Live;
import com.verint.mpathy.db.live.tables.records.BucketCountCwav87wdquRecord;

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
public class BucketCountCwav87wdqu extends TableImpl<BucketCountCwav87wdquRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>live.bucket_count_CwaV87wDQu</code>
     */
    public static final BucketCountCwav87wdqu BUCKET_COUNT_CWAV87WDQU = new BucketCountCwav87wdqu();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BucketCountCwav87wdquRecord> getRecordType() {
        return BucketCountCwav87wdquRecord.class;
    }

    /**
     * The column <code>live.bucket_count_CwaV87wDQu.idsite</code>.
     */
    public final TableField<BucketCountCwav87wdquRecord, Integer> IDSITE = createField(DSL.name("idsite"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>live.bucket_count_CwaV87wDQu.idbucket</code>.
     */
    public final TableField<BucketCountCwav87wdquRecord, BigDecimal> IDBUCKET = createField(DSL.name("idbucket"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>live.bucket_count_CwaV87wDQu.start_date</code>.
     */
    public final TableField<BucketCountCwav87wdquRecord, LocalTime> START_DATE = createField(DSL.name("start_date"), SQLDataType.LOCALTIME(6), this, "");

    /**
     * The column <code>live.bucket_count_CwaV87wDQu.stop_date</code>.
     */
    public final TableField<BucketCountCwav87wdquRecord, LocalTime> STOP_DATE = createField(DSL.name("stop_date"), SQLDataType.LOCALTIME(6), this, "");

    private BucketCountCwav87wdqu(Name alias, Table<BucketCountCwav87wdquRecord> aliased) {
        this(alias, aliased, null);
    }

    private BucketCountCwav87wdqu(Name alias, Table<BucketCountCwav87wdquRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>live.bucket_count_CwaV87wDQu</code> table
     * reference
     */
    public BucketCountCwav87wdqu(String alias) {
        this(DSL.name(alias), BUCKET_COUNT_CWAV87WDQU);
    }

    /**
     * Create an aliased <code>live.bucket_count_CwaV87wDQu</code> table
     * reference
     */
    public BucketCountCwav87wdqu(Name alias) {
        this(alias, BUCKET_COUNT_CWAV87WDQU);
    }

    /**
     * Create a <code>live.bucket_count_CwaV87wDQu</code> table reference
     */
    public BucketCountCwav87wdqu() {
        this(DSL.name("bucket_count_CwaV87wDQu"), null);
    }

    public <O extends Record> BucketCountCwav87wdqu(Table<O> child, ForeignKey<O, BucketCountCwav87wdquRecord> key) {
        super(child, key, BUCKET_COUNT_CWAV87WDQU);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Live.LIVE;
    }

    @Override
    public BucketCountCwav87wdqu as(String alias) {
        return new BucketCountCwav87wdqu(DSL.name(alias), this);
    }

    @Override
    public BucketCountCwav87wdqu as(Name alias) {
        return new BucketCountCwav87wdqu(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BucketCountCwav87wdqu rename(String name) {
        return new BucketCountCwav87wdqu(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BucketCountCwav87wdqu rename(Name name) {
        return new BucketCountCwav87wdqu(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, BigDecimal, LocalTime, LocalTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
