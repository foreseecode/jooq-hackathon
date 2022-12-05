/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live_core.tables.records;


import com.verint.mpathy.db.live_core.tables.QuestionnaireElement;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * Easy access to underlying table in other schemas.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class QuestionnaireElementRecord extends TableRecordImpl<QuestionnaireElementRecord> implements Record2<Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>live_core.questionnaire_element.idquestionnaire_element</code>.
     */
    public void setIdquestionnaireElement(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>live_core.questionnaire_element.idquestionnaire_element</code>.
     */
    public Long getIdquestionnaireElement() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>live_core.questionnaire_element.idquestionnaire</code>.
     */
    public void setIdquestionnaire(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>live_core.questionnaire_element.idquestionnaire</code>.
     */
    public Long getIdquestionnaire() {
        return (Long) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Long, Long> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return QuestionnaireElement.QUESTIONNAIRE_ELEMENT.IDQUESTIONNAIRE_ELEMENT;
    }

    @Override
    public Field<Long> field2() {
        return QuestionnaireElement.QUESTIONNAIRE_ELEMENT.IDQUESTIONNAIRE;
    }

    @Override
    public Long component1() {
        return getIdquestionnaireElement();
    }

    @Override
    public Long component2() {
        return getIdquestionnaire();
    }

    @Override
    public Long value1() {
        return getIdquestionnaireElement();
    }

    @Override
    public Long value2() {
        return getIdquestionnaire();
    }

    @Override
    public QuestionnaireElementRecord value1(Long value) {
        setIdquestionnaireElement(value);
        return this;
    }

    @Override
    public QuestionnaireElementRecord value2(Long value) {
        setIdquestionnaire(value);
        return this;
    }

    @Override
    public QuestionnaireElementRecord values(Long value1, Long value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached QuestionnaireElementRecord
     */
    public QuestionnaireElementRecord() {
        super(QuestionnaireElement.QUESTIONNAIRE_ELEMENT);
    }

    /**
     * Create a detached, initialised QuestionnaireElementRecord
     */
    public QuestionnaireElementRecord(Long idquestionnaireElement, Long idquestionnaire) {
        super(QuestionnaireElement.QUESTIONNAIRE_ELEMENT);

        setIdquestionnaireElement(idquestionnaireElement);
        setIdquestionnaire(idquestionnaire);
    }
}
