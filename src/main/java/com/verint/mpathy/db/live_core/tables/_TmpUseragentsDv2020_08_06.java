/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables;


import com.verint.mpathy.db.live_core.LiveCore;
import com.verint.mpathy.db.live_core.tables.records._TmpUseragentsDv2020_08_06Record;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
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
public class _TmpUseragentsDv2020_08_06 extends TableImpl<_TmpUseragentsDv2020_08_06Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>live_core._TMP-useragents-dv2020-08-06</code>
     */
    public static final _TmpUseragentsDv2020_08_06 _TMP_USERAGENTS_DV2020_08_06 = new _TmpUseragentsDv2020_08_06();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<_TmpUseragentsDv2020_08_06Record> getRecordType() {
        return _TmpUseragentsDv2020_08_06Record.class;
    }

    /**
     * The column
     * <code>live_core._TMP-useragents-dv2020-08-06.iduseragent</code>.
     */
    public final TableField<_TmpUseragentsDv2020_08_06Record, Long> IDUSERAGENT = createField(DSL.name("iduseragent"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live_core._TMP-useragents-dv2020-08-06.product</code>.
     */
    public final TableField<_TmpUseragentsDv2020_08_06Record, String> PRODUCT = createField(DSL.name("product"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live_core._TMP-useragents-dv2020-08-06.version</code>.
     */
    public final TableField<_TmpUseragentsDv2020_08_06Record, String> VERSION = createField(DSL.name("version"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live_core._TMP-useragents-dv2020-08-06.os</code>.
     */
    public final TableField<_TmpUseragentsDv2020_08_06Record, String> OS = createField(DSL.name("os"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live_core._TMP-useragents-dv2020-08-06.ua_string</code>.
     */
    public final TableField<_TmpUseragentsDv2020_08_06Record, String> UA_STRING = createField(DSL.name("ua_string"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live_core._TMP-useragents-dv2020-08-06.type</code>.
     */
    public final TableField<_TmpUseragentsDv2020_08_06Record, String> TYPE = createField(DSL.name("type"), SQLDataType.CLOB, this, "");

    private _TmpUseragentsDv2020_08_06(Name alias, Table<_TmpUseragentsDv2020_08_06Record> aliased) {
        this(alias, aliased, null);
    }

    private _TmpUseragentsDv2020_08_06(Name alias, Table<_TmpUseragentsDv2020_08_06Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Easy access to underlying table in other schemas."), TableOptions.view("create view \"_TMP-useragents-dv2020-08-06\" as  SELECT \"_TMP-useragents-dv2020-08-06\".iduseragent,\n    \"_TMP-useragents-dv2020-08-06\".product,\n    \"_TMP-useragents-dv2020-08-06\".version,\n    \"_TMP-useragents-dv2020-08-06\".os,\n    \"_TMP-useragents-dv2020-08-06\".ua_string,\n    \"_TMP-useragents-dv2020-08-06\".type\n   FROM live.\"_TMP-useragents-dv2020-08-06\";"));
    }

    /**
     * Create an aliased <code>live_core._TMP-useragents-dv2020-08-06</code>
     * table reference
     */
    public _TmpUseragentsDv2020_08_06(String alias) {
        this(DSL.name(alias), _TMP_USERAGENTS_DV2020_08_06);
    }

    /**
     * Create an aliased <code>live_core._TMP-useragents-dv2020-08-06</code>
     * table reference
     */
    public _TmpUseragentsDv2020_08_06(Name alias) {
        this(alias, _TMP_USERAGENTS_DV2020_08_06);
    }

    /**
     * Create a <code>live_core._TMP-useragents-dv2020-08-06</code> table
     * reference
     */
    public _TmpUseragentsDv2020_08_06() {
        this(DSL.name("_TMP-useragents-dv2020-08-06"), null);
    }

    public <O extends Record> _TmpUseragentsDv2020_08_06(Table<O> child, ForeignKey<O, _TmpUseragentsDv2020_08_06Record> key) {
        super(child, key, _TMP_USERAGENTS_DV2020_08_06);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : LiveCore.LIVE_CORE;
    }

    @Override
    public _TmpUseragentsDv2020_08_06 as(String alias) {
        return new _TmpUseragentsDv2020_08_06(DSL.name(alias), this);
    }

    @Override
    public _TmpUseragentsDv2020_08_06 as(Name alias) {
        return new _TmpUseragentsDv2020_08_06(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public _TmpUseragentsDv2020_08_06 rename(String name) {
        return new _TmpUseragentsDv2020_08_06(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public _TmpUseragentsDv2020_08_06 rename(Name name) {
        return new _TmpUseragentsDv2020_08_06(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
