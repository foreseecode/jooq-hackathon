/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables.records;


import com.verint.mpathy.db.live.tables.Useragent;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UseragentRecord extends TableRecordImpl<UseragentRecord> implements Record6<Long, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>live.useragent.iduseragent</code>.
     */
    public void setIduseragent(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>live.useragent.iduseragent</code>.
     */
    public Long getIduseragent() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>live.useragent.product</code>.
     */
    public void setProduct(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>live.useragent.product</code>.
     */
    public String getProduct() {
        return (String) get(1);
    }

    /**
     * Setter for <code>live.useragent.version</code>.
     */
    public void setVersion(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>live.useragent.version</code>.
     */
    public String getVersion() {
        return (String) get(2);
    }

    /**
     * Setter for <code>live.useragent.os</code>.
     */
    public void setOs(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>live.useragent.os</code>.
     */
    public String getOs() {
        return (String) get(3);
    }

    /**
     * Setter for <code>live.useragent.ua_string</code>.
     */
    public void setUaString(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>live.useragent.ua_string</code>.
     */
    public String getUaString() {
        return (String) get(4);
    }

    /**
     * Setter for <code>live.useragent.type</code>.
     */
    public void setType(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>live.useragent.type</code>.
     */
    public String getType() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Long, String, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Useragent.USERAGENT.IDUSERAGENT;
    }

    @Override
    public Field<String> field2() {
        return Useragent.USERAGENT.PRODUCT;
    }

    @Override
    public Field<String> field3() {
        return Useragent.USERAGENT.VERSION;
    }

    @Override
    public Field<String> field4() {
        return Useragent.USERAGENT.OS;
    }

    @Override
    public Field<String> field5() {
        return Useragent.USERAGENT.UA_STRING;
    }

    @Override
    public Field<String> field6() {
        return Useragent.USERAGENT.TYPE;
    }

    @Override
    public Long component1() {
        return getIduseragent();
    }

    @Override
    public String component2() {
        return getProduct();
    }

    @Override
    public String component3() {
        return getVersion();
    }

    @Override
    public String component4() {
        return getOs();
    }

    @Override
    public String component5() {
        return getUaString();
    }

    @Override
    public String component6() {
        return getType();
    }

    @Override
    public Long value1() {
        return getIduseragent();
    }

    @Override
    public String value2() {
        return getProduct();
    }

    @Override
    public String value3() {
        return getVersion();
    }

    @Override
    public String value4() {
        return getOs();
    }

    @Override
    public String value5() {
        return getUaString();
    }

    @Override
    public String value6() {
        return getType();
    }

    @Override
    public UseragentRecord value1(Long value) {
        setIduseragent(value);
        return this;
    }

    @Override
    public UseragentRecord value2(String value) {
        setProduct(value);
        return this;
    }

    @Override
    public UseragentRecord value3(String value) {
        setVersion(value);
        return this;
    }

    @Override
    public UseragentRecord value4(String value) {
        setOs(value);
        return this;
    }

    @Override
    public UseragentRecord value5(String value) {
        setUaString(value);
        return this;
    }

    @Override
    public UseragentRecord value6(String value) {
        setType(value);
        return this;
    }

    @Override
    public UseragentRecord values(Long value1, String value2, String value3, String value4, String value5, String value6) {
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
     * Create a detached UseragentRecord
     */
    public UseragentRecord() {
        super(Useragent.USERAGENT);
    }

    /**
     * Create a detached, initialised UseragentRecord
     */
    public UseragentRecord(Long iduseragent, String product, String version, String os, String uaString, String type) {
        super(Useragent.USERAGENT);

        setIduseragent(iduseragent);
        setProduct(product);
        setVersion(version);
        setOs(os);
        setUaString(uaString);
        setType(type);
    }
}
