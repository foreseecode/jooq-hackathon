/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables.records;


import com.verint.mpathy.db.live_core.tables.MapMove_3;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;


/**
 * Easy access to underlying table in other schemas.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MapMove_3Record extends TableRecordImpl<MapMove_3Record> implements Record6<BigDecimal, BigDecimal, Integer, Object, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>live_core.map_move_3.idpage</code>.
     */
    public void setIdpage(BigDecimal value) {
        set(0, value);
    }

    /**
     * Getter for <code>live_core.map_move_3.idpage</code>.
     */
    public BigDecimal getIdpage() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>live_core.map_move_3.idsession</code>.
     */
    public void setIdsession(BigDecimal value) {
        set(1, value);
    }

    /**
     * Getter for <code>live_core.map_move_3.idsession</code>.
     */
    public BigDecimal getIdsession() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>live_core.map_move_3.idsite</code>.
     */
    public void setIdsite(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>live_core.map_move_3.idsite</code>.
     */
    public Integer getIdsite() {
        return (Integer) get(2);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setPoint(Object value) {
        set(3, value);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public Object getPoint() {
        return get(3);
    }

    /**
     * Setter for <code>live_core.map_move_3.time</code>.
     */
    public void setTime(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>live_core.map_move_3.time</code>.
     */
    public Long getTime() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>live_core.map_move_3.viewport_width</code>.
     */
    public void setViewportWidth(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>live_core.map_move_3.viewport_width</code>.
     */
    public Long getViewportWidth() {
        return (Long) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<BigDecimal, BigDecimal, Integer, Object, Long, Long> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<BigDecimal, BigDecimal, Integer, Object, Long, Long> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<BigDecimal> field1() {
        return MapMove_3.MAP_MOVE_3.IDPAGE;
    }

    @Override
    public Field<BigDecimal> field2() {
        return MapMove_3.MAP_MOVE_3.IDSESSION;
    }

    @Override
    public Field<Integer> field3() {
        return MapMove_3.MAP_MOVE_3.IDSITE;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Field<Object> field4() {
        return MapMove_3.MAP_MOVE_3.POINT;
    }

    @Override
    public Field<Long> field5() {
        return MapMove_3.MAP_MOVE_3.TIME;
    }

    @Override
    public Field<Long> field6() {
        return MapMove_3.MAP_MOVE_3.VIEWPORT_WIDTH;
    }

    @Override
    public BigDecimal component1() {
        return getIdpage();
    }

    @Override
    public BigDecimal component2() {
        return getIdsession();
    }

    @Override
    public Integer component3() {
        return getIdsite();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Object component4() {
        return getPoint();
    }

    @Override
    public Long component5() {
        return getTime();
    }

    @Override
    public Long component6() {
        return getViewportWidth();
    }

    @Override
    public BigDecimal value1() {
        return getIdpage();
    }

    @Override
    public BigDecimal value2() {
        return getIdsession();
    }

    @Override
    public Integer value3() {
        return getIdsite();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Object value4() {
        return getPoint();
    }

    @Override
    public Long value5() {
        return getTime();
    }

    @Override
    public Long value6() {
        return getViewportWidth();
    }

    @Override
    public MapMove_3Record value1(BigDecimal value) {
        setIdpage(value);
        return this;
    }

    @Override
    public MapMove_3Record value2(BigDecimal value) {
        setIdsession(value);
        return this;
    }

    @Override
    public MapMove_3Record value3(Integer value) {
        setIdsite(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public MapMove_3Record value4(Object value) {
        setPoint(value);
        return this;
    }

    @Override
    public MapMove_3Record value5(Long value) {
        setTime(value);
        return this;
    }

    @Override
    public MapMove_3Record value6(Long value) {
        setViewportWidth(value);
        return this;
    }

    @Override
    public MapMove_3Record values(BigDecimal value1, BigDecimal value2, Integer value3, Object value4, Long value5, Long value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MapMove_3Record
     */
    public MapMove_3Record() {
        super(MapMove_3.MAP_MOVE_3);
    }

    /**
     * Create a detached, initialised MapMove_3Record
     */
    public MapMove_3Record(BigDecimal idpage, BigDecimal idsession, Integer idsite, Object point, Long time, Long viewportWidth) {
        super(MapMove_3.MAP_MOVE_3);

        setIdpage(idpage);
        setIdsession(idsession);
        setIdsite(idsite);
        setPoint(point);
        setTime(time);
        setViewportWidth(viewportWidth);
    }
}
