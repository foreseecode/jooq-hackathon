/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables.records;


import com.verint.mpathy.db.live.tables.Trafficstats;

import java.math.BigDecimal;
import java.time.LocalTime;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TrafficstatsRecord extends TableRecordImpl<TrafficstatsRecord> implements Record10<Integer, LocalTime, BigDecimal, BigDecimal, Long, Long, Long, Long, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>live.trafficstats.idsite</code>.
     */
    public void setIdsite(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>live.trafficstats.idsite</code>.
     */
    public Integer getIdsite() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>live.trafficstats.time</code>.
     */
    public void setTime(LocalTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>live.trafficstats.time</code>.
     */
    public LocalTime getTime() {
        return (LocalTime) get(1);
    }

    /**
     * Setter for <code>live.trafficstats.transfervolume</code>.
     */
    public void setTransfervolume(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for <code>live.trafficstats.transfervolume</code>.
     */
    public BigDecimal getTransfervolume() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>live.trafficstats.transfervolume_diff</code>.
     */
    public void setTransfervolumeDiff(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>live.trafficstats.transfervolume_diff</code>.
     */
    public BigDecimal getTransfervolumeDiff() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>live.trafficstats.loader_count</code>.
     */
    public void setLoaderCount(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>live.trafficstats.loader_count</code>.
     */
    public Long getLoaderCount() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>live.trafficstats.loader_count_diff</code>.
     */
    public void setLoaderCountDiff(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>live.trafficstats.loader_count_diff</code>.
     */
    public Long getLoaderCountDiff() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>live.trafficstats.engine_count</code>.
     */
    public void setEngineCount(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>live.trafficstats.engine_count</code>.
     */
    public Long getEngineCount() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>live.trafficstats.engine_count_diff</code>.
     */
    public void setEngineCountDiff(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>live.trafficstats.engine_count_diff</code>.
     */
    public Long getEngineCountDiff() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>live.trafficstats.account_loader_count</code>.
     */
    public void setAccountLoaderCount(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>live.trafficstats.account_loader_count</code>.
     */
    public Long getAccountLoaderCount() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>live.trafficstats.account_loader_count_diff</code>.
     */
    public void setAccountLoaderCountDiff(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>live.trafficstats.account_loader_count_diff</code>.
     */
    public Long getAccountLoaderCountDiff() {
        return (Long) get(9);
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, LocalTime, BigDecimal, BigDecimal, Long, Long, Long, Long, Long, Long> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Integer, LocalTime, BigDecimal, BigDecimal, Long, Long, Long, Long, Long, Long> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Trafficstats.TRAFFICSTATS.IDSITE;
    }

    @Override
    public Field<LocalTime> field2() {
        return Trafficstats.TRAFFICSTATS.TIME;
    }

    @Override
    public Field<BigDecimal> field3() {
        return Trafficstats.TRAFFICSTATS.TRANSFERVOLUME;
    }

    @Override
    public Field<BigDecimal> field4() {
        return Trafficstats.TRAFFICSTATS.TRANSFERVOLUME_DIFF;
    }

    @Override
    public Field<Long> field5() {
        return Trafficstats.TRAFFICSTATS.LOADER_COUNT;
    }

    @Override
    public Field<Long> field6() {
        return Trafficstats.TRAFFICSTATS.LOADER_COUNT_DIFF;
    }

    @Override
    public Field<Long> field7() {
        return Trafficstats.TRAFFICSTATS.ENGINE_COUNT;
    }

    @Override
    public Field<Long> field8() {
        return Trafficstats.TRAFFICSTATS.ENGINE_COUNT_DIFF;
    }

    @Override
    public Field<Long> field9() {
        return Trafficstats.TRAFFICSTATS.ACCOUNT_LOADER_COUNT;
    }

    @Override
    public Field<Long> field10() {
        return Trafficstats.TRAFFICSTATS.ACCOUNT_LOADER_COUNT_DIFF;
    }

    @Override
    public Integer component1() {
        return getIdsite();
    }

    @Override
    public LocalTime component2() {
        return getTime();
    }

    @Override
    public BigDecimal component3() {
        return getTransfervolume();
    }

    @Override
    public BigDecimal component4() {
        return getTransfervolumeDiff();
    }

    @Override
    public Long component5() {
        return getLoaderCount();
    }

    @Override
    public Long component6() {
        return getLoaderCountDiff();
    }

    @Override
    public Long component7() {
        return getEngineCount();
    }

    @Override
    public Long component8() {
        return getEngineCountDiff();
    }

    @Override
    public Long component9() {
        return getAccountLoaderCount();
    }

    @Override
    public Long component10() {
        return getAccountLoaderCountDiff();
    }

    @Override
    public Integer value1() {
        return getIdsite();
    }

    @Override
    public LocalTime value2() {
        return getTime();
    }

    @Override
    public BigDecimal value3() {
        return getTransfervolume();
    }

    @Override
    public BigDecimal value4() {
        return getTransfervolumeDiff();
    }

    @Override
    public Long value5() {
        return getLoaderCount();
    }

    @Override
    public Long value6() {
        return getLoaderCountDiff();
    }

    @Override
    public Long value7() {
        return getEngineCount();
    }

    @Override
    public Long value8() {
        return getEngineCountDiff();
    }

    @Override
    public Long value9() {
        return getAccountLoaderCount();
    }

    @Override
    public Long value10() {
        return getAccountLoaderCountDiff();
    }

    @Override
    public TrafficstatsRecord value1(Integer value) {
        setIdsite(value);
        return this;
    }

    @Override
    public TrafficstatsRecord value2(LocalTime value) {
        setTime(value);
        return this;
    }

    @Override
    public TrafficstatsRecord value3(BigDecimal value) {
        setTransfervolume(value);
        return this;
    }

    @Override
    public TrafficstatsRecord value4(BigDecimal value) {
        setTransfervolumeDiff(value);
        return this;
    }

    @Override
    public TrafficstatsRecord value5(Long value) {
        setLoaderCount(value);
        return this;
    }

    @Override
    public TrafficstatsRecord value6(Long value) {
        setLoaderCountDiff(value);
        return this;
    }

    @Override
    public TrafficstatsRecord value7(Long value) {
        setEngineCount(value);
        return this;
    }

    @Override
    public TrafficstatsRecord value8(Long value) {
        setEngineCountDiff(value);
        return this;
    }

    @Override
    public TrafficstatsRecord value9(Long value) {
        setAccountLoaderCount(value);
        return this;
    }

    @Override
    public TrafficstatsRecord value10(Long value) {
        setAccountLoaderCountDiff(value);
        return this;
    }

    @Override
    public TrafficstatsRecord values(Integer value1, LocalTime value2, BigDecimal value3, BigDecimal value4, Long value5, Long value6, Long value7, Long value8, Long value9, Long value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TrafficstatsRecord
     */
    public TrafficstatsRecord() {
        super(Trafficstats.TRAFFICSTATS);
    }

    /**
     * Create a detached, initialised TrafficstatsRecord
     */
    public TrafficstatsRecord(Integer idsite, LocalTime time, BigDecimal transfervolume, BigDecimal transfervolumeDiff, Long loaderCount, Long loaderCountDiff, Long engineCount, Long engineCountDiff, Long accountLoaderCount, Long accountLoaderCountDiff) {
        super(Trafficstats.TRAFFICSTATS);

        setIdsite(idsite);
        setTime(time);
        setTransfervolume(transfervolume);
        setTransfervolumeDiff(transfervolumeDiff);
        setLoaderCount(loaderCount);
        setLoaderCountDiff(loaderCountDiff);
        setEngineCount(engineCount);
        setEngineCountDiff(engineCountDiff);
        setAccountLoaderCount(accountLoaderCount);
        setAccountLoaderCountDiff(accountLoaderCountDiff);
    }
}
