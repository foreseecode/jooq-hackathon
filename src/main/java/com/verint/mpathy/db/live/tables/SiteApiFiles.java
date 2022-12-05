/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables;


import com.verint.mpathy.db.live.Live;
import com.verint.mpathy.db.live.tables.records.SiteApiFilesRecord;

import java.time.LocalTime;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row13;
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
public class SiteApiFiles extends TableImpl<SiteApiFilesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>live.site_api_files</code>
     */
    public static final SiteApiFiles SITE_API_FILES = new SiteApiFiles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SiteApiFilesRecord> getRecordType() {
        return SiteApiFilesRecord.class;
    }

    /**
     * The column <code>live.site_api_files.idfile</code>.
     */
    public final TableField<SiteApiFilesRecord, Long> IDFILE = createField(DSL.name("idfile"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>live.site_api_files.idsite</code>.
     */
    public final TableField<SiteApiFilesRecord, Long> IDSITE = createField(DSL.name("idsite"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>live.site_api_files.subject</code>.
     */
    public final TableField<SiteApiFilesRecord, String> SUBJECT = createField(DSL.name("subject"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>live.site_api_files.file_name</code>.
     */
    public final TableField<SiteApiFilesRecord, String> FILE_NAME = createField(DSL.name("file_name"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>live.site_api_files.file_type</code>.
     */
    public final TableField<SiteApiFilesRecord, String> FILE_TYPE = createField(DSL.name("file_type"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>live.site_api_files.file_date</code>.
     */
    public final TableField<SiteApiFilesRecord, LocalTime> FILE_DATE = createField(DSL.name("file_date"), SQLDataType.LOCALTIME(6).nullable(false), this, "");

    /**
     * The column <code>live.site_api_files.email</code>.
     */
    public final TableField<SiteApiFilesRecord, String> EMAIL = createField(DSL.name("email"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live.site_api_files.password</code>.
     */
    public final TableField<SiteApiFilesRecord, String> PASSWORD = createField(DSL.name("password"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live.site_api_files.idview</code>.
     */
    public final TableField<SiteApiFilesRecord, String> IDVIEW = createField(DSL.name("idview"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live.site_api_files.enabled</code>.
     */
    public final TableField<SiteApiFilesRecord, Boolean> ENABLED = createField(DSL.name("enabled"), SQLDataType.BOOLEAN.defaultValue(DSL.field("false", SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>live.site_api_files.last_download</code>.
     */
    public final TableField<SiteApiFilesRecord, LocalTime> LAST_DOWNLOAD = createField(DSL.name("last_download"), SQLDataType.LOCALTIME(6), this, "");

    /**
     * The column <code>live.site_api_files.trackingkey</code>.
     */
    public final TableField<SiteApiFilesRecord, String> TRACKINGKEY = createField(DSL.name("trackingkey"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live.site_api_files.segment_regex</code>.
     */
    public final TableField<SiteApiFilesRecord, String> SEGMENT_REGEX = createField(DSL.name("segment_regex"), SQLDataType.CLOB, this, "");

    private SiteApiFiles(Name alias, Table<SiteApiFilesRecord> aliased) {
        this(alias, aliased, null);
    }

    private SiteApiFiles(Name alias, Table<SiteApiFilesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>live.site_api_files</code> table reference
     */
    public SiteApiFiles(String alias) {
        this(DSL.name(alias), SITE_API_FILES);
    }

    /**
     * Create an aliased <code>live.site_api_files</code> table reference
     */
    public SiteApiFiles(Name alias) {
        this(alias, SITE_API_FILES);
    }

    /**
     * Create a <code>live.site_api_files</code> table reference
     */
    public SiteApiFiles() {
        this(DSL.name("site_api_files"), null);
    }

    public <O extends Record> SiteApiFiles(Table<O> child, ForeignKey<O, SiteApiFilesRecord> key) {
        super(child, key, SITE_API_FILES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Live.LIVE;
    }

    @Override
    public Identity<SiteApiFilesRecord, Long> getIdentity() {
        return (Identity<SiteApiFilesRecord, Long>) super.getIdentity();
    }

    @Override
    public SiteApiFiles as(String alias) {
        return new SiteApiFiles(DSL.name(alias), this);
    }

    @Override
    public SiteApiFiles as(Name alias) {
        return new SiteApiFiles(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SiteApiFiles rename(String name) {
        return new SiteApiFiles(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SiteApiFiles rename(Name name) {
        return new SiteApiFiles(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<Long, Long, String, String, String, LocalTime, String, String, String, Boolean, LocalTime, String, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}
