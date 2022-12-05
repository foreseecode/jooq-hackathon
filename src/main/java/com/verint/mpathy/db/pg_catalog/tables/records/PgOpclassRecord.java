/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.pg_catalog.tables.records;


import com.verint.mpathy.db.pg_catalog.tables.PgOpclass;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgOpclassRecord extends UpdatableRecordImpl<PgOpclassRecord> implements Record9<Long, Long, String, Long, Long, Long, Long, Boolean, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_opclass.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_opclass.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_opclass.opcmethod</code>.
     */
    public void setOpcmethod(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_opclass.opcmethod</code>.
     */
    public Long getOpcmethod() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_opclass.opcname</code>.
     */
    public void setOpcname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_opclass.opcname</code>.
     */
    public String getOpcname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_opclass.opcnamespace</code>.
     */
    public void setOpcnamespace(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_opclass.opcnamespace</code>.
     */
    public Long getOpcnamespace() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_opclass.opcowner</code>.
     */
    public void setOpcowner(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_opclass.opcowner</code>.
     */
    public Long getOpcowner() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_opclass.opcfamily</code>.
     */
    public void setOpcfamily(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_opclass.opcfamily</code>.
     */
    public Long getOpcfamily() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_opclass.opcintype</code>.
     */
    public void setOpcintype(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_opclass.opcintype</code>.
     */
    public Long getOpcintype() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_opclass.opcdefault</code>.
     */
    public void setOpcdefault(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_opclass.opcdefault</code>.
     */
    public Boolean getOpcdefault() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_opclass.opckeytype</code>.
     */
    public void setOpckeytype(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_opclass.opckeytype</code>.
     */
    public Long getOpckeytype() {
        return (Long) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, Long, String, Long, Long, Long, Long, Boolean, Long> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, Long, String, Long, Long, Long, Long, Boolean, Long> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgOpclass.PG_OPCLASS.OID;
    }

    @Override
    public Field<Long> field2() {
        return PgOpclass.PG_OPCLASS.OPCMETHOD;
    }

    @Override
    public Field<String> field3() {
        return PgOpclass.PG_OPCLASS.OPCNAME;
    }

    @Override
    public Field<Long> field4() {
        return PgOpclass.PG_OPCLASS.OPCNAMESPACE;
    }

    @Override
    public Field<Long> field5() {
        return PgOpclass.PG_OPCLASS.OPCOWNER;
    }

    @Override
    public Field<Long> field6() {
        return PgOpclass.PG_OPCLASS.OPCFAMILY;
    }

    @Override
    public Field<Long> field7() {
        return PgOpclass.PG_OPCLASS.OPCINTYPE;
    }

    @Override
    public Field<Boolean> field8() {
        return PgOpclass.PG_OPCLASS.OPCDEFAULT;
    }

    @Override
    public Field<Long> field9() {
        return PgOpclass.PG_OPCLASS.OPCKEYTYPE;
    }

    @Override
    public Long component1() {
        return getOid();
    }

    @Override
    public Long component2() {
        return getOpcmethod();
    }

    @Override
    public String component3() {
        return getOpcname();
    }

    @Override
    public Long component4() {
        return getOpcnamespace();
    }

    @Override
    public Long component5() {
        return getOpcowner();
    }

    @Override
    public Long component6() {
        return getOpcfamily();
    }

    @Override
    public Long component7() {
        return getOpcintype();
    }

    @Override
    public Boolean component8() {
        return getOpcdefault();
    }

    @Override
    public Long component9() {
        return getOpckeytype();
    }

    @Override
    public Long value1() {
        return getOid();
    }

    @Override
    public Long value2() {
        return getOpcmethod();
    }

    @Override
    public String value3() {
        return getOpcname();
    }

    @Override
    public Long value4() {
        return getOpcnamespace();
    }

    @Override
    public Long value5() {
        return getOpcowner();
    }

    @Override
    public Long value6() {
        return getOpcfamily();
    }

    @Override
    public Long value7() {
        return getOpcintype();
    }

    @Override
    public Boolean value8() {
        return getOpcdefault();
    }

    @Override
    public Long value9() {
        return getOpckeytype();
    }

    @Override
    public PgOpclassRecord value1(Long value) {
        setOid(value);
        return this;
    }

    @Override
    public PgOpclassRecord value2(Long value) {
        setOpcmethod(value);
        return this;
    }

    @Override
    public PgOpclassRecord value3(String value) {
        setOpcname(value);
        return this;
    }

    @Override
    public PgOpclassRecord value4(Long value) {
        setOpcnamespace(value);
        return this;
    }

    @Override
    public PgOpclassRecord value5(Long value) {
        setOpcowner(value);
        return this;
    }

    @Override
    public PgOpclassRecord value6(Long value) {
        setOpcfamily(value);
        return this;
    }

    @Override
    public PgOpclassRecord value7(Long value) {
        setOpcintype(value);
        return this;
    }

    @Override
    public PgOpclassRecord value8(Boolean value) {
        setOpcdefault(value);
        return this;
    }

    @Override
    public PgOpclassRecord value9(Long value) {
        setOpckeytype(value);
        return this;
    }

    @Override
    public PgOpclassRecord values(Long value1, Long value2, String value3, Long value4, Long value5, Long value6, Long value7, Boolean value8, Long value9) {
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
     * Create a detached PgOpclassRecord
     */
    public PgOpclassRecord() {
        super(PgOpclass.PG_OPCLASS);
    }

    /**
     * Create a detached, initialised PgOpclassRecord
     */
    public PgOpclassRecord(Long oid, Long opcmethod, String opcname, Long opcnamespace, Long opcowner, Long opcfamily, Long opcintype, Boolean opcdefault, Long opckeytype) {
        super(PgOpclass.PG_OPCLASS);

        setOid(oid);
        setOpcmethod(opcmethod);
        setOpcname(opcname);
        setOpcnamespace(opcnamespace);
        setOpcowner(opcowner);
        setOpcfamily(opcfamily);
        setOpcintype(opcintype);
        setOpcdefault(opcdefault);
        setOpckeytype(opckeytype);
    }
}
