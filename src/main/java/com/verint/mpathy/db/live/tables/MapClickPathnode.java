/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables;


import com.verint.mpathy.db.live.Live;
import com.verint.mpathy.db.live.tables.records.MapClickPathnodeRecord;

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
public class MapClickPathnode extends TableImpl<MapClickPathnodeRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>live.map_click_pathnode</code>
     */
    public static final MapClickPathnode MAP_CLICK_PATHNODE = new MapClickPathnode();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MapClickPathnodeRecord> getRecordType() {
        return MapClickPathnodeRecord.class;
    }

    /**
     * The column <code>live.map_click_pathnode.idnode</code>. ident of the
     * pathnode.
     */
    public final TableField<MapClickPathnodeRecord, Long> IDNODE = createField(DSL.name("idnode"), SQLDataType.BIGINT.nullable(false).identity(true), this, "ident of the pathnode.");

    /**
     * The column <code>live.map_click_pathnode.nodename</code>. name and
     * attributes of the document node.
     */
    public final TableField<MapClickPathnodeRecord, String> NODENAME = createField(DSL.name("nodename"), SQLDataType.CLOB.nullable(false), this, "name and attributes of the document node.");

    private MapClickPathnode(Name alias, Table<MapClickPathnodeRecord> aliased) {
        this(alias, aliased, null);
    }

    private MapClickPathnode(Name alias, Table<MapClickPathnodeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>live.map_click_pathnode</code> table reference
     */
    public MapClickPathnode(String alias) {
        this(DSL.name(alias), MAP_CLICK_PATHNODE);
    }

    /**
     * Create an aliased <code>live.map_click_pathnode</code> table reference
     */
    public MapClickPathnode(Name alias) {
        this(alias, MAP_CLICK_PATHNODE);
    }

    /**
     * Create a <code>live.map_click_pathnode</code> table reference
     */
    public MapClickPathnode() {
        this(DSL.name("map_click_pathnode"), null);
    }

    public <O extends Record> MapClickPathnode(Table<O> child, ForeignKey<O, MapClickPathnodeRecord> key) {
        super(child, key, MAP_CLICK_PATHNODE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Live.LIVE;
    }

    @Override
    public Identity<MapClickPathnodeRecord, Long> getIdentity() {
        return (Identity<MapClickPathnodeRecord, Long>) super.getIdentity();
    }

    @Override
    public MapClickPathnode as(String alias) {
        return new MapClickPathnode(DSL.name(alias), this);
    }

    @Override
    public MapClickPathnode as(Name alias) {
        return new MapClickPathnode(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MapClickPathnode rename(String name) {
        return new MapClickPathnode(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MapClickPathnode rename(Name name) {
        return new MapClickPathnode(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
