/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables.records;


import com.verint.mpathy.db.live_core.tables.BucketTemplate;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


/**
 * Easy access to underlying table in other schemas.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BucketTemplateRecord extends TableRecordImpl<BucketTemplateRecord> implements Record7<String, Short, Long, Short, Short, Long, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>live_core.bucket_template.type</code>.
     */
    public void setType(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>live_core.bucket_template.type</code>.
     */
    public String getType() {
        return (String) get(0);
    }

    /**
     * Setter for <code>live_core.bucket_template.retention</code>.
     */
    public void setRetention(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>live_core.bucket_template.retention</code>.
     */
    public Short getRetention() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>live_core.bucket_template.limit</code>.
     */
    public void setLimit(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>live_core.bucket_template.limit</code>.
     */
    public Long getLimit() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>live_core.bucket_template.alert_threshold</code>.
     */
    public void setAlertThreshold(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>live_core.bucket_template.alert_threshold</code>.
     */
    public Short getAlertThreshold() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>live_core.bucket_template.count_delay</code>.
     */
    public void setCountDelay(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>live_core.bucket_template.count_delay</code>.
     */
    public Short getCountDelay() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>live_core.bucket_template.priority</code>.
     */
    public void setPriority(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>live_core.bucket_template.priority</code>.
     */
    public Long getPriority() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>live_core.bucket_template.name</code>.
     */
    public void setName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>live_core.bucket_template.name</code>.
     */
    public String getName() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, Short, Long, Short, Short, Long, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<String, Short, Long, Short, Short, Long, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return BucketTemplate.BUCKET_TEMPLATE.TYPE;
    }

    @Override
    public Field<Short> field2() {
        return BucketTemplate.BUCKET_TEMPLATE.RETENTION;
    }

    @Override
    public Field<Long> field3() {
        return BucketTemplate.BUCKET_TEMPLATE.LIMIT;
    }

    @Override
    public Field<Short> field4() {
        return BucketTemplate.BUCKET_TEMPLATE.ALERT_THRESHOLD;
    }

    @Override
    public Field<Short> field5() {
        return BucketTemplate.BUCKET_TEMPLATE.COUNT_DELAY;
    }

    @Override
    public Field<Long> field6() {
        return BucketTemplate.BUCKET_TEMPLATE.PRIORITY;
    }

    @Override
    public Field<String> field7() {
        return BucketTemplate.BUCKET_TEMPLATE.NAME;
    }

    @Override
    public String component1() {
        return getType();
    }

    @Override
    public Short component2() {
        return getRetention();
    }

    @Override
    public Long component3() {
        return getLimit();
    }

    @Override
    public Short component4() {
        return getAlertThreshold();
    }

    @Override
    public Short component5() {
        return getCountDelay();
    }

    @Override
    public Long component6() {
        return getPriority();
    }

    @Override
    public String component7() {
        return getName();
    }

    @Override
    public String value1() {
        return getType();
    }

    @Override
    public Short value2() {
        return getRetention();
    }

    @Override
    public Long value3() {
        return getLimit();
    }

    @Override
    public Short value4() {
        return getAlertThreshold();
    }

    @Override
    public Short value5() {
        return getCountDelay();
    }

    @Override
    public Long value6() {
        return getPriority();
    }

    @Override
    public String value7() {
        return getName();
    }

    @Override
    public BucketTemplateRecord value1(String value) {
        setType(value);
        return this;
    }

    @Override
    public BucketTemplateRecord value2(Short value) {
        setRetention(value);
        return this;
    }

    @Override
    public BucketTemplateRecord value3(Long value) {
        setLimit(value);
        return this;
    }

    @Override
    public BucketTemplateRecord value4(Short value) {
        setAlertThreshold(value);
        return this;
    }

    @Override
    public BucketTemplateRecord value5(Short value) {
        setCountDelay(value);
        return this;
    }

    @Override
    public BucketTemplateRecord value6(Long value) {
        setPriority(value);
        return this;
    }

    @Override
    public BucketTemplateRecord value7(String value) {
        setName(value);
        return this;
    }

    @Override
    public BucketTemplateRecord values(String value1, Short value2, Long value3, Short value4, Short value5, Long value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BucketTemplateRecord
     */
    public BucketTemplateRecord() {
        super(BucketTemplate.BUCKET_TEMPLATE);
    }

    /**
     * Create a detached, initialised BucketTemplateRecord
     */
    public BucketTemplateRecord(String type, Short retention, Long limit, Short alertThreshold, Short countDelay, Long priority, String name) {
        super(BucketTemplate.BUCKET_TEMPLATE);

        setType(type);
        setRetention(retention);
        setLimit(limit);
        setAlertThreshold(alertThreshold);
        setCountDelay(countDelay);
        setPriority(priority);
        setName(name);
    }
}
