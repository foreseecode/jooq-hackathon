/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables.records;


import com.verint.mpathy.db.live.tables.Movement_2t3;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Movement_2t3Record extends TableRecordImpl<Movement_2t3Record> implements Record3<Integer, BigDecimal, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>live.movement_2t3.idsite</code>. Technical foreign key
     * to the "site" table and a foreign key to "site".
     */
    public void setIdsite(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>live.movement_2t3.idsite</code>. Technical foreign key
     * to the "site" table and a foreign key to "site".
     */
    public Integer getIdsite() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>live.movement_2t3.idpage</code>. Technical foreign key
     * to the "page" table and a foreign key to "page".
     */
    public void setIdpage(BigDecimal value) {
        set(1, value);
    }

    /**
     * Getter for <code>live.movement_2t3.idpage</code>. Technical foreign key
     * to the "page" table and a foreign key to "page".
     */
    public BigDecimal getIdpage() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>live.movement_2t3.move</code>. Accumulated moves from
     * "map_move between 2 and 3 seconds.
     */
    public void setMove(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>live.movement_2t3.move</code>. Accumulated moves from
     * "map_move between 2 and 3 seconds.
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
        return Movement_2t3.MOVEMENT_2T3.IDSITE;
    }

    @Override
    public Field<BigDecimal> field2() {
        return Movement_2t3.MOVEMENT_2T3.IDPAGE;
    }

    @Override
    public Field<String> field3() {
        return Movement_2t3.MOVEMENT_2T3.MOVE;
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
    public Movement_2t3Record value1(Integer value) {
        setIdsite(value);
        return this;
    }

    @Override
    public Movement_2t3Record value2(BigDecimal value) {
        setIdpage(value);
        return this;
    }

    @Override
    public Movement_2t3Record value3(String value) {
        setMove(value);
        return this;
    }

    @Override
    public Movement_2t3Record values(Integer value1, BigDecimal value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached Movement_2t3Record
     */
    public Movement_2t3Record() {
        super(Movement_2t3.MOVEMENT_2T3);
    }

    /**
     * Create a detached, initialised Movement_2t3Record
     */
    public Movement_2t3Record(Integer idsite, BigDecimal idpage, String move) {
        super(Movement_2t3.MOVEMENT_2T3);

        setIdsite(idsite);
        setIdpage(idpage);
        setMove(move);
    }
}
