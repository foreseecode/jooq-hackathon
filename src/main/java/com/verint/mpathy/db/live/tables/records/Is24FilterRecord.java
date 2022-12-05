/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables.records;


import com.verint.mpathy.db.live.tables.Is24Filter;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Is24FilterRecord extends TableRecordImpl<Is24FilterRecord> implements Record3<BigDecimal, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>live.is24_filter.idfilter</code>.
     */
    public void setIdfilter(BigDecimal value) {
        set(0, value);
    }

    /**
     * Getter for <code>live.is24_filter.idfilter</code>.
     */
    public BigDecimal getIdfilter() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>live.is24_filter.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>live.is24_filter.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>live.is24_filter.scope</code>.
     */
    public void setScope(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>live.is24_filter.scope</code>.
     */
    public String getScope() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<BigDecimal, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<BigDecimal, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<BigDecimal> field1() {
        return Is24Filter.IS24_FILTER.IDFILTER;
    }

    @Override
    public Field<String> field2() {
        return Is24Filter.IS24_FILTER.NAME;
    }

    @Override
    public Field<String> field3() {
        return Is24Filter.IS24_FILTER.SCOPE;
    }

    @Override
    public BigDecimal component1() {
        return getIdfilter();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getScope();
    }

    @Override
    public BigDecimal value1() {
        return getIdfilter();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getScope();
    }

    @Override
    public Is24FilterRecord value1(BigDecimal value) {
        setIdfilter(value);
        return this;
    }

    @Override
    public Is24FilterRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public Is24FilterRecord value3(String value) {
        setScope(value);
        return this;
    }

    @Override
    public Is24FilterRecord values(BigDecimal value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached Is24FilterRecord
     */
    public Is24FilterRecord() {
        super(Is24Filter.IS24_FILTER);
    }

    /**
     * Create a detached, initialised Is24FilterRecord
     */
    public Is24FilterRecord(BigDecimal idfilter, String name, String scope) {
        super(Is24Filter.IS24_FILTER);

        setIdfilter(idfilter);
        setName(name);
        setScope(scope);
    }
}
