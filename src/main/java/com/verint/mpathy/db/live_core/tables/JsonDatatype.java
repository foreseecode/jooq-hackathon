/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables;


import com.verint.mpathy.db.live_core.LiveCore;
import com.verint.mpathy.db.live_core.tables.records.JsonDatatypeRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * Easy access to underlying table in other schemas.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JsonDatatype extends TableImpl<JsonDatatypeRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>live_core.json_datatype</code>
     */
    public static final JsonDatatype JSON_DATATYPE = new JsonDatatype();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JsonDatatypeRecord> getRecordType() {
        return JsonDatatypeRecord.class;
    }

    /**
     * The column <code>live_core.json_datatype.idjson_datatype</code>.
     */
    public final TableField<JsonDatatypeRecord, Long> IDJSON_DATATYPE = createField(DSL.name("idjson_datatype"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live_core.json_datatype.type_class</code>.
     */
    public final TableField<JsonDatatypeRecord, String> TYPE_CLASS = createField(DSL.name("type_class"), SQLDataType.CLOB, this, "");

    private JsonDatatype(Name alias, Table<JsonDatatypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private JsonDatatype(Name alias, Table<JsonDatatypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Easy access to underlying table in other schemas."), TableOptions.view("create view \"json_datatype\" as  SELECT json_datatype.idjson_datatype,\n    json_datatype.type_class\n   FROM live.json_datatype;"));
    }

    /**
     * Create an aliased <code>live_core.json_datatype</code> table reference
     */
    public JsonDatatype(String alias) {
        this(DSL.name(alias), JSON_DATATYPE);
    }

    /**
     * Create an aliased <code>live_core.json_datatype</code> table reference
     */
    public JsonDatatype(Name alias) {
        this(alias, JSON_DATATYPE);
    }

    /**
     * Create a <code>live_core.json_datatype</code> table reference
     */
    public JsonDatatype() {
        this(DSL.name("json_datatype"), null);
    }

    public <O extends Record> JsonDatatype(Table<O> child, ForeignKey<O, JsonDatatypeRecord> key) {
        super(child, key, JSON_DATATYPE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : LiveCore.LIVE_CORE;
    }

    @Override
    public JsonDatatype as(String alias) {
        return new JsonDatatype(DSL.name(alias), this);
    }

    @Override
    public JsonDatatype as(Name alias) {
        return new JsonDatatype(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonDatatype rename(String name) {
        return new JsonDatatype(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonDatatype rename(Name name) {
        return new JsonDatatype(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
