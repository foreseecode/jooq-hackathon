/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables;


import com.verint.mpathy.db.live.Live;
import com.verint.mpathy.db.live.tables.records.QuestionnaireTypeRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
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
public class QuestionnaireType extends TableImpl<QuestionnaireTypeRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>live.questionnaire_type</code>
     */
    public static final QuestionnaireType QUESTIONNAIRE_TYPE = new QuestionnaireType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<QuestionnaireTypeRecord> getRecordType() {
        return QuestionnaireTypeRecord.class;
    }

    /**
     * The column <code>live.questionnaire_type.idquestionnaire_type</code>.
     */
    public final TableField<QuestionnaireTypeRecord, Long> IDQUESTIONNAIRE_TYPE = createField(DSL.name("idquestionnaire_type"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>live.questionnaire_type.name</code>.
     */
    public final TableField<QuestionnaireTypeRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>live.questionnaire_type.text</code>.
     */
    public final TableField<QuestionnaireTypeRecord, String> TEXT = createField(DSL.name("text"), SQLDataType.CLOB, this, "");

    private QuestionnaireType(Name alias, Table<QuestionnaireTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private QuestionnaireType(Name alias, Table<QuestionnaireTypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>live.questionnaire_type</code> table reference
     */
    public QuestionnaireType(String alias) {
        this(DSL.name(alias), QUESTIONNAIRE_TYPE);
    }

    /**
     * Create an aliased <code>live.questionnaire_type</code> table reference
     */
    public QuestionnaireType(Name alias) {
        this(alias, QUESTIONNAIRE_TYPE);
    }

    /**
     * Create a <code>live.questionnaire_type</code> table reference
     */
    public QuestionnaireType() {
        this(DSL.name("questionnaire_type"), null);
    }

    public <O extends Record> QuestionnaireType(Table<O> child, ForeignKey<O, QuestionnaireTypeRecord> key) {
        super(child, key, QUESTIONNAIRE_TYPE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Live.LIVE;
    }

    @Override
    public Identity<QuestionnaireTypeRecord, Long> getIdentity() {
        return (Identity<QuestionnaireTypeRecord, Long>) super.getIdentity();
    }

    @Override
    public QuestionnaireType as(String alias) {
        return new QuestionnaireType(DSL.name(alias), this);
    }

    @Override
    public QuestionnaireType as(Name alias) {
        return new QuestionnaireType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public QuestionnaireType rename(String name) {
        return new QuestionnaireType(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public QuestionnaireType rename(Name name) {
        return new QuestionnaireType(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
