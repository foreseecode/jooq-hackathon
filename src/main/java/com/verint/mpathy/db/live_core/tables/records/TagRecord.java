/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables.records;


import com.verint.mpathy.db.live_core.tables.Tag;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * Easy access to underlying table in other schemas.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TagRecord extends TableRecordImpl<TagRecord> implements Record2<Long, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>live_core.tag.idtag</code>.
     */
    public void setIdtag(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>live_core.tag.idtag</code>.
     */
    public Long getIdtag() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>live_core.tag.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>live_core.tag.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Long, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Tag.TAG.IDTAG;
    }

    @Override
    public Field<String> field2() {
        return Tag.TAG.NAME;
    }

    @Override
    public Long component1() {
        return getIdtag();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Long value1() {
        return getIdtag();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public TagRecord value1(Long value) {
        setIdtag(value);
        return this;
    }

    @Override
    public TagRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public TagRecord values(Long value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TagRecord
     */
    public TagRecord() {
        super(Tag.TAG);
    }

    /**
     * Create a detached, initialised TagRecord
     */
    public TagRecord(Long idtag, String name) {
        super(Tag.TAG);

        setIdtag(idtag);
        setName(name);
    }
}
