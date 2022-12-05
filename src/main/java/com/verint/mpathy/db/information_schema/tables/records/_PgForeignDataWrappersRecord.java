/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.information_schema.tables.records;


import com.verint.mpathy.db.information_schema.tables._PgForeignDataWrappers;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class _PgForeignDataWrappersRecord extends TableRecordImpl<_PgForeignDataWrappersRecord> implements Record7<Long, Long, String[], String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema._pg_foreign_data_wrappers.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema._pg_foreign_data_wrappers.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>information_schema._pg_foreign_data_wrappers.fdwowner</code>.
     */
    public void setFdwowner(Long value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema._pg_foreign_data_wrappers.fdwowner</code>.
     */
    public Long getFdwowner() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>information_schema._pg_foreign_data_wrappers.fdwoptions</code>.
     */
    public void setFdwoptions(String[] value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema._pg_foreign_data_wrappers.fdwoptions</code>.
     */
    public String[] getFdwoptions() {
        return (String[]) get(2);
    }

    /**
     * Setter for
     * <code>information_schema._pg_foreign_data_wrappers.foreign_data_wrapper_catalog</code>.
     */
    public void setForeignDataWrapperCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema._pg_foreign_data_wrappers.foreign_data_wrapper_catalog</code>.
     */
    public String getForeignDataWrapperCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema._pg_foreign_data_wrappers.foreign_data_wrapper_name</code>.
     */
    public void setForeignDataWrapperName(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema._pg_foreign_data_wrappers.foreign_data_wrapper_name</code>.
     */
    public String getForeignDataWrapperName() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>information_schema._pg_foreign_data_wrappers.authorization_identifier</code>.
     */
    public void setAuthorizationIdentifier(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>information_schema._pg_foreign_data_wrappers.authorization_identifier</code>.
     */
    public String getAuthorizationIdentifier() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>information_schema._pg_foreign_data_wrappers.foreign_data_wrapper_language</code>.
     */
    public void setForeignDataWrapperLanguage(String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>information_schema._pg_foreign_data_wrappers.foreign_data_wrapper_language</code>.
     */
    public String getForeignDataWrapperLanguage() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, Long, String[], String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Long, Long, String[], String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return _PgForeignDataWrappers._PG_FOREIGN_DATA_WRAPPERS.OID;
    }

    @Override
    public Field<Long> field2() {
        return _PgForeignDataWrappers._PG_FOREIGN_DATA_WRAPPERS.FDWOWNER;
    }

    @Override
    public Field<String[]> field3() {
        return _PgForeignDataWrappers._PG_FOREIGN_DATA_WRAPPERS.FDWOPTIONS;
    }

    @Override
    public Field<String> field4() {
        return _PgForeignDataWrappers._PG_FOREIGN_DATA_WRAPPERS.FOREIGN_DATA_WRAPPER_CATALOG;
    }

    @Override
    public Field<String> field5() {
        return _PgForeignDataWrappers._PG_FOREIGN_DATA_WRAPPERS.FOREIGN_DATA_WRAPPER_NAME;
    }

    @Override
    public Field<String> field6() {
        return _PgForeignDataWrappers._PG_FOREIGN_DATA_WRAPPERS.AUTHORIZATION_IDENTIFIER;
    }

    @Override
    public Field<String> field7() {
        return _PgForeignDataWrappers._PG_FOREIGN_DATA_WRAPPERS.FOREIGN_DATA_WRAPPER_LANGUAGE;
    }

    @Override
    public Long component1() {
        return getOid();
    }

    @Override
    public Long component2() {
        return getFdwowner();
    }

    @Override
    public String[] component3() {
        return getFdwoptions();
    }

    @Override
    public String component4() {
        return getForeignDataWrapperCatalog();
    }

    @Override
    public String component5() {
        return getForeignDataWrapperName();
    }

    @Override
    public String component6() {
        return getAuthorizationIdentifier();
    }

    @Override
    public String component7() {
        return getForeignDataWrapperLanguage();
    }

    @Override
    public Long value1() {
        return getOid();
    }

    @Override
    public Long value2() {
        return getFdwowner();
    }

    @Override
    public String[] value3() {
        return getFdwoptions();
    }

    @Override
    public String value4() {
        return getForeignDataWrapperCatalog();
    }

    @Override
    public String value5() {
        return getForeignDataWrapperName();
    }

    @Override
    public String value6() {
        return getAuthorizationIdentifier();
    }

    @Override
    public String value7() {
        return getForeignDataWrapperLanguage();
    }

    @Override
    public _PgForeignDataWrappersRecord value1(Long value) {
        setOid(value);
        return this;
    }

    @Override
    public _PgForeignDataWrappersRecord value2(Long value) {
        setFdwowner(value);
        return this;
    }

    @Override
    public _PgForeignDataWrappersRecord value3(String[] value) {
        setFdwoptions(value);
        return this;
    }

    @Override
    public _PgForeignDataWrappersRecord value4(String value) {
        setForeignDataWrapperCatalog(value);
        return this;
    }

    @Override
    public _PgForeignDataWrappersRecord value5(String value) {
        setForeignDataWrapperName(value);
        return this;
    }

    @Override
    public _PgForeignDataWrappersRecord value6(String value) {
        setAuthorizationIdentifier(value);
        return this;
    }

    @Override
    public _PgForeignDataWrappersRecord value7(String value) {
        setForeignDataWrapperLanguage(value);
        return this;
    }

    @Override
    public _PgForeignDataWrappersRecord values(Long value1, Long value2, String[] value3, String value4, String value5, String value6, String value7) {
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
     * Create a detached _PgForeignDataWrappersRecord
     */
    public _PgForeignDataWrappersRecord() {
        super(_PgForeignDataWrappers._PG_FOREIGN_DATA_WRAPPERS);
    }

    /**
     * Create a detached, initialised _PgForeignDataWrappersRecord
     */
    public _PgForeignDataWrappersRecord(Long oid, Long fdwowner, String[] fdwoptions, String foreignDataWrapperCatalog, String foreignDataWrapperName, String authorizationIdentifier, String foreignDataWrapperLanguage) {
        super(_PgForeignDataWrappers._PG_FOREIGN_DATA_WRAPPERS);

        setOid(oid);
        setFdwowner(fdwowner);
        setFdwoptions(fdwoptions);
        setForeignDataWrapperCatalog(foreignDataWrapperCatalog);
        setForeignDataWrapperName(foreignDataWrapperName);
        setAuthorizationIdentifier(authorizationIdentifier);
        setForeignDataWrapperLanguage(foreignDataWrapperLanguage);
    }
}
