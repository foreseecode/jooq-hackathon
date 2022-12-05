/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.pg_catalog.tables;


import com.verint.mpathy.db.pg_catalog.Keys;
import com.verint.mpathy.db.pg_catalog.PgCatalog;
import com.verint.mpathy.db.pg_catalog.tables.records.PgForeignTableRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgForeignTable extends TableImpl<PgForeignTableRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_foreign_table</code>
     */
    public static final PgForeignTable PG_FOREIGN_TABLE = new PgForeignTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgForeignTableRecord> getRecordType() {
        return PgForeignTableRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_foreign_table.ftrelid</code>.
     */
    public final TableField<PgForeignTableRecord, Long> FTRELID = createField(DSL.name("ftrelid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_table.ftserver</code>.
     */
    public final TableField<PgForeignTableRecord, Long> FTSERVER = createField(DSL.name("ftserver"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_foreign_table.ftoptions</code>.
     */
    public final TableField<PgForeignTableRecord, String[]> FTOPTIONS = createField(DSL.name("ftoptions"), SQLDataType.CLOB.getArrayDataType(), this, "");

    private PgForeignTable(Name alias, Table<PgForeignTableRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgForeignTable(Name alias, Table<PgForeignTableRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_foreign_table</code> table
     * reference
     */
    public PgForeignTable(String alias) {
        this(DSL.name(alias), PG_FOREIGN_TABLE);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_foreign_table</code> table
     * reference
     */
    public PgForeignTable(Name alias) {
        this(alias, PG_FOREIGN_TABLE);
    }

    /**
     * Create a <code>pg_catalog.pg_foreign_table</code> table reference
     */
    public PgForeignTable() {
        this(DSL.name("pg_foreign_table"), null);
    }

    public <O extends Record> PgForeignTable(Table<O> child, ForeignKey<O, PgForeignTableRecord> key) {
        super(child, key, PG_FOREIGN_TABLE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<PgForeignTableRecord> getPrimaryKey() {
        return Keys.PG_FOREIGN_TABLE_RELID_INDEX;
    }

    @Override
    public PgForeignTable as(String alias) {
        return new PgForeignTable(DSL.name(alias), this);
    }

    @Override
    public PgForeignTable as(Name alias) {
        return new PgForeignTable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgForeignTable rename(String name) {
        return new PgForeignTable(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgForeignTable rename(Name name) {
        return new PgForeignTable(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, Long, String[]> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
