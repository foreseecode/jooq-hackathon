/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.pg_catalog.tables.records;


import com.verint.mpathy.db.pg_catalog.tables.PgAvailableExtensionVersions;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgAvailableExtensionVersionsRecord extends TableRecordImpl<PgAvailableExtensionVersionsRecord> implements Record8<String, String, Boolean, Boolean, Boolean, String, String[], String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_available_extension_versions.name</code>.
     */
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_available_extension_versions.name</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_available_extension_versions.version</code>.
     */
    public void setVersion(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_available_extension_versions.version</code>.
     */
    public String getVersion() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_available_extension_versions.superuser</code>.
     */
    public void setSuperuser(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_available_extension_versions.superuser</code>.
     */
    public Boolean getSuperuser() {
        return (Boolean) get(2);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_available_extension_versions.trusted</code>.
     */
    public void setTrusted(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_available_extension_versions.trusted</code>.
     */
    public Boolean getTrusted() {
        return (Boolean) get(3);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_available_extension_versions.relocatable</code>.
     */
    public void setRelocatable(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_available_extension_versions.relocatable</code>.
     */
    public Boolean getRelocatable() {
        return (Boolean) get(4);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_available_extension_versions.schema</code>.
     */
    public void setSchema(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_available_extension_versions.schema</code>.
     */
    public String getSchema() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_available_extension_versions.requires</code>.
     */
    public void setRequires(String[] value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_available_extension_versions.requires</code>.
     */
    public String[] getRequires() {
        return (String[]) get(6);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_available_extension_versions.comment</code>.
     */
    public void setComment(String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_available_extension_versions.comment</code>.
     */
    public String getComment() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, String, Boolean, Boolean, Boolean, String, String[], String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<String, String, Boolean, Boolean, Boolean, String, String[], String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return PgAvailableExtensionVersions.PG_AVAILABLE_EXTENSION_VERSIONS.NAME;
    }

    @Override
    public Field<String> field2() {
        return PgAvailableExtensionVersions.PG_AVAILABLE_EXTENSION_VERSIONS.VERSION;
    }

    @Override
    public Field<Boolean> field3() {
        return PgAvailableExtensionVersions.PG_AVAILABLE_EXTENSION_VERSIONS.SUPERUSER;
    }

    @Override
    public Field<Boolean> field4() {
        return PgAvailableExtensionVersions.PG_AVAILABLE_EXTENSION_VERSIONS.TRUSTED;
    }

    @Override
    public Field<Boolean> field5() {
        return PgAvailableExtensionVersions.PG_AVAILABLE_EXTENSION_VERSIONS.RELOCATABLE;
    }

    @Override
    public Field<String> field6() {
        return PgAvailableExtensionVersions.PG_AVAILABLE_EXTENSION_VERSIONS.SCHEMA;
    }

    @Override
    public Field<String[]> field7() {
        return PgAvailableExtensionVersions.PG_AVAILABLE_EXTENSION_VERSIONS.REQUIRES;
    }

    @Override
    public Field<String> field8() {
        return PgAvailableExtensionVersions.PG_AVAILABLE_EXTENSION_VERSIONS.COMMENT;
    }

    @Override
    public String component1() {
        return getName();
    }

    @Override
    public String component2() {
        return getVersion();
    }

    @Override
    public Boolean component3() {
        return getSuperuser();
    }

    @Override
    public Boolean component4() {
        return getTrusted();
    }

    @Override
    public Boolean component5() {
        return getRelocatable();
    }

    @Override
    public String component6() {
        return getSchema();
    }

    @Override
    public String[] component7() {
        return getRequires();
    }

    @Override
    public String component8() {
        return getComment();
    }

    @Override
    public String value1() {
        return getName();
    }

    @Override
    public String value2() {
        return getVersion();
    }

    @Override
    public Boolean value3() {
        return getSuperuser();
    }

    @Override
    public Boolean value4() {
        return getTrusted();
    }

    @Override
    public Boolean value5() {
        return getRelocatable();
    }

    @Override
    public String value6() {
        return getSchema();
    }

    @Override
    public String[] value7() {
        return getRequires();
    }

    @Override
    public String value8() {
        return getComment();
    }

    @Override
    public PgAvailableExtensionVersionsRecord value1(String value) {
        setName(value);
        return this;
    }

    @Override
    public PgAvailableExtensionVersionsRecord value2(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public PgAvailableExtensionVersionsRecord value3(Boolean value) {
        setSuperuser(value);
        return this;
    }

    @Override
    public PgAvailableExtensionVersionsRecord value4(Boolean value) {
        setTrusted(value);
        return this;
    }

    @Override
    public PgAvailableExtensionVersionsRecord value5(Boolean value) {
        setRelocatable(value);
        return this;
    }

    @Override
    public PgAvailableExtensionVersionsRecord value6(String value) {
        setSchema(value);
        return this;
    }

    @Override
    public PgAvailableExtensionVersionsRecord value7(String[] value) {
        setRequires(value);
        return this;
    }

    @Override
    public PgAvailableExtensionVersionsRecord value8(String value) {
        setComment(value);
        return this;
    }

    @Override
    public PgAvailableExtensionVersionsRecord values(String value1, String value2, Boolean value3, Boolean value4, Boolean value5, String value6, String[] value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgAvailableExtensionVersionsRecord
     */
    public PgAvailableExtensionVersionsRecord() {
        super(PgAvailableExtensionVersions.PG_AVAILABLE_EXTENSION_VERSIONS);
    }

    /**
     * Create a detached, initialised PgAvailableExtensionVersionsRecord
     */
    public PgAvailableExtensionVersionsRecord(String name, String version, Boolean superuser, Boolean trusted, Boolean relocatable, String schema, String[] requires, String comment) {
        super(PgAvailableExtensionVersions.PG_AVAILABLE_EXTENSION_VERSIONS);

        setName(name);
        setVersion(version);
        setSuperuser(superuser);
        setTrusted(trusted);
        setRelocatable(relocatable);
        setSchema(schema);
        setRequires(requires);
        setComment(comment);
    }
}
