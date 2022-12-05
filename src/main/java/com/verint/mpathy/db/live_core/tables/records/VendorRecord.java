/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables.records;


import com.verint.mpathy.db.live_core.tables.Vendor;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * Easy access to underlying table in other schemas.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VendorRecord extends TableRecordImpl<VendorRecord> implements Record2<Long, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>live_core.vendor.idvendor</code>.
     */
    public void setIdvendor(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>live_core.vendor.idvendor</code>.
     */
    public Long getIdvendor() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>live_core.vendor.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>live_core.vendor.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Long, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Vendor.VENDOR.IDVENDOR;
    }

    @Override
    public Field<String> field2() {
        return Vendor.VENDOR.NAME;
    }

    @Override
    public Long component1() {
        return getIdvendor();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Long value1() {
        return getIdvendor();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public VendorRecord value1(Long value) {
        setIdvendor(value);
        return this;
    }

    @Override
    public VendorRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public VendorRecord values(Long value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VendorRecord
     */
    public VendorRecord() {
        super(Vendor.VENDOR);
    }

    /**
     * Create a detached, initialised VendorRecord
     */
    public VendorRecord(Long idvendor, String name) {
        super(Vendor.VENDOR);

        setIdvendor(idvendor);
        setName(name);
    }
}
