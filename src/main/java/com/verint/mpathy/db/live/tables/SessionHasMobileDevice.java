/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables;


import com.verint.mpathy.db.live.Live;
import com.verint.mpathy.db.live.tables.records.SessionHasMobileDeviceRecord;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * The table contains the reference between a session and his mobile device
 * information.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SessionHasMobileDevice extends TableImpl<SessionHasMobileDeviceRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>live.session_has_mobile_device</code>
     */
    public static final SessionHasMobileDevice SESSION_HAS_MOBILE_DEVICE = new SessionHasMobileDevice();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SessionHasMobileDeviceRecord> getRecordType() {
        return SessionHasMobileDeviceRecord.class;
    }

    /**
     * The column <code>live.session_has_mobile_device.idsession</code>. The
     * session reference is part of the primary key.
     */
    public final TableField<SessionHasMobileDeviceRecord, Long> IDSESSION = createField(DSL.name("idsession"), SQLDataType.BIGINT.nullable(false).identity(true), this, "The session reference is part of the primary key.");

    /**
     * The column <code>live.session_has_mobile_device.idmobile_device</code>.
     * The foreign key to the "mobile_device" table is part of the primary key.
     */
    public final TableField<SessionHasMobileDeviceRecord, BigDecimal> IDMOBILE_DEVICE = createField(DSL.name("idmobile_device"), SQLDataType.NUMERIC.nullable(false), this, "The foreign key to the \"mobile_device\" table is part of the primary key.");

    private SessionHasMobileDevice(Name alias, Table<SessionHasMobileDeviceRecord> aliased) {
        this(alias, aliased, null);
    }

    private SessionHasMobileDevice(Name alias, Table<SessionHasMobileDeviceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("The table contains the reference between a session and his mobile device information."), TableOptions.table());
    }

    /**
     * Create an aliased <code>live.session_has_mobile_device</code> table
     * reference
     */
    public SessionHasMobileDevice(String alias) {
        this(DSL.name(alias), SESSION_HAS_MOBILE_DEVICE);
    }

    /**
     * Create an aliased <code>live.session_has_mobile_device</code> table
     * reference
     */
    public SessionHasMobileDevice(Name alias) {
        this(alias, SESSION_HAS_MOBILE_DEVICE);
    }

    /**
     * Create a <code>live.session_has_mobile_device</code> table reference
     */
    public SessionHasMobileDevice() {
        this(DSL.name("session_has_mobile_device"), null);
    }

    public <O extends Record> SessionHasMobileDevice(Table<O> child, ForeignKey<O, SessionHasMobileDeviceRecord> key) {
        super(child, key, SESSION_HAS_MOBILE_DEVICE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Live.LIVE;
    }

    @Override
    public Identity<SessionHasMobileDeviceRecord, Long> getIdentity() {
        return (Identity<SessionHasMobileDeviceRecord, Long>) super.getIdentity();
    }

    @Override
    public SessionHasMobileDevice as(String alias) {
        return new SessionHasMobileDevice(DSL.name(alias), this);
    }

    @Override
    public SessionHasMobileDevice as(Name alias) {
        return new SessionHasMobileDevice(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SessionHasMobileDevice rename(String name) {
        return new SessionHasMobileDevice(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SessionHasMobileDevice rename(Name name) {
        return new SessionHasMobileDevice(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, BigDecimal> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
