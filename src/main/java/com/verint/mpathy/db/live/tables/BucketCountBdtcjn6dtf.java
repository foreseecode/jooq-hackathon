/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables;


import com.verint.mpathy.db.live.Live;
import com.verint.mpathy.db.live.tables.records.BucketCountBdtcjn6dtfRecord;

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
public class BucketCountBdtcjn6dtf extends TableImpl<BucketCountBdtcjn6dtfRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>live.bucket_count_bDTcJn6dTf</code>
     */
    public static final BucketCountBdtcjn6dtf BUCKET_COUNT_BDTCJN6DTF = new BucketCountBdtcjn6dtf();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BucketCountBdtcjn6dtfRecord> getRecordType() {
        return BucketCountBdtcjn6dtfRecord.class;
    }

    /**
     * The column <code>live.bucket_count_bDTcJn6dTf.idsite</code>.
     */
    public final TableField<BucketCountBdtcjn6dtfRecord, Integer> IDSITE = createField(DSL.name("idsite"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>live.bucket_count_bDTcJn6dTf.idbucket</code>.
     */
    public final TableField<BucketCountBdtcjn6dtfRecord, BigDecimal> IDBUCKET = createField(DSL.name("idbucket"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>live.bucket_count_bDTcJn6dTf.start_date</code>.
     */
    public final TableField<BucketCountBdtcjn6dtfRecord, LocalTime> START_DATE = createField(DSL.name("start_date"), SQLDataType.LOCALTIME(6), this, "");

    /**
     * The column <code>live.bucket_count_bDTcJn6dTf.stop_date</code>.
     */
    public final TableField<BucketCountBdtcjn6dtfRecord, LocalTime> STOP_DATE = createField(DSL.name("stop_date"), SQLDataType.LOCALTIME(6), this, "");

    private BucketCountBdtcjn6dtf(Name alias, Table<BucketCountBdtcjn6dtfRecord> aliased) {
        this(alias, aliased, null);
    }

    private BucketCountBdtcjn6dtf(Name alias, Table<BucketCountBdtcjn6dtfRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>live.bucket_count_bDTcJn6dTf</code> table
     * reference
     */
    public BucketCountBdtcjn6dtf(String alias) {
        this(DSL.name(alias), BUCKET_COUNT_BDTCJN6DTF);
    }

    /**
     * Create an aliased <code>live.bucket_count_bDTcJn6dTf</code> table
     * reference
     */
    public BucketCountBdtcjn6dtf(Name alias) {
        this(alias, BUCKET_COUNT_BDTCJN6DTF);
    }

    /**
     * Create a <code>live.bucket_count_bDTcJn6dTf</code> table reference
     */
    public BucketCountBdtcjn6dtf() {
        this(DSL.name("bucket_count_bDTcJn6dTf"), null);
    }

    public <O extends Record> BucketCountBdtcjn6dtf(Table<O> child, ForeignKey<O, BucketCountBdtcjn6dtfRecord> key) {
        super(child, key, BUCKET_COUNT_BDTCJN6DTF);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Live.LIVE;
    }

    @Override
    public BucketCountBdtcjn6dtf as(String alias) {
        return new BucketCountBdtcjn6dtf(DSL.name(alias), this);
    }

    @Override
    public BucketCountBdtcjn6dtf as(Name alias) {
        return new BucketCountBdtcjn6dtf(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BucketCountBdtcjn6dtf rename(String name) {
        return new BucketCountBdtcjn6dtf(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BucketCountBdtcjn6dtf rename(Name name) {
        return new BucketCountBdtcjn6dtf(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, BigDecimal, LocalTime, LocalTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
