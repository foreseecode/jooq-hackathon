/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables;


import com.verint.mpathy.db.live.Live;
import com.verint.mpathy.db.live.tables.records.PageRecord;

import java.math.BigDecimal;
import java.time.LocalTime;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
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
public class Page extends TableImpl<PageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>live.page</code>
     */
    public static final Page PAGE = new Page();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PageRecord> getRecordType() {
        return PageRecord.class;
    }

    /**
     * The column <code>live.page.idpage</code>.
     */
    public final TableField<PageRecord, BigDecimal> IDPAGE = createField(DSL.name("idpage"), SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>live.page.idsession</code>.
     */
    public final TableField<PageRecord, BigDecimal> IDSESSION = createField(DSL.name("idsession"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>live.page.idsite</code>.
     */
    public final TableField<PageRecord, Integer> IDSITE = createField(DSL.name("idsite"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>live.page.idpage_name</code>.
     */
    public final TableField<PageRecord, Long> IDPAGE_NAME = createField(DSL.name("idpage_name"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live.page.idurl</code>.
     */
    public final TableField<PageRecord, Long> IDURL = createField(DSL.name("idurl"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live.page.idreferer</code>.
     */
    public final TableField<PageRecord, Long> IDREFERER = createField(DSL.name("idreferer"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live.page.iduseragent</code>.
     */
    public final TableField<PageRecord, Long> IDUSERAGENT = createField(DSL.name("iduseragent"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live.page.successor</code>.
     */
    public final TableField<PageRecord, BigDecimal> SUCCESSOR = createField(DSL.name("successor"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>live.page.server_date</code>.
     */
    public final TableField<PageRecord, LocalTime> SERVER_DATE = createField(DSL.name("server_date"), SQLDataType.LOCALTIME(6), this, "");

    /**
     * The column <code>live.page.client_date</code>.
     */
    public final TableField<PageRecord, LocalTime> CLIENT_DATE = createField(DSL.name("client_date"), SQLDataType.LOCALTIME(6), this, "");

    /**
     * The column <code>live.page.dimensions</code>.
     */
    public final TableField<PageRecord, String> DIMENSIONS = createField(DSL.name("dimensions"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live.page.screensize</code>.
     */
    public final TableField<PageRecord, String> SCREENSIZE = createField(DSL.name("screensize"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live.page.no_mpt_reason</code>.
     */
    public final TableField<PageRecord, Short> NO_MPT_REASON = createField(DSL.name("no_mpt_reason"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>live.page.length_loaded</code>.
     */
    public final TableField<PageRecord, Long> LENGTH_LOADED = createField(DSL.name("length_loaded"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live.page.length_active</code>.
     */
    public final TableField<PageRecord, Long> LENGTH_ACTIVE = createField(DSL.name("length_active"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live.page.length_visible</code>.
     */
    public final TableField<PageRecord, Long> LENGTH_VISIBLE = createField(DSL.name("length_visible"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live.page.time_domload</code>.
     */
    public final TableField<PageRecord, Long> TIME_DOMLOAD = createField(DSL.name("time_domload"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live.page.time_imagesload</code>.
     */
    public final TableField<PageRecord, Long> TIME_IMAGESLOAD = createField(DSL.name("time_imagesload"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live.page.time_load</code>.
     */
    public final TableField<PageRecord, Long> TIME_LOAD = createField(DSL.name("time_load"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live.page.num_clicks</code>.
     */
    public final TableField<PageRecord, Long> NUM_CLICKS = createField(DSL.name("num_clicks"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live.page.has_scrolled</code>.
     */
    public final TableField<PageRecord, Short> HAS_SCROLLED = createField(DSL.name("has_scrolled"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>live.page.load_complete</code>.
     */
    public final TableField<PageRecord, Short> LOAD_COMPLETE = createField(DSL.name("load_complete"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>live.page.percent_seen</code>.
     */
    public final TableField<PageRecord, Long> PERCENT_SEEN = createField(DSL.name("percent_seen"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live.page.page_height</code>.
     */
    public final TableField<PageRecord, Long> PAGE_HEIGHT = createField(DSL.name("page_height"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live.page.viewport_height</code>.
     */
    public final TableField<PageRecord, Long> VIEWPORT_HEIGHT = createField(DSL.name("viewport_height"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live.page.viewport_width</code>.
     */
    public final TableField<PageRecord, Long> VIEWPORT_WIDTH = createField(DSL.name("viewport_width"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live.page.guide_pattern</code>.
     */
    public final TableField<PageRecord, Short> GUIDE_PATTERN = createField(DSL.name("guide_pattern"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>live.page.reading_pattern</code>.
     */
    public final TableField<PageRecord, Short> READING_PATTERN = createField(DSL.name("reading_pattern"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>live.page.scroll_top</code>.
     */
    public final TableField<PageRecord, Long> SCROLL_TOP = createField(DSL.name("scroll_top"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live.page.multicall</code>.
     */
    public final TableField<PageRecord, Short> MULTICALL = createField(DSL.name("multicall"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>live.page.mouse_meter</code>.
     */
    public final TableField<PageRecord, Long> MOUSE_METER = createField(DSL.name("mouse_meter"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live.page.answer_time</code>.
     */
    public final TableField<PageRecord, Long> ANSWER_TIME = createField(DSL.name("answer_time"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live.page.scaffold</code>.
     */
    public final TableField<PageRecord, String> SCAFFOLD = createField(DSL.name("scaffold"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live.page.newpi</code>.
     */
    public final TableField<PageRecord, Short> NEWPI = createField(DSL.name("newpi"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>live.page.client_width</code>.
     */
    public final TableField<PageRecord, Long> CLIENT_WIDTH = createField(DSL.name("client_width"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live.page.is_mutation_stream</code>.
     */
    public final TableField<PageRecord, Boolean> IS_MUTATION_STREAM = createField(DSL.name("is_mutation_stream"), SQLDataType.BOOLEAN, this, "");

    private Page(Name alias, Table<PageRecord> aliased) {
        this(alias, aliased, null);
    }

    private Page(Name alias, Table<PageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>live.page</code> table reference
     */
    public Page(String alias) {
        this(DSL.name(alias), PAGE);
    }

    /**
     * Create an aliased <code>live.page</code> table reference
     */
    public Page(Name alias) {
        this(alias, PAGE);
    }

    /**
     * Create a <code>live.page</code> table reference
     */
    public Page() {
        this(DSL.name("page"), null);
    }

    public <O extends Record> Page(Table<O> child, ForeignKey<O, PageRecord> key) {
        super(child, key, PAGE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Live.LIVE;
    }

    @Override
    public Page as(String alias) {
        return new Page(DSL.name(alias), this);
    }

    @Override
    public Page as(Name alias) {
        return new Page(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Page rename(String name) {
        return new Page(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Page rename(Name name) {
        return new Page(name, null);
    }
}
