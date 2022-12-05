/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables.records;


import com.verint.mpathy.db.live_core.tables.Scrollingmap;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


/**
 * Easy access to underlying table in other schemas.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ScrollingmapRecord extends TableRecordImpl<ScrollingmapRecord> implements Record7<BigDecimal, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>live_core.scrollingmap.idpage</code>.
     */
    public void setIdpage(BigDecimal value) {
        set(0, value);
    }

    /**
     * Getter for <code>live_core.scrollingmap.idpage</code>.
     */
    public BigDecimal getIdpage() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>live_core.scrollingmap.stripes1</code>.
     */
    public void setStripes1(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>live_core.scrollingmap.stripes1</code>.
     */
    public String getStripes1() {
        return (String) get(1);
    }

    /**
     * Setter for <code>live_core.scrollingmap.stripes2</code>.
     */
    public void setStripes2(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>live_core.scrollingmap.stripes2</code>.
     */
    public String getStripes2() {
        return (String) get(2);
    }

    /**
     * Setter for <code>live_core.scrollingmap.stripes3</code>.
     */
    public void setStripes3(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>live_core.scrollingmap.stripes3</code>.
     */
    public String getStripes3() {
        return (String) get(3);
    }

    /**
     * Setter for <code>live_core.scrollingmap.stripes4</code>.
     */
    public void setStripes4(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>live_core.scrollingmap.stripes4</code>.
     */
    public String getStripes4() {
        return (String) get(4);
    }

    /**
     * Setter for <code>live_core.scrollingmap.stripes5</code>.
     */
    public void setStripes5(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>live_core.scrollingmap.stripes5</code>.
     */
    public String getStripes5() {
        return (String) get(5);
    }

    /**
     * Setter for <code>live_core.scrollingmap.stripes6</code>.
     */
    public void setStripes6(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>live_core.scrollingmap.stripes6</code>.
     */
    public String getStripes6() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<BigDecimal, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<BigDecimal, String, String, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<BigDecimal> field1() {
        return Scrollingmap.SCROLLINGMAP.IDPAGE;
    }

    @Override
    public Field<String> field2() {
        return Scrollingmap.SCROLLINGMAP.STRIPES1;
    }

    @Override
    public Field<String> field3() {
        return Scrollingmap.SCROLLINGMAP.STRIPES2;
    }

    @Override
    public Field<String> field4() {
        return Scrollingmap.SCROLLINGMAP.STRIPES3;
    }

    @Override
    public Field<String> field5() {
        return Scrollingmap.SCROLLINGMAP.STRIPES4;
    }

    @Override
    public Field<String> field6() {
        return Scrollingmap.SCROLLINGMAP.STRIPES5;
    }

    @Override
    public Field<String> field7() {
        return Scrollingmap.SCROLLINGMAP.STRIPES6;
    }

    @Override
    public BigDecimal component1() {
        return getIdpage();
    }

    @Override
    public String component2() {
        return getStripes1();
    }

    @Override
    public String component3() {
        return getStripes2();
    }

    @Override
    public String component4() {
        return getStripes3();
    }

    @Override
    public String component5() {
        return getStripes4();
    }

    @Override
    public String component6() {
        return getStripes5();
    }

    @Override
    public String component7() {
        return getStripes6();
    }

    @Override
    public BigDecimal value1() {
        return getIdpage();
    }

    @Override
    public String value2() {
        return getStripes1();
    }

    @Override
    public String value3() {
        return getStripes2();
    }

    @Override
    public String value4() {
        return getStripes3();
    }

    @Override
    public String value5() {
        return getStripes4();
    }

    @Override
    public String value6() {
        return getStripes5();
    }

    @Override
    public String value7() {
        return getStripes6();
    }

    @Override
    public ScrollingmapRecord value1(BigDecimal value) {
        setIdpage(value);
        return this;
    }

    @Override
    public ScrollingmapRecord value2(String value) {
        setStripes1(value);
        return this;
    }

    @Override
    public ScrollingmapRecord value3(String value) {
        setStripes2(value);
        return this;
    }

    @Override
    public ScrollingmapRecord value4(String value) {
        setStripes3(value);
        return this;
    }

    @Override
    public ScrollingmapRecord value5(String value) {
        setStripes4(value);
        return this;
    }

    @Override
    public ScrollingmapRecord value6(String value) {
        setStripes5(value);
        return this;
    }

    @Override
    public ScrollingmapRecord value7(String value) {
        setStripes6(value);
        return this;
    }

    @Override
    public ScrollingmapRecord values(BigDecimal value1, String value2, String value3, String value4, String value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ScrollingmapRecord
     */
    public ScrollingmapRecord() {
        super(Scrollingmap.SCROLLINGMAP);
    }

    /**
     * Create a detached, initialised ScrollingmapRecord
     */
    public ScrollingmapRecord(BigDecimal idpage, String stripes1, String stripes2, String stripes3, String stripes4, String stripes5, String stripes6) {
        super(Scrollingmap.SCROLLINGMAP);

        setIdpage(idpage);
        setStripes1(stripes1);
        setStripes2(stripes2);
        setStripes3(stripes3);
        setStripes4(stripes4);
        setStripes5(stripes5);
        setStripes6(stripes6);
    }
}
