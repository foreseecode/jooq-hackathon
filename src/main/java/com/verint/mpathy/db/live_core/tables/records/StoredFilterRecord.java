/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables.records;


import com.verint.mpathy.db.live_core.tables.StoredFilter;

import java.math.BigDecimal;
import java.time.LocalTime;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StoredFilterRecord extends TableRecordImpl<StoredFilterRecord> implements Record9<BigDecimal, Integer, String, String, String, Boolean, LocalTime, String, LocalTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>live_core.stored_filter.iduser</code>. Foreign Key to
     * "user"-Table.
     */
    public void setIduser(BigDecimal value) {
        set(0, value);
    }

    /**
     * Getter for <code>live_core.stored_filter.iduser</code>. Foreign Key to
     * "user"-Table.
     */
    public BigDecimal getIduser() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>live_core.stored_filter.idsite</code>. Foreign Key to
     * "site"-Table.
     */
    public void setIdsite(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>live_core.stored_filter.idsite</code>. Foreign Key to
     * "site"-Table.
     */
    public Integer getIdsite() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>live_core.stored_filter.hash</code>. A unique hash based
     * on the "request"- and "created"-value.
     */
    public void setHash(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>live_core.stored_filter.hash</code>. A unique hash based
     * on the "request"- and "created"-value.
     */
    public String getHash() {
        return (String) get(2);
    }

    /**
     * Setter for <code>live_core.stored_filter.description</code>. Do describe
     * the Filter.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>live_core.stored_filter.description</code>. Do describe
     * the Filter.
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>live_core.stored_filter.request</code>. Serialized
     * JSON-Object with the Filter-Request.
     */
    public void setRequest(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>live_core.stored_filter.request</code>. Serialized
     * JSON-Object with the Filter-Request.
     */
    public String getRequest() {
        return (String) get(4);
    }

    /**
     * Setter for <code>live_core.stored_filter.visible</code>. Store the
     * visibility of the Filter ("true" = public, "false" = private).
     */
    public void setVisible(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>live_core.stored_filter.visible</code>. Store the
     * visibility of the Filter ("true" = public, "false" = private).
     */
    public Boolean getVisible() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>live_core.stored_filter.created</code>. The creation
     * time of the Filter.
     */
    public void setCreated(LocalTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>live_core.stored_filter.created</code>. The creation
     * time of the Filter.
     */
    public LocalTime getCreated() {
        return (LocalTime) get(6);
    }

    /**
     * Setter for <code>live_core.stored_filter.type</code>.
     */
    public void setType(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>live_core.stored_filter.type</code>.
     */
    public String getType() {
        return (String) get(7);
    }

    /**
     * Setter for <code>live_core.stored_filter.used</code>.
     */
    public void setUsed(LocalTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>live_core.stored_filter.used</code>.
     */
    public LocalTime getUsed() {
        return (LocalTime) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<BigDecimal, Integer, String, String, String, Boolean, LocalTime, String, LocalTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<BigDecimal, Integer, String, String, String, Boolean, LocalTime, String, LocalTime> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<BigDecimal> field1() {
        return StoredFilter.STORED_FILTER.IDUSER;
    }

    @Override
    public Field<Integer> field2() {
        return StoredFilter.STORED_FILTER.IDSITE;
    }

    @Override
    public Field<String> field3() {
        return StoredFilter.STORED_FILTER.HASH;
    }

    @Override
    public Field<String> field4() {
        return StoredFilter.STORED_FILTER.DESCRIPTION;
    }

    @Override
    public Field<String> field5() {
        return StoredFilter.STORED_FILTER.REQUEST;
    }

    @Override
    public Field<Boolean> field6() {
        return StoredFilter.STORED_FILTER.VISIBLE;
    }

    @Override
    public Field<LocalTime> field7() {
        return StoredFilter.STORED_FILTER.CREATED;
    }

    @Override
    public Field<String> field8() {
        return StoredFilter.STORED_FILTER.TYPE;
    }

    @Override
    public Field<LocalTime> field9() {
        return StoredFilter.STORED_FILTER.USED;
    }

    @Override
    public BigDecimal component1() {
        return getIduser();
    }

    @Override
    public Integer component2() {
        return getIdsite();
    }

    @Override
    public String component3() {
        return getHash();
    }

    @Override
    public String component4() {
        return getDescription();
    }

    @Override
    public String component5() {
        return getRequest();
    }

    @Override
    public Boolean component6() {
        return getVisible();
    }

    @Override
    public LocalTime component7() {
        return getCreated();
    }

    @Override
    public String component8() {
        return getType();
    }

    @Override
    public LocalTime component9() {
        return getUsed();
    }

    @Override
    public BigDecimal value1() {
        return getIduser();
    }

    @Override
    public Integer value2() {
        return getIdsite();
    }

    @Override
    public String value3() {
        return getHash();
    }

    @Override
    public String value4() {
        return getDescription();
    }

    @Override
    public String value5() {
        return getRequest();
    }

    @Override
    public Boolean value6() {
        return getVisible();
    }

    @Override
    public LocalTime value7() {
        return getCreated();
    }

    @Override
    public String value8() {
        return getType();
    }

    @Override
    public LocalTime value9() {
        return getUsed();
    }

    @Override
    public StoredFilterRecord value1(BigDecimal value) {
        setIduser(value);
        return this;
    }

    @Override
    public StoredFilterRecord value2(Integer value) {
        setIdsite(value);
        return this;
    }

    @Override
    public StoredFilterRecord value3(String value) {
        setHash(value);
        return this;
    }

    @Override
    public StoredFilterRecord value4(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public StoredFilterRecord value5(String value) {
        setRequest(value);
        return this;
    }

    @Override
    public StoredFilterRecord value6(Boolean value) {
        setVisible(value);
        return this;
    }

    @Override
    public StoredFilterRecord value7(LocalTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public StoredFilterRecord value8(String value) {
        setType(value);
        return this;
    }

    @Override
    public StoredFilterRecord value9(LocalTime value) {
        setUsed(value);
        return this;
    }

    @Override
    public StoredFilterRecord values(BigDecimal value1, Integer value2, String value3, String value4, String value5, Boolean value6, LocalTime value7, String value8, LocalTime value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StoredFilterRecord
     */
    public StoredFilterRecord() {
        super(StoredFilter.STORED_FILTER);
    }

    /**
     * Create a detached, initialised StoredFilterRecord
     */
    public StoredFilterRecord(BigDecimal iduser, Integer idsite, String hash, String description, String request, Boolean visible, LocalTime created, String type, LocalTime used) {
        super(StoredFilter.STORED_FILTER);

        setIduser(iduser);
        setIdsite(idsite);
        setHash(hash);
        setDescription(description);
        setRequest(request);
        setVisible(visible);
        setCreated(created);
        setType(type);
        setUsed(used);
    }
}
