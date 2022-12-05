/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables.records;


import com.verint.mpathy.db.live_core.tables.BucketCountXwwlf8vbaw;

import java.math.BigDecimal;
import java.time.LocalTime;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * Easy access to underlying table in other schemas.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BucketCountXwwlf8vbawRecord extends TableRecordImpl<BucketCountXwwlf8vbawRecord> implements Record4<Integer, BigDecimal, LocalTime, LocalTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>live_core.bucket_count_xWwLF8VBaw.idsite</code>.
     */
    public void setIdsite(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>live_core.bucket_count_xWwLF8VBaw.idsite</code>.
     */
    public Integer getIdsite() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>live_core.bucket_count_xWwLF8VBaw.idbucket</code>.
     */
    public void setIdbucket(BigDecimal value) {
        set(1, value);
    }

    /**
     * Getter for <code>live_core.bucket_count_xWwLF8VBaw.idbucket</code>.
     */
    public BigDecimal getIdbucket() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>live_core.bucket_count_xWwLF8VBaw.start_date</code>.
     */
    public void setStartDate(LocalTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>live_core.bucket_count_xWwLF8VBaw.start_date</code>.
     */
    public LocalTime getStartDate() {
        return (LocalTime) get(2);
    }

    /**
     * Setter for <code>live_core.bucket_count_xWwLF8VBaw.stop_date</code>.
     */
    public void setStopDate(LocalTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>live_core.bucket_count_xWwLF8VBaw.stop_date</code>.
     */
    public LocalTime getStopDate() {
        return (LocalTime) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, BigDecimal, LocalTime, LocalTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, BigDecimal, LocalTime, LocalTime> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return BucketCountXwwlf8vbaw.BUCKET_COUNT_XWWLF8VBAW.IDSITE;
    }

    @Override
    public Field<BigDecimal> field2() {
        return BucketCountXwwlf8vbaw.BUCKET_COUNT_XWWLF8VBAW.IDBUCKET;
    }

    @Override
    public Field<LocalTime> field3() {
        return BucketCountXwwlf8vbaw.BUCKET_COUNT_XWWLF8VBAW.START_DATE;
    }

    @Override
    public Field<LocalTime> field4() {
        return BucketCountXwwlf8vbaw.BUCKET_COUNT_XWWLF8VBAW.STOP_DATE;
    }

    @Override
    public Integer component1() {
        return getIdsite();
    }

    @Override
    public BigDecimal component2() {
        return getIdbucket();
    }

    @Override
    public LocalTime component3() {
        return getStartDate();
    }

    @Override
    public LocalTime component4() {
        return getStopDate();
    }

    @Override
    public Integer value1() {
        return getIdsite();
    }

    @Override
    public BigDecimal value2() {
        return getIdbucket();
    }

    @Override
    public LocalTime value3() {
        return getStartDate();
    }

    @Override
    public LocalTime value4() {
        return getStopDate();
    }

    @Override
    public BucketCountXwwlf8vbawRecord value1(Integer value) {
        setIdsite(value);
        return this;
    }

    @Override
    public BucketCountXwwlf8vbawRecord value2(BigDecimal value) {
        setIdbucket(value);
        return this;
    }

    @Override
    public BucketCountXwwlf8vbawRecord value3(LocalTime value) {
        setStartDate(value);
        return this;
    }

    @Override
    public BucketCountXwwlf8vbawRecord value4(LocalTime value) {
        setStopDate(value);
        return this;
    }

    @Override
    public BucketCountXwwlf8vbawRecord values(Integer value1, BigDecimal value2, LocalTime value3, LocalTime value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BucketCountXwwlf8vbawRecord
     */
    public BucketCountXwwlf8vbawRecord() {
        super(BucketCountXwwlf8vbaw.BUCKET_COUNT_XWWLF8VBAW);
    }

    /**
     * Create a detached, initialised BucketCountXwwlf8vbawRecord
     */
    public BucketCountXwwlf8vbawRecord(Integer idsite, BigDecimal idbucket, LocalTime startDate, LocalTime stopDate) {
        super(BucketCountXwwlf8vbaw.BUCKET_COUNT_XWWLF8VBAW);

        setIdsite(idsite);
        setIdbucket(idbucket);
        setStartDate(startDate);
        setStopDate(stopDate);
    }
}
