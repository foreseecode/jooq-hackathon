/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables.records;


import com.verint.mpathy.db.live.tables.Movement_3t4;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Movement_3t4Record extends TableRecordImpl<Movement_3t4Record> implements Record3<Integer, BigDecimal, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>live.movement_3t4.idsite</code>. Technical foreign key
     * to the "site" table and a foreign key to "site".
     */
    public void setIdsite(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>live.movement_3t4.idsite</code>. Technical foreign key
     * to the "site" table and a foreign key to "site".
     */
    public Integer getIdsite() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>live.movement_3t4.idpage</code>. Technical foreign key
     * to the "page" table and a foreign key to "page".
     */
    public void setIdpage(BigDecimal value) {
        set(1, value);
    }

    /**
     * Getter for <code>live.movement_3t4.idpage</code>. Technical foreign key
     * to the "page" table and a foreign key to "page".
     */
    public BigDecimal getIdpage() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>live.movement_3t4.move</code>. Accumulated moves from
     * "map_move between 3 and 4 seconds.
     */
    public void setMove(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>live.movement_3t4.move</code>. Accumulated moves from
     * "map_move between 3 and 4 seconds.
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
        return Movement_3t4.MOVEMENT_3T4.IDSITE;
    }

    @Override
    public Field<BigDecimal> field2() {
        return Movement_3t4.MOVEMENT_3T4.IDPAGE;
    }

    @Override
    public Field<String> field3() {
        return Movement_3t4.MOVEMENT_3T4.MOVE;
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
    public Movement_3t4Record value1(Integer value) {
        setIdsite(value);
        return this;
    }

    @Override
    public Movement_3t4Record value2(BigDecimal value) {
        setIdpage(value);
        return this;
    }

    @Override
    public Movement_3t4Record value3(String value) {
        setMove(value);
        return this;
    }

    @Override
    public Movement_3t4Record values(Integer value1, BigDecimal value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached Movement_3t4Record
     */
    public Movement_3t4Record() {
        super(Movement_3t4.MOVEMENT_3T4);
    }

    /**
     * Create a detached, initialised Movement_3t4Record
     */
    public Movement_3t4Record(Integer idsite, BigDecimal idpage, String move) {
        super(Movement_3t4.MOVEMENT_3T4);

        setIdsite(idsite);
        setIdpage(idpage);
        setMove(move);
    }
}
