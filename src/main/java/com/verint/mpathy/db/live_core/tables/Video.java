/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables;


import com.verint.mpathy.db.live_core.LiveCore;
import com.verint.mpathy.db.live_core.tables.records.VideoRecord;

import java.math.BigDecimal;
import java.time.LocalTime;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row16;
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
public class Video extends TableImpl<VideoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>live_core.video</code>
     */
    public static final Video VIDEO = new Video();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VideoRecord> getRecordType() {
        return VideoRecord.class;
    }

    /**
     * The column <code>live_core.video.idvideo</code>.
     */
    public final TableField<VideoRecord, Long> IDVIDEO = createField(DSL.name("idvideo"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live_core.video.idsession</code>.
     */
    public final TableField<VideoRecord, BigDecimal> IDSESSION = createField(DSL.name("idsession"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>live_core.video.idsite</code>.
     */
    public final TableField<VideoRecord, Integer> IDSITE = createField(DSL.name("idsite"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>live_core.video.iduser</code>.
     */
    public final TableField<VideoRecord, BigDecimal> IDUSER = createField(DSL.name("iduser"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>live_core.video.idpage_start</code>.
     */
    public final TableField<VideoRecord, BigDecimal> IDPAGE_START = createField(DSL.name("idpage_start"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>live_core.video.idpage_end</code>.
     */
    public final TableField<VideoRecord, BigDecimal> IDPAGE_END = createField(DSL.name("idpage_end"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>live_core.video.name_video</code>.
     */
    public final TableField<VideoRecord, String> NAME_VIDEO = createField(DSL.name("name_video"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live_core.video.queue_state</code>.
     */
    public final TableField<VideoRecord, Short> QUEUE_STATE = createField(DSL.name("queue_state"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>live_core.video.finished_percent</code>.
     */
    public final TableField<VideoRecord, Short> FINISHED_PERCENT = createField(DSL.name("finished_percent"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>live_core.video.is_deleted</code>.
     */
    public final TableField<VideoRecord, Short> IS_DELETED = createField(DSL.name("is_deleted"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>live_core.video.created_at</code>.
     */
    public final TableField<VideoRecord, LocalTime> CREATED_AT = createField(DSL.name("created_at"), SQLDataType.LOCALTIME(6), this, "");

    /**
     * The column <code>live_core.video.finished_at</code>.
     */
    public final TableField<VideoRecord, LocalTime> FINISHED_AT = createField(DSL.name("finished_at"), SQLDataType.LOCALTIME(6), this, "");

    /**
     * The column <code>live_core.video.last_download_at</code>.
     */
    public final TableField<VideoRecord, LocalTime> LAST_DOWNLOAD_AT = createField(DSL.name("last_download_at"), SQLDataType.LOCALTIME(6), this, "");

    /**
     * The column <code>live_core.video.expires_at</code>.
     */
    public final TableField<VideoRecord, LocalTime> EXPIRES_AT = createField(DSL.name("expires_at"), SQLDataType.LOCALTIME(6), this, "");

    /**
     * The column <code>live_core.video.error_message</code>.
     */
    public final TableField<VideoRecord, String> ERROR_MESSAGE = createField(DSL.name("error_message"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live_core.video.uuid</code>.
     */
    public final TableField<VideoRecord, String> UUID = createField(DSL.name("uuid"), SQLDataType.CLOB, this, "");

    private Video(Name alias, Table<VideoRecord> aliased) {
        this(alias, aliased, null);
    }

    private Video(Name alias, Table<VideoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Easy access to underlying table in other schemas."), TableOptions.view("create view \"video\" as  SELECT video.idvideo,\n    video.idsession,\n    video.idsite,\n    video.iduser,\n    video.idpage_start,\n    video.idpage_end,\n    video.name_video,\n    video.queue_state,\n    video.finished_percent,\n    video.is_deleted,\n    video.created_at,\n    video.finished_at,\n    video.last_download_at,\n    video.expires_at,\n    video.error_message,\n    video.uuid\n   FROM live.video;"));
    }

    /**
     * Create an aliased <code>live_core.video</code> table reference
     */
    public Video(String alias) {
        this(DSL.name(alias), VIDEO);
    }

    /**
     * Create an aliased <code>live_core.video</code> table reference
     */
    public Video(Name alias) {
        this(alias, VIDEO);
    }

    /**
     * Create a <code>live_core.video</code> table reference
     */
    public Video() {
        this(DSL.name("video"), null);
    }

    public <O extends Record> Video(Table<O> child, ForeignKey<O, VideoRecord> key) {
        super(child, key, VIDEO);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : LiveCore.LIVE_CORE;
    }

    @Override
    public Video as(String alias) {
        return new Video(DSL.name(alias), this);
    }

    @Override
    public Video as(Name alias) {
        return new Video(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Video rename(String name) {
        return new Video(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Video rename(Name name) {
        return new Video(name, null);
    }

    // -------------------------------------------------------------------------
    // Row16 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row16<Long, BigDecimal, Integer, BigDecimal, BigDecimal, BigDecimal, String, Short, Short, Short, LocalTime, LocalTime, LocalTime, LocalTime, String, String> fieldsRow() {
        return (Row16) super.fieldsRow();
    }
}
