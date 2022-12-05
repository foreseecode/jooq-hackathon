/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables;


import com.verint.mpathy.db.live.Live;
import com.verint.mpathy.db.live.tables.records.LogSessionRecord;

import java.math.BigDecimal;
import java.time.LocalTime;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
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
public class LogSession extends TableImpl<LogSessionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>live.log_session</code>
     */
    public static final LogSession LOG_SESSION = new LogSession();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LogSessionRecord> getRecordType() {
        return LogSessionRecord.class;
    }

    /**
     * The column <code>live.log_session.idsession</code>.
     */
    public final TableField<LogSessionRecord, BigDecimal> IDSESSION = createField(DSL.name("idsession"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>live.log_session.import_state</code>.
     */
    public final TableField<LogSessionRecord, Short> IMPORT_STATE = createField(DSL.name("import_state"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>live.log_session.date</code>.
     */
    public final TableField<LogSessionRecord, LocalTime> DATE = createField(DSL.name("date"), SQLDataType.LOCALTIME(6), this, "");

    /**
     * The column <code>live.log_session.import_error</code>.
     */
    public final TableField<LogSessionRecord, String> IMPORT_ERROR = createField(DSL.name("import_error"), SQLDataType.CLOB, this, "");

    private LogSession(Name alias, Table<LogSessionRecord> aliased) {
        this(alias, aliased, null);
    }

    private LogSession(Name alias, Table<LogSessionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>live.log_session</code> table reference
     */
    public LogSession(String alias) {
        this(DSL.name(alias), LOG_SESSION);
    }

    /**
     * Create an aliased <code>live.log_session</code> table reference
     */
    public LogSession(Name alias) {
        this(alias, LOG_SESSION);
    }

    /**
     * Create a <code>live.log_session</code> table reference
     */
    public LogSession() {
        this(DSL.name("log_session"), null);
    }

    public <O extends Record> LogSession(Table<O> child, ForeignKey<O, LogSessionRecord> key) {
        super(child, key, LOG_SESSION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Live.LIVE;
    }

    @Override
    public LogSession as(String alias) {
        return new LogSession(DSL.name(alias), this);
    }

    @Override
    public LogSession as(Name alias) {
        return new LogSession(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LogSession rename(String name) {
        return new LogSession(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LogSession rename(Name name) {
        return new LogSession(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<BigDecimal, Short, LocalTime, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
