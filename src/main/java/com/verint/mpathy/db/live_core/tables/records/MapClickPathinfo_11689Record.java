/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables.records;


import com.verint.mpathy.db.live_core.tables.MapClickPathinfo_11689;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.TableRecordImpl;


/**
 * Easy access to underlying table in other schemas.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MapClickPathinfo_11689Record extends TableRecordImpl<MapClickPathinfo_11689Record> implements Record12<String, Long, Integer, Integer, Integer, Integer, Integer, Integer, Integer, BigDecimal, BigDecimal, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>live_core.map_click_pathinfo_11689.idpathinfo_plain</code>.
     */
    public void setIdpathinfoPlain(String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>live_core.map_click_pathinfo_11689.idpathinfo_plain</code>.
     */
    public String getIdpathinfoPlain() {
        return (String) get(0);
    }

    /**
     * Setter for <code>live_core.map_click_pathinfo_11689.idpage_name</code>.
     */
    public void setIdpageName(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>live_core.map_click_pathinfo_11689.idpage_name</code>.
     */
    public Long getIdpageName() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>live_core.map_click_pathinfo_11689.idsite</code>.
     */
    public void setIdsite(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>live_core.map_click_pathinfo_11689.idsite</code>.
     */
    public Integer getIdsite() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>live_core.map_click_pathinfo_11689.abs_width</code>.
     */
    public void setAbsWidth(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>live_core.map_click_pathinfo_11689.abs_width</code>.
     */
    public Integer getAbsWidth() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>live_core.map_click_pathinfo_11689.abs_height</code>.
     */
    public void setAbsHeight(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>live_core.map_click_pathinfo_11689.abs_height</code>.
     */
    public Integer getAbsHeight() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>live_core.map_click_pathinfo_11689.abs_x</code>.
     */
    public void setAbsX(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>live_core.map_click_pathinfo_11689.abs_x</code>.
     */
    public Integer getAbsX() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>live_core.map_click_pathinfo_11689.abs_y</code>.
     */
    public void setAbsY(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>live_core.map_click_pathinfo_11689.abs_y</code>.
     */
    public Integer getAbsY() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>live_core.map_click_pathinfo_11689.rel_x</code>.
     */
    public void setRelX(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>live_core.map_click_pathinfo_11689.rel_x</code>.
     */
    public Integer getRelX() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>live_core.map_click_pathinfo_11689.rel_y</code>.
     */
    public void setRelY(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>live_core.map_click_pathinfo_11689.rel_y</code>.
     */
    public Integer getRelY() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>live_core.map_click_pathinfo_11689.relp_width</code>.
     */
    public void setRelpWidth(BigDecimal value) {
        set(9, value);
    }

    /**
     * Getter for <code>live_core.map_click_pathinfo_11689.relp_width</code>.
     */
    public BigDecimal getRelpWidth() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>live_core.map_click_pathinfo_11689.relp_x</code>.
     */
    public void setRelpX(BigDecimal value) {
        set(10, value);
    }

    /**
     * Getter for <code>live_core.map_click_pathinfo_11689.relp_x</code>.
     */
    public BigDecimal getRelpX() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>live_core.map_click_pathinfo_11689.idpathinfo</code>.
     */
    public void setIdpathinfo(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>live_core.map_click_pathinfo_11689.idpathinfo</code>.
     */
    public Long getIdpathinfo() {
        return (Long) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<String, Long, Integer, Integer, Integer, Integer, Integer, Integer, Integer, BigDecimal, BigDecimal, Long> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<String, Long, Integer, Integer, Integer, Integer, Integer, Integer, Integer, BigDecimal, BigDecimal, Long> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return MapClickPathinfo_11689.MAP_CLICK_PATHINFO_11689.IDPATHINFO_PLAIN;
    }

    @Override
    public Field<Long> field2() {
        return MapClickPathinfo_11689.MAP_CLICK_PATHINFO_11689.IDPAGE_NAME;
    }

    @Override
    public Field<Integer> field3() {
        return MapClickPathinfo_11689.MAP_CLICK_PATHINFO_11689.IDSITE;
    }

    @Override
    public Field<Integer> field4() {
        return MapClickPathinfo_11689.MAP_CLICK_PATHINFO_11689.ABS_WIDTH;
    }

    @Override
    public Field<Integer> field5() {
        return MapClickPathinfo_11689.MAP_CLICK_PATHINFO_11689.ABS_HEIGHT;
    }

    @Override
    public Field<Integer> field6() {
        return MapClickPathinfo_11689.MAP_CLICK_PATHINFO_11689.ABS_X;
    }

    @Override
    public Field<Integer> field7() {
        return MapClickPathinfo_11689.MAP_CLICK_PATHINFO_11689.ABS_Y;
    }

    @Override
    public Field<Integer> field8() {
        return MapClickPathinfo_11689.MAP_CLICK_PATHINFO_11689.REL_X;
    }

    @Override
    public Field<Integer> field9() {
        return MapClickPathinfo_11689.MAP_CLICK_PATHINFO_11689.REL_Y;
    }

    @Override
    public Field<BigDecimal> field10() {
        return MapClickPathinfo_11689.MAP_CLICK_PATHINFO_11689.RELP_WIDTH;
    }

    @Override
    public Field<BigDecimal> field11() {
        return MapClickPathinfo_11689.MAP_CLICK_PATHINFO_11689.RELP_X;
    }

    @Override
    public Field<Long> field12() {
        return MapClickPathinfo_11689.MAP_CLICK_PATHINFO_11689.IDPATHINFO;
    }

    @Override
    public String component1() {
        return getIdpathinfoPlain();
    }

    @Override
    public Long component2() {
        return getIdpageName();
    }

    @Override
    public Integer component3() {
        return getIdsite();
    }

    @Override
    public Integer component4() {
        return getAbsWidth();
    }

    @Override
    public Integer component5() {
        return getAbsHeight();
    }

    @Override
    public Integer component6() {
        return getAbsX();
    }

    @Override
    public Integer component7() {
        return getAbsY();
    }

    @Override
    public Integer component8() {
        return getRelX();
    }

    @Override
    public Integer component9() {
        return getRelY();
    }

    @Override
    public BigDecimal component10() {
        return getRelpWidth();
    }

    @Override
    public BigDecimal component11() {
        return getRelpX();
    }

    @Override
    public Long component12() {
        return getIdpathinfo();
    }

    @Override
    public String value1() {
        return getIdpathinfoPlain();
    }

    @Override
    public Long value2() {
        return getIdpageName();
    }

    @Override
    public Integer value3() {
        return getIdsite();
    }

    @Override
    public Integer value4() {
        return getAbsWidth();
    }

    @Override
    public Integer value5() {
        return getAbsHeight();
    }

    @Override
    public Integer value6() {
        return getAbsX();
    }

    @Override
    public Integer value7() {
        return getAbsY();
    }

    @Override
    public Integer value8() {
        return getRelX();
    }

    @Override
    public Integer value9() {
        return getRelY();
    }

    @Override
    public BigDecimal value10() {
        return getRelpWidth();
    }

    @Override
    public BigDecimal value11() {
        return getRelpX();
    }

    @Override
    public Long value12() {
        return getIdpathinfo();
    }

    @Override
    public MapClickPathinfo_11689Record value1(String value) {
        setIdpathinfoPlain(value);
        return this;
    }

    @Override
    public MapClickPathinfo_11689Record value2(Long value) {
        setIdpageName(value);
        return this;
    }

    @Override
    public MapClickPathinfo_11689Record value3(Integer value) {
        setIdsite(value);
        return this;
    }

    @Override
    public MapClickPathinfo_11689Record value4(Integer value) {
        setAbsWidth(value);
        return this;
    }

    @Override
    public MapClickPathinfo_11689Record value5(Integer value) {
        setAbsHeight(value);
        return this;
    }

    @Override
    public MapClickPathinfo_11689Record value6(Integer value) {
        setAbsX(value);
        return this;
    }

    @Override
    public MapClickPathinfo_11689Record value7(Integer value) {
        setAbsY(value);
        return this;
    }

    @Override
    public MapClickPathinfo_11689Record value8(Integer value) {
        setRelX(value);
        return this;
    }

    @Override
    public MapClickPathinfo_11689Record value9(Integer value) {
        setRelY(value);
        return this;
    }

    @Override
    public MapClickPathinfo_11689Record value10(BigDecimal value) {
        setRelpWidth(value);
        return this;
    }

    @Override
    public MapClickPathinfo_11689Record value11(BigDecimal value) {
        setRelpX(value);
        return this;
    }

    @Override
    public MapClickPathinfo_11689Record value12(Long value) {
        setIdpathinfo(value);
        return this;
    }

    @Override
    public MapClickPathinfo_11689Record values(String value1, Long value2, Integer value3, Integer value4, Integer value5, Integer value6, Integer value7, Integer value8, Integer value9, BigDecimal value10, BigDecimal value11, Long value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MapClickPathinfo_11689Record
     */
    public MapClickPathinfo_11689Record() {
        super(MapClickPathinfo_11689.MAP_CLICK_PATHINFO_11689);
    }

    /**
     * Create a detached, initialised MapClickPathinfo_11689Record
     */
    public MapClickPathinfo_11689Record(String idpathinfoPlain, Long idpageName, Integer idsite, Integer absWidth, Integer absHeight, Integer absX, Integer absY, Integer relX, Integer relY, BigDecimal relpWidth, BigDecimal relpX, Long idpathinfo) {
        super(MapClickPathinfo_11689.MAP_CLICK_PATHINFO_11689);

        setIdpathinfoPlain(idpathinfoPlain);
        setIdpageName(idpageName);
        setIdsite(idsite);
        setAbsWidth(absWidth);
        setAbsHeight(absHeight);
        setAbsX(absX);
        setAbsY(absY);
        setRelX(relX);
        setRelY(relY);
        setRelpWidth(relpWidth);
        setRelpX(relpX);
        setIdpathinfo(idpathinfo);
    }
}
