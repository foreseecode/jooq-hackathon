/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables.records;


import com.verint.mpathy.db.live.tables.QuestionnaireCrypt;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * Reference table between questionnaire (exasol) and crypt_keys (cassandra).
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class QuestionnaireCryptRecord extends TableRecordImpl<QuestionnaireCryptRecord> implements Record2<Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>live.questionnaire_crypt.idquestionnaire</code>. Foreign
     * key to the questionnaire settings.
     */
    public void setIdquestionnaire(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>live.questionnaire_crypt.idquestionnaire</code>. Foreign
     * key to the questionnaire settings.
     */
    public Long getIdquestionnaire() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>live.questionnaire_crypt.idcrypt</code>. External key to
     * the cassandra "crypt_keys" table.
     */
    public void setIdcrypt(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>live.questionnaire_crypt.idcrypt</code>. External key to
     * the cassandra "crypt_keys" table.
     */
    public Long getIdcrypt() {
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
        return QuestionnaireCrypt.QUESTIONNAIRE_CRYPT.IDQUESTIONNAIRE;
    }

    @Override
    public Field<Long> field2() {
        return QuestionnaireCrypt.QUESTIONNAIRE_CRYPT.IDCRYPT;
    }

    @Override
    public Long component1() {
        return getIdquestionnaire();
    }

    @Override
    public Long component2() {
        return getIdcrypt();
    }

    @Override
    public Long value1() {
        return getIdquestionnaire();
    }

    @Override
    public Long value2() {
        return getIdcrypt();
    }

    @Override
    public QuestionnaireCryptRecord value1(Long value) {
        setIdquestionnaire(value);
        return this;
    }

    @Override
    public QuestionnaireCryptRecord value2(Long value) {
        setIdcrypt(value);
        return this;
    }

    @Override
    public QuestionnaireCryptRecord values(Long value1, Long value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached QuestionnaireCryptRecord
     */
    public QuestionnaireCryptRecord() {
        super(QuestionnaireCrypt.QUESTIONNAIRE_CRYPT);
    }

    /**
     * Create a detached, initialised QuestionnaireCryptRecord
     */
    public QuestionnaireCryptRecord(Long idquestionnaire, Long idcrypt) {
        super(QuestionnaireCrypt.QUESTIONNAIRE_CRYPT);

        setIdquestionnaire(idquestionnaire);
        setIdcrypt(idcrypt);
    }
}
