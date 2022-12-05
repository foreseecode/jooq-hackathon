/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables.records;


import com.verint.mpathy.db.live.tables.SiteApiFiles;

import java.time.LocalTime;

import org.jooq.Field;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SiteApiFilesRecord extends TableRecordImpl<SiteApiFilesRecord> implements Record13<Long, Long, String, String, String, LocalTime, String, String, String, Boolean, LocalTime, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>live.site_api_files.idfile</code>.
     */
    public void setIdfile(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>live.site_api_files.idfile</code>.
     */
    public Long getIdfile() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>live.site_api_files.idsite</code>.
     */
    public void setIdsite(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>live.site_api_files.idsite</code>.
     */
    public Long getIdsite() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>live.site_api_files.subject</code>.
     */
    public void setSubject(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>live.site_api_files.subject</code>.
     */
    public String getSubject() {
        return (String) get(2);
    }

    /**
     * Setter for <code>live.site_api_files.file_name</code>.
     */
    public void setFileName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>live.site_api_files.file_name</code>.
     */
    public String getFileName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>live.site_api_files.file_type</code>.
     */
    public void setFileType(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>live.site_api_files.file_type</code>.
     */
    public String getFileType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>live.site_api_files.file_date</code>.
     */
    public void setFileDate(LocalTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>live.site_api_files.file_date</code>.
     */
    public LocalTime getFileDate() {
        return (LocalTime) get(5);
    }

    /**
     * Setter for <code>live.site_api_files.email</code>.
     */
    public void setEmail(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>live.site_api_files.email</code>.
     */
    public String getEmail() {
        return (String) get(6);
    }

    /**
     * Setter for <code>live.site_api_files.password</code>.
     */
    public void setPassword(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>live.site_api_files.password</code>.
     */
    public String getPassword() {
        return (String) get(7);
    }

    /**
     * Setter for <code>live.site_api_files.idview</code>.
     */
    public void setIdview(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>live.site_api_files.idview</code>.
     */
    public String getIdview() {
        return (String) get(8);
    }

    /**
     * Setter for <code>live.site_api_files.enabled</code>.
     */
    public void setEnabled(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>live.site_api_files.enabled</code>.
     */
    public Boolean getEnabled() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>live.site_api_files.last_download</code>.
     */
    public void setLastDownload(LocalTime value) {
        set(10, value);
    }

    /**
     * Getter for <code>live.site_api_files.last_download</code>.
     */
    public LocalTime getLastDownload() {
        return (LocalTime) get(10);
    }

    /**
     * Setter for <code>live.site_api_files.trackingkey</code>.
     */
    public void setTrackingkey(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>live.site_api_files.trackingkey</code>.
     */
    public String getTrackingkey() {
        return (String) get(11);
    }

    /**
     * Setter for <code>live.site_api_files.segment_regex</code>.
     */
    public void setSegmentRegex(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>live.site_api_files.segment_regex</code>.
     */
    public String getSegmentRegex() {
        return (String) get(12);
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row13<Long, Long, String, String, String, LocalTime, String, String, String, Boolean, LocalTime, String, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<Long, Long, String, String, String, LocalTime, String, String, String, Boolean, LocalTime, String, String> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return SiteApiFiles.SITE_API_FILES.IDFILE;
    }

    @Override
    public Field<Long> field2() {
        return SiteApiFiles.SITE_API_FILES.IDSITE;
    }

    @Override
    public Field<String> field3() {
        return SiteApiFiles.SITE_API_FILES.SUBJECT;
    }

    @Override
    public Field<String> field4() {
        return SiteApiFiles.SITE_API_FILES.FILE_NAME;
    }

    @Override
    public Field<String> field5() {
        return SiteApiFiles.SITE_API_FILES.FILE_TYPE;
    }

    @Override
    public Field<LocalTime> field6() {
        return SiteApiFiles.SITE_API_FILES.FILE_DATE;
    }

    @Override
    public Field<String> field7() {
        return SiteApiFiles.SITE_API_FILES.EMAIL;
    }

    @Override
    public Field<String> field8() {
        return SiteApiFiles.SITE_API_FILES.PASSWORD;
    }

    @Override
    public Field<String> field9() {
        return SiteApiFiles.SITE_API_FILES.IDVIEW;
    }

    @Override
    public Field<Boolean> field10() {
        return SiteApiFiles.SITE_API_FILES.ENABLED;
    }

    @Override
    public Field<LocalTime> field11() {
        return SiteApiFiles.SITE_API_FILES.LAST_DOWNLOAD;
    }

    @Override
    public Field<String> field12() {
        return SiteApiFiles.SITE_API_FILES.TRACKINGKEY;
    }

    @Override
    public Field<String> field13() {
        return SiteApiFiles.SITE_API_FILES.SEGMENT_REGEX;
    }

    @Override
    public Long component1() {
        return getIdfile();
    }

    @Override
    public Long component2() {
        return getIdsite();
    }

    @Override
    public String component3() {
        return getSubject();
    }

    @Override
    public String component4() {
        return getFileName();
    }

    @Override
    public String component5() {
        return getFileType();
    }

    @Override
    public LocalTime component6() {
        return getFileDate();
    }

    @Override
    public String component7() {
        return getEmail();
    }

    @Override
    public String component8() {
        return getPassword();
    }

    @Override
    public String component9() {
        return getIdview();
    }

    @Override
    public Boolean component10() {
        return getEnabled();
    }

    @Override
    public LocalTime component11() {
        return getLastDownload();
    }

    @Override
    public String component12() {
        return getTrackingkey();
    }

    @Override
    public String component13() {
        return getSegmentRegex();
    }

    @Override
    public Long value1() {
        return getIdfile();
    }

    @Override
    public Long value2() {
        return getIdsite();
    }

    @Override
    public String value3() {
        return getSubject();
    }

    @Override
    public String value4() {
        return getFileName();
    }

    @Override
    public String value5() {
        return getFileType();
    }

    @Override
    public LocalTime value6() {
        return getFileDate();
    }

    @Override
    public String value7() {
        return getEmail();
    }

    @Override
    public String value8() {
        return getPassword();
    }

    @Override
    public String value9() {
        return getIdview();
    }

    @Override
    public Boolean value10() {
        return getEnabled();
    }

    @Override
    public LocalTime value11() {
        return getLastDownload();
    }

    @Override
    public String value12() {
        return getTrackingkey();
    }

    @Override
    public String value13() {
        return getSegmentRegex();
    }

    @Override
    public SiteApiFilesRecord value1(Long value) {
        setIdfile(value);
        return this;
    }

    @Override
    public SiteApiFilesRecord value2(Long value) {
        setIdsite(value);
        return this;
    }

    @Override
    public SiteApiFilesRecord value3(String value) {
        setSubject(value);
        return this;
    }

    @Override
    public SiteApiFilesRecord value4(String value) {
        setFileName(value);
        return this;
    }

    @Override
    public SiteApiFilesRecord value5(String value) {
        setFileType(value);
        return this;
    }

    @Override
    public SiteApiFilesRecord value6(LocalTime value) {
        setFileDate(value);
        return this;
    }

    @Override
    public SiteApiFilesRecord value7(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public SiteApiFilesRecord value8(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public SiteApiFilesRecord value9(String value) {
        setIdview(value);
        return this;
    }

    @Override
    public SiteApiFilesRecord value10(Boolean value) {
        setEnabled(value);
        return this;
    }

    @Override
    public SiteApiFilesRecord value11(LocalTime value) {
        setLastDownload(value);
        return this;
    }

    @Override
    public SiteApiFilesRecord value12(String value) {
        setTrackingkey(value);
        return this;
    }

    @Override
    public SiteApiFilesRecord value13(String value) {
        setSegmentRegex(value);
        return this;
    }

    @Override
    public SiteApiFilesRecord values(Long value1, Long value2, String value3, String value4, String value5, LocalTime value6, String value7, String value8, String value9, Boolean value10, LocalTime value11, String value12, String value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SiteApiFilesRecord
     */
    public SiteApiFilesRecord() {
        super(SiteApiFiles.SITE_API_FILES);
    }

    /**
     * Create a detached, initialised SiteApiFilesRecord
     */
    public SiteApiFilesRecord(Long idfile, Long idsite, String subject, String fileName, String fileType, LocalTime fileDate, String email, String password, String idview, Boolean enabled, LocalTime lastDownload, String trackingkey, String segmentRegex) {
        super(SiteApiFiles.SITE_API_FILES);

        setIdfile(idfile);
        setIdsite(idsite);
        setSubject(subject);
        setFileName(fileName);
        setFileType(fileType);
        setFileDate(fileDate);
        setEmail(email);
        setPassword(password);
        setIdview(idview);
        setEnabled(enabled);
        setLastDownload(lastDownload);
        setTrackingkey(trackingkey);
        setSegmentRegex(segmentRegex);
    }
}
