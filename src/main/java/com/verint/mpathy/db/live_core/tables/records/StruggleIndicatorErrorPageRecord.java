/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables.records;


import com.verint.mpathy.db.live_core.tables.StruggleIndicatorErrorPage;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * Easy access to underlying table in other schemas.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StruggleIndicatorErrorPageRecord extends TableRecordImpl<StruggleIndicatorErrorPageRecord> implements Record3<Long, BigDecimal, Short> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>live_core.struggle_indicator_error_page.idstruggle_indicator_error_page</code>.
     */
    public void setIdstruggleIndicatorErrorPage(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>live_core.struggle_indicator_error_page.idstruggle_indicator_error_page</code>.
     */
    public Long getIdstruggleIndicatorErrorPage() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>live_core.struggle_indicator_error_page.idpage</code>.
     */
    public void setIdpage(BigDecimal value) {
        set(1, value);
    }

    /**
     * Getter for <code>live_core.struggle_indicator_error_page.idpage</code>.
     */
    public BigDecimal getIdpage() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>live_core.struggle_indicator_error_page.value</code>.
     */
    public void setValue(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>live_core.struggle_indicator_error_page.value</code>.
     */
    public Short getValue() {
        return (Short) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, BigDecimal, Short> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Long, BigDecimal, Short> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return StruggleIndicatorErrorPage.STRUGGLE_INDICATOR_ERROR_PAGE.IDSTRUGGLE_INDICATOR_ERROR_PAGE;
    }

    @Override
    public Field<BigDecimal> field2() {
        return StruggleIndicatorErrorPage.STRUGGLE_INDICATOR_ERROR_PAGE.IDPAGE;
    }

    @Override
    public Field<Short> field3() {
        return StruggleIndicatorErrorPage.STRUGGLE_INDICATOR_ERROR_PAGE.VALUE;
    }

    @Override
    public Long component1() {
        return getIdstruggleIndicatorErrorPage();
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
    public Long value1() {
        return getIdstruggleIndicatorErrorPage();
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
    public StruggleIndicatorErrorPageRecord value1(Long value) {
        setIdstruggleIndicatorErrorPage(value);
        return this;
    }

    @Override
    public StruggleIndicatorErrorPageRecord value2(BigDecimal value) {
        setIdpage(value);
        return this;
    }

    @Override
    public StruggleIndicatorErrorPageRecord value3(Short value) {
        setValue(value);
        return this;
    }

    @Override
    public StruggleIndicatorErrorPageRecord values(Long value1, BigDecimal value2, Short value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StruggleIndicatorErrorPageRecord
     */
    public StruggleIndicatorErrorPageRecord() {
        super(StruggleIndicatorErrorPage.STRUGGLE_INDICATOR_ERROR_PAGE);
    }

    /**
     * Create a detached, initialised StruggleIndicatorErrorPageRecord
     */
    public StruggleIndicatorErrorPageRecord(Long idstruggleIndicatorErrorPage, BigDecimal idpage, Short value) {
        super(StruggleIndicatorErrorPage.STRUGGLE_INDICATOR_ERROR_PAGE);

        setIdstruggleIndicatorErrorPage(idstruggleIndicatorErrorPage);
        setIdpage(idpage);
        setValue(value);
    }
}
