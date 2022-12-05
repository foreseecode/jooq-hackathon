/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.pg_catalog.tables.records;


import com.verint.mpathy.db.pg_catalog.tables.PgReplicationOrigin;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgReplicationOriginRecord extends UpdatableRecordImpl<PgReplicationOriginRecord> implements Record2<Long, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_replication_origin.roident</code>.
     */
    public void setRoident(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_replication_origin.roident</code>.
     */
    public Long getRoident() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_replication_origin.roname</code>.
     */
    public void setRoname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_replication_origin.roname</code>.
     */
    public String getRoname() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
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
        return PgReplicationOrigin.PG_REPLICATION_ORIGIN.ROIDENT;
    }

    @Override
    public Field<String> field2() {
        return PgReplicationOrigin.PG_REPLICATION_ORIGIN.RONAME;
    }

    @Override
    public Long component1() {
        return getRoident();
    }

    @Override
    public String component2() {
        return getRoname();
    }

    @Override
    public Long value1() {
        return getRoident();
    }

    @Override
    public String value2() {
        return getRoname();
    }

    @Override
    public PgReplicationOriginRecord value1(Long value) {
        setRoident(value);
        return this;
    }

    @Override
    public PgReplicationOriginRecord value2(String value) {
        setRoname(value);
        return this;
    }

    @Override
    public PgReplicationOriginRecord values(Long value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgReplicationOriginRecord
     */
    public PgReplicationOriginRecord() {
        super(PgReplicationOrigin.PG_REPLICATION_ORIGIN);
    }

    /**
     * Create a detached, initialised PgReplicationOriginRecord
     */
    public PgReplicationOriginRecord(Long roident, String roname) {
        super(PgReplicationOrigin.PG_REPLICATION_ORIGIN);

        setRoident(roident);
        setRoname(roname);
    }
}
