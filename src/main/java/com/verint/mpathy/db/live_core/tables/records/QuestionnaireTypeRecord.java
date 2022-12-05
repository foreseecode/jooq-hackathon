/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables.records;


import com.verint.mpathy.db.live_core.tables.QuestionnaireType;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * Easy access to underlying table in other schemas.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class QuestionnaireTypeRecord extends TableRecordImpl<QuestionnaireTypeRecord> implements Record3<Long, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>live_core.questionnaire_type.idquestionnaire_type</code>.
     */
    public void setIdquestionnaireType(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>live_core.questionnaire_type.idquestionnaire_type</code>.
     */
    public Long getIdquestionnaireType() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>live_core.questionnaire_type.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>live_core.questionnaire_type.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>live_core.questionnaire_type.text</code>.
     */
    public void setText(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>live_core.questionnaire_type.text</code>.
     */
    public String getText() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Long, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return QuestionnaireType.QUESTIONNAIRE_TYPE.IDQUESTIONNAIRE_TYPE;
    }

    @Override
    public Field<String> field2() {
        return QuestionnaireType.QUESTIONNAIRE_TYPE.NAME;
    }

    @Override
    public Field<String> field3() {
        return QuestionnaireType.QUESTIONNAIRE_TYPE.TEXT;
    }

    @Override
    public Long component1() {
        return getIdquestionnaireType();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getText();
    }

    @Override
    public Long value1() {
        return getIdquestionnaireType();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getText();
    }

    @Override
    public QuestionnaireTypeRecord value1(Long value) {
        setIdquestionnaireType(value);
        return this;
    }

    @Override
    public QuestionnaireTypeRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public QuestionnaireTypeRecord value3(String value) {
        setText(value);
        return this;
    }

    @Override
    public QuestionnaireTypeRecord values(Long value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached QuestionnaireTypeRecord
     */
    public QuestionnaireTypeRecord() {
        super(QuestionnaireType.QUESTIONNAIRE_TYPE);
    }

    /**
     * Create a detached, initialised QuestionnaireTypeRecord
     */
    public QuestionnaireTypeRecord(Long idquestionnaireType, String name, String text) {
        super(QuestionnaireType.QUESTIONNAIRE_TYPE);

        setIdquestionnaireType(idquestionnaireType);
        setName(name);
        setText(text);
    }
}
