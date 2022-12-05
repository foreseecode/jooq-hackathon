/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_data.tables;


import com.verint.mpathy.db.live_data.LiveData;
import com.verint.mpathy.db.live_data.tables.records._SessionSelectionRecord;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row1;
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
public class _SessionSelection extends TableImpl<_SessionSelectionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>live_data._session_selection</code>
     */
    public static final _SessionSelection _SESSION_SELECTION = new _SessionSelection();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<_SessionSelectionRecord> getRecordType() {
        return _SessionSelectionRecord.class;
    }

    /**
     * The column <code>live_data._session_selection.idsession</code>.
     */
    public final TableField<_SessionSelectionRecord, BigDecimal> IDSESSION = createField(DSL.name("idsession"), SQLDataType.NUMERIC, this, "");

    private _SessionSelection(Name alias, Table<_SessionSelectionRecord> aliased) {
        this(alias, aliased, null);
    }

    private _SessionSelection(Name alias, Table<_SessionSelectionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>live_data._session_selection</code> table
     * reference
     */
    public _SessionSelection(String alias) {
        this(DSL.name(alias), _SESSION_SELECTION);
    }

    /**
     * Create an aliased <code>live_data._session_selection</code> table
     * reference
     */
    public _SessionSelection(Name alias) {
        this(alias, _SESSION_SELECTION);
    }

    /**
     * Create a <code>live_data._session_selection</code> table reference
     */
    public _SessionSelection() {
        this(DSL.name("_session_selection"), null);
    }

    public <O extends Record> _SessionSelection(Table<O> child, ForeignKey<O, _SessionSelectionRecord> key) {
        super(child, key, _SESSION_SELECTION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : LiveData.LIVE_DATA;
    }

    @Override
    public _SessionSelection as(String alias) {
        return new _SessionSelection(DSL.name(alias), this);
    }

    @Override
    public _SessionSelection as(Name alias) {
        return new _SessionSelection(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public _SessionSelection rename(String name) {
        return new _SessionSelection(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public _SessionSelection rename(Name name) {
        return new _SessionSelection(name, null);
    }

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row1<BigDecimal> fieldsRow() {
        return (Row1) super.fieldsRow();
    }
}
