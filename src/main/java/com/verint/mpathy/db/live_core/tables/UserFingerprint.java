/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables;


import com.verint.mpathy.db.live_core.LiveCore;
import com.verint.mpathy.db.live_core.tables.records.UserFingerprintRecord;

import java.time.LocalTime;

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
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserFingerprint extends TableImpl<UserFingerprintRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>live_core.user_fingerprint</code>
     */
    public static final UserFingerprint USER_FINGERPRINT = new UserFingerprint();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserFingerprintRecord> getRecordType() {
        return UserFingerprintRecord.class;
    }

    /**
     * The column <code>live_core.user_fingerprint.iduser</code>.
     */
    public final TableField<UserFingerprintRecord, Long> IDUSER = createField(DSL.name("iduser"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>live_core.user_fingerprint.hashed_ip</code>.
     */
    public final TableField<UserFingerprintRecord, String> HASHED_IP = createField(DSL.name("hashed_ip"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live_core.user_fingerprint.login_session_id</code>.
     */
    public final TableField<UserFingerprintRecord, String> LOGIN_SESSION_ID = createField(DSL.name("login_session_id"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live_core.user_fingerprint.fingerprint_hash</code>.
     */
    public final TableField<UserFingerprintRecord, String> FINGERPRINT_HASH = createField(DSL.name("fingerprint_hash"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live_core.user_fingerprint.fingerprint_json</code>.
     */
    public final TableField<UserFingerprintRecord, String> FINGERPRINT_JSON = createField(DSL.name("fingerprint_json"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live_core.user_fingerprint.first_logged_in_at</code>.
     */
    public final TableField<UserFingerprintRecord, LocalTime> FIRST_LOGGED_IN_AT = createField(DSL.name("first_logged_in_at"), SQLDataType.LOCALTIME(6), this, "");

    /**
     * The column <code>live_core.user_fingerprint.last_activity_at</code>.
     */
    public final TableField<UserFingerprintRecord, LocalTime> LAST_ACTIVITY_AT = createField(DSL.name("last_activity_at"), SQLDataType.LOCALTIME(6), this, "");

    /**
     * The column <code>live_core.user_fingerprint.login_count</code>.
     */
    public final TableField<UserFingerprintRecord, Long> LOGIN_COUNT = createField(DSL.name("login_count"), SQLDataType.BIGINT, this, "");

    private UserFingerprint(Name alias, Table<UserFingerprintRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserFingerprint(Name alias, Table<UserFingerprintRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>live_core.user_fingerprint</code> table reference
     */
    public UserFingerprint(String alias) {
        this(DSL.name(alias), USER_FINGERPRINT);
    }

    /**
     * Create an aliased <code>live_core.user_fingerprint</code> table reference
     */
    public UserFingerprint(Name alias) {
        this(alias, USER_FINGERPRINT);
    }

    /**
     * Create a <code>live_core.user_fingerprint</code> table reference
     */
    public UserFingerprint() {
        this(DSL.name("user_fingerprint"), null);
    }

    public <O extends Record> UserFingerprint(Table<O> child, ForeignKey<O, UserFingerprintRecord> key) {
        super(child, key, USER_FINGERPRINT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : LiveCore.LIVE_CORE;
    }

    @Override
    public UserFingerprint as(String alias) {
        return new UserFingerprint(DSL.name(alias), this);
    }

    @Override
    public UserFingerprint as(Name alias) {
        return new UserFingerprint(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserFingerprint rename(String name) {
        return new UserFingerprint(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserFingerprint rename(Name name) {
        return new UserFingerprint(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, String, String, String, String, LocalTime, LocalTime, Long> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
