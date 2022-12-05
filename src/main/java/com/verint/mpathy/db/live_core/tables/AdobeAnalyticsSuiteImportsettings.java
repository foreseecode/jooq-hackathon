/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables;


import com.verint.mpathy.db.live_core.LiveCore;
import com.verint.mpathy.db.live_core.tables.records.AdobeAnalyticsSuiteImportsettingsRecord;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
 * Easy access to underlying table in other schemas.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AdobeAnalyticsSuiteImportsettings extends TableImpl<AdobeAnalyticsSuiteImportsettingsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>live_core.adobe_analytics_suite_importsettings</code>
     */
    public static final AdobeAnalyticsSuiteImportsettings ADOBE_ANALYTICS_SUITE_IMPORTSETTINGS = new AdobeAnalyticsSuiteImportsettings();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AdobeAnalyticsSuiteImportsettingsRecord> getRecordType() {
        return AdobeAnalyticsSuiteImportsettingsRecord.class;
    }

    /**
     * The column
     * <code>live_core.adobe_analytics_suite_importsettings.idimport</code>.
     */
    public final TableField<AdobeAnalyticsSuiteImportsettingsRecord, Long> IDIMPORT = createField(DSL.name("idimport"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>live_core.adobe_analytics_suite_importsettings.idsuite</code>.
     */
    public final TableField<AdobeAnalyticsSuiteImportsettingsRecord, BigDecimal> IDSUITE = createField(DSL.name("idsuite"), SQLDataType.NUMERIC, this, "");

    /**
     * The column
     * <code>live_core.adobe_analytics_suite_importsettings.rsid</code>.
     */
    public final TableField<AdobeAnalyticsSuiteImportsettingsRecord, String> RSID = createField(DSL.name("rsid"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>live_core.adobe_analytics_suite_importsettings.username</code>.
     */
    public final TableField<AdobeAnalyticsSuiteImportsettingsRecord, String> USERNAME = createField(DSL.name("username"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>live_core.adobe_analytics_suite_importsettings.secret</code>.
     */
    public final TableField<AdobeAnalyticsSuiteImportsettingsRecord, String> SECRET = createField(DSL.name("secret"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>live_core.adobe_analytics_suite_importsettings.evar</code>.
     */
    public final TableField<AdobeAnalyticsSuiteImportsettingsRecord, String> EVAR = createField(DSL.name("evar"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>live_core.adobe_analytics_suite_importsettings.metric</code>.
     */
    public final TableField<AdobeAnalyticsSuiteImportsettingsRecord, String> METRIC = createField(DSL.name("metric"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>live_core.adobe_analytics_suite_importsettings.endpoint</code>.
     */
    public final TableField<AdobeAnalyticsSuiteImportsettingsRecord, String> ENDPOINT = createField(DSL.name("endpoint"), SQLDataType.CLOB, this, "");

    private AdobeAnalyticsSuiteImportsettings(Name alias, Table<AdobeAnalyticsSuiteImportsettingsRecord> aliased) {
        this(alias, aliased, null);
    }

    private AdobeAnalyticsSuiteImportsettings(Name alias, Table<AdobeAnalyticsSuiteImportsettingsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Easy access to underlying table in other schemas."), TableOptions.view("create view \"adobe_analytics_suite_importsettings\" as  SELECT adobe_analytics_suite_importsettings.idimport,\n    adobe_analytics_suite_importsettings.idsuite,\n    adobe_analytics_suite_importsettings.rsid,\n    adobe_analytics_suite_importsettings.username,\n    adobe_analytics_suite_importsettings.secret,\n    adobe_analytics_suite_importsettings.evar,\n    adobe_analytics_suite_importsettings.metric,\n    adobe_analytics_suite_importsettings.endpoint\n   FROM live.adobe_analytics_suite_importsettings;"));
    }

    /**
     * Create an aliased
     * <code>live_core.adobe_analytics_suite_importsettings</code> table
     * reference
     */
    public AdobeAnalyticsSuiteImportsettings(String alias) {
        this(DSL.name(alias), ADOBE_ANALYTICS_SUITE_IMPORTSETTINGS);
    }

    /**
     * Create an aliased
     * <code>live_core.adobe_analytics_suite_importsettings</code> table
     * reference
     */
    public AdobeAnalyticsSuiteImportsettings(Name alias) {
        this(alias, ADOBE_ANALYTICS_SUITE_IMPORTSETTINGS);
    }

    /**
     * Create a <code>live_core.adobe_analytics_suite_importsettings</code>
     * table reference
     */
    public AdobeAnalyticsSuiteImportsettings() {
        this(DSL.name("adobe_analytics_suite_importsettings"), null);
    }

    public <O extends Record> AdobeAnalyticsSuiteImportsettings(Table<O> child, ForeignKey<O, AdobeAnalyticsSuiteImportsettingsRecord> key) {
        super(child, key, ADOBE_ANALYTICS_SUITE_IMPORTSETTINGS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : LiveCore.LIVE_CORE;
    }

    @Override
    public AdobeAnalyticsSuiteImportsettings as(String alias) {
        return new AdobeAnalyticsSuiteImportsettings(DSL.name(alias), this);
    }

    @Override
    public AdobeAnalyticsSuiteImportsettings as(Name alias) {
        return new AdobeAnalyticsSuiteImportsettings(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AdobeAnalyticsSuiteImportsettings rename(String name) {
        return new AdobeAnalyticsSuiteImportsettings(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AdobeAnalyticsSuiteImportsettings rename(Name name) {
        return new AdobeAnalyticsSuiteImportsettings(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, BigDecimal, String, String, String, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
