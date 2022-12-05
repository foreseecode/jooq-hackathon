/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables.records;


import com.verint.mpathy.db.live_core.tables.AdobeAnalyticsSuite;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


/**
 * Easy access to underlying table in other schemas.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AdobeAnalyticsSuiteRecord extends TableRecordImpl<AdobeAnalyticsSuiteRecord> implements Record5<Long, Integer, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>live_core.adobe_analytics_suite.idsuite</code>.
     */
    public void setIdsuite(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>live_core.adobe_analytics_suite.idsuite</code>.
     */
    public Long getIdsuite() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>live_core.adobe_analytics_suite.idsite</code>.
     */
    public void setIdsite(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>live_core.adobe_analytics_suite.idsite</code>.
     */
    public Integer getIdsite() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>live_core.adobe_analytics_suite.segment_regex</code>.
     */
    public void setSegmentRegex(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>live_core.adobe_analytics_suite.segment_regex</code>.
     */
    public String getSegmentRegex() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>live_core.adobe_analytics_suite.visitor_data_ref_column</code>.
     */
    public void setVisitorDataRefColumn(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>live_core.adobe_analytics_suite.visitor_data_ref_column</code>.
     */
    public String getVisitorDataRefColumn() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>live_core.adobe_analytics_suite.segment_regex_enable</code>.
     */
    public void setSegmentRegexEnable(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>live_core.adobe_analytics_suite.segment_regex_enable</code>.
     */
    public String getSegmentRegexEnable() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, Integer, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Long, Integer, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return AdobeAnalyticsSuite.ADOBE_ANALYTICS_SUITE.IDSUITE;
    }

    @Override
    public Field<Integer> field2() {
        return AdobeAnalyticsSuite.ADOBE_ANALYTICS_SUITE.IDSITE;
    }

    @Override
    public Field<String> field3() {
        return AdobeAnalyticsSuite.ADOBE_ANALYTICS_SUITE.SEGMENT_REGEX;
    }

    @Override
    public Field<String> field4() {
        return AdobeAnalyticsSuite.ADOBE_ANALYTICS_SUITE.VISITOR_DATA_REF_COLUMN;
    }

    @Override
    public Field<String> field5() {
        return AdobeAnalyticsSuite.ADOBE_ANALYTICS_SUITE.SEGMENT_REGEX_ENABLE;
    }

    @Override
    public Long component1() {
        return getIdsuite();
    }

    @Override
    public Integer component2() {
        return getIdsite();
    }

    @Override
    public String component3() {
        return getSegmentRegex();
    }

    @Override
    public String component4() {
        return getVisitorDataRefColumn();
    }

    @Override
    public String component5() {
        return getSegmentRegexEnable();
    }

    @Override
    public Long value1() {
        return getIdsuite();
    }

    @Override
    public Integer value2() {
        return getIdsite();
    }

    @Override
    public String value3() {
        return getSegmentRegex();
    }

    @Override
    public String value4() {
        return getVisitorDataRefColumn();
    }

    @Override
    public String value5() {
        return getSegmentRegexEnable();
    }

    @Override
    public AdobeAnalyticsSuiteRecord value1(Long value) {
        setIdsuite(value);
        return this;
    }

    @Override
    public AdobeAnalyticsSuiteRecord value2(Integer value) {
        setIdsite(value);
        return this;
    }

    @Override
    public AdobeAnalyticsSuiteRecord value3(String value) {
        setSegmentRegex(value);
        return this;
    }

    @Override
    public AdobeAnalyticsSuiteRecord value4(String value) {
        setVisitorDataRefColumn(value);
        return this;
    }

    @Override
    public AdobeAnalyticsSuiteRecord value5(String value) {
        setSegmentRegexEnable(value);
        return this;
    }

    @Override
    public AdobeAnalyticsSuiteRecord values(Long value1, Integer value2, String value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AdobeAnalyticsSuiteRecord
     */
    public AdobeAnalyticsSuiteRecord() {
        super(AdobeAnalyticsSuite.ADOBE_ANALYTICS_SUITE);
    }

    /**
     * Create a detached, initialised AdobeAnalyticsSuiteRecord
     */
    public AdobeAnalyticsSuiteRecord(Long idsuite, Integer idsite, String segmentRegex, String visitorDataRefColumn, String segmentRegexEnable) {
        super(AdobeAnalyticsSuite.ADOBE_ANALYTICS_SUITE);

        setIdsuite(idsuite);
        setIdsite(idsite);
        setSegmentRegex(segmentRegex);
        setVisitorDataRefColumn(visitorDataRefColumn);
        setSegmentRegexEnable(segmentRegexEnable);
    }
}
