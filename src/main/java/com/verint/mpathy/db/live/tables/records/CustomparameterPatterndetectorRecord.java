/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables.records;


import com.verint.mpathy.db.live.tables.CustomparameterPatterndetector;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CustomparameterPatterndetectorRecord extends TableRecordImpl<CustomparameterPatterndetectorRecord> implements Record2<Long, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>live.customparameter_patterndetector.idcp</code>.
     */
    public void setIdcp(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>live.customparameter_patterndetector.idcp</code>.
     */
    public Long getIdcp() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>live.customparameter_patterndetector.pattern</code>.
     */
    public void setPattern(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>live.customparameter_patterndetector.pattern</code>.
     */
    public String getPattern() {
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
        return CustomparameterPatterndetector.CUSTOMPARAMETER_PATTERNDETECTOR.IDCP;
    }

    @Override
    public Field<String> field2() {
        return CustomparameterPatterndetector.CUSTOMPARAMETER_PATTERNDETECTOR.PATTERN;
    }

    @Override
    public Long component1() {
        return getIdcp();
    }

    @Override
    public String component2() {
        return getPattern();
    }

    @Override
    public Long value1() {
        return getIdcp();
    }

    @Override
    public String value2() {
        return getPattern();
    }

    @Override
    public CustomparameterPatterndetectorRecord value1(Long value) {
        setIdcp(value);
        return this;
    }

    @Override
    public CustomparameterPatterndetectorRecord value2(String value) {
        setPattern(value);
        return this;
    }

    @Override
    public CustomparameterPatterndetectorRecord values(Long value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CustomparameterPatterndetectorRecord
     */
    public CustomparameterPatterndetectorRecord() {
        super(CustomparameterPatterndetector.CUSTOMPARAMETER_PATTERNDETECTOR);
    }

    /**
     * Create a detached, initialised CustomparameterPatterndetectorRecord
     */
    public CustomparameterPatterndetectorRecord(Long idcp, String pattern) {
        super(CustomparameterPatterndetector.CUSTOMPARAMETER_PATTERNDETECTOR);

        setIdcp(idcp);
        setPattern(pattern);
    }
}
