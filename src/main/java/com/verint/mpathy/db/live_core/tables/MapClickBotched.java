/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables;


import com.verint.mpathy.db.live_core.LiveCore;
import com.verint.mpathy.db.live_core.tables.records.MapClickBotchedRecord;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row15;
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
public class MapClickBotched extends TableImpl<MapClickBotchedRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>live_core.map_click_botched</code>
     */
    public static final MapClickBotched MAP_CLICK_BOTCHED = new MapClickBotched();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MapClickBotchedRecord> getRecordType() {
        return MapClickBotchedRecord.class;
    }

    /**
     * The column <code>live_core.map_click_botched.idpage</code>.
     */
    public final TableField<MapClickBotchedRecord, BigDecimal> IDPAGE = createField(DSL.name("idpage"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>live_core.map_click_botched.idsession</code>.
     */
    public final TableField<MapClickBotchedRecord, BigDecimal> IDSESSION = createField(DSL.name("idsession"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>live_core.map_click_botched.idsite</code>.
     */
    public final TableField<MapClickBotchedRecord, Integer> IDSITE = createField(DSL.name("idsite"), SQLDataType.INTEGER, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<MapClickBotchedRecord, Object> POINT = createField(DSL.name("point"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"path\""), this, "");

    /**
     * The column <code>live_core.map_click_botched.time</code>.
     */
    public final TableField<MapClickBotchedRecord, Long> TIME = createField(DSL.name("time"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live_core.map_click_botched.tagname</code>.
     */
    public final TableField<MapClickBotchedRecord, String> TAGNAME = createField(DSL.name("tagname"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live_core.map_click_botched.viewport_width</code>.
     */
    public final TableField<MapClickBotchedRecord, Long> VIEWPORT_WIDTH = createField(DSL.name("viewport_width"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live_core.map_click_botched.xpath</code>.
     */
    public final TableField<MapClickBotchedRecord, String> XPATH = createField(DSL.name("xpath"), SQLDataType.CLOB, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<MapClickBotchedRecord, Object> RELATIVE_POINT = createField(DSL.name("relative_point"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"path\""), this, "");

    /**
     * The column <code>live_core.map_click_botched.width</code>.
     */
    public final TableField<MapClickBotchedRecord, Integer> WIDTH = createField(DSL.name("width"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>live_core.map_click_botched.height</code>.
     */
    public final TableField<MapClickBotchedRecord, Integer> HEIGHT = createField(DSL.name("height"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>live_core.map_click_botched.path_idpathinfo</code>.
     */
    public final TableField<MapClickBotchedRecord, Long> PATH_IDPATHINFO = createField(DSL.name("path_idpathinfo"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live_core.map_click_botched.path_idpathinfo0</code>.
     */
    public final TableField<MapClickBotchedRecord, Long> PATH_IDPATHINFO0 = createField(DSL.name("path_idpathinfo0"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live_core.map_click_botched.path_idpathinfo1</code>.
     */
    public final TableField<MapClickBotchedRecord, Long> PATH_IDPATHINFO1 = createField(DSL.name("path_idpathinfo1"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live_core.map_click_botched.path_idpathinfo2</code>.
     */
    public final TableField<MapClickBotchedRecord, Long> PATH_IDPATHINFO2 = createField(DSL.name("path_idpathinfo2"), SQLDataType.BIGINT, this, "");

    private MapClickBotched(Name alias, Table<MapClickBotchedRecord> aliased) {
        this(alias, aliased, null);
    }

    private MapClickBotched(Name alias, Table<MapClickBotchedRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Easy access to underlying table in other schemas."), TableOptions.view("create view \"map_click_botched\" as  SELECT map_click_botched.idpage,\n    map_click_botched.idsession,\n    map_click_botched.idsite,\n    map_click_botched.point,\n    map_click_botched.\"time\",\n    map_click_botched.tagname,\n    map_click_botched.viewport_width,\n    map_click_botched.xpath,\n    map_click_botched.relative_point,\n    map_click_botched.width,\n    map_click_botched.height,\n    map_click_botched.path_idpathinfo,\n    map_click_botched.path_idpathinfo0,\n    map_click_botched.path_idpathinfo1,\n    map_click_botched.path_idpathinfo2\n   FROM live.map_click_botched;"));
    }

    /**
     * Create an aliased <code>live_core.map_click_botched</code> table
     * reference
     */
    public MapClickBotched(String alias) {
        this(DSL.name(alias), MAP_CLICK_BOTCHED);
    }

    /**
     * Create an aliased <code>live_core.map_click_botched</code> table
     * reference
     */
    public MapClickBotched(Name alias) {
        this(alias, MAP_CLICK_BOTCHED);
    }

    /**
     * Create a <code>live_core.map_click_botched</code> table reference
     */
    public MapClickBotched() {
        this(DSL.name("map_click_botched"), null);
    }

    public <O extends Record> MapClickBotched(Table<O> child, ForeignKey<O, MapClickBotchedRecord> key) {
        super(child, key, MAP_CLICK_BOTCHED);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : LiveCore.LIVE_CORE;
    }

    @Override
    public MapClickBotched as(String alias) {
        return new MapClickBotched(DSL.name(alias), this);
    }

    @Override
    public MapClickBotched as(Name alias) {
        return new MapClickBotched(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MapClickBotched rename(String name) {
        return new MapClickBotched(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MapClickBotched rename(Name name) {
        return new MapClickBotched(name, null);
    }

    // -------------------------------------------------------------------------
    // Row15 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row15<BigDecimal, BigDecimal, Integer, Object, Long, String, Long, String, Object, Integer, Integer, Long, Long, Long, Long> fieldsRow() {
        return (Row15) super.fieldsRow();
    }
}
