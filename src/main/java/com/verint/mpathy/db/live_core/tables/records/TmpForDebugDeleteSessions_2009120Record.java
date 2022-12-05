/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables.records;


import com.verint.mpathy.db.live_core.tables.TmpForDebugDeleteSessions_2009120;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


/**
 * Easy access to underlying table in other schemas.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TmpForDebugDeleteSessions_2009120Record extends TableRecordImpl<TmpForDebugDeleteSessions_2009120Record> implements Record5<Integer, BigDecimal, BigDecimal, BigDecimal, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>live_core.tmp_for_debug_delete_sessions_2009120.idsite</code>.
     */
    public void setIdsite(Integer value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>live_core.tmp_for_debug_delete_sessions_2009120.idsite</code>.
     */
    public Integer getIdsite() {
        return (Integer) get(0);
    }

    /**
     * Setter for
     * <code>live_core.tmp_for_debug_delete_sessions_2009120.idvisitor</code>.
     */
    public void setIdvisitor(BigDecimal value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>live_core.tmp_for_debug_delete_sessions_2009120.idvisitor</code>.
     */
    public BigDecimal getIdvisitor() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for
     * <code>live_core.tmp_for_debug_delete_sessions_2009120.idsession</code>.
     */
    public void setIdsession(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>live_core.tmp_for_debug_delete_sessions_2009120.idsession</code>.
     */
    public BigDecimal getIdsession() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for
     * <code>live_core.tmp_for_debug_delete_sessions_2009120.idpage</code>.
     */
    public void setIdpage(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>live_core.tmp_for_debug_delete_sessions_2009120.idpage</code>.
     */
    public BigDecimal getIdpage() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for
     * <code>live_core.tmp_for_debug_delete_sessions_2009120.scaffold</code>.
     */
    public void setScaffold(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>live_core.tmp_for_debug_delete_sessions_2009120.scaffold</code>.
     */
    public String getScaffold() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, BigDecimal, BigDecimal, BigDecimal, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, BigDecimal, BigDecimal, BigDecimal, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return TmpForDebugDeleteSessions_2009120.TMP_FOR_DEBUG_DELETE_SESSIONS_2009120.IDSITE;
    }

    @Override
    public Field<BigDecimal> field2() {
        return TmpForDebugDeleteSessions_2009120.TMP_FOR_DEBUG_DELETE_SESSIONS_2009120.IDVISITOR;
    }

    @Override
    public Field<BigDecimal> field3() {
        return TmpForDebugDeleteSessions_2009120.TMP_FOR_DEBUG_DELETE_SESSIONS_2009120.IDSESSION;
    }

    @Override
    public Field<BigDecimal> field4() {
        return TmpForDebugDeleteSessions_2009120.TMP_FOR_DEBUG_DELETE_SESSIONS_2009120.IDPAGE;
    }

    @Override
    public Field<String> field5() {
        return TmpForDebugDeleteSessions_2009120.TMP_FOR_DEBUG_DELETE_SESSIONS_2009120.SCAFFOLD;
    }

    @Override
    public Integer component1() {
        return getIdsite();
    }

    @Override
    public BigDecimal component2() {
        return getIdvisitor();
    }

    @Override
    public BigDecimal component3() {
        return getIdsession();
    }

    @Override
    public BigDecimal component4() {
        return getIdpage();
    }

    @Override
    public String component5() {
        return getScaffold();
    }

    @Override
    public Integer value1() {
        return getIdsite();
    }

    @Override
    public BigDecimal value2() {
        return getIdvisitor();
    }

    @Override
    public BigDecimal value3() {
        return getIdsession();
    }

    @Override
    public BigDecimal value4() {
        return getIdpage();
    }

    @Override
    public String value5() {
        return getScaffold();
    }

    @Override
    public TmpForDebugDeleteSessions_2009120Record value1(Integer value) {
        setIdsite(value);
        return this;
    }

    @Override
    public TmpForDebugDeleteSessions_2009120Record value2(BigDecimal value) {
        setIdvisitor(value);
        return this;
    }

    @Override
    public TmpForDebugDeleteSessions_2009120Record value3(BigDecimal value) {
        setIdsession(value);
        return this;
    }

    @Override
    public TmpForDebugDeleteSessions_2009120Record value4(BigDecimal value) {
        setIdpage(value);
        return this;
    }

    @Override
    public TmpForDebugDeleteSessions_2009120Record value5(String value) {
        setScaffold(value);
        return this;
    }

    @Override
    public TmpForDebugDeleteSessions_2009120Record values(Integer value1, BigDecimal value2, BigDecimal value3, BigDecimal value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TmpForDebugDeleteSessions_2009120Record
     */
    public TmpForDebugDeleteSessions_2009120Record() {
        super(TmpForDebugDeleteSessions_2009120.TMP_FOR_DEBUG_DELETE_SESSIONS_2009120);
    }

    /**
     * Create a detached, initialised TmpForDebugDeleteSessions_2009120Record
     */
    public TmpForDebugDeleteSessions_2009120Record(Integer idsite, BigDecimal idvisitor, BigDecimal idsession, BigDecimal idpage, String scaffold) {
        super(TmpForDebugDeleteSessions_2009120.TMP_FOR_DEBUG_DELETE_SESSIONS_2009120);

        setIdsite(idsite);
        setIdvisitor(idvisitor);
        setIdsession(idsession);
        setIdpage(idpage);
        setScaffold(scaffold);
    }
}
