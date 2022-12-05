/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables.records;


import com.verint.mpathy.db.live_core.tables.MapClickBotched;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.TableRecordImpl;


/**
 * Easy access to underlying table in other schemas.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MapClickBotchedRecord extends TableRecordImpl<MapClickBotchedRecord> implements Record15<BigDecimal, BigDecimal, Integer, Object, Long, String, Long, String, Object, Integer, Integer, Long, Long, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>live_core.map_click_botched.idpage</code>.
     */
    public void setIdpage(BigDecimal value) {
        set(0, value);
    }

    /**
     * Getter for <code>live_core.map_click_botched.idpage</code>.
     */
    public BigDecimal getIdpage() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>live_core.map_click_botched.idsession</code>.
     */
    public void setIdsession(BigDecimal value) {
        set(1, value);
    }

    /**
     * Getter for <code>live_core.map_click_botched.idsession</code>.
     */
    public BigDecimal getIdsession() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>live_core.map_click_botched.idsite</code>.
     */
    public void setIdsite(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>live_core.map_click_botched.idsite</code>.
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
     * Setter for <code>live_core.map_click_botched.time</code>.
     */
    public void setTime(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>live_core.map_click_botched.time</code>.
     */
    public Long getTime() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>live_core.map_click_botched.tagname</code>.
     */
    public void setTagname(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>live_core.map_click_botched.tagname</code>.
     */
    public String getTagname() {
        return (String) get(5);
    }

    /**
     * Setter for <code>live_core.map_click_botched.viewport_width</code>.
     */
    public void setViewportWidth(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>live_core.map_click_botched.viewport_width</code>.
     */
    public Long getViewportWidth() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>live_core.map_click_botched.xpath</code>.
     */
    public void setXpath(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>live_core.map_click_botched.xpath</code>.
     */
    public String getXpath() {
        return (String) get(7);
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
    public void setRelativePoint(Object value) {
        set(8, value);
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
    public Object getRelativePoint() {
        return get(8);
    }

    /**
     * Setter for <code>live_core.map_click_botched.width</code>.
     */
    public void setWidth(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>live_core.map_click_botched.width</code>.
     */
    public Integer getWidth() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>live_core.map_click_botched.height</code>.
     */
    public void setHeight(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>live_core.map_click_botched.height</code>.
     */
    public Integer getHeight() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>live_core.map_click_botched.path_idpathinfo</code>.
     */
    public void setPathIdpathinfo(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>live_core.map_click_botched.path_idpathinfo</code>.
     */
    public Long getPathIdpathinfo() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>live_core.map_click_botched.path_idpathinfo0</code>.
     */
    public void setPathIdpathinfo0(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>live_core.map_click_botched.path_idpathinfo0</code>.
     */
    public Long getPathIdpathinfo0() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>live_core.map_click_botched.path_idpathinfo1</code>.
     */
    public void setPathIdpathinfo1(Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>live_core.map_click_botched.path_idpathinfo1</code>.
     */
    public Long getPathIdpathinfo1() {
        return (Long) get(13);
    }

    /**
     * Setter for <code>live_core.map_click_botched.path_idpathinfo2</code>.
     */
    public void setPathIdpathinfo2(Long value) {
        set(14, value);
    }

    /**
     * Getter for <code>live_core.map_click_botched.path_idpathinfo2</code>.
     */
    public Long getPathIdpathinfo2() {
        return (Long) get(14);
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row15<BigDecimal, BigDecimal, Integer, Object, Long, String, Long, String, Object, Integer, Integer, Long, Long, Long, Long> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    @Override
    public Row15<BigDecimal, BigDecimal, Integer, Object, Long, String, Long, String, Object, Integer, Integer, Long, Long, Long, Long> valuesRow() {
        return (Row15) super.valuesRow();
    }

    @Override
    public Field<BigDecimal> field1() {
        return MapClickBotched.MAP_CLICK_BOTCHED.IDPAGE;
    }

    @Override
    public Field<BigDecimal> field2() {
        return MapClickBotched.MAP_CLICK_BOTCHED.IDSESSION;
    }

    @Override
    public Field<Integer> field3() {
        return MapClickBotched.MAP_CLICK_BOTCHED.IDSITE;
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
        return MapClickBotched.MAP_CLICK_BOTCHED.POINT;
    }

    @Override
    public Field<Long> field5() {
        return MapClickBotched.MAP_CLICK_BOTCHED.TIME;
    }

    @Override
    public Field<String> field6() {
        return MapClickBotched.MAP_CLICK_BOTCHED.TAGNAME;
    }

    @Override
    public Field<Long> field7() {
        return MapClickBotched.MAP_CLICK_BOTCHED.VIEWPORT_WIDTH;
    }

    @Override
    public Field<String> field8() {
        return MapClickBotched.MAP_CLICK_BOTCHED.XPATH;
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
    public Field<Object> field9() {
        return MapClickBotched.MAP_CLICK_BOTCHED.RELATIVE_POINT;
    }

    @Override
    public Field<Integer> field10() {
        return MapClickBotched.MAP_CLICK_BOTCHED.WIDTH;
    }

    @Override
    public Field<Integer> field11() {
        return MapClickBotched.MAP_CLICK_BOTCHED.HEIGHT;
    }

    @Override
    public Field<Long> field12() {
        return MapClickBotched.MAP_CLICK_BOTCHED.PATH_IDPATHINFO;
    }

    @Override
    public Field<Long> field13() {
        return MapClickBotched.MAP_CLICK_BOTCHED.PATH_IDPATHINFO0;
    }

    @Override
    public Field<Long> field14() {
        return MapClickBotched.MAP_CLICK_BOTCHED.PATH_IDPATHINFO1;
    }

    @Override
    public Field<Long> field15() {
        return MapClickBotched.MAP_CLICK_BOTCHED.PATH_IDPATHINFO2;
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
    public String component6() {
        return getTagname();
    }

    @Override
    public Long component7() {
        return getViewportWidth();
    }

    @Override
    public String component8() {
        return getXpath();
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
    public Object component9() {
        return getRelativePoint();
    }

    @Override
    public Integer component10() {
        return getWidth();
    }

    @Override
    public Integer component11() {
        return getHeight();
    }

    @Override
    public Long component12() {
        return getPathIdpathinfo();
    }

    @Override
    public Long component13() {
        return getPathIdpathinfo0();
    }

    @Override
    public Long component14() {
        return getPathIdpathinfo1();
    }

    @Override
    public Long component15() {
        return getPathIdpathinfo2();
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
    public String value6() {
        return getTagname();
    }

    @Override
    public Long value7() {
        return getViewportWidth();
    }

    @Override
    public String value8() {
        return getXpath();
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
    public Object value9() {
        return getRelativePoint();
    }

    @Override
    public Integer value10() {
        return getWidth();
    }

    @Override
    public Integer value11() {
        return getHeight();
    }

    @Override
    public Long value12() {
        return getPathIdpathinfo();
    }

    @Override
    public Long value13() {
        return getPathIdpathinfo0();
    }

    @Override
    public Long value14() {
        return getPathIdpathinfo1();
    }

    @Override
    public Long value15() {
        return getPathIdpathinfo2();
    }

    @Override
    public MapClickBotchedRecord value1(BigDecimal value) {
        setIdpage(value);
        return this;
    }

    @Override
    public MapClickBotchedRecord value2(BigDecimal value) {
        setIdsession(value);
        return this;
    }

    @Override
    public MapClickBotchedRecord value3(Integer value) {
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
    public MapClickBotchedRecord value4(Object value) {
        setPoint(value);
        return this;
    }

    @Override
    public MapClickBotchedRecord value5(Long value) {
        setTime(value);
        return this;
    }

    @Override
    public MapClickBotchedRecord value6(String value) {
        setTagname(value);
        return this;
    }

    @Override
    public MapClickBotchedRecord value7(Long value) {
        setViewportWidth(value);
        return this;
    }

    @Override
    public MapClickBotchedRecord value8(String value) {
        setXpath(value);
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
    public MapClickBotchedRecord value9(Object value) {
        setRelativePoint(value);
        return this;
    }

    @Override
    public MapClickBotchedRecord value10(Integer value) {
        setWidth(value);
        return this;
    }

    @Override
    public MapClickBotchedRecord value11(Integer value) {
        setHeight(value);
        return this;
    }

    @Override
    public MapClickBotchedRecord value12(Long value) {
        setPathIdpathinfo(value);
        return this;
    }

    @Override
    public MapClickBotchedRecord value13(Long value) {
        setPathIdpathinfo0(value);
        return this;
    }

    @Override
    public MapClickBotchedRecord value14(Long value) {
        setPathIdpathinfo1(value);
        return this;
    }

    @Override
    public MapClickBotchedRecord value15(Long value) {
        setPathIdpathinfo2(value);
        return this;
    }

    @Override
    public MapClickBotchedRecord values(BigDecimal value1, BigDecimal value2, Integer value3, Object value4, Long value5, String value6, Long value7, String value8, Object value9, Integer value10, Integer value11, Long value12, Long value13, Long value14, Long value15) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MapClickBotchedRecord
     */
    public MapClickBotchedRecord() {
        super(MapClickBotched.MAP_CLICK_BOTCHED);
    }

    /**
     * Create a detached, initialised MapClickBotchedRecord
     */
    public MapClickBotchedRecord(BigDecimal idpage, BigDecimal idsession, Integer idsite, Object point, Long time, String tagname, Long viewportWidth, String xpath, Object relativePoint, Integer width, Integer height, Long pathIdpathinfo, Long pathIdpathinfo0, Long pathIdpathinfo1, Long pathIdpathinfo2) {
        super(MapClickBotched.MAP_CLICK_BOTCHED);

        setIdpage(idpage);
        setIdsession(idsession);
        setIdsite(idsite);
        setPoint(point);
        setTime(time);
        setTagname(tagname);
        setViewportWidth(viewportWidth);
        setXpath(xpath);
        setRelativePoint(relativePoint);
        setWidth(width);
        setHeight(height);
        setPathIdpathinfo(pathIdpathinfo);
        setPathIdpathinfo0(pathIdpathinfo0);
        setPathIdpathinfo1(pathIdpathinfo1);
        setPathIdpathinfo2(pathIdpathinfo2);
    }
}
