/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables;


import com.verint.mpathy.db.live.Live;
import com.verint.mpathy.db.live.tables.records.MapClickPathinfoRecord;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row12;
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
public class MapClickPathinfo extends TableImpl<MapClickPathinfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>live.map_click_pathinfo</code>
     */
    public static final MapClickPathinfo MAP_CLICK_PATHINFO = new MapClickPathinfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MapClickPathinfoRecord> getRecordType() {
        return MapClickPathinfoRecord.class;
    }

    /**
     * The column <code>live.map_click_pathinfo.idpathinfo_plain</code>. ident
     * of the pathinfo.
     */
    public final TableField<MapClickPathinfoRecord, String> IDPATHINFO_PLAIN = createField(DSL.name("idpathinfo_plain"), SQLDataType.CLOB.nullable(false), this, "ident of the pathinfo.");

    /**
     * The column <code>live.map_click_pathinfo.idpage_name</code>. ident of the
     * page.
     */
    public final TableField<MapClickPathinfoRecord, Long> IDPAGE_NAME = createField(DSL.name("idpage_name"), SQLDataType.BIGINT.nullable(false), this, "ident of the page.");

    /**
     * The column <code>live.map_click_pathinfo.idsite</code>. ident of the
     * site.
     */
    public final TableField<MapClickPathinfoRecord, Integer> IDSITE = createField(DSL.name("idsite"), SQLDataType.INTEGER.nullable(false), this, "ident of the site.");

    /**
     * The column <code>live.map_click_pathinfo.abs_width</code>. absolute width
     * of the container.
     */
    public final TableField<MapClickPathinfoRecord, Integer> ABS_WIDTH = createField(DSL.name("abs_width"), SQLDataType.INTEGER, this, "absolute width of the container.");

    /**
     * The column <code>live.map_click_pathinfo.abs_height</code>. absolute
     * height of the container.
     */
    public final TableField<MapClickPathinfoRecord, Integer> ABS_HEIGHT = createField(DSL.name("abs_height"), SQLDataType.INTEGER, this, "absolute height of the container.");

    /**
     * The column <code>live.map_click_pathinfo.abs_x</code>. absolute
     * position(x) of the left top corner in px of container.
     */
    public final TableField<MapClickPathinfoRecord, Integer> ABS_X = createField(DSL.name("abs_x"), SQLDataType.INTEGER.nullable(false), this, "absolute position(x) of the left top corner in px of container.");

    /**
     * The column <code>live.map_click_pathinfo.abs_y</code>. absolute
     * position(y) of the left top corner in px of container.
     */
    public final TableField<MapClickPathinfoRecord, Integer> ABS_Y = createField(DSL.name("abs_y"), SQLDataType.INTEGER.nullable(false), this, "absolute position(y) of the left top corner in px of container.");

    /**
     * The column <code>live.map_click_pathinfo.rel_x</code>. relative
     * position(x) of the left top corner in px of container in relation to the
     * upper parent.
     */
    public final TableField<MapClickPathinfoRecord, Integer> REL_X = createField(DSL.name("rel_x"), SQLDataType.INTEGER.nullable(false), this, "relative position(x) of the left top corner in px of container in relation to the upper parent.");

    /**
     * The column <code>live.map_click_pathinfo.rel_y</code>. relative
     * position(y) of the left top corner in px of container in relation to the
     * upper parent.
     */
    public final TableField<MapClickPathinfoRecord, Integer> REL_Y = createField(DSL.name("rel_y"), SQLDataType.INTEGER.nullable(false), this, "relative position(y) of the left top corner in px of container in relation to the upper parent.");

    /**
     * The column <code>live.map_click_pathinfo.relp_width</code>. relative
     * width of the element in relation to the parent container
     */
    public final TableField<MapClickPathinfoRecord, BigDecimal> RELP_WIDTH = createField(DSL.name("relp_width"), SQLDataType.NUMERIC.nullable(false), this, "relative width of the element in relation to the parent container");

    /**
     * The column <code>live.map_click_pathinfo.relp_x</code>. relative x offset
     * factor as a relation of the percentual width in relation to the parent
     * container
     */
    public final TableField<MapClickPathinfoRecord, BigDecimal> RELP_X = createField(DSL.name("relp_x"), SQLDataType.NUMERIC.nullable(false), this, "relative x offset factor as a relation of the percentual width in relation to the parent container");

    /**
     * The column <code>live.map_click_pathinfo.idpathinfo</code>. added new id
     * for compressed xpath format see MPATHY-2305
     */
    public final TableField<MapClickPathinfoRecord, Long> IDPATHINFO = createField(DSL.name("idpathinfo"), SQLDataType.BIGINT.nullable(false).identity(true), this, "added new id for compressed xpath format see MPATHY-2305");

    private MapClickPathinfo(Name alias, Table<MapClickPathinfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private MapClickPathinfo(Name alias, Table<MapClickPathinfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>live.map_click_pathinfo</code> table reference
     */
    public MapClickPathinfo(String alias) {
        this(DSL.name(alias), MAP_CLICK_PATHINFO);
    }

    /**
     * Create an aliased <code>live.map_click_pathinfo</code> table reference
     */
    public MapClickPathinfo(Name alias) {
        this(alias, MAP_CLICK_PATHINFO);
    }

    /**
     * Create a <code>live.map_click_pathinfo</code> table reference
     */
    public MapClickPathinfo() {
        this(DSL.name("map_click_pathinfo"), null);
    }

    public <O extends Record> MapClickPathinfo(Table<O> child, ForeignKey<O, MapClickPathinfoRecord> key) {
        super(child, key, MAP_CLICK_PATHINFO);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Live.LIVE;
    }

    @Override
    public Identity<MapClickPathinfoRecord, Long> getIdentity() {
        return (Identity<MapClickPathinfoRecord, Long>) super.getIdentity();
    }

    @Override
    public MapClickPathinfo as(String alias) {
        return new MapClickPathinfo(DSL.name(alias), this);
    }

    @Override
    public MapClickPathinfo as(Name alias) {
        return new MapClickPathinfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MapClickPathinfo rename(String name) {
        return new MapClickPathinfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MapClickPathinfo rename(Name name) {
        return new MapClickPathinfo(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<String, Long, Integer, Integer, Integer, Integer, Integer, Integer, Integer, BigDecimal, BigDecimal, Long> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
}
