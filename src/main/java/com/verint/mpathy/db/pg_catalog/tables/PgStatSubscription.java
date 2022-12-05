/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.pg_catalog.tables;


import com.verint.mpathy.db.pg_catalog.PgCatalog;
import com.verint.mpathy.db.pg_catalog.tables.records.PgStatSubscriptionRecord;

import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
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
public class PgStatSubscription extends TableImpl<PgStatSubscriptionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_subscription</code>
     */
    public static final PgStatSubscription PG_STAT_SUBSCRIPTION = new PgStatSubscription();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatSubscriptionRecord> getRecordType() {
        return PgStatSubscriptionRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_subscription.subid</code>.
     */
    public final TableField<PgStatSubscriptionRecord, Long> SUBID = createField(DSL.name("subid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_subscription.subname</code>.
     */
    public final TableField<PgStatSubscriptionRecord, String> SUBNAME = createField(DSL.name("subname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_subscription.pid</code>.
     */
    public final TableField<PgStatSubscriptionRecord, Integer> PID = createField(DSL.name("pid"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_subscription.relid</code>.
     */
    public final TableField<PgStatSubscriptionRecord, Long> RELID = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgStatSubscriptionRecord, Object> RECEIVED_LSN = createField(DSL.name("received_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_subscription.last_msg_send_time</code>.
     */
    public final TableField<PgStatSubscriptionRecord, OffsetDateTime> LAST_MSG_SEND_TIME = createField(DSL.name("last_msg_send_time"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_subscription.last_msg_receipt_time</code>.
     */
    public final TableField<PgStatSubscriptionRecord, OffsetDateTime> LAST_MSG_RECEIPT_TIME = createField(DSL.name("last_msg_receipt_time"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<PgStatSubscriptionRecord, Object> LATEST_END_LSN = createField(DSL.name("latest_end_lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_subscription.latest_end_time</code>.
     */
    public final TableField<PgStatSubscriptionRecord, OffsetDateTime> LATEST_END_TIME = createField(DSL.name("latest_end_time"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    private PgStatSubscription(Name alias, Table<PgStatSubscriptionRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatSubscription(Name alias, Table<PgStatSubscriptionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"pg_stat_subscription\" as  SELECT su.oid AS subid,\n    su.subname,\n    st.pid,\n    st.relid,\n    st.received_lsn,\n    st.last_msg_send_time,\n    st.last_msg_receipt_time,\n    st.latest_end_lsn,\n    st.latest_end_time\n   FROM (pg_subscription su\n     LEFT JOIN pg_stat_get_subscription(NULL::oid) st(subid, relid, pid, received_lsn, last_msg_send_time, last_msg_receipt_time, latest_end_lsn, latest_end_time) ON ((st.subid = su.oid)));"));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_subscription</code> table
     * reference
     */
    public PgStatSubscription(String alias) {
        this(DSL.name(alias), PG_STAT_SUBSCRIPTION);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_subscription</code> table
     * reference
     */
    public PgStatSubscription(Name alias) {
        this(alias, PG_STAT_SUBSCRIPTION);
    }

    /**
     * Create a <code>pg_catalog.pg_stat_subscription</code> table reference
     */
    public PgStatSubscription() {
        this(DSL.name("pg_stat_subscription"), null);
    }

    public <O extends Record> PgStatSubscription(Table<O> child, ForeignKey<O, PgStatSubscriptionRecord> key) {
        super(child, key, PG_STAT_SUBSCRIPTION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatSubscription as(String alias) {
        return new PgStatSubscription(DSL.name(alias), this);
    }

    @Override
    public PgStatSubscription as(Name alias) {
        return new PgStatSubscription(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatSubscription rename(String name) {
        return new PgStatSubscription(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatSubscription rename(Name name) {
        return new PgStatSubscription(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, String, Integer, Long, Object, OffsetDateTime, OffsetDateTime, Object, OffsetDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
