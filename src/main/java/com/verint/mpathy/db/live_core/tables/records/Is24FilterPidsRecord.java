/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables.records;


import com.verint.mpathy.db.live_core.tables.Is24FilterPids;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * Easy access to underlying table in other schemas.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Is24FilterPidsRecord extends TableRecordImpl<Is24FilterPidsRecord> implements Record3<BigDecimal, BigDecimal, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>live_core.is24_filter_pids.idfilter</code>.
     */
    public void setIdfilter(BigDecimal value) {
        set(0, value);
    }

    /**
     * Getter for <code>live_core.is24_filter_pids.idfilter</code>.
     */
    public BigDecimal getIdfilter() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>live_core.is24_filter_pids.idpage</code>.
     */
    public void setIdpage(BigDecimal value) {
        set(1, value);
    }

    /**
     * Getter for <code>live_core.is24_filter_pids.idpage</code>.
     */
    public BigDecimal getIdpage() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>live_core.is24_filter_pids.date</code>.
     */
    public void setDate(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>live_core.is24_filter_pids.date</code>.
     */
    public Integer getDate() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<BigDecimal, BigDecimal, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<BigDecimal, BigDecimal, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<BigDecimal> field1() {
        return Is24FilterPids.IS24_FILTER_PIDS.IDFILTER;
    }

    @Override
    public Field<BigDecimal> field2() {
        return Is24FilterPids.IS24_FILTER_PIDS.IDPAGE;
    }

    @Override
    public Field<Integer> field3() {
        return Is24FilterPids.IS24_FILTER_PIDS.DATE;
    }

    @Override
    public BigDecimal component1() {
        return getIdfilter();
    }

    @Override
    public BigDecimal component2() {
        return getIdpage();
    }

    @Override
    public Integer component3() {
        return getDate();
    }

    @Override
    public BigDecimal value1() {
        return getIdfilter();
    }

    @Override
    public BigDecimal value2() {
        return getIdpage();
    }

    @Override
    public Integer value3() {
        return getDate();
    }

    @Override
    public Is24FilterPidsRecord value1(BigDecimal value) {
        setIdfilter(value);
        return this;
    }

    @Override
    public Is24FilterPidsRecord value2(BigDecimal value) {
        setIdpage(value);
        return this;
    }

    @Override
    public Is24FilterPidsRecord value3(Integer value) {
        setDate(value);
        return this;
    }

    @Override
    public Is24FilterPidsRecord values(BigDecimal value1, BigDecimal value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached Is24FilterPidsRecord
     */
    public Is24FilterPidsRecord() {
        super(Is24FilterPids.IS24_FILTER_PIDS);
    }

    /**
     * Create a detached, initialised Is24FilterPidsRecord
     */
    public Is24FilterPidsRecord(BigDecimal idfilter, BigDecimal idpage, Integer date) {
        super(Is24FilterPids.IS24_FILTER_PIDS);

        setIdfilter(idfilter);
        setIdpage(idpage);
        setDate(date);
    }
}
