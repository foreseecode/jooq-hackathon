/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables.records;


import com.verint.mpathy.db.live_core.tables.PageHasResource;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * Easy access to underlying table in other schemas.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PageHasResourceRecord extends TableRecordImpl<PageHasResourceRecord> implements Record2<BigDecimal, BigDecimal> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>live_core.page_has_resource.idpage</code>.
     */
    public void setIdpage(BigDecimal value) {
        set(0, value);
    }

    /**
     * Getter for <code>live_core.page_has_resource.idpage</code>.
     */
    public BigDecimal getIdpage() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>live_core.page_has_resource.idres</code>.
     */
    public void setIdres(BigDecimal value) {
        set(1, value);
    }

    /**
     * Getter for <code>live_core.page_has_resource.idres</code>.
     */
    public BigDecimal getIdres() {
        return (BigDecimal) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<BigDecimal, BigDecimal> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<BigDecimal, BigDecimal> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<BigDecimal> field1() {
        return PageHasResource.PAGE_HAS_RESOURCE.IDPAGE;
    }

    @Override
    public Field<BigDecimal> field2() {
        return PageHasResource.PAGE_HAS_RESOURCE.IDRES;
    }

    @Override
    public BigDecimal component1() {
        return getIdpage();
    }

    @Override
    public BigDecimal component2() {
        return getIdres();
    }

    @Override
    public BigDecimal value1() {
        return getIdpage();
    }

    @Override
    public BigDecimal value2() {
        return getIdres();
    }

    @Override
    public PageHasResourceRecord value1(BigDecimal value) {
        setIdpage(value);
        return this;
    }

    @Override
    public PageHasResourceRecord value2(BigDecimal value) {
        setIdres(value);
        return this;
    }

    @Override
    public PageHasResourceRecord values(BigDecimal value1, BigDecimal value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PageHasResourceRecord
     */
    public PageHasResourceRecord() {
        super(PageHasResource.PAGE_HAS_RESOURCE);
    }

    /**
     * Create a detached, initialised PageHasResourceRecord
     */
    public PageHasResourceRecord(BigDecimal idpage, BigDecimal idres) {
        super(PageHasResource.PAGE_HAS_RESOURCE);

        setIdpage(idpage);
        setIdres(idres);
    }
}
