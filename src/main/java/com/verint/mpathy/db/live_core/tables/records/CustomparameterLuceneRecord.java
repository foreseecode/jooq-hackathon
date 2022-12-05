/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables.records;


import com.verint.mpathy.db.live_core.tables.CustomparameterLucene;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * Easy access to underlying table in other schemas.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CustomparameterLuceneRecord extends TableRecordImpl<CustomparameterLuceneRecord> implements Record3<Long, Boolean, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>live_core.customparameter_lucene.idcp</code>.
     */
    public void setIdcp(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>live_core.customparameter_lucene.idcp</code>.
     */
    public Long getIdcp() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>live_core.customparameter_lucene.regexp</code>.
     */
    public void setRegexp(Boolean value) {
        set(1, value);
    }

    /**
     * Getter for <code>live_core.customparameter_lucene.regexp</code>.
     */
    public Boolean getRegexp() {
        return (Boolean) get(1);
    }

    /**
     * Setter for <code>live_core.customparameter_lucene.query</code>.
     */
    public void setQuery(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>live_core.customparameter_lucene.query</code>.
     */
    public String getQuery() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, Boolean, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Long, Boolean, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return CustomparameterLucene.CUSTOMPARAMETER_LUCENE.IDCP;
    }

    @Override
    public Field<Boolean> field2() {
        return CustomparameterLucene.CUSTOMPARAMETER_LUCENE.REGEXP;
    }

    @Override
    public Field<String> field3() {
        return CustomparameterLucene.CUSTOMPARAMETER_LUCENE.QUERY;
    }

    @Override
    public Long component1() {
        return getIdcp();
    }

    @Override
    public Boolean component2() {
        return getRegexp();
    }

    @Override
    public String component3() {
        return getQuery();
    }

    @Override
    public Long value1() {
        return getIdcp();
    }

    @Override
    public Boolean value2() {
        return getRegexp();
    }

    @Override
    public String value3() {
        return getQuery();
    }

    @Override
    public CustomparameterLuceneRecord value1(Long value) {
        setIdcp(value);
        return this;
    }

    @Override
    public CustomparameterLuceneRecord value2(Boolean value) {
        setRegexp(value);
        return this;
    }

    @Override
    public CustomparameterLuceneRecord value3(String value) {
        setQuery(value);
        return this;
    }

    @Override
    public CustomparameterLuceneRecord values(Long value1, Boolean value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CustomparameterLuceneRecord
     */
    public CustomparameterLuceneRecord() {
        super(CustomparameterLucene.CUSTOMPARAMETER_LUCENE);
    }

    /**
     * Create a detached, initialised CustomparameterLuceneRecord
     */
    public CustomparameterLuceneRecord(Long idcp, Boolean regexp, String query) {
        super(CustomparameterLucene.CUSTOMPARAMETER_LUCENE);

        setIdcp(idcp);
        setRegexp(regexp);
        setQuery(query);
    }
}
