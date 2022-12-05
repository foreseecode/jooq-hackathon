/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.pg_catalog.tables.records;


import com.verint.mpathy.db.pg_catalog.tables.PgSequences;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgSequencesRecord extends TableRecordImpl<PgSequencesRecord> implements Record11<String, String, String, Object, Long, Long, Long, Long, Boolean, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_sequences.schemaname</code>.
     */
    public void setSchemaname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequences.schemaname</code>.
     */
    public String getSchemaname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_sequences.sequencename</code>.
     */
    public void setSequencename(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequences.sequencename</code>.
     */
    public String getSequencename() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_sequences.sequenceowner</code>.
     */
    public void setSequenceowner(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequences.sequenceowner</code>.
     */
    public String getSequenceowner() {
        return (String) get(2);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setDataType(Object value) {
        set(3, value);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public Object getDataType() {
        return get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_sequences.start_value</code>.
     */
    public void setStartValue(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequences.start_value</code>.
     */
    public Long getStartValue() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_sequences.min_value</code>.
     */
    public void setMinValue(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequences.min_value</code>.
     */
    public Long getMinValue() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_sequences.max_value</code>.
     */
    public void setMaxValue(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequences.max_value</code>.
     */
    public Long getMaxValue() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_sequences.increment_by</code>.
     */
    public void setIncrementBy(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequences.increment_by</code>.
     */
    public Long getIncrementBy() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_sequences.cycle</code>.
     */
    public void setCycle(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequences.cycle</code>.
     */
    public Boolean getCycle() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_sequences.cache_size</code>.
     */
    public void setCacheSize(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequences.cache_size</code>.
     */
    public Long getCacheSize() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_sequences.last_value</code>.
     */
    public void setLastValue(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequences.last_value</code>.
     */
    public Long getLastValue() {
        return (Long) get(10);
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<String, String, String, Object, Long, Long, Long, Long, Boolean, Long, Long> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<String, String, String, Object, Long, Long, Long, Long, Boolean, Long, Long> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return PgSequences.PG_SEQUENCES.SCHEMANAME;
    }

    @Override
    public Field<String> field2() {
        return PgSequences.PG_SEQUENCES.SEQUENCENAME;
    }

    @Override
    public Field<String> field3() {
        return PgSequences.PG_SEQUENCES.SEQUENCEOWNER;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Field<Object> field4() {
        return PgSequences.PG_SEQUENCES.DATA_TYPE;
    }

    @Override
    public Field<Long> field5() {
        return PgSequences.PG_SEQUENCES.START_VALUE;
    }

    @Override
    public Field<Long> field6() {
        return PgSequences.PG_SEQUENCES.MIN_VALUE;
    }

    @Override
    public Field<Long> field7() {
        return PgSequences.PG_SEQUENCES.MAX_VALUE;
    }

    @Override
    public Field<Long> field8() {
        return PgSequences.PG_SEQUENCES.INCREMENT_BY;
    }

    @Override
    public Field<Boolean> field9() {
        return PgSequences.PG_SEQUENCES.CYCLE;
    }

    @Override
    public Field<Long> field10() {
        return PgSequences.PG_SEQUENCES.CACHE_SIZE;
    }

    @Override
    public Field<Long> field11() {
        return PgSequences.PG_SEQUENCES.LAST_VALUE;
    }

    @Override
    public String component1() {
        return getSchemaname();
    }

    @Override
    public String component2() {
        return getSequencename();
    }

    @Override
    public String component3() {
        return getSequenceowner();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Object component4() {
        return getDataType();
    }

    @Override
    public Long component5() {
        return getStartValue();
    }

    @Override
    public Long component6() {
        return getMinValue();
    }

    @Override
    public Long component7() {
        return getMaxValue();
    }

    @Override
    public Long component8() {
        return getIncrementBy();
    }

    @Override
    public Boolean component9() {
        return getCycle();
    }

    @Override
    public Long component10() {
        return getCacheSize();
    }

    @Override
    public Long component11() {
        return getLastValue();
    }

    @Override
    public String value1() {
        return getSchemaname();
    }

    @Override
    public String value2() {
        return getSequencename();
    }

    @Override
    public String value3() {
        return getSequenceowner();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Object value4() {
        return getDataType();
    }

    @Override
    public Long value5() {
        return getStartValue();
    }

    @Override
    public Long value6() {
        return getMinValue();
    }

    @Override
    public Long value7() {
        return getMaxValue();
    }

    @Override
    public Long value8() {
        return getIncrementBy();
    }

    @Override
    public Boolean value9() {
        return getCycle();
    }

    @Override
    public Long value10() {
        return getCacheSize();
    }

    @Override
    public Long value11() {
        return getLastValue();
    }

    @Override
    public PgSequencesRecord value1(String value) {
        setSchemaname(value);
        return this;
    }

    @Override
    public PgSequencesRecord value2(String value) {
        setSequencename(value);
        return this;
    }

    @Override
    public PgSequencesRecord value3(String value) {
        setSequenceowner(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public PgSequencesRecord value4(Object value) {
        setDataType(value);
        return this;
    }

    @Override
    public PgSequencesRecord value5(Long value) {
        setStartValue(value);
        return this;
    }

    @Override
    public PgSequencesRecord value6(Long value) {
        setMinValue(value);
        return this;
    }

    @Override
    public PgSequencesRecord value7(Long value) {
        setMaxValue(value);
        return this;
    }

    @Override
    public PgSequencesRecord value8(Long value) {
        setIncrementBy(value);
        return this;
    }

    @Override
    public PgSequencesRecord value9(Boolean value) {
        setCycle(value);
        return this;
    }

    @Override
    public PgSequencesRecord value10(Long value) {
        setCacheSize(value);
        return this;
    }

    @Override
    public PgSequencesRecord value11(Long value) {
        setLastValue(value);
        return this;
    }

    @Override
    public PgSequencesRecord values(String value1, String value2, String value3, Object value4, Long value5, Long value6, Long value7, Long value8, Boolean value9, Long value10, Long value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgSequencesRecord
     */
    public PgSequencesRecord() {
        super(PgSequences.PG_SEQUENCES);
    }

    /**
     * Create a detached, initialised PgSequencesRecord
     */
    public PgSequencesRecord(String schemaname, String sequencename, String sequenceowner, Object dataType, Long startValue, Long minValue, Long maxValue, Long incrementBy, Boolean cycle, Long cacheSize, Long lastValue) {
        super(PgSequences.PG_SEQUENCES);

        setSchemaname(schemaname);
        setSequencename(sequencename);
        setSequenceowner(sequenceowner);
        setDataType(dataType);
        setStartValue(startValue);
        setMinValue(minValue);
        setMaxValue(maxValue);
        setIncrementBy(incrementBy);
        setCycle(cycle);
        setCacheSize(cacheSize);
        setLastValue(lastValue);
    }
}
