/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.pg_catalog.tables.records;


import com.verint.mpathy.db.pg_catalog.tables.TsParse;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TsParseRecord extends TableRecordImpl<TsParseRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.ts_parse.tokid</code>.
     */
    public void setTokid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.ts_parse.tokid</code>.
     */
    public Integer getTokid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>pg_catalog.ts_parse.token</code>.
     */
    public void setToken(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.ts_parse.token</code>.
     */
    public String getToken() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return TsParse.TS_PARSE.TOKID;
    }

    @Override
    public Field<String> field2() {
        return TsParse.TS_PARSE.TOKEN;
    }

    @Override
    public Integer component1() {
        return getTokid();
    }

    @Override
    public String component2() {
        return getToken();
    }

    @Override
    public Integer value1() {
        return getTokid();
    }

    @Override
    public String value2() {
        return getToken();
    }

    @Override
    public TsParseRecord value1(Integer value) {
        setTokid(value);
        return this;
    }

    @Override
    public TsParseRecord value2(String value) {
        setToken(value);
        return this;
    }

    @Override
    public TsParseRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TsParseRecord
     */
    public TsParseRecord() {
        super(TsParse.TS_PARSE);
    }

    /**
     * Create a detached, initialised TsParseRecord
     */
    public TsParseRecord(Integer tokid, String token) {
        super(TsParse.TS_PARSE);

        setTokid(tokid);
        setToken(token);
    }
}
