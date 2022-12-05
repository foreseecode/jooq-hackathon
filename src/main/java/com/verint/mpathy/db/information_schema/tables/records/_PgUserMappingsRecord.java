/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.information_schema.tables.records;


import com.verint.mpathy.db.information_schema.tables._PgUserMappings;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class _PgUserMappingsRecord extends TableRecordImpl<_PgUserMappingsRecord> implements Record7<Long, String[], Long, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema._pg_user_mappings.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema._pg_user_mappings.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>information_schema._pg_user_mappings.umoptions</code>.
     */
    public void setUmoptions(String[] value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema._pg_user_mappings.umoptions</code>.
     */
    public String[] getUmoptions() {
        return (String[]) get(1);
    }

    /**
     * Setter for <code>information_schema._pg_user_mappings.umuser</code>.
     */
    public void setUmuser(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema._pg_user_mappings.umuser</code>.
     */
    public Long getUmuser() {
        return (Long) get(2);
    }

    /**
     * Setter for
     * <code>information_schema._pg_user_mappings.authorization_identifier</code>.
     */
    public void setAuthorizationIdentifier(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema._pg_user_mappings.authorization_identifier</code>.
     */
    public String getAuthorizationIdentifier() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema._pg_user_mappings.foreign_server_catalog</code>.
     */
    public void setForeignServerCatalog(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema._pg_user_mappings.foreign_server_catalog</code>.
     */
    public String getForeignServerCatalog() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>information_schema._pg_user_mappings.foreign_server_name</code>.
     */
    public void setForeignServerName(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>information_schema._pg_user_mappings.foreign_server_name</code>.
     */
    public String getForeignServerName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema._pg_user_mappings.srvowner</code>.
     */
    public void setSrvowner(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema._pg_user_mappings.srvowner</code>.
     */
    public String getSrvowner() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, String[], Long, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Long, String[], Long, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return _PgUserMappings._PG_USER_MAPPINGS.OID;
    }

    @Override
    public Field<String[]> field2() {
        return _PgUserMappings._PG_USER_MAPPINGS.UMOPTIONS;
    }

    @Override
    public Field<Long> field3() {
        return _PgUserMappings._PG_USER_MAPPINGS.UMUSER;
    }

    @Override
    public Field<String> field4() {
        return _PgUserMappings._PG_USER_MAPPINGS.AUTHORIZATION_IDENTIFIER;
    }

    @Override
    public Field<String> field5() {
        return _PgUserMappings._PG_USER_MAPPINGS.FOREIGN_SERVER_CATALOG;
    }

    @Override
    public Field<String> field6() {
        return _PgUserMappings._PG_USER_MAPPINGS.FOREIGN_SERVER_NAME;
    }

    @Override
    public Field<String> field7() {
        return _PgUserMappings._PG_USER_MAPPINGS.SRVOWNER;
    }

    @Override
    public Long component1() {
        return getOid();
    }

    @Override
    public String[] component2() {
        return getUmoptions();
    }

    @Override
    public Long component3() {
        return getUmuser();
    }

    @Override
    public String component4() {
        return getAuthorizationIdentifier();
    }

    @Override
    public String component5() {
        return getForeignServerCatalog();
    }

    @Override
    public String component6() {
        return getForeignServerName();
    }

    @Override
    public String component7() {
        return getSrvowner();
    }

    @Override
    public Long value1() {
        return getOid();
    }

    @Override
    public String[] value2() {
        return getUmoptions();
    }

    @Override
    public Long value3() {
        return getUmuser();
    }

    @Override
    public String value4() {
        return getAuthorizationIdentifier();
    }

    @Override
    public String value5() {
        return getForeignServerCatalog();
    }

    @Override
    public String value6() {
        return getForeignServerName();
    }

    @Override
    public String value7() {
        return getSrvowner();
    }

    @Override
    public _PgUserMappingsRecord value1(Long value) {
        setOid(value);
        return this;
    }

    @Override
    public _PgUserMappingsRecord value2(String[] value) {
        setUmoptions(value);
        return this;
    }

    @Override
    public _PgUserMappingsRecord value3(Long value) {
        setUmuser(value);
        return this;
    }

    @Override
    public _PgUserMappingsRecord value4(String value) {
        setAuthorizationIdentifier(value);
        return this;
    }

    @Override
    public _PgUserMappingsRecord value5(String value) {
        setForeignServerCatalog(value);
        return this;
    }

    @Override
    public _PgUserMappingsRecord value6(String value) {
        setForeignServerName(value);
        return this;
    }

    @Override
    public _PgUserMappingsRecord value7(String value) {
        setSrvowner(value);
        return this;
    }

    @Override
    public _PgUserMappingsRecord values(Long value1, String[] value2, Long value3, String value4, String value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached _PgUserMappingsRecord
     */
    public _PgUserMappingsRecord() {
        super(_PgUserMappings._PG_USER_MAPPINGS);
    }

    /**
     * Create a detached, initialised _PgUserMappingsRecord
     */
    public _PgUserMappingsRecord(Long oid, String[] umoptions, Long umuser, String authorizationIdentifier, String foreignServerCatalog, String foreignServerName, String srvowner) {
        super(_PgUserMappings._PG_USER_MAPPINGS);

        setOid(oid);
        setUmoptions(umoptions);
        setUmuser(umuser);
        setAuthorizationIdentifier(authorizationIdentifier);
        setForeignServerCatalog(foreignServerCatalog);
        setForeignServerName(foreignServerName);
        setSrvowner(srvowner);
    }
}
