/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.information_schema.tables;


import com.verint.mpathy.db.information_schema.InformationSchema;
import com.verint.mpathy.db.information_schema.tables.records.RoutineRoutineUsageRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoutineRoutineUsage extends TableImpl<RoutineRoutineUsageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.routine_routine_usage</code>
     */
    public static final RoutineRoutineUsage ROUTINE_ROUTINE_USAGE = new RoutineRoutineUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoutineRoutineUsageRecord> getRecordType() {
        return RoutineRoutineUsageRecord.class;
    }

    /**
     * The column
     * <code>information_schema.routine_routine_usage.specific_catalog</code>.
     */
    public final TableField<RoutineRoutineUsageRecord, String> SPECIFIC_CATALOG = createField(DSL.name("specific_catalog"), com.verint.mpathy.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_routine_usage.specific_schema</code>.
     */
    public final TableField<RoutineRoutineUsageRecord, String> SPECIFIC_SCHEMA = createField(DSL.name("specific_schema"), com.verint.mpathy.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_routine_usage.specific_name</code>.
     */
    public final TableField<RoutineRoutineUsageRecord, String> SPECIFIC_NAME = createField(DSL.name("specific_name"), com.verint.mpathy.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_routine_usage.routine_catalog</code>.
     */
    public final TableField<RoutineRoutineUsageRecord, String> ROUTINE_CATALOG = createField(DSL.name("routine_catalog"), com.verint.mpathy.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_routine_usage.routine_schema</code>.
     */
    public final TableField<RoutineRoutineUsageRecord, String> ROUTINE_SCHEMA = createField(DSL.name("routine_schema"), com.verint.mpathy.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routine_routine_usage.routine_name</code>.
     */
    public final TableField<RoutineRoutineUsageRecord, String> ROUTINE_NAME = createField(DSL.name("routine_name"), com.verint.mpathy.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private RoutineRoutineUsage(Name alias, Table<RoutineRoutineUsageRecord> aliased) {
        this(alias, aliased, null);
    }

    private RoutineRoutineUsage(Name alias, Table<RoutineRoutineUsageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"routine_routine_usage\" as  SELECT DISTINCT (current_database())::information_schema.sql_identifier AS specific_catalog,\n    (np.nspname)::information_schema.sql_identifier AS specific_schema,\n    (nameconcatoid(p.proname, p.oid))::information_schema.sql_identifier AS specific_name,\n    (current_database())::information_schema.sql_identifier AS routine_catalog,\n    (np1.nspname)::information_schema.sql_identifier AS routine_schema,\n    (nameconcatoid(p1.proname, p1.oid))::information_schema.sql_identifier AS routine_name\n   FROM pg_namespace np,\n    pg_proc p,\n    pg_depend d,\n    pg_proc p1,\n    pg_namespace np1\n  WHERE ((np.oid = p.pronamespace) AND (p.oid = d.objid) AND (d.classid = ('pg_proc'::regclass)::oid) AND (d.refobjid = p1.oid) AND (d.refclassid = ('pg_proc'::regclass)::oid) AND (p1.pronamespace = np1.oid) AND (p.prokind = ANY (ARRAY['f'::\"char\", 'p'::\"char\"])) AND (p1.prokind = ANY (ARRAY['f'::\"char\", 'p'::\"char\"])) AND pg_has_role(p1.proowner, 'USAGE'::text));"));
    }

    /**
     * Create an aliased <code>information_schema.routine_routine_usage</code>
     * table reference
     */
    public RoutineRoutineUsage(String alias) {
        this(DSL.name(alias), ROUTINE_ROUTINE_USAGE);
    }

    /**
     * Create an aliased <code>information_schema.routine_routine_usage</code>
     * table reference
     */
    public RoutineRoutineUsage(Name alias) {
        this(alias, ROUTINE_ROUTINE_USAGE);
    }

    /**
     * Create a <code>information_schema.routine_routine_usage</code> table
     * reference
     */
    public RoutineRoutineUsage() {
        this(DSL.name("routine_routine_usage"), null);
    }

    public <O extends Record> RoutineRoutineUsage(Table<O> child, ForeignKey<O, RoutineRoutineUsageRecord> key) {
        super(child, key, ROUTINE_ROUTINE_USAGE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public RoutineRoutineUsage as(String alias) {
        return new RoutineRoutineUsage(DSL.name(alias), this);
    }

    @Override
    public RoutineRoutineUsage as(Name alias) {
        return new RoutineRoutineUsage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RoutineRoutineUsage rename(String name) {
        return new RoutineRoutineUsage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoutineRoutineUsage rename(Name name) {
        return new RoutineRoutineUsage(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
