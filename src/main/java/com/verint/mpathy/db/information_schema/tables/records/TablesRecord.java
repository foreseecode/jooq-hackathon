/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.information_schema.tables.records;


import com.verint.mpathy.db.information_schema.tables.Tables;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TablesRecord extends TableRecordImpl<TablesRecord> implements Record12<String, String, String, String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.tables.table_catalog</code>.
     */
    public void setTableCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.tables.table_catalog</code>.
     */
    public String getTableCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.tables.table_schema</code>.
     */
    public void setTableSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.tables.table_schema</code>.
     */
    public String getTableSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.tables.table_name</code>.
     */
    public void setTableName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.tables.table_name</code>.
     */
    public String getTableName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.tables.table_type</code>.
     */
    public void setTableType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.tables.table_type</code>.
     */
    public String getTableType() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.tables.self_referencing_column_name</code>.
     */
    public void setSelfReferencingColumnName(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema.tables.self_referencing_column_name</code>.
     */
    public String getSelfReferencingColumnName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.tables.reference_generation</code>.
     */
    public void setReferenceGeneration(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.tables.reference_generation</code>.
     */
    public String getReferenceGeneration() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>information_schema.tables.user_defined_type_catalog</code>.
     */
    public void setUserDefinedTypeCatalog(String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>information_schema.tables.user_defined_type_catalog</code>.
     */
    public String getUserDefinedTypeCatalog() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>information_schema.tables.user_defined_type_schema</code>.
     */
    public void setUserDefinedTypeSchema(String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>information_schema.tables.user_defined_type_schema</code>.
     */
    public String getUserDefinedTypeSchema() {
        return (String) get(7);
    }

    /**
     * Setter for <code>information_schema.tables.user_defined_type_name</code>.
     */
    public void setUserDefinedTypeName(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema.tables.user_defined_type_name</code>.
     */
    public String getUserDefinedTypeName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>information_schema.tables.is_insertable_into</code>.
     */
    public void setIsInsertableInto(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>information_schema.tables.is_insertable_into</code>.
     */
    public String getIsInsertableInto() {
        return (String) get(9);
    }

    /**
     * Setter for <code>information_schema.tables.is_typed</code>.
     */
    public void setIsTyped(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>information_schema.tables.is_typed</code>.
     */
    public String getIsTyped() {
        return (String) get(10);
    }

    /**
     * Setter for <code>information_schema.tables.commit_action</code>.
     */
    public void setCommitAction(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>information_schema.tables.commit_action</code>.
     */
    public String getCommitAction() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<String, String, String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<String, String, String, String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Tables.TABLES.TABLE_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return Tables.TABLES.TABLE_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return Tables.TABLES.TABLE_NAME;
    }

    @Override
    public Field<String> field4() {
        return Tables.TABLES.TABLE_TYPE;
    }

    @Override
    public Field<String> field5() {
        return Tables.TABLES.SELF_REFERENCING_COLUMN_NAME;
    }

    @Override
    public Field<String> field6() {
        return Tables.TABLES.REFERENCE_GENERATION;
    }

    @Override
    public Field<String> field7() {
        return Tables.TABLES.USER_DEFINED_TYPE_CATALOG;
    }

    @Override
    public Field<String> field8() {
        return Tables.TABLES.USER_DEFINED_TYPE_SCHEMA;
    }

    @Override
    public Field<String> field9() {
        return Tables.TABLES.USER_DEFINED_TYPE_NAME;
    }

    @Override
    public Field<String> field10() {
        return Tables.TABLES.IS_INSERTABLE_INTO;
    }

    @Override
    public Field<String> field11() {
        return Tables.TABLES.IS_TYPED;
    }

    @Override
    public Field<String> field12() {
        return Tables.TABLES.COMMIT_ACTION;
    }

    @Override
    public String component1() {
        return getTableCatalog();
    }

    @Override
    public String component2() {
        return getTableSchema();
    }

    @Override
    public String component3() {
        return getTableName();
    }

    @Override
    public String component4() {
        return getTableType();
    }

    @Override
    public String component5() {
        return getSelfReferencingColumnName();
    }

    @Override
    public String component6() {
        return getReferenceGeneration();
    }

    @Override
    public String component7() {
        return getUserDefinedTypeCatalog();
    }

    @Override
    public String component8() {
        return getUserDefinedTypeSchema();
    }

    @Override
    public String component9() {
        return getUserDefinedTypeName();
    }

    @Override
    public String component10() {
        return getIsInsertableInto();
    }

    @Override
    public String component11() {
        return getIsTyped();
    }

    @Override
    public String component12() {
        return getCommitAction();
    }

    @Override
    public String value1() {
        return getTableCatalog();
    }

    @Override
    public String value2() {
        return getTableSchema();
    }

    @Override
    public String value3() {
        return getTableName();
    }

    @Override
    public String value4() {
        return getTableType();
    }

    @Override
    public String value5() {
        return getSelfReferencingColumnName();
    }

    @Override
    public String value6() {
        return getReferenceGeneration();
    }

    @Override
    public String value7() {
        return getUserDefinedTypeCatalog();
    }

    @Override
    public String value8() {
        return getUserDefinedTypeSchema();
    }

    @Override
    public String value9() {
        return getUserDefinedTypeName();
    }

    @Override
    public String value10() {
        return getIsInsertableInto();
    }

    @Override
    public String value11() {
        return getIsTyped();
    }

    @Override
    public String value12() {
        return getCommitAction();
    }

    @Override
    public TablesRecord value1(String value) {
        setTableCatalog(value);
        return this;
    }

    @Override
    public TablesRecord value2(String value) {
        setTableSchema(value);
        return this;
    }

    @Override
    public TablesRecord value3(String value) {
        setTableName(value);
        return this;
    }

    @Override
    public TablesRecord value4(String value) {
        setTableType(value);
        return this;
    }

    @Override
    public TablesRecord value5(String value) {
        setSelfReferencingColumnName(value);
        return this;
    }

    @Override
    public TablesRecord value6(String value) {
        setReferenceGeneration(value);
        return this;
    }

    @Override
    public TablesRecord value7(String value) {
        setUserDefinedTypeCatalog(value);
        return this;
    }

    @Override
    public TablesRecord value8(String value) {
        setUserDefinedTypeSchema(value);
        return this;
    }

    @Override
    public TablesRecord value9(String value) {
        setUserDefinedTypeName(value);
        return this;
    }

    @Override
    public TablesRecord value10(String value) {
        setIsInsertableInto(value);
        return this;
    }

    @Override
    public TablesRecord value11(String value) {
        setIsTyped(value);
        return this;
    }

    @Override
    public TablesRecord value12(String value) {
        setCommitAction(value);
        return this;
    }

    @Override
    public TablesRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12) {
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
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TablesRecord
     */
    public TablesRecord() {
        super(Tables.TABLES);
    }

    /**
     * Create a detached, initialised TablesRecord
     */
    public TablesRecord(String tableCatalog, String tableSchema, String tableName, String tableType, String selfReferencingColumnName, String referenceGeneration, String userDefinedTypeCatalog, String userDefinedTypeSchema, String userDefinedTypeName, String isInsertableInto, String isTyped, String commitAction) {
        super(Tables.TABLES);

        setTableCatalog(tableCatalog);
        setTableSchema(tableSchema);
        setTableName(tableName);
        setTableType(tableType);
        setSelfReferencingColumnName(selfReferencingColumnName);
        setReferenceGeneration(referenceGeneration);
        setUserDefinedTypeCatalog(userDefinedTypeCatalog);
        setUserDefinedTypeSchema(userDefinedTypeSchema);
        setUserDefinedTypeName(userDefinedTypeName);
        setIsInsertableInto(isInsertableInto);
        setIsTyped(isTyped);
        setCommitAction(commitAction);
    }
}
