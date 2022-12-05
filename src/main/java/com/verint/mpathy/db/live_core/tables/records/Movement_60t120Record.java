/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables.records;


import com.verint.mpathy.db.live_core.tables.Movement_60t120;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * Easy access to underlying table in other schemas.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Movement_60t120Record extends TableRecordImpl<Movement_60t120Record> implements Record3<Integer, BigDecimal, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>live_core.movement_60t120.idsite</code>.
     */
    public void setIdsite(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>live_core.movement_60t120.idsite</code>.
     */
    public Integer getIdsite() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>live_core.movement_60t120.idpage</code>.
     */
    public void setIdpage(BigDecimal value) {
        set(1, value);
    }

    /**
     * Getter for <code>live_core.movement_60t120.idpage</code>.
     */
    public BigDecimal getIdpage() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>live_core.movement_60t120.move</code>.
     */
    public void setMove(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>live_core.movement_60t120.move</code>.
     */
    public String getMove() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, BigDecimal, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, BigDecimal, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Movement_60t120.MOVEMENT_60T120.IDSITE;
    }

    @Override
    public Field<BigDecimal> field2() {
        return Movement_60t120.MOVEMENT_60T120.IDPAGE;
    }

    @Override
    public Field<String> field3() {
        return Movement_60t120.MOVEMENT_60T120.MOVE;
    }

    @Override
    public Integer component1() {
        return getIdsite();
    }

    @Override
    public BigDecimal component2() {
        return getIdpage();
    }

    @Override
    public String component3() {
        return getMove();
    }

    @Override
    public Integer value1() {
        return getIdsite();
    }

    @Override
    public BigDecimal value2() {
        return getIdpage();
    }

    @Override
    public String value3() {
        return getMove();
    }

    @Override
    public Movement_60t120Record value1(Integer value) {
        setIdsite(value);
        return this;
    }

    @Override
    public Movement_60t120Record value2(BigDecimal value) {
        setIdpage(value);
        return this;
    }

    @Override
    public Movement_60t120Record value3(String value) {
        setMove(value);
        return this;
    }

    @Override
    public Movement_60t120Record values(Integer value1, BigDecimal value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached Movement_60t120Record
     */
    public Movement_60t120Record() {
        super(Movement_60t120.MOVEMENT_60T120);
    }

    /**
     * Create a detached, initialised Movement_60t120Record
     */
    public Movement_60t120Record(Integer idsite, BigDecimal idpage, String move) {
        super(Movement_60t120.MOVEMENT_60T120);

        setIdsite(idsite);
        setIdpage(idpage);
        setMove(move);
    }
}
