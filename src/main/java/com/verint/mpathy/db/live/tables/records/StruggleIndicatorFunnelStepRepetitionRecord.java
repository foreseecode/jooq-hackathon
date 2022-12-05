/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables.records;


import com.verint.mpathy.db.live.tables.StruggleIndicatorFunnelStepRepetition;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * Indicator definition: Event is triggered when a user visits a page that is
 * part of a funnel more often than defined in the struggle settings.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StruggleIndicatorFunnelStepRepetitionRecord extends TableRecordImpl<StruggleIndicatorFunnelStepRepetitionRecord> implements Record4<Long, BigDecimal, Short, BigDecimal> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>live.struggle_indicator_funnel_step_repetition.idstruggle_indicator_funnel_step_repetition</code>.
     * The primary key for identifying rows of this table.
     */
    public void setIdstruggleIndicatorFunnelStepRepetition(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>live.struggle_indicator_funnel_step_repetition.idstruggle_indicator_funnel_step_repetition</code>.
     * The primary key for identifying rows of this table.
     */
    public Long getIdstruggleIndicatorFunnelStepRepetition() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>live.struggle_indicator_funnel_step_repetition.idpage</code>. The
     * FK for reference to the ID column of the "page" table.
     */
    public void setIdpage(BigDecimal value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>live.struggle_indicator_funnel_step_repetition.idpage</code>. The
     * FK for reference to the ID column of the "page" table.
     */
    public BigDecimal getIdpage() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for
     * <code>live.struggle_indicator_funnel_step_repetition.value</code>. True,
     * i.e. 1, if the user visits a page that is part of a funnel more often
     * than defined in the struggle settings.
     */
    public void setValue(Short value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>live.struggle_indicator_funnel_step_repetition.value</code>. True,
     * i.e. 1, if the user visits a page that is part of a funnel more often
     * than defined in the struggle settings.
     */
    public Short getValue() {
        return (Short) get(2);
    }

    /**
     * Setter for
     * <code>live.struggle_indicator_funnel_step_repetition.idtaskitem</code>.
     * The FK for reference to the ID column of the "task_item" table.
     */
    public void setIdtaskitem(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>live.struggle_indicator_funnel_step_repetition.idtaskitem</code>.
     * The FK for reference to the ID column of the "task_item" table.
     */
    public BigDecimal getIdtaskitem() {
        return (BigDecimal) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, BigDecimal, Short, BigDecimal> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Long, BigDecimal, Short, BigDecimal> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return StruggleIndicatorFunnelStepRepetition.STRUGGLE_INDICATOR_FUNNEL_STEP_REPETITION.IDSTRUGGLE_INDICATOR_FUNNEL_STEP_REPETITION;
    }

    @Override
    public Field<BigDecimal> field2() {
        return StruggleIndicatorFunnelStepRepetition.STRUGGLE_INDICATOR_FUNNEL_STEP_REPETITION.IDPAGE;
    }

    @Override
    public Field<Short> field3() {
        return StruggleIndicatorFunnelStepRepetition.STRUGGLE_INDICATOR_FUNNEL_STEP_REPETITION.VALUE;
    }

    @Override
    public Field<BigDecimal> field4() {
        return StruggleIndicatorFunnelStepRepetition.STRUGGLE_INDICATOR_FUNNEL_STEP_REPETITION.IDTASKITEM;
    }

    @Override
    public Long component1() {
        return getIdstruggleIndicatorFunnelStepRepetition();
    }

    @Override
    public BigDecimal component2() {
        return getIdpage();
    }

    @Override
    public Short component3() {
        return getValue();
    }

    @Override
    public BigDecimal component4() {
        return getIdtaskitem();
    }

    @Override
    public Long value1() {
        return getIdstruggleIndicatorFunnelStepRepetition();
    }

    @Override
    public BigDecimal value2() {
        return getIdpage();
    }

    @Override
    public Short value3() {
        return getValue();
    }

    @Override
    public BigDecimal value4() {
        return getIdtaskitem();
    }

    @Override
    public StruggleIndicatorFunnelStepRepetitionRecord value1(Long value) {
        setIdstruggleIndicatorFunnelStepRepetition(value);
        return this;
    }

    @Override
    public StruggleIndicatorFunnelStepRepetitionRecord value2(BigDecimal value) {
        setIdpage(value);
        return this;
    }

    @Override
    public StruggleIndicatorFunnelStepRepetitionRecord value3(Short value) {
        setValue(value);
        return this;
    }

    @Override
    public StruggleIndicatorFunnelStepRepetitionRecord value4(BigDecimal value) {
        setIdtaskitem(value);
        return this;
    }

    @Override
    public StruggleIndicatorFunnelStepRepetitionRecord values(Long value1, BigDecimal value2, Short value3, BigDecimal value4) {
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
     * Create a detached StruggleIndicatorFunnelStepRepetitionRecord
     */
    public StruggleIndicatorFunnelStepRepetitionRecord() {
        super(StruggleIndicatorFunnelStepRepetition.STRUGGLE_INDICATOR_FUNNEL_STEP_REPETITION);
    }

    /**
     * Create a detached, initialised
     * StruggleIndicatorFunnelStepRepetitionRecord
     */
    public StruggleIndicatorFunnelStepRepetitionRecord(Long idstruggleIndicatorFunnelStepRepetition, BigDecimal idpage, Short value, BigDecimal idtaskitem) {
        super(StruggleIndicatorFunnelStepRepetition.STRUGGLE_INDICATOR_FUNNEL_STEP_REPETITION);

        setIdstruggleIndicatorFunnelStepRepetition(idstruggleIndicatorFunnelStepRepetition);
        setIdpage(idpage);
        setValue(value);
        setIdtaskitem(idtaskitem);
    }
}
