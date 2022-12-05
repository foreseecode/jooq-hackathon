/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables;


import com.verint.mpathy.db.live_core.LiveCore;
import com.verint.mpathy.db.live_core.tables.records.StageJsonPairRecord;

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
 * Easy access to underlying table in other schemas.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StageJsonPair extends TableImpl<StageJsonPairRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>live_core.stage_json_pair</code>
     */
    public static final StageJsonPair STAGE_JSON_PAIR = new StageJsonPair();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StageJsonPairRecord> getRecordType() {
        return StageJsonPairRecord.class;
    }

    /**
     * The column <code>live_core.stage_json_pair.idstage_json_pair</code>.
     */
    public final TableField<StageJsonPairRecord, Long> IDSTAGE_JSON_PAIR = createField(DSL.name("idstage_json_pair"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live_core.stage_json_pair.idvideo_page_stats</code>.
     */
    public final TableField<StageJsonPairRecord, BigDecimal> IDVIDEO_PAGE_STATS = createField(DSL.name("idvideo_page_stats"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>live_core.stage_json_pair.idjson_key</code>.
     */
    public final TableField<StageJsonPairRecord, BigDecimal> IDJSON_KEY = createField(DSL.name("idjson_key"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>live_core.stage_json_pair.idjson_value</code>.
     */
    public final TableField<StageJsonPairRecord, BigDecimal> IDJSON_VALUE = createField(DSL.name("idjson_value"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>live_core.stage_json_pair.idstage_json_pair_ref</code>.
     */
    public final TableField<StageJsonPairRecord, BigDecimal> IDSTAGE_JSON_PAIR_REF = createField(DSL.name("idstage_json_pair_ref"), SQLDataType.NUMERIC, this, "");

    private StageJsonPair(Name alias, Table<StageJsonPairRecord> aliased) {
        this(alias, aliased, null);
    }

    private StageJsonPair(Name alias, Table<StageJsonPairRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Easy access to underlying table in other schemas."), TableOptions.view("create view \"stage_json_pair\" as  SELECT stage_json_pair.idstage_json_pair,\n    stage_json_pair.idvideo_page_stats,\n    stage_json_pair.idjson_key,\n    stage_json_pair.idjson_value,\n    stage_json_pair.idstage_json_pair_ref\n   FROM live.stage_json_pair;"));
    }

    /**
     * Create an aliased <code>live_core.stage_json_pair</code> table reference
     */
    public StageJsonPair(String alias) {
        this(DSL.name(alias), STAGE_JSON_PAIR);
    }

    /**
     * Create an aliased <code>live_core.stage_json_pair</code> table reference
     */
    public StageJsonPair(Name alias) {
        this(alias, STAGE_JSON_PAIR);
    }

    /**
     * Create a <code>live_core.stage_json_pair</code> table reference
     */
    public StageJsonPair() {
        this(DSL.name("stage_json_pair"), null);
    }

    public <O extends Record> StageJsonPair(Table<O> child, ForeignKey<O, StageJsonPairRecord> key) {
        super(child, key, STAGE_JSON_PAIR);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : LiveCore.LIVE_CORE;
    }

    @Override
    public StageJsonPair as(String alias) {
        return new StageJsonPair(DSL.name(alias), this);
    }

    @Override
    public StageJsonPair as(Name alias) {
        return new StageJsonPair(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public StageJsonPair rename(String name) {
        return new StageJsonPair(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public StageJsonPair rename(Name name) {
        return new StageJsonPair(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, BigDecimal, BigDecimal, BigDecimal, BigDecimal> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
