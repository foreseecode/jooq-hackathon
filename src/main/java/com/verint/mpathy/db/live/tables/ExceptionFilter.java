/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables;


import com.verint.mpathy.db.live.Live;
import com.verint.mpathy.db.live.tables.records.ExceptionFilterRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
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
public class ExceptionFilter extends TableImpl<ExceptionFilterRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>live.exception_filter</code>
     */
    public static final ExceptionFilter EXCEPTION_FILTER = new ExceptionFilter();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ExceptionFilterRecord> getRecordType() {
        return ExceptionFilterRecord.class;
    }

    /**
     * The column <code>live.exception_filter.idexception_filter</code>.
     */
    public final TableField<ExceptionFilterRecord, Long> IDEXCEPTION_FILTER = createField(DSL.name("idexception_filter"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>live.exception_filter.idsite</code>.
     */
    public final TableField<ExceptionFilterRecord, Integer> IDSITE = createField(DSL.name("idsite"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>live.exception_filter.regex</code>.
     */
    public final TableField<ExceptionFilterRecord, String> REGEX = createField(DSL.name("regex"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live.exception_filter.sesspercentage</code>.
     */
    public final TableField<ExceptionFilterRecord, Double> SESSPERCENTAGE = createField(DSL.name("sesspercentage"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>live.exception_filter.type</code>.
     */
    public final TableField<ExceptionFilterRecord, Short> TYPE = createField(DSL.name("type"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>live.exception_filter.recprob_desktop</code>.
     */
    public final TableField<ExceptionFilterRecord, Double> RECPROB_DESKTOP = createField(DSL.name("recprob_desktop"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>live.exception_filter.recprob_phone</code>.
     */
    public final TableField<ExceptionFilterRecord, Double> RECPROB_PHONE = createField(DSL.name("recprob_phone"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>live.exception_filter.recprob_tablet</code>.
     */
    public final TableField<ExceptionFilterRecord, Double> RECPROB_TABLET = createField(DSL.name("recprob_tablet"), SQLDataType.DOUBLE, this, "");

    private ExceptionFilter(Name alias, Table<ExceptionFilterRecord> aliased) {
        this(alias, aliased, null);
    }

    private ExceptionFilter(Name alias, Table<ExceptionFilterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>live.exception_filter</code> table reference
     */
    public ExceptionFilter(String alias) {
        this(DSL.name(alias), EXCEPTION_FILTER);
    }

    /**
     * Create an aliased <code>live.exception_filter</code> table reference
     */
    public ExceptionFilter(Name alias) {
        this(alias, EXCEPTION_FILTER);
    }

    /**
     * Create a <code>live.exception_filter</code> table reference
     */
    public ExceptionFilter() {
        this(DSL.name("exception_filter"), null);
    }

    public <O extends Record> ExceptionFilter(Table<O> child, ForeignKey<O, ExceptionFilterRecord> key) {
        super(child, key, EXCEPTION_FILTER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Live.LIVE;
    }

    @Override
    public Identity<ExceptionFilterRecord, Long> getIdentity() {
        return (Identity<ExceptionFilterRecord, Long>) super.getIdentity();
    }

    @Override
    public ExceptionFilter as(String alias) {
        return new ExceptionFilter(DSL.name(alias), this);
    }

    @Override
    public ExceptionFilter as(Name alias) {
        return new ExceptionFilter(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ExceptionFilter rename(String name) {
        return new ExceptionFilter(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ExceptionFilter rename(Name name) {
        return new ExceptionFilter(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, Integer, String, Double, Short, Double, Double, Double> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
