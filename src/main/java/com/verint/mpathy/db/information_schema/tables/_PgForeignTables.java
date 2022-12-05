/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.information_schema.tables;


import com.verint.mpathy.db.information_schema.InformationSchema;
import com.verint.mpathy.db.information_schema.tables.records._PgForeignTablesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
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
public class _PgForeignTables extends TableImpl<_PgForeignTablesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema._pg_foreign_tables</code>
     */
    public static final _PgForeignTables _PG_FOREIGN_TABLES = new _PgForeignTables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<_PgForeignTablesRecord> getRecordType() {
        return _PgForeignTablesRecord.class;
    }

    /**
     * The column
     * <code>information_schema._pg_foreign_tables.foreign_table_catalog</code>.
     */
    public final TableField<_PgForeignTablesRecord, String> FOREIGN_TABLE_CATALOG = createField(DSL.name("foreign_table_catalog"), com.verint.mpathy.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_tables.foreign_table_schema</code>.
     */
    public final TableField<_PgForeignTablesRecord, String> FOREIGN_TABLE_SCHEMA = createField(DSL.name("foreign_table_schema"), com.verint.mpathy.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_tables.foreign_table_name</code>.
     */
    public final TableField<_PgForeignTablesRecord, String> FOREIGN_TABLE_NAME = createField(DSL.name("foreign_table_name"), com.verint.mpathy.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema._pg_foreign_tables.ftoptions</code>.
     */
    public final TableField<_PgForeignTablesRecord, String[]> FTOPTIONS = createField(DSL.name("ftoptions"), SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_tables.foreign_server_catalog</code>.
     */
    public final TableField<_PgForeignTablesRecord, String> FOREIGN_SERVER_CATALOG = createField(DSL.name("foreign_server_catalog"), com.verint.mpathy.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_tables.foreign_server_name</code>.
     */
    public final TableField<_PgForeignTablesRecord, String> FOREIGN_SERVER_NAME = createField(DSL.name("foreign_server_name"), com.verint.mpathy.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_tables.authorization_identifier</code>.
     */
    public final TableField<_PgForeignTablesRecord, String> AUTHORIZATION_IDENTIFIER = createField(DSL.name("authorization_identifier"), com.verint.mpathy.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private _PgForeignTables(Name alias, Table<_PgForeignTablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private _PgForeignTables(Name alias, Table<_PgForeignTablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"_pg_foreign_tables\" as  SELECT (current_database())::information_schema.sql_identifier AS foreign_table_catalog,\n    (n.nspname)::information_schema.sql_identifier AS foreign_table_schema,\n    (c.relname)::information_schema.sql_identifier AS foreign_table_name,\n    t.ftoptions,\n    (current_database())::information_schema.sql_identifier AS foreign_server_catalog,\n    (s.srvname)::information_schema.sql_identifier AS foreign_server_name,\n    (u.rolname)::information_schema.sql_identifier AS authorization_identifier\n   FROM pg_foreign_table t,\n    pg_foreign_server s,\n    pg_foreign_data_wrapper w,\n    pg_authid u,\n    pg_namespace n,\n    pg_class c\n  WHERE ((w.oid = s.srvfdw) AND (u.oid = c.relowner) AND (pg_has_role(c.relowner, 'USAGE'::text) OR has_table_privilege(c.oid, 'SELECT, INSERT, UPDATE, DELETE, TRUNCATE, REFERENCES, TRIGGER'::text) OR has_any_column_privilege(c.oid, 'SELECT, INSERT, UPDATE, REFERENCES'::text)) AND (n.oid = c.relnamespace) AND (c.oid = t.ftrelid) AND (c.relkind = 'f'::\"char\") AND (s.oid = t.ftserver));"));
    }

    /**
     * Create an aliased <code>information_schema._pg_foreign_tables</code>
     * table reference
     */
    public _PgForeignTables(String alias) {
        this(DSL.name(alias), _PG_FOREIGN_TABLES);
    }

    /**
     * Create an aliased <code>information_schema._pg_foreign_tables</code>
     * table reference
     */
    public _PgForeignTables(Name alias) {
        this(alias, _PG_FOREIGN_TABLES);
    }

    /**
     * Create a <code>information_schema._pg_foreign_tables</code> table
     * reference
     */
    public _PgForeignTables() {
        this(DSL.name("_pg_foreign_tables"), null);
    }

    public <O extends Record> _PgForeignTables(Table<O> child, ForeignKey<O, _PgForeignTablesRecord> key) {
        super(child, key, _PG_FOREIGN_TABLES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public _PgForeignTables as(String alias) {
        return new _PgForeignTables(DSL.name(alias), this);
    }

    @Override
    public _PgForeignTables as(Name alias) {
        return new _PgForeignTables(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public _PgForeignTables rename(String name) {
        return new _PgForeignTables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public _PgForeignTables rename(Name name) {
        return new _PgForeignTables(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String[], String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
