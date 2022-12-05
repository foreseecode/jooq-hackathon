/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables;


import com.verint.mpathy.db.live.Live;
import com.verint.mpathy.db.live.tables.records.TmpForDebugDeleteSessions_20017851Record;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
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
public class TmpForDebugDeleteSessions_20017851 extends TableImpl<TmpForDebugDeleteSessions_20017851Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>live.tmp_for_debug_delete_sessions_20017851</code>
     */
    public static final TmpForDebugDeleteSessions_20017851 TMP_FOR_DEBUG_DELETE_SESSIONS_20017851 = new TmpForDebugDeleteSessions_20017851();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TmpForDebugDeleteSessions_20017851Record> getRecordType() {
        return TmpForDebugDeleteSessions_20017851Record.class;
    }

    /**
     * The column
     * <code>live.tmp_for_debug_delete_sessions_20017851.idsite</code>.
     */
    public final TableField<TmpForDebugDeleteSessions_20017851Record, Integer> IDSITE = createField(DSL.name("idsite"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>live.tmp_for_debug_delete_sessions_20017851.idvisitor</code>.
     */
    public final TableField<TmpForDebugDeleteSessions_20017851Record, BigDecimal> IDVISITOR = createField(DSL.name("idvisitor"), SQLDataType.NUMERIC, this, "");

    /**
     * The column
     * <code>live.tmp_for_debug_delete_sessions_20017851.idsession</code>.
     */
    public final TableField<TmpForDebugDeleteSessions_20017851Record, BigDecimal> IDSESSION = createField(DSL.name("idsession"), SQLDataType.NUMERIC, this, "");

    /**
     * The column
     * <code>live.tmp_for_debug_delete_sessions_20017851.idpage</code>.
     */
    public final TableField<TmpForDebugDeleteSessions_20017851Record, BigDecimal> IDPAGE = createField(DSL.name("idpage"), SQLDataType.NUMERIC, this, "");

    /**
     * The column
     * <code>live.tmp_for_debug_delete_sessions_20017851.scaffold</code>.
     */
    public final TableField<TmpForDebugDeleteSessions_20017851Record, String> SCAFFOLD = createField(DSL.name("scaffold"), SQLDataType.CLOB, this, "");

    private TmpForDebugDeleteSessions_20017851(Name alias, Table<TmpForDebugDeleteSessions_20017851Record> aliased) {
        this(alias, aliased, null);
    }

    private TmpForDebugDeleteSessions_20017851(Name alias, Table<TmpForDebugDeleteSessions_20017851Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>live.tmp_for_debug_delete_sessions_20017851</code> table reference
     */
    public TmpForDebugDeleteSessions_20017851(String alias) {
        this(DSL.name(alias), TMP_FOR_DEBUG_DELETE_SESSIONS_20017851);
    }

    /**
     * Create an aliased
     * <code>live.tmp_for_debug_delete_sessions_20017851</code> table reference
     */
    public TmpForDebugDeleteSessions_20017851(Name alias) {
        this(alias, TMP_FOR_DEBUG_DELETE_SESSIONS_20017851);
    }

    /**
     * Create a <code>live.tmp_for_debug_delete_sessions_20017851</code> table
     * reference
     */
    public TmpForDebugDeleteSessions_20017851() {
        this(DSL.name("tmp_for_debug_delete_sessions_20017851"), null);
    }

    public <O extends Record> TmpForDebugDeleteSessions_20017851(Table<O> child, ForeignKey<O, TmpForDebugDeleteSessions_20017851Record> key) {
        super(child, key, TMP_FOR_DEBUG_DELETE_SESSIONS_20017851);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Live.LIVE;
    }

    @Override
    public TmpForDebugDeleteSessions_20017851 as(String alias) {
        return new TmpForDebugDeleteSessions_20017851(DSL.name(alias), this);
    }

    @Override
    public TmpForDebugDeleteSessions_20017851 as(Name alias) {
        return new TmpForDebugDeleteSessions_20017851(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TmpForDebugDeleteSessions_20017851 rename(String name) {
        return new TmpForDebugDeleteSessions_20017851(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TmpForDebugDeleteSessions_20017851 rename(Name name) {
        return new TmpForDebugDeleteSessions_20017851(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, BigDecimal, BigDecimal, BigDecimal, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
