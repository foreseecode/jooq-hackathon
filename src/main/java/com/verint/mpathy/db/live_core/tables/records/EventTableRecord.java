/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables.records;


import com.verint.mpathy.db.live_core.tables.EventTable;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;


/**
 * Easy access to underlying table in other schemas.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EventTableRecord extends TableRecordImpl<EventTableRecord> implements Record6<Short, String, String, Boolean, Short, Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>live_core.event_table.idevent</code>.
     */
    public void setIdevent(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>live_core.event_table.idevent</code>.
     */
    public Short getIdevent() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>live_core.event_table.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>live_core.event_table.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>live_core.event_table.structure</code>.
     */
    public void setStructure(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>live_core.event_table.structure</code>.
     */
    public String getStructure() {
        return (String) get(2);
    }

    /**
     * Setter for <code>live_core.event_table.user_activity</code>.
     */
    public void setUserActivity(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>live_core.event_table.user_activity</code>.
     */
    public Boolean getUserActivity() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>live_core.event_table.revision</code>.
     */
    public void setRevision(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>live_core.event_table.revision</code>.
     */
    public Short getRevision() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>live_core.event_table.deprecated</code>.
     */
    public void setDeprecated(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>live_core.event_table.deprecated</code>.
     */
    public Boolean getDeprecated() {
        return (Boolean) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Short, String, String, Boolean, Short, Boolean> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Short, String, String, Boolean, Short, Boolean> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Short> field1() {
        return EventTable.EVENT_TABLE.IDEVENT;
    }

    @Override
    public Field<String> field2() {
        return EventTable.EVENT_TABLE.NAME;
    }

    @Override
    public Field<String> field3() {
        return EventTable.EVENT_TABLE.STRUCTURE;
    }

    @Override
    public Field<Boolean> field4() {
        return EventTable.EVENT_TABLE.USER_ACTIVITY;
    }

    @Override
    public Field<Short> field5() {
        return EventTable.EVENT_TABLE.REVISION;
    }

    @Override
    public Field<Boolean> field6() {
        return EventTable.EVENT_TABLE.DEPRECATED;
    }

    @Override
    public Short component1() {
        return getIdevent();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getStructure();
    }

    @Override
    public Boolean component4() {
        return getUserActivity();
    }

    @Override
    public Short component5() {
        return getRevision();
    }

    @Override
    public Boolean component6() {
        return getDeprecated();
    }

    @Override
    public Short value1() {
        return getIdevent();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getStructure();
    }

    @Override
    public Boolean value4() {
        return getUserActivity();
    }

    @Override
    public Short value5() {
        return getRevision();
    }

    @Override
    public Boolean value6() {
        return getDeprecated();
    }

    @Override
    public EventTableRecord value1(Short value) {
        setIdevent(value);
        return this;
    }

    @Override
    public EventTableRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public EventTableRecord value3(String value) {
        setStructure(value);
        return this;
    }

    @Override
    public EventTableRecord value4(Boolean value) {
        setUserActivity(value);
        return this;
    }

    @Override
    public EventTableRecord value5(Short value) {
        setRevision(value);
        return this;
    }

    @Override
    public EventTableRecord value6(Boolean value) {
        setDeprecated(value);
        return this;
    }

    @Override
    public EventTableRecord values(Short value1, String value2, String value3, Boolean value4, Short value5, Boolean value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EventTableRecord
     */
    public EventTableRecord() {
        super(EventTable.EVENT_TABLE);
    }

    /**
     * Create a detached, initialised EventTableRecord
     */
    public EventTableRecord(Short idevent, String name, String structure, Boolean userActivity, Short revision, Boolean deprecated) {
        super(EventTable.EVENT_TABLE);

        setIdevent(idevent);
        setName(name);
        setStructure(structure);
        setUserActivity(userActivity);
        setRevision(revision);
        setDeprecated(deprecated);
    }
}
