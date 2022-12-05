/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables.records;


import com.verint.mpathy.db.live.tables.PropertyValues;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PropertyValuesRecord extends TableRecordImpl<PropertyValuesRecord> implements Record2<Long, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>live.property_values.idvalue</code>.
     */
    public void setIdvalue(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>live.property_values.idvalue</code>.
     */
    public Long getIdvalue() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>live.property_values.content</code>.
     */
    public void setContent(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>live.property_values.content</code>.
     */
    public String getContent() {
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
        return PropertyValues.PROPERTY_VALUES.IDVALUE;
    }

    @Override
    public Field<String> field2() {
        return PropertyValues.PROPERTY_VALUES.CONTENT;
    }

    @Override
    public Long component1() {
        return getIdvalue();
    }

    @Override
    public String component2() {
        return getContent();
    }

    @Override
    public Long value1() {
        return getIdvalue();
    }

    @Override
    public String value2() {
        return getContent();
    }

    @Override
    public PropertyValuesRecord value1(Long value) {
        setIdvalue(value);
        return this;
    }

    @Override
    public PropertyValuesRecord value2(String value) {
        setContent(value);
        return this;
    }

    @Override
    public PropertyValuesRecord values(Long value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PropertyValuesRecord
     */
    public PropertyValuesRecord() {
        super(PropertyValues.PROPERTY_VALUES);
    }

    /**
     * Create a detached, initialised PropertyValuesRecord
     */
    public PropertyValuesRecord(Long idvalue, String content) {
        super(PropertyValues.PROPERTY_VALUES);

        setIdvalue(idvalue);
        setContent(content);
    }
}
