/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables;


import com.verint.mpathy.db.live_core.LiveCore;
import com.verint.mpathy.db.live_core.tables.records.BucketAlertEmailSettingRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
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
public class BucketAlertEmailSetting extends TableImpl<BucketAlertEmailSettingRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>live_core.bucket_alert_email_setting</code>
     */
    public static final BucketAlertEmailSetting BUCKET_ALERT_EMAIL_SETTING = new BucketAlertEmailSetting();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BucketAlertEmailSettingRecord> getRecordType() {
        return BucketAlertEmailSettingRecord.class;
    }

    /**
     * The column
     * <code>live_core.bucket_alert_email_setting.idbucket_alert_email_setting</code>.
     */
    public final TableField<BucketAlertEmailSettingRecord, Integer> IDBUCKET_ALERT_EMAIL_SETTING = createField(DSL.name("idbucket_alert_email_setting"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>live_core.bucket_alert_email_setting.idsite</code>.
     */
    public final TableField<BucketAlertEmailSettingRecord, Integer> IDSITE = createField(DSL.name("idsite"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>live_core.bucket_alert_email_setting.sender_address</code>.
     */
    public final TableField<BucketAlertEmailSettingRecord, String> SENDER_ADDRESS = createField(DSL.name("sender_address"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live_core.bucket_alert_email_setting.sender_name</code>.
     */
    public final TableField<BucketAlertEmailSettingRecord, String> SENDER_NAME = createField(DSL.name("sender_name"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>live_core.bucket_alert_email_setting.content_template</code>.
     */
    public final TableField<BucketAlertEmailSettingRecord, String> CONTENT_TEMPLATE = createField(DSL.name("content_template"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live_core.bucket_alert_email_setting.subject</code>.
     */
    public final TableField<BucketAlertEmailSettingRecord, String> SUBJECT = createField(DSL.name("subject"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live_core.bucket_alert_email_setting.bouncer</code>.
     */
    public final TableField<BucketAlertEmailSettingRecord, String> BOUNCER = createField(DSL.name("bouncer"), SQLDataType.CLOB, this, "");

    private BucketAlertEmailSetting(Name alias, Table<BucketAlertEmailSettingRecord> aliased) {
        this(alias, aliased, null);
    }

    private BucketAlertEmailSetting(Name alias, Table<BucketAlertEmailSettingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Easy access to underlying table in other schemas."), TableOptions.view("create view \"bucket_alert_email_setting\" as  SELECT bucket_alert_email_setting.idbucket_alert_email_setting,\n    bucket_alert_email_setting.idsite,\n    bucket_alert_email_setting.sender_address,\n    bucket_alert_email_setting.sender_name,\n    bucket_alert_email_setting.content_template,\n    bucket_alert_email_setting.subject,\n    bucket_alert_email_setting.bouncer\n   FROM live.bucket_alert_email_setting;"));
    }

    /**
     * Create an aliased <code>live_core.bucket_alert_email_setting</code> table
     * reference
     */
    public BucketAlertEmailSetting(String alias) {
        this(DSL.name(alias), BUCKET_ALERT_EMAIL_SETTING);
    }

    /**
     * Create an aliased <code>live_core.bucket_alert_email_setting</code> table
     * reference
     */
    public BucketAlertEmailSetting(Name alias) {
        this(alias, BUCKET_ALERT_EMAIL_SETTING);
    }

    /**
     * Create a <code>live_core.bucket_alert_email_setting</code> table
     * reference
     */
    public BucketAlertEmailSetting() {
        this(DSL.name("bucket_alert_email_setting"), null);
    }

    public <O extends Record> BucketAlertEmailSetting(Table<O> child, ForeignKey<O, BucketAlertEmailSettingRecord> key) {
        super(child, key, BUCKET_ALERT_EMAIL_SETTING);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : LiveCore.LIVE_CORE;
    }

    @Override
    public BucketAlertEmailSetting as(String alias) {
        return new BucketAlertEmailSetting(DSL.name(alias), this);
    }

    @Override
    public BucketAlertEmailSetting as(Name alias) {
        return new BucketAlertEmailSetting(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BucketAlertEmailSetting rename(String name) {
        return new BucketAlertEmailSetting(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BucketAlertEmailSetting rename(Name name) {
        return new BucketAlertEmailSetting(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, Integer, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
