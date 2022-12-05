/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables.records;


import com.verint.mpathy.db.live_core.tables.TestDv_2020_07_24;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * Easy access to underlying table in other schemas.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TestDv_2020_07_24Record extends TableRecordImpl<TestDv_2020_07_24Record> implements Record2<BigDecimal, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>live_core.TEST_DV_2020_07_24.id</code>.
     */
    public void setId(BigDecimal value) {
        set(0, value);
    }

    /**
     * Getter for <code>live_core.TEST_DV_2020_07_24.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>live_core.TEST_DV_2020_07_24.content</code>.
     */
    public void setContent(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>live_core.TEST_DV_2020_07_24.content</code>.
     */
    public String getContent() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<BigDecimal, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<BigDecimal, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<BigDecimal> field1() {
        return TestDv_2020_07_24.TEST_DV_2020_07_24.ID;
    }

    @Override
    public Field<String> field2() {
        return TestDv_2020_07_24.TEST_DV_2020_07_24.CONTENT;
    }

    @Override
    public BigDecimal component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getContent();
    }

    @Override
    public BigDecimal value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getContent();
    }

    @Override
    public TestDv_2020_07_24Record value1(BigDecimal value) {
        setId(value);
        return this;
    }

    @Override
    public TestDv_2020_07_24Record value2(String value) {
        setContent(value);
        return this;
    }

    @Override
    public TestDv_2020_07_24Record values(BigDecimal value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TestDv_2020_07_24Record
     */
    public TestDv_2020_07_24Record() {
        super(TestDv_2020_07_24.TEST_DV_2020_07_24);
    }

    /**
     * Create a detached, initialised TestDv_2020_07_24Record
     */
    public TestDv_2020_07_24Record(BigDecimal id, String content) {
        super(TestDv_2020_07_24.TEST_DV_2020_07_24);

        setId(id);
        setContent(content);
    }
}
