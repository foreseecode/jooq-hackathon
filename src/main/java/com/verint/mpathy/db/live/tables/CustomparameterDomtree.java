/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables;


import com.verint.mpathy.db.live.Live;
import com.verint.mpathy.db.live.tables.records.CustomparameterDomtreeRecord;

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
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CustomparameterDomtree extends TableImpl<CustomparameterDomtreeRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>live.customparameter_domtree</code>
     */
    public static final CustomparameterDomtree CUSTOMPARAMETER_DOMTREE = new CustomparameterDomtree();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CustomparameterDomtreeRecord> getRecordType() {
        return CustomparameterDomtreeRecord.class;
    }

    /**
     * The column <code>live.customparameter_domtree.idcp</code>.
     */
    public final TableField<CustomparameterDomtreeRecord, Long> IDCP = createField(DSL.name("idcp"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>live.customparameter_domtree.selector</code>.
     */
    public final TableField<CustomparameterDomtreeRecord, String> SELECTOR = createField(DSL.name("selector"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live.customparameter_domtree.extractmode</code>.
     */
    public final TableField<CustomparameterDomtreeRecord, String> EXTRACTMODE = createField(DSL.name("extractmode"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>live.customparameter_domtree.attribute</code>.
     */
    public final TableField<CustomparameterDomtreeRecord, String> ATTRIBUTE = createField(DSL.name("attribute"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live.customparameter_domtree.parserregex</code>.
     */
    public final TableField<CustomparameterDomtreeRecord, String> PARSERREGEX = createField(DSL.name("parserregex"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live.customparameter_domtree.excluderegex</code>.
     */
    public final TableField<CustomparameterDomtreeRecord, String> EXCLUDEREGEX = createField(DSL.name("excluderegex"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live.customparameter_domtree.excludeitems</code>.
     */
    public final TableField<CustomparameterDomtreeRecord, String> EXCLUDEITEMS = createField(DSL.name("excludeitems"), SQLDataType.CLOB, this, "");

    private CustomparameterDomtree(Name alias, Table<CustomparameterDomtreeRecord> aliased) {
        this(alias, aliased, null);
    }

    private CustomparameterDomtree(Name alias, Table<CustomparameterDomtreeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>live.customparameter_domtree</code> table
     * reference
     */
    public CustomparameterDomtree(String alias) {
        this(DSL.name(alias), CUSTOMPARAMETER_DOMTREE);
    }

    /**
     * Create an aliased <code>live.customparameter_domtree</code> table
     * reference
     */
    public CustomparameterDomtree(Name alias) {
        this(alias, CUSTOMPARAMETER_DOMTREE);
    }

    /**
     * Create a <code>live.customparameter_domtree</code> table reference
     */
    public CustomparameterDomtree() {
        this(DSL.name("customparameter_domtree"), null);
    }

    public <O extends Record> CustomparameterDomtree(Table<O> child, ForeignKey<O, CustomparameterDomtreeRecord> key) {
        super(child, key, CUSTOMPARAMETER_DOMTREE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Live.LIVE;
    }

    @Override
    public CustomparameterDomtree as(String alias) {
        return new CustomparameterDomtree(DSL.name(alias), this);
    }

    @Override
    public CustomparameterDomtree as(Name alias) {
        return new CustomparameterDomtree(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CustomparameterDomtree rename(String name) {
        return new CustomparameterDomtree(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CustomparameterDomtree rename(Name name) {
        return new CustomparameterDomtree(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
