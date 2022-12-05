/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.pg_catalog.tables;


import com.verint.mpathy.db.pg_catalog.PgCatalog;
import com.verint.mpathy.db.pg_catalog.tables.records.PgStatBgwriterRecord;

import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
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
public class PgStatBgwriter extends TableImpl<PgStatBgwriterRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_bgwriter</code>
     */
    public static final PgStatBgwriter PG_STAT_BGWRITER = new PgStatBgwriter();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatBgwriterRecord> getRecordType() {
        return PgStatBgwriterRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_bgwriter.checkpoints_timed</code>.
     */
    public final TableField<PgStatBgwriterRecord, Long> CHECKPOINTS_TIMED = createField(DSL.name("checkpoints_timed"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_bgwriter.checkpoints_req</code>.
     */
    public final TableField<PgStatBgwriterRecord, Long> CHECKPOINTS_REQ = createField(DSL.name("checkpoints_req"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_bgwriter.checkpoint_write_time</code>.
     */
    public final TableField<PgStatBgwriterRecord, Double> CHECKPOINT_WRITE_TIME = createField(DSL.name("checkpoint_write_time"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_bgwriter.checkpoint_sync_time</code>.
     */
    public final TableField<PgStatBgwriterRecord, Double> CHECKPOINT_SYNC_TIME = createField(DSL.name("checkpoint_sync_time"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_bgwriter.buffers_checkpoint</code>.
     */
    public final TableField<PgStatBgwriterRecord, Long> BUFFERS_CHECKPOINT = createField(DSL.name("buffers_checkpoint"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_bgwriter.buffers_clean</code>.
     */
    public final TableField<PgStatBgwriterRecord, Long> BUFFERS_CLEAN = createField(DSL.name("buffers_clean"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_bgwriter.maxwritten_clean</code>.
     */
    public final TableField<PgStatBgwriterRecord, Long> MAXWRITTEN_CLEAN = createField(DSL.name("maxwritten_clean"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_bgwriter.buffers_backend</code>.
     */
    public final TableField<PgStatBgwriterRecord, Long> BUFFERS_BACKEND = createField(DSL.name("buffers_backend"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_bgwriter.buffers_backend_fsync</code>.
     */
    public final TableField<PgStatBgwriterRecord, Long> BUFFERS_BACKEND_FSYNC = createField(DSL.name("buffers_backend_fsync"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_bgwriter.buffers_alloc</code>.
     */
    public final TableField<PgStatBgwriterRecord, Long> BUFFERS_ALLOC = createField(DSL.name("buffers_alloc"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_bgwriter.stats_reset</code>.
     */
    public final TableField<PgStatBgwriterRecord, OffsetDateTime> STATS_RESET = createField(DSL.name("stats_reset"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    private PgStatBgwriter(Name alias, Table<PgStatBgwriterRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatBgwriter(Name alias, Table<PgStatBgwriterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"pg_stat_bgwriter\" as  SELECT pg_stat_get_bgwriter_timed_checkpoints() AS checkpoints_timed,\n    pg_stat_get_bgwriter_requested_checkpoints() AS checkpoints_req,\n    pg_stat_get_checkpoint_write_time() AS checkpoint_write_time,\n    pg_stat_get_checkpoint_sync_time() AS checkpoint_sync_time,\n    pg_stat_get_bgwriter_buf_written_checkpoints() AS buffers_checkpoint,\n    pg_stat_get_bgwriter_buf_written_clean() AS buffers_clean,\n    pg_stat_get_bgwriter_maxwritten_clean() AS maxwritten_clean,\n    pg_stat_get_buf_written_backend() AS buffers_backend,\n    pg_stat_get_buf_fsync_backend() AS buffers_backend_fsync,\n    pg_stat_get_buf_alloc() AS buffers_alloc,\n    pg_stat_get_bgwriter_stat_reset_time() AS stats_reset;"));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_bgwriter</code> table
     * reference
     */
    public PgStatBgwriter(String alias) {
        this(DSL.name(alias), PG_STAT_BGWRITER);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_bgwriter</code> table
     * reference
     */
    public PgStatBgwriter(Name alias) {
        this(alias, PG_STAT_BGWRITER);
    }

    /**
     * Create a <code>pg_catalog.pg_stat_bgwriter</code> table reference
     */
    public PgStatBgwriter() {
        this(DSL.name("pg_stat_bgwriter"), null);
    }

    public <O extends Record> PgStatBgwriter(Table<O> child, ForeignKey<O, PgStatBgwriterRecord> key) {
        super(child, key, PG_STAT_BGWRITER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatBgwriter as(String alias) {
        return new PgStatBgwriter(DSL.name(alias), this);
    }

    @Override
    public PgStatBgwriter as(Name alias) {
        return new PgStatBgwriter(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatBgwriter rename(String name) {
        return new PgStatBgwriter(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatBgwriter rename(Name name) {
        return new PgStatBgwriter(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Long, Long, Double, Double, Long, Long, Long, Long, Long, Long, OffsetDateTime> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}
