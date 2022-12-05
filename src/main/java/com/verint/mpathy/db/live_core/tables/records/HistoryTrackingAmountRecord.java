/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables.records;


import com.verint.mpathy.db.live_core.tables.HistoryTrackingAmount;

import java.time.LocalTime;

import org.jooq.impl.TableRecordImpl;


/**
 * Easy access to underlying table in other schemas.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HistoryTrackingAmountRecord extends TableRecordImpl<HistoryTrackingAmountRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>live_core.history_tracking_amount.idhta</code>.
     */
    public void setIdhta(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>live_core.history_tracking_amount.idhta</code>.
     */
    public Long getIdhta() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>live_core.history_tracking_amount.date</code>.
     */
    public void setDate(LocalTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>live_core.history_tracking_amount.date</code>.
     */
    public LocalTime getDate() {
        return (LocalTime) get(1);
    }

    /**
     * Setter for <code>live_core.history_tracking_amount.idsite</code>.
     */
    public void setIdsite(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>live_core.history_tracking_amount.idsite</code>.
     */
    public Integer getIdsite() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>live_core.history_tracking_amount.idserver</code>.
     */
    public void setIdserver(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>live_core.history_tracking_amount.idserver</code>.
     */
    public Short getIdserver() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>live_core.history_tracking_amount.amount_desktop</code>.
     */
    public void setAmountDesktop(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>live_core.history_tracking_amount.amount_desktop</code>.
     */
    public Long getAmountDesktop() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>live_core.history_tracking_amount.amount_phone</code>.
     */
    public void setAmountPhone(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>live_core.history_tracking_amount.amount_phone</code>.
     */
    public Long getAmountPhone() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>live_core.history_tracking_amount.amount_tablet</code>.
     */
    public void setAmountTablet(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>live_core.history_tracking_amount.amount_tablet</code>.
     */
    public Long getAmountTablet() {
        return (Long) get(6);
    }

    /**
     * Setter for
     * <code>live_core.history_tracking_amount.recprob_desktop</code>.
     */
    public void setRecprobDesktop(Double value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>live_core.history_tracking_amount.recprob_desktop</code>.
     */
    public Double getRecprobDesktop() {
        return (Double) get(7);
    }

    /**
     * Setter for <code>live_core.history_tracking_amount.recprob_phone</code>.
     */
    public void setRecprobPhone(Double value) {
        set(8, value);
    }

    /**
     * Getter for <code>live_core.history_tracking_amount.recprob_phone</code>.
     */
    public Double getRecprobPhone() {
        return (Double) get(8);
    }

    /**
     * Setter for <code>live_core.history_tracking_amount.recprob_tablet</code>.
     */
    public void setRecprobTablet(Double value) {
        set(9, value);
    }

    /**
     * Getter for <code>live_core.history_tracking_amount.recprob_tablet</code>.
     */
    public Double getRecprobTablet() {
        return (Double) get(9);
    }

    /**
     * Setter for
     * <code>live_core.history_tracking_amount.pilimit_desktop</code>.
     */
    public void setPilimitDesktop(Long value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>live_core.history_tracking_amount.pilimit_desktop</code>.
     */
    public Long getPilimitDesktop() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>live_core.history_tracking_amount.pilimit_phone</code>.
     */
    public void setPilimitPhone(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>live_core.history_tracking_amount.pilimit_phone</code>.
     */
    public Long getPilimitPhone() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>live_core.history_tracking_amount.pilimit_tablet</code>.
     */
    public void setPilimitTablet(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>live_core.history_tracking_amount.pilimit_tablet</code>.
     */
    public Long getPilimitTablet() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>live_core.history_tracking_amount.type</code>.
     */
    public void setType(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>live_core.history_tracking_amount.type</code>.
     */
    public String getType() {
        return (String) get(13);
    }

    /**
     * Setter for <code>live_core.history_tracking_amount.range</code>.
     */
    public void setRange(Long value) {
        set(14, value);
    }

    /**
     * Getter for <code>live_core.history_tracking_amount.range</code>.
     */
    public Long getRange() {
        return (Long) get(14);
    }

    /**
     * Setter for <code>live_core.history_tracking_amount.avg_desktop</code>.
     */
    public void setAvgDesktop(Double value) {
        set(15, value);
    }

    /**
     * Getter for <code>live_core.history_tracking_amount.avg_desktop</code>.
     */
    public Double getAvgDesktop() {
        return (Double) get(15);
    }

    /**
     * Setter for <code>live_core.history_tracking_amount.avg_phone</code>.
     */
    public void setAvgPhone(Double value) {
        set(16, value);
    }

    /**
     * Getter for <code>live_core.history_tracking_amount.avg_phone</code>.
     */
    public Double getAvgPhone() {
        return (Double) get(16);
    }

    /**
     * Setter for <code>live_core.history_tracking_amount.avg_tablet</code>.
     */
    public void setAvgTablet(Double value) {
        set(17, value);
    }

    /**
     * Getter for <code>live_core.history_tracking_amount.avg_tablet</code>.
     */
    public Double getAvgTablet() {
        return (Double) get(17);
    }

    /**
     * Setter for <code>live_core.history_tracking_amount.min_desktop</code>.
     */
    public void setMinDesktop(Double value) {
        set(18, value);
    }

    /**
     * Getter for <code>live_core.history_tracking_amount.min_desktop</code>.
     */
    public Double getMinDesktop() {
        return (Double) get(18);
    }

    /**
     * Setter for <code>live_core.history_tracking_amount.min_phone</code>.
     */
    public void setMinPhone(Double value) {
        set(19, value);
    }

    /**
     * Getter for <code>live_core.history_tracking_amount.min_phone</code>.
     */
    public Double getMinPhone() {
        return (Double) get(19);
    }

    /**
     * Setter for <code>live_core.history_tracking_amount.min_tablet</code>.
     */
    public void setMinTablet(Double value) {
        set(20, value);
    }

    /**
     * Getter for <code>live_core.history_tracking_amount.min_tablet</code>.
     */
    public Double getMinTablet() {
        return (Double) get(20);
    }

    /**
     * Setter for <code>live_core.history_tracking_amount.max_desktop</code>.
     */
    public void setMaxDesktop(Double value) {
        set(21, value);
    }

    /**
     * Getter for <code>live_core.history_tracking_amount.max_desktop</code>.
     */
    public Double getMaxDesktop() {
        return (Double) get(21);
    }

    /**
     * Setter for <code>live_core.history_tracking_amount.max_phone</code>.
     */
    public void setMaxPhone(Double value) {
        set(22, value);
    }

    /**
     * Getter for <code>live_core.history_tracking_amount.max_phone</code>.
     */
    public Double getMaxPhone() {
        return (Double) get(22);
    }

    /**
     * Setter for <code>live_core.history_tracking_amount.max_tablet</code>.
     */
    public void setMaxTablet(Double value) {
        set(23, value);
    }

    /**
     * Getter for <code>live_core.history_tracking_amount.max_tablet</code>.
     */
    public Double getMaxTablet() {
        return (Double) get(23);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HistoryTrackingAmountRecord
     */
    public HistoryTrackingAmountRecord() {
        super(HistoryTrackingAmount.HISTORY_TRACKING_AMOUNT);
    }

    /**
     * Create a detached, initialised HistoryTrackingAmountRecord
     */
    public HistoryTrackingAmountRecord(Long idhta, LocalTime date, Integer idsite, Short idserver, Long amountDesktop, Long amountPhone, Long amountTablet, Double recprobDesktop, Double recprobPhone, Double recprobTablet, Long pilimitDesktop, Long pilimitPhone, Long pilimitTablet, String type, Long range, Double avgDesktop, Double avgPhone, Double avgTablet, Double minDesktop, Double minPhone, Double minTablet, Double maxDesktop, Double maxPhone, Double maxTablet) {
        super(HistoryTrackingAmount.HISTORY_TRACKING_AMOUNT);

        setIdhta(idhta);
        setDate(date);
        setIdsite(idsite);
        setIdserver(idserver);
        setAmountDesktop(amountDesktop);
        setAmountPhone(amountPhone);
        setAmountTablet(amountTablet);
        setRecprobDesktop(recprobDesktop);
        setRecprobPhone(recprobPhone);
        setRecprobTablet(recprobTablet);
        setPilimitDesktop(pilimitDesktop);
        setPilimitPhone(pilimitPhone);
        setPilimitTablet(pilimitTablet);
        setType(type);
        setRange(range);
        setAvgDesktop(avgDesktop);
        setAvgPhone(avgPhone);
        setAvgTablet(avgTablet);
        setMinDesktop(minDesktop);
        setMinPhone(minPhone);
        setMinTablet(minTablet);
        setMaxDesktop(maxDesktop);
        setMaxPhone(maxPhone);
        setMaxTablet(maxTablet);
    }
}
