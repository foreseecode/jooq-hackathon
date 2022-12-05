/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables;


import com.verint.mpathy.db.live.Live;
import com.verint.mpathy.db.live.tables.records.PrivilegeRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
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
public class Privilege extends TableImpl<PrivilegeRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>live.privilege</code>
     */
    public static final Privilege PRIVILEGE = new Privilege();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PrivilegeRecord> getRecordType() {
        return PrivilegeRecord.class;
    }

    /**
     * The column <code>live.privilege.idprivilege</code>.
     */
    public final TableField<PrivilegeRecord, Long> IDPRIVILEGE = createField(DSL.name("idprivilege"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>live.privilege.name</code>. technical name of the
     * privilege
     */
    public final TableField<PrivilegeRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "technical name of the privilege");

    /**
     * The column <code>live.privilege.description</code>. description of the
     * privilege
     */
    public final TableField<PrivilegeRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "description of the privilege");

    /**
     * The column <code>live.privilege.display_name</code>. text to show for
     * this privilege
     */
    public final TableField<PrivilegeRecord, String> DISPLAY_NAME = createField(DSL.name("display_name"), SQLDataType.CLOB, this, "text to show for this privilege");

    private Privilege(Name alias, Table<PrivilegeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Privilege(Name alias, Table<PrivilegeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>live.privilege</code> table reference
     */
    public Privilege(String alias) {
        this(DSL.name(alias), PRIVILEGE);
    }

    /**
     * Create an aliased <code>live.privilege</code> table reference
     */
    public Privilege(Name alias) {
        this(alias, PRIVILEGE);
    }

    /**
     * Create a <code>live.privilege</code> table reference
     */
    public Privilege() {
        this(DSL.name("privilege"), null);
    }

    public <O extends Record> Privilege(Table<O> child, ForeignKey<O, PrivilegeRecord> key) {
        super(child, key, PRIVILEGE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Live.LIVE;
    }

    @Override
    public Identity<PrivilegeRecord, Long> getIdentity() {
        return (Identity<PrivilegeRecord, Long>) super.getIdentity();
    }

    @Override
    public Privilege as(String alias) {
        return new Privilege(DSL.name(alias), this);
    }

    @Override
    public Privilege as(Name alias) {
        return new Privilege(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Privilege rename(String name) {
        return new Privilege(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Privilege rename(Name name) {
        return new Privilege(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
