/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables.records;


import com.verint.mpathy.db.live.tables.Cp_3338Session;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Cp_3338SessionRecord extends TableRecordImpl<Cp_3338SessionRecord> implements Record3<BigDecimal, Long, BigDecimal> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>live.cp_3338_session.idsession</code>.
     */
    public void setIdsession(BigDecimal value) {
        set(0, value);
    }

    /**
     * Getter for <code>live.cp_3338_session.idsession</code>.
     */
    public BigDecimal getIdsession() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>live.cp_3338_session.idcp</code>.
     */
    public void setIdcp(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>live.cp_3338_session.idcp</code>.
     */
    public Long getIdcp() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>live.cp_3338_session.idvalue</code>.
     */
    public void setIdvalue(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for <code>live.cp_3338_session.idvalue</code>.
     */
    public BigDecimal getIdvalue() {
        return (BigDecimal) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<BigDecimal, Long, BigDecimal> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<BigDecimal, Long, BigDecimal> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<BigDecimal> field1() {
        return Cp_3338Session.CP_3338_SESSION.IDSESSION;
    }

    @Override
    public Field<Long> field2() {
        return Cp_3338Session.CP_3338_SESSION.IDCP;
    }

    @Override
    public Field<BigDecimal> field3() {
        return Cp_3338Session.CP_3338_SESSION.IDVALUE;
    }

    @Override
    public BigDecimal component1() {
        return getIdsession();
    }

    @Override
    public Long component2() {
        return getIdcp();
    }

    @Override
    public BigDecimal component3() {
        return getIdvalue();
    }

    @Override
    public BigDecimal value1() {
        return getIdsession();
    }

    @Override
    public Long value2() {
        return getIdcp();
    }

    @Override
    public BigDecimal value3() {
        return getIdvalue();
    }

    @Override
    public Cp_3338SessionRecord value1(BigDecimal value) {
        setIdsession(value);
        return this;
    }

    @Override
    public Cp_3338SessionRecord value2(Long value) {
        setIdcp(value);
        return this;
    }

    @Override
    public Cp_3338SessionRecord value3(BigDecimal value) {
        setIdvalue(value);
        return this;
    }

    @Override
    public Cp_3338SessionRecord values(BigDecimal value1, Long value2, BigDecimal value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached Cp_3338SessionRecord
     */
    public Cp_3338SessionRecord() {
        super(Cp_3338Session.CP_3338_SESSION);
    }

    /**
     * Create a detached, initialised Cp_3338SessionRecord
     */
    public Cp_3338SessionRecord(BigDecimal idsession, Long idcp, BigDecimal idvalue) {
        super(Cp_3338Session.CP_3338_SESSION);

        setIdsession(idsession);
        setIdcp(idcp);
        setIdvalue(idvalue);
    }
}
