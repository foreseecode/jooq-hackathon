/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables.records;


import com.verint.mpathy.db.live_core.tables.TaskAction;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.TableRecordImpl;


/**
 * Easy access to underlying table in other schemas.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TaskActionRecord extends TableRecordImpl<TaskActionRecord> implements Record12<Long, BigDecimal, BigDecimal, Integer, BigDecimal, BigDecimal, Long, Long, Long, Long, Long, Short> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>live_core.task_action.idtask</code>.
     */
    public void setIdtask(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>live_core.task_action.idtask</code>.
     */
    public Long getIdtask() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>live_core.task_action.idsession</code>.
     */
    public void setIdsession(BigDecimal value) {
        set(1, value);
    }

    /**
     * Getter for <code>live_core.task_action.idsession</code>.
     */
    public BigDecimal getIdsession() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>live_core.task_action.timestamp</code>.
     */
    public void setTimestamp(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for <code>live_core.task_action.timestamp</code>.
     */
    public BigDecimal getTimestamp() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>live_core.task_action.idsite</code>.
     */
    public void setIdsite(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>live_core.task_action.idsite</code>.
     */
    public Integer getIdsite() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>live_core.task_action.last_taskitem</code>.
     */
    public void setLastTaskitem(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>live_core.task_action.last_taskitem</code>.
     */
    public BigDecimal getLastTaskitem() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>live_core.task_action.last_pi</code>.
     */
    public void setLastPi(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>live_core.task_action.last_pi</code>.
     */
    public BigDecimal getLastPi() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>live_core.task_action.length_loaded</code>.
     */
    public void setLengthLoaded(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>live_core.task_action.length_loaded</code>.
     */
    public Long getLengthLoaded() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>live_core.task_action.length_active</code>.
     */
    public void setLengthActive(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>live_core.task_action.length_active</code>.
     */
    public Long getLengthActive() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>live_core.task_action.length_visible</code>.
     */
    public void setLengthVisible(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>live_core.task_action.length_visible</code>.
     */
    public Long getLengthVisible() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>live_core.task_action.num_pi</code>.
     */
    public void setNumPi(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>live_core.task_action.num_pi</code>.
     */
    public Long getNumPi() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>live_core.task_action.num_clicks</code>.
     */
    public void setNumClicks(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>live_core.task_action.num_clicks</code>.
     */
    public Long getNumClicks() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>live_core.task_action.completed</code>.
     */
    public void setCompleted(Short value) {
        set(11, value);
    }

    /**
     * Getter for <code>live_core.task_action.completed</code>.
     */
    public Short getCompleted() {
        return (Short) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<Long, BigDecimal, BigDecimal, Integer, BigDecimal, BigDecimal, Long, Long, Long, Long, Long, Short> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<Long, BigDecimal, BigDecimal, Integer, BigDecimal, BigDecimal, Long, Long, Long, Long, Long, Short> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return TaskAction.TASK_ACTION.IDTASK;
    }

    @Override
    public Field<BigDecimal> field2() {
        return TaskAction.TASK_ACTION.IDSESSION;
    }

    @Override
    public Field<BigDecimal> field3() {
        return TaskAction.TASK_ACTION.TIMESTAMP;
    }

    @Override
    public Field<Integer> field4() {
        return TaskAction.TASK_ACTION.IDSITE;
    }

    @Override
    public Field<BigDecimal> field5() {
        return TaskAction.TASK_ACTION.LAST_TASKITEM;
    }

    @Override
    public Field<BigDecimal> field6() {
        return TaskAction.TASK_ACTION.LAST_PI;
    }

    @Override
    public Field<Long> field7() {
        return TaskAction.TASK_ACTION.LENGTH_LOADED;
    }

    @Override
    public Field<Long> field8() {
        return TaskAction.TASK_ACTION.LENGTH_ACTIVE;
    }

    @Override
    public Field<Long> field9() {
        return TaskAction.TASK_ACTION.LENGTH_VISIBLE;
    }

    @Override
    public Field<Long> field10() {
        return TaskAction.TASK_ACTION.NUM_PI;
    }

    @Override
    public Field<Long> field11() {
        return TaskAction.TASK_ACTION.NUM_CLICKS;
    }

    @Override
    public Field<Short> field12() {
        return TaskAction.TASK_ACTION.COMPLETED;
    }

    @Override
    public Long component1() {
        return getIdtask();
    }

    @Override
    public BigDecimal component2() {
        return getIdsession();
    }

    @Override
    public BigDecimal component3() {
        return getTimestamp();
    }

    @Override
    public Integer component4() {
        return getIdsite();
    }

    @Override
    public BigDecimal component5() {
        return getLastTaskitem();
    }

    @Override
    public BigDecimal component6() {
        return getLastPi();
    }

    @Override
    public Long component7() {
        return getLengthLoaded();
    }

    @Override
    public Long component8() {
        return getLengthActive();
    }

    @Override
    public Long component9() {
        return getLengthVisible();
    }

    @Override
    public Long component10() {
        return getNumPi();
    }

    @Override
    public Long component11() {
        return getNumClicks();
    }

    @Override
    public Short component12() {
        return getCompleted();
    }

    @Override
    public Long value1() {
        return getIdtask();
    }

    @Override
    public BigDecimal value2() {
        return getIdsession();
    }

    @Override
    public BigDecimal value3() {
        return getTimestamp();
    }

    @Override
    public Integer value4() {
        return getIdsite();
    }

    @Override
    public BigDecimal value5() {
        return getLastTaskitem();
    }

    @Override
    public BigDecimal value6() {
        return getLastPi();
    }

    @Override
    public Long value7() {
        return getLengthLoaded();
    }

    @Override
    public Long value8() {
        return getLengthActive();
    }

    @Override
    public Long value9() {
        return getLengthVisible();
    }

    @Override
    public Long value10() {
        return getNumPi();
    }

    @Override
    public Long value11() {
        return getNumClicks();
    }

    @Override
    public Short value12() {
        return getCompleted();
    }

    @Override
    public TaskActionRecord value1(Long value) {
        setIdtask(value);
        return this;
    }

    @Override
    public TaskActionRecord value2(BigDecimal value) {
        setIdsession(value);
        return this;
    }

    @Override
    public TaskActionRecord value3(BigDecimal value) {
        setTimestamp(value);
        return this;
    }

    @Override
    public TaskActionRecord value4(Integer value) {
        setIdsite(value);
        return this;
    }

    @Override
    public TaskActionRecord value5(BigDecimal value) {
        setLastTaskitem(value);
        return this;
    }

    @Override
    public TaskActionRecord value6(BigDecimal value) {
        setLastPi(value);
        return this;
    }

    @Override
    public TaskActionRecord value7(Long value) {
        setLengthLoaded(value);
        return this;
    }

    @Override
    public TaskActionRecord value8(Long value) {
        setLengthActive(value);
        return this;
    }

    @Override
    public TaskActionRecord value9(Long value) {
        setLengthVisible(value);
        return this;
    }

    @Override
    public TaskActionRecord value10(Long value) {
        setNumPi(value);
        return this;
    }

    @Override
    public TaskActionRecord value11(Long value) {
        setNumClicks(value);
        return this;
    }

    @Override
    public TaskActionRecord value12(Short value) {
        setCompleted(value);
        return this;
    }

    @Override
    public TaskActionRecord values(Long value1, BigDecimal value2, BigDecimal value3, Integer value4, BigDecimal value5, BigDecimal value6, Long value7, Long value8, Long value9, Long value10, Long value11, Short value12) {
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
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TaskActionRecord
     */
    public TaskActionRecord() {
        super(TaskAction.TASK_ACTION);
    }

    /**
     * Create a detached, initialised TaskActionRecord
     */
    public TaskActionRecord(Long idtask, BigDecimal idsession, BigDecimal timestamp, Integer idsite, BigDecimal lastTaskitem, BigDecimal lastPi, Long lengthLoaded, Long lengthActive, Long lengthVisible, Long numPi, Long numClicks, Short completed) {
        super(TaskAction.TASK_ACTION);

        setIdtask(idtask);
        setIdsession(idsession);
        setTimestamp(timestamp);
        setIdsite(idsite);
        setLastTaskitem(lastTaskitem);
        setLastPi(lastPi);
        setLengthLoaded(lengthLoaded);
        setLengthActive(lengthActive);
        setLengthVisible(lengthVisible);
        setNumPi(numPi);
        setNumClicks(numClicks);
        setCompleted(completed);
    }
}
