/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables.records;


import com.verint.mpathy.db.live.tables.Event;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EventRecord extends TableRecordImpl<EventRecord> implements Record8<BigDecimal, BigDecimal, Long, Short, Object, Long, String, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>live.event.idpage</code>.
     */
    public void setIdpage(BigDecimal value) {
        set(0, value);
    }

    /**
     * Getter for <code>live.event.idpage</code>.
     */
    public BigDecimal getIdpage() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>live.event.idsession</code>.
     */
    public void setIdsession(BigDecimal value) {
        set(1, value);
    }

    /**
     * Getter for <code>live.event.idsession</code>.
     */
    public BigDecimal getIdsession() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>live.event.idsite</code>.
     */
    public void setIdsite(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>live.event.idsite</code>.
     */
    public Long getIdsite() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>live.event.event_id</code>.
     */
    public void setEventId(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>live.event.event_id</code>.
     */
    public Short getEventId() {
        return (Short) get(3);
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
        set(4, value);
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
        return get(4);
    }

    /**
     * Setter for <code>live.event.time</code>.
     */
    public void setTime(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>live.event.time</code>.
     */
    public Long getTime() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>live.event.tagname</code>.
     */
    public void setTagname(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>live.event.tagname</code>.
     */
    public String getTagname() {
        return (String) get(6);
    }

    /**
     * Setter for <code>live.event.viewport_width</code>.
     */
    public void setViewportWidth(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>live.event.viewport_width</code>.
     */
    public Long getViewportWidth() {
        return (Long) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<BigDecimal, BigDecimal, Long, Short, Object, Long, String, Long> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<BigDecimal, BigDecimal, Long, Short, Object, Long, String, Long> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<BigDecimal> field1() {
        return Event.EVENT.IDPAGE;
    }

    @Override
    public Field<BigDecimal> field2() {
        return Event.EVENT.IDSESSION;
    }

    @Override
    public Field<Long> field3() {
        return Event.EVENT.IDSITE;
    }

    @Override
    public Field<Short> field4() {
        return Event.EVENT.EVENT_ID;
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
    public Field<Object> field5() {
        return Event.EVENT.POINT;
    }

    @Override
    public Field<Long> field6() {
        return Event.EVENT.TIME;
    }

    @Override
    public Field<String> field7() {
        return Event.EVENT.TAGNAME;
    }

    @Override
    public Field<Long> field8() {
        return Event.EVENT.VIEWPORT_WIDTH;
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
    public Long component3() {
        return getIdsite();
    }

    @Override
    public Short component4() {
        return getEventId();
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
    public Object component5() {
        return getPoint();
    }

    @Override
    public Long component6() {
        return getTime();
    }

    @Override
    public String component7() {
        return getTagname();
    }

    @Override
    public Long component8() {
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
    public Long value3() {
        return getIdsite();
    }

    @Override
    public Short value4() {
        return getEventId();
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
    public Object value5() {
        return getPoint();
    }

    @Override
    public Long value6() {
        return getTime();
    }

    @Override
    public String value7() {
        return getTagname();
    }

    @Override
    public Long value8() {
        return getViewportWidth();
    }

    @Override
    public EventRecord value1(BigDecimal value) {
        setIdpage(value);
        return this;
    }

    @Override
    public EventRecord value2(BigDecimal value) {
        setIdsession(value);
        return this;
    }

    @Override
    public EventRecord value3(Long value) {
        setIdsite(value);
        return this;
    }

    @Override
    public EventRecord value4(Short value) {
        setEventId(value);
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
    public EventRecord value5(Object value) {
        setPoint(value);
        return this;
    }

    @Override
    public EventRecord value6(Long value) {
        setTime(value);
        return this;
    }

    @Override
    public EventRecord value7(String value) {
        setTagname(value);
        return this;
    }

    @Override
    public EventRecord value8(Long value) {
        setViewportWidth(value);
        return this;
    }

    @Override
    public EventRecord values(BigDecimal value1, BigDecimal value2, Long value3, Short value4, Object value5, Long value6, String value7, Long value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EventRecord
     */
    public EventRecord() {
        super(Event.EVENT);
    }

    /**
     * Create a detached, initialised EventRecord
     */
    public EventRecord(BigDecimal idpage, BigDecimal idsession, Long idsite, Short eventId, Object point, Long time, String tagname, Long viewportWidth) {
        super(Event.EVENT);

        setIdpage(idpage);
        setIdsession(idsession);
        setIdsite(idsite);
        setEventId(eventId);
        setPoint(point);
        setTime(time);
        setTagname(tagname);
        setViewportWidth(viewportWidth);
    }
}
