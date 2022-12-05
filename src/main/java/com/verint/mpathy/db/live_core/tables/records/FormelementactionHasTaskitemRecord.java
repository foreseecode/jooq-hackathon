/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables.records;


import com.verint.mpathy.db.live_core.tables.FormelementactionHasTaskitem;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;


/**
 * Easy access to underlying table in other schemas.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FormelementactionHasTaskitemRecord extends TableRecordImpl<FormelementactionHasTaskitemRecord> implements Record6<BigDecimal, BigDecimal, BigDecimal, BigDecimal, Long, Short> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>live_core.formelementaction_has_taskitem.idtaskitem</code>.
     */
    public void setIdtaskitem(BigDecimal value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>live_core.formelementaction_has_taskitem.idtaskitem</code>.
     */
    public BigDecimal getIdtaskitem() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for
     * <code>live_core.formelementaction_has_taskitem.idelement</code>.
     */
    public void setIdelement(BigDecimal value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>live_core.formelementaction_has_taskitem.idelement</code>.
     */
    public BigDecimal getIdelement() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>live_core.formelementaction_has_taskitem.idpage</code>.
     */
    public void setIdpage(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for <code>live_core.formelementaction_has_taskitem.idpage</code>.
     */
    public BigDecimal getIdpage() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for
     * <code>live_core.formelementaction_has_taskitem.idsession</code>.
     */
    public void setIdsession(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>live_core.formelementaction_has_taskitem.idsession</code>.
     */
    public BigDecimal getIdsession() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>live_core.formelementaction_has_taskitem.idtask</code>.
     */
    public void setIdtask(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>live_core.formelementaction_has_taskitem.idtask</code>.
     */
    public Long getIdtask() {
        return (Long) get(4);
    }

    /**
     * Setter for
     * <code>live_core.formelementaction_has_taskitem.canceled</code>.
     */
    public void setCanceled(Short value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>live_core.formelementaction_has_taskitem.canceled</code>.
     */
    public Short getCanceled() {
        return (Short) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<BigDecimal, BigDecimal, BigDecimal, BigDecimal, Long, Short> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<BigDecimal, BigDecimal, BigDecimal, BigDecimal, Long, Short> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<BigDecimal> field1() {
        return FormelementactionHasTaskitem.FORMELEMENTACTION_HAS_TASKITEM.IDTASKITEM;
    }

    @Override
    public Field<BigDecimal> field2() {
        return FormelementactionHasTaskitem.FORMELEMENTACTION_HAS_TASKITEM.IDELEMENT;
    }

    @Override
    public Field<BigDecimal> field3() {
        return FormelementactionHasTaskitem.FORMELEMENTACTION_HAS_TASKITEM.IDPAGE;
    }

    @Override
    public Field<BigDecimal> field4() {
        return FormelementactionHasTaskitem.FORMELEMENTACTION_HAS_TASKITEM.IDSESSION;
    }

    @Override
    public Field<Long> field5() {
        return FormelementactionHasTaskitem.FORMELEMENTACTION_HAS_TASKITEM.IDTASK;
    }

    @Override
    public Field<Short> field6() {
        return FormelementactionHasTaskitem.FORMELEMENTACTION_HAS_TASKITEM.CANCELED;
    }

    @Override
    public BigDecimal component1() {
        return getIdtaskitem();
    }

    @Override
    public BigDecimal component2() {
        return getIdelement();
    }

    @Override
    public BigDecimal component3() {
        return getIdpage();
    }

    @Override
    public BigDecimal component4() {
        return getIdsession();
    }

    @Override
    public Long component5() {
        return getIdtask();
    }

    @Override
    public Short component6() {
        return getCanceled();
    }

    @Override
    public BigDecimal value1() {
        return getIdtaskitem();
    }

    @Override
    public BigDecimal value2() {
        return getIdelement();
    }

    @Override
    public BigDecimal value3() {
        return getIdpage();
    }

    @Override
    public BigDecimal value4() {
        return getIdsession();
    }

    @Override
    public Long value5() {
        return getIdtask();
    }

    @Override
    public Short value6() {
        return getCanceled();
    }

    @Override
    public FormelementactionHasTaskitemRecord value1(BigDecimal value) {
        setIdtaskitem(value);
        return this;
    }

    @Override
    public FormelementactionHasTaskitemRecord value2(BigDecimal value) {
        setIdelement(value);
        return this;
    }

    @Override
    public FormelementactionHasTaskitemRecord value3(BigDecimal value) {
        setIdpage(value);
        return this;
    }

    @Override
    public FormelementactionHasTaskitemRecord value4(BigDecimal value) {
        setIdsession(value);
        return this;
    }

    @Override
    public FormelementactionHasTaskitemRecord value5(Long value) {
        setIdtask(value);
        return this;
    }

    @Override
    public FormelementactionHasTaskitemRecord value6(Short value) {
        setCanceled(value);
        return this;
    }

    @Override
    public FormelementactionHasTaskitemRecord values(BigDecimal value1, BigDecimal value2, BigDecimal value3, BigDecimal value4, Long value5, Short value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FormelementactionHasTaskitemRecord
     */
    public FormelementactionHasTaskitemRecord() {
        super(FormelementactionHasTaskitem.FORMELEMENTACTION_HAS_TASKITEM);
    }

    /**
     * Create a detached, initialised FormelementactionHasTaskitemRecord
     */
    public FormelementactionHasTaskitemRecord(BigDecimal idtaskitem, BigDecimal idelement, BigDecimal idpage, BigDecimal idsession, Long idtask, Short canceled) {
        super(FormelementactionHasTaskitem.FORMELEMENTACTION_HAS_TASKITEM);

        setIdtaskitem(idtaskitem);
        setIdelement(idelement);
        setIdpage(idpage);
        setIdsession(idsession);
        setIdtask(idtask);
        setCanceled(canceled);
    }
}
