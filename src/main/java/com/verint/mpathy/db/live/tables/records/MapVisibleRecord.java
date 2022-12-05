/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables.records;


import com.verint.mpathy.db.live.tables.MapVisible;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MapVisibleRecord extends TableRecordImpl<MapVisibleRecord> implements Record9<BigDecimal, BigDecimal, Integer, Object, Long, Long, Long, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>live.map_visible.idpage</code>.
     */
    public void setIdpage(BigDecimal value) {
        set(0, value);
    }

    /**
     * Getter for <code>live.map_visible.idpage</code>.
     */
    public BigDecimal getIdpage() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>live.map_visible.idsession</code>.
     */
    public void setIdsession(BigDecimal value) {
        set(1, value);
    }

    /**
     * Getter for <code>live.map_visible.idsession</code>.
     */
    public BigDecimal getIdsession() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>live.map_visible.idsite</code>.
     */
    public void setIdsite(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>live.map_visible.idsite</code>.
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
    public void setViewport(Object value) {
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
    public Object getViewport() {
        return get(3);
    }

    /**
     * Setter for <code>live.map_visible.time</code>.
     */
    public void setTime(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>live.map_visible.time</code>.
     */
    public Long getTime() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>live.map_visible.x1</code>.
     */
    public void setX1(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>live.map_visible.x1</code>.
     */
    public Long getX1() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>live.map_visible.y1</code>.
     */
    public void setY1(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>live.map_visible.y1</code>.
     */
    public Long getY1() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>live.map_visible.x2</code>.
     */
    public void setX2(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>live.map_visible.x2</code>.
     */
    public Long getX2() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>live.map_visible.y2</code>.
     */
    public void setY2(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>live.map_visible.y2</code>.
     */
    public Long getY2() {
        return (Long) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<BigDecimal, BigDecimal, Integer, Object, Long, Long, Long, Long, Long> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<BigDecimal, BigDecimal, Integer, Object, Long, Long, Long, Long, Long> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<BigDecimal> field1() {
        return MapVisible.MAP_VISIBLE.IDPAGE;
    }

    @Override
    public Field<BigDecimal> field2() {
        return MapVisible.MAP_VISIBLE.IDSESSION;
    }

    @Override
    public Field<Integer> field3() {
        return MapVisible.MAP_VISIBLE.IDSITE;
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
        return MapVisible.MAP_VISIBLE.VIEWPORT;
    }

    @Override
    public Field<Long> field5() {
        return MapVisible.MAP_VISIBLE.TIME;
    }

    @Override
    public Field<Long> field6() {
        return MapVisible.MAP_VISIBLE.X1;
    }

    @Override
    public Field<Long> field7() {
        return MapVisible.MAP_VISIBLE.Y1;
    }

    @Override
    public Field<Long> field8() {
        return MapVisible.MAP_VISIBLE.X2;
    }

    @Override
    public Field<Long> field9() {
        return MapVisible.MAP_VISIBLE.Y2;
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
        return getViewport();
    }

    @Override
    public Long component5() {
        return getTime();
    }

    @Override
    public Long component6() {
        return getX1();
    }

    @Override
    public Long component7() {
        return getY1();
    }

    @Override
    public Long component8() {
        return getX2();
    }

    @Override
    public Long component9() {
        return getY2();
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
        return getViewport();
    }

    @Override
    public Long value5() {
        return getTime();
    }

    @Override
    public Long value6() {
        return getX1();
    }

    @Override
    public Long value7() {
        return getY1();
    }

    @Override
    public Long value8() {
        return getX2();
    }

    @Override
    public Long value9() {
        return getY2();
    }

    @Override
    public MapVisibleRecord value1(BigDecimal value) {
        setIdpage(value);
        return this;
    }

    @Override
    public MapVisibleRecord value2(BigDecimal value) {
        setIdsession(value);
        return this;
    }

    @Override
    public MapVisibleRecord value3(Integer value) {
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
    public MapVisibleRecord value4(Object value) {
        setViewport(value);
        return this;
    }

    @Override
    public MapVisibleRecord value5(Long value) {
        setTime(value);
        return this;
    }

    @Override
    public MapVisibleRecord value6(Long value) {
        setX1(value);
        return this;
    }

    @Override
    public MapVisibleRecord value7(Long value) {
        setY1(value);
        return this;
    }

    @Override
    public MapVisibleRecord value8(Long value) {
        setX2(value);
        return this;
    }

    @Override
    public MapVisibleRecord value9(Long value) {
        setY2(value);
        return this;
    }

    @Override
    public MapVisibleRecord values(BigDecimal value1, BigDecimal value2, Integer value3, Object value4, Long value5, Long value6, Long value7, Long value8, Long value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MapVisibleRecord
     */
    public MapVisibleRecord() {
        super(MapVisible.MAP_VISIBLE);
    }

    /**
     * Create a detached, initialised MapVisibleRecord
     */
    public MapVisibleRecord(BigDecimal idpage, BigDecimal idsession, Integer idsite, Object viewport, Long time, Long x1, Long y1, Long x2, Long y2) {
        super(MapVisible.MAP_VISIBLE);

        setIdpage(idpage);
        setIdsession(idsession);
        setIdsite(idsite);
        setViewport(viewport);
        setTime(time);
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
    }
}
