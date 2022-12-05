/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables;


import com.verint.mpathy.db.live.Live;
import com.verint.mpathy.db.live.tables.records.CustomparameterSqlqueryRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CustomparameterSqlquery extends TableImpl<CustomparameterSqlqueryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>live.customparameter_sqlquery</code>
     */
    public static final CustomparameterSqlquery CUSTOMPARAMETER_SQLQUERY = new CustomparameterSqlquery();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CustomparameterSqlqueryRecord> getRecordType() {
        return CustomparameterSqlqueryRecord.class;
    }

    /**
     * The column <code>live.customparameter_sqlquery.idcp</code>.
     */
    public final TableField<CustomparameterSqlqueryRecord, Long> IDCP = createField(DSL.name("idcp"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>live.customparameter_sqlquery.query</code>.
     */
    public final TableField<CustomparameterSqlqueryRecord, String> QUERY = createField(DSL.name("query"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>live.customparameter_sqlquery.rawquery</code>.
     */
    public final TableField<CustomparameterSqlqueryRecord, String> RAWQUERY = createField(DSL.name("rawquery"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>live.customparameter_sqlquery.useRawQuery</code>.
     */
    public final TableField<CustomparameterSqlqueryRecord, Boolean> USERAWQUERY = createField(DSL.name("useRawQuery"), SQLDataType.BOOLEAN.defaultValue(DSL.field("false", SQLDataType.BOOLEAN)), this, "");

    private CustomparameterSqlquery(Name alias, Table<CustomparameterSqlqueryRecord> aliased) {
        this(alias, aliased, null);
    }

    private CustomparameterSqlquery(Name alias, Table<CustomparameterSqlqueryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>live.customparameter_sqlquery</code> table
     * reference
     */
    public CustomparameterSqlquery(String alias) {
        this(DSL.name(alias), CUSTOMPARAMETER_SQLQUERY);
    }

    /**
     * Create an aliased <code>live.customparameter_sqlquery</code> table
     * reference
     */
    public CustomparameterSqlquery(Name alias) {
        this(alias, CUSTOMPARAMETER_SQLQUERY);
    }

    /**
     * Create a <code>live.customparameter_sqlquery</code> table reference
     */
    public CustomparameterSqlquery() {
        this(DSL.name("customparameter_sqlquery"), null);
    }

    public <O extends Record> CustomparameterSqlquery(Table<O> child, ForeignKey<O, CustomparameterSqlqueryRecord> key) {
        super(child, key, CUSTOMPARAMETER_SQLQUERY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Live.LIVE;
    }

    @Override
    public CustomparameterSqlquery as(String alias) {
        return new CustomparameterSqlquery(DSL.name(alias), this);
    }

    @Override
    public CustomparameterSqlquery as(Name alias) {
        return new CustomparameterSqlquery(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CustomparameterSqlquery rename(String name) {
        return new CustomparameterSqlquery(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CustomparameterSqlquery rename(Name name) {
        return new CustomparameterSqlquery(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, String, String, Boolean> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
