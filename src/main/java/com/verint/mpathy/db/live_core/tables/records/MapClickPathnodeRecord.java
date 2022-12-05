/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables.records;


import com.verint.mpathy.db.live_core.tables.MapClickPathnode;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * Easy access to underlying table in other schemas.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MapClickPathnodeRecord extends TableRecordImpl<MapClickPathnodeRecord> implements Record2<Long, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>live_core.map_click_pathnode.idnode</code>.
     */
    public void setIdnode(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>live_core.map_click_pathnode.idnode</code>.
     */
    public Long getIdnode() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>live_core.map_click_pathnode.nodename</code>.
     */
    public void setNodename(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>live_core.map_click_pathnode.nodename</code>.
     */
    public String getNodename() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Long, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return MapClickPathnode.MAP_CLICK_PATHNODE.IDNODE;
    }

    @Override
    public Field<String> field2() {
        return MapClickPathnode.MAP_CLICK_PATHNODE.NODENAME;
    }

    @Override
    public Long component1() {
        return getIdnode();
    }

    @Override
    public String component2() {
        return getNodename();
    }

    @Override
    public Long value1() {
        return getIdnode();
    }

    @Override
    public String value2() {
        return getNodename();
    }

    @Override
    public MapClickPathnodeRecord value1(Long value) {
        setIdnode(value);
        return this;
    }

    @Override
    public MapClickPathnodeRecord value2(String value) {
        setNodename(value);
        return this;
    }

    @Override
    public MapClickPathnodeRecord values(Long value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MapClickPathnodeRecord
     */
    public MapClickPathnodeRecord() {
        super(MapClickPathnode.MAP_CLICK_PATHNODE);
    }

    /**
     * Create a detached, initialised MapClickPathnodeRecord
     */
    public MapClickPathnodeRecord(Long idnode, String nodename) {
        super(MapClickPathnode.MAP_CLICK_PATHNODE);

        setIdnode(idnode);
        setNodename(nodename);
    }
}
