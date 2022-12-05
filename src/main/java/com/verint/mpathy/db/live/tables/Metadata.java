/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables;


import com.verint.mpathy.db.live.Live;
import com.verint.mpathy.db.live.tables.records.MetadataRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Metadata extends TableImpl<MetadataRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>live.metadata</code>
     */
    public static final Metadata METADATA = new Metadata();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MetadataRecord> getRecordType() {
        return MetadataRecord.class;
    }

    /**
     * The column <code>live.metadata.idmetadata</code>.
     */
    public final TableField<MetadataRecord, Long> IDMETADATA = createField(DSL.name("idmetadata"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>live.metadata.name</code>.
     */
    public final TableField<MetadataRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    private Metadata(Name alias, Table<MetadataRecord> aliased) {
        this(alias, aliased, null);
    }

    private Metadata(Name alias, Table<MetadataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>live.metadata</code> table reference
     */
    public Metadata(String alias) {
        this(DSL.name(alias), METADATA);
    }

    /**
     * Create an aliased <code>live.metadata</code> table reference
     */
    public Metadata(Name alias) {
        this(alias, METADATA);
    }

    /**
     * Create a <code>live.metadata</code> table reference
     */
    public Metadata() {
        this(DSL.name("metadata"), null);
    }

    public <O extends Record> Metadata(Table<O> child, ForeignKey<O, MetadataRecord> key) {
        super(child, key, METADATA);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Live.LIVE;
    }

    @Override
    public Identity<MetadataRecord, Long> getIdentity() {
        return (Identity<MetadataRecord, Long>) super.getIdentity();
    }

    @Override
    public Metadata as(String alias) {
        return new Metadata(DSL.name(alias), this);
    }

    @Override
    public Metadata as(Name alias) {
        return new Metadata(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Metadata rename(String name) {
        return new Metadata(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Metadata rename(Name name) {
        return new Metadata(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
