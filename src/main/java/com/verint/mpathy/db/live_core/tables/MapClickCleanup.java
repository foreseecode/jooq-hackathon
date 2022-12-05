/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables;


import com.verint.mpathy.db.live_core.LiveCore;
import com.verint.mpathy.db.live_core.tables.records.MapClickCleanupRecord;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
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
public class MapClickCleanup extends TableImpl<MapClickCleanupRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>live_core.map_click_cleanup</code>
     */
    public static final MapClickCleanup MAP_CLICK_CLEANUP = new MapClickCleanup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MapClickCleanupRecord> getRecordType() {
        return MapClickCleanupRecord.class;
    }

    /**
     * The column <code>live_core.map_click_cleanup.idpage</code>.
     */
    public final TableField<MapClickCleanupRecord, BigDecimal> IDPAGE = createField(DSL.name("idpage"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>live_core.map_click_cleanup.idsession</code>.
     */
    public final TableField<MapClickCleanupRecord, BigDecimal> IDSESSION = createField(DSL.name("idsession"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>live_core.map_click_cleanup.idsite</code>.
     */
    public final TableField<MapClickCleanupRecord, Integer> IDSITE = createField(DSL.name("idsite"), SQLDataType.INTEGER, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<MapClickCleanupRecord, Object> POINT = createField(DSL.name("point"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"path\""), this, "");

    /**
     * The column <code>live_core.map_click_cleanup.time</code>.
     */
    public final TableField<MapClickCleanupRecord, Long> TIME = createField(DSL.name("time"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live_core.map_click_cleanup.tagname</code>.
     */
    public final TableField<MapClickCleanupRecord, String> TAGNAME = createField(DSL.name("tagname"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live_core.map_click_cleanup.viewport_width</code>.
     */
    public final TableField<MapClickCleanupRecord, Long> VIEWPORT_WIDTH = createField(DSL.name("viewport_width"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live_core.map_click_cleanup.xpath</code>.
     */
    public final TableField<MapClickCleanupRecord, String> XPATH = createField(DSL.name("xpath"), SQLDataType.CLOB, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<MapClickCleanupRecord, Object> RELATIVE_POINT = createField(DSL.name("relative_point"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"path\""), this, "");

    /**
     * The column <code>live_core.map_click_cleanup.width</code>.
     */
    public final TableField<MapClickCleanupRecord, Integer> WIDTH = createField(DSL.name("width"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>live_core.map_click_cleanup.height</code>.
     */
    public final TableField<MapClickCleanupRecord, Integer> HEIGHT = createField(DSL.name("height"), SQLDataType.INTEGER, this, "");

    private MapClickCleanup(Name alias, Table<MapClickCleanupRecord> aliased) {
        this(alias, aliased, null);
    }

    private MapClickCleanup(Name alias, Table<MapClickCleanupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Easy access to underlying table in other schemas."), TableOptions.view("create view \"map_click_cleanup\" as  SELECT map_click_cleanup.idpage,\n    map_click_cleanup.idsession,\n    map_click_cleanup.idsite,\n    map_click_cleanup.point,\n    map_click_cleanup.\"time\",\n    map_click_cleanup.tagname,\n    map_click_cleanup.viewport_width,\n    map_click_cleanup.xpath,\n    map_click_cleanup.relative_point,\n    map_click_cleanup.width,\n    map_click_cleanup.height\n   FROM live.map_click_cleanup;"));
    }

    /**
     * Create an aliased <code>live_core.map_click_cleanup</code> table
     * reference
     */
    public MapClickCleanup(String alias) {
        this(DSL.name(alias), MAP_CLICK_CLEANUP);
    }

    /**
     * Create an aliased <code>live_core.map_click_cleanup</code> table
     * reference
     */
    public MapClickCleanup(Name alias) {
        this(alias, MAP_CLICK_CLEANUP);
    }

    /**
     * Create a <code>live_core.map_click_cleanup</code> table reference
     */
    public MapClickCleanup() {
        this(DSL.name("map_click_cleanup"), null);
    }

    public <O extends Record> MapClickCleanup(Table<O> child, ForeignKey<O, MapClickCleanupRecord> key) {
        super(child, key, MAP_CLICK_CLEANUP);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : LiveCore.LIVE_CORE;
    }

    @Override
    public MapClickCleanup as(String alias) {
        return new MapClickCleanup(DSL.name(alias), this);
    }

    @Override
    public MapClickCleanup as(Name alias) {
        return new MapClickCleanup(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MapClickCleanup rename(String name) {
        return new MapClickCleanup(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MapClickCleanup rename(Name name) {
        return new MapClickCleanup(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<BigDecimal, BigDecimal, Integer, Object, Long, String, Long, String, Object, Integer, Integer> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}
