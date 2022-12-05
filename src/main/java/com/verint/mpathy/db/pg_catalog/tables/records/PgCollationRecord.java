/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.pg_catalog.tables.records;


import com.verint.mpathy.db.pg_catalog.tables.PgCollation;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgCollationRecord extends UpdatableRecordImpl<PgCollationRecord> implements Record10<Long, String, Long, Long, String, Boolean, Integer, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_collation.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_collation.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_collation.collname</code>.
     */
    public void setCollname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_collation.collname</code>.
     */
    public String getCollname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_collation.collnamespace</code>.
     */
    public void setCollnamespace(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_collation.collnamespace</code>.
     */
    public Long getCollnamespace() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_collation.collowner</code>.
     */
    public void setCollowner(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_collation.collowner</code>.
     */
    public Long getCollowner() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_collation.collprovider</code>.
     */
    public void setCollprovider(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_collation.collprovider</code>.
     */
    public String getCollprovider() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_collation.collisdeterministic</code>.
     */
    public void setCollisdeterministic(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_collation.collisdeterministic</code>.
     */
    public Boolean getCollisdeterministic() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_collation.collencoding</code>.
     */
    public void setCollencoding(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_collation.collencoding</code>.
     */
    public Integer getCollencoding() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_collation.collcollate</code>.
     */
    public void setCollcollate(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_collation.collcollate</code>.
     */
    public String getCollcollate() {
        return (String) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_collation.collctype</code>.
     */
    public void setCollctype(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_collation.collctype</code>.
     */
    public String getCollctype() {
        return (String) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_collation.collversion</code>.
     */
    public void setCollversion(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_collation.collversion</code>.
     */
    public String getCollversion() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, String, Long, Long, String, Boolean, Integer, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Long, String, Long, Long, String, Boolean, Integer, String, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgCollation.PG_COLLATION.OID;
    }

    @Override
    public Field<String> field2() {
        return PgCollation.PG_COLLATION.COLLNAME;
    }

    @Override
    public Field<Long> field3() {
        return PgCollation.PG_COLLATION.COLLNAMESPACE;
    }

    @Override
    public Field<Long> field4() {
        return PgCollation.PG_COLLATION.COLLOWNER;
    }

    @Override
    public Field<String> field5() {
        return PgCollation.PG_COLLATION.COLLPROVIDER;
    }

    @Override
    public Field<Boolean> field6() {
        return PgCollation.PG_COLLATION.COLLISDETERMINISTIC;
    }

    @Override
    public Field<Integer> field7() {
        return PgCollation.PG_COLLATION.COLLENCODING;
    }

    @Override
    public Field<String> field8() {
        return PgCollation.PG_COLLATION.COLLCOLLATE;
    }

    @Override
    public Field<String> field9() {
        return PgCollation.PG_COLLATION.COLLCTYPE;
    }

    @Override
    public Field<String> field10() {
        return PgCollation.PG_COLLATION.COLLVERSION;
    }

    @Override
    public Long component1() {
        return getOid();
    }

    @Override
    public String component2() {
        return getCollname();
    }

    @Override
    public Long component3() {
        return getCollnamespace();
    }

    @Override
    public Long component4() {
        return getCollowner();
    }

    @Override
    public String component5() {
        return getCollprovider();
    }

    @Override
    public Boolean component6() {
        return getCollisdeterministic();
    }

    @Override
    public Integer component7() {
        return getCollencoding();
    }

    @Override
    public String component8() {
        return getCollcollate();
    }

    @Override
    public String component9() {
        return getCollctype();
    }

    @Override
    public String component10() {
        return getCollversion();
    }

    @Override
    public Long value1() {
        return getOid();
    }

    @Override
    public String value2() {
        return getCollname();
    }

    @Override
    public Long value3() {
        return getCollnamespace();
    }

    @Override
    public Long value4() {
        return getCollowner();
    }

    @Override
    public String value5() {
        return getCollprovider();
    }

    @Override
    public Boolean value6() {
        return getCollisdeterministic();
    }

    @Override
    public Integer value7() {
        return getCollencoding();
    }

    @Override
    public String value8() {
        return getCollcollate();
    }

    @Override
    public String value9() {
        return getCollctype();
    }

    @Override
    public String value10() {
        return getCollversion();
    }

    @Override
    public PgCollationRecord value1(Long value) {
        setOid(value);
        return this;
    }

    @Override
    public PgCollationRecord value2(String value) {
        setCollname(value);
        return this;
    }

    @Override
    public PgCollationRecord value3(Long value) {
        setCollnamespace(value);
        return this;
    }

    @Override
    public PgCollationRecord value4(Long value) {
        setCollowner(value);
        return this;
    }

    @Override
    public PgCollationRecord value5(String value) {
        setCollprovider(value);
        return this;
    }

    @Override
    public PgCollationRecord value6(Boolean value) {
        setCollisdeterministic(value);
        return this;
    }

    @Override
    public PgCollationRecord value7(Integer value) {
        setCollencoding(value);
        return this;
    }

    @Override
    public PgCollationRecord value8(String value) {
        setCollcollate(value);
        return this;
    }

    @Override
    public PgCollationRecord value9(String value) {
        setCollctype(value);
        return this;
    }

    @Override
    public PgCollationRecord value10(String value) {
        setCollversion(value);
        return this;
    }

    @Override
    public PgCollationRecord values(Long value1, String value2, Long value3, Long value4, String value5, Boolean value6, Integer value7, String value8, String value9, String value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgCollationRecord
     */
    public PgCollationRecord() {
        super(PgCollation.PG_COLLATION);
    }

    /**
     * Create a detached, initialised PgCollationRecord
     */
    public PgCollationRecord(Long oid, String collname, Long collnamespace, Long collowner, String collprovider, Boolean collisdeterministic, Integer collencoding, String collcollate, String collctype, String collversion) {
        super(PgCollation.PG_COLLATION);

        setOid(oid);
        setCollname(collname);
        setCollnamespace(collnamespace);
        setCollowner(collowner);
        setCollprovider(collprovider);
        setCollisdeterministic(collisdeterministic);
        setCollencoding(collencoding);
        setCollcollate(collcollate);
        setCollctype(collctype);
        setCollversion(collversion);
    }
}
