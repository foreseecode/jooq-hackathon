/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.pg_catalog.tables.records;


import com.verint.mpathy.db.pg_catalog.tables.PgGetMultixactMembers;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgGetMultixactMembersRecord extends TableRecordImpl<PgGetMultixactMembersRecord> implements Record2<Long, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_get_multixact_members.xid</code>.
     */
    public void setXid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_multixact_members.xid</code>.
     */
    public Long getXid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_multixact_members.mode</code>.
     */
    public void setMode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_multixact_members.mode</code>.
     */
    public String getMode() {
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
        return PgGetMultixactMembers.PG_GET_MULTIXACT_MEMBERS.XID;
    }

    @Override
    public Field<String> field2() {
        return PgGetMultixactMembers.PG_GET_MULTIXACT_MEMBERS.MODE;
    }

    @Override
    public Long component1() {
        return getXid();
    }

    @Override
    public String component2() {
        return getMode();
    }

    @Override
    public Long value1() {
        return getXid();
    }

    @Override
    public String value2() {
        return getMode();
    }

    @Override
    public PgGetMultixactMembersRecord value1(Long value) {
        setXid(value);
        return this;
    }

    @Override
    public PgGetMultixactMembersRecord value2(String value) {
        setMode(value);
        return this;
    }

    @Override
    public PgGetMultixactMembersRecord values(Long value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgGetMultixactMembersRecord
     */
    public PgGetMultixactMembersRecord() {
        super(PgGetMultixactMembers.PG_GET_MULTIXACT_MEMBERS);
    }

    /**
     * Create a detached, initialised PgGetMultixactMembersRecord
     */
    public PgGetMultixactMembersRecord(Long xid, String mode) {
        super(PgGetMultixactMembers.PG_GET_MULTIXACT_MEMBERS);

        setXid(xid);
        setMode(mode);
    }
}
