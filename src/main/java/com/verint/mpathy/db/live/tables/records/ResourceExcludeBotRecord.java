/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.live.tables.records;


import com.verint.mpathy.db.live.tables.ResourceExcludeBot;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * The table contains regular expression parts to identify bots by his
 * useragent.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ResourceExcludeBotRecord extends TableRecordImpl<ResourceExcludeBotRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>live.resource_exclude_bot.idexclude_bot</code>. Primary
     * key for the bot entry.
     */
    public void setIdexcludeBot(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>live.resource_exclude_bot.idexclude_bot</code>. Primary
     * key for the bot entry.
     */
    public Integer getIdexcludeBot() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>live.resource_exclude_bot.pattern</code>. The content is
     * the part of only ONE regular expression pattern. Each entry represents a
     * or condition and must be prepared to run as a "match" search (not find)
     * like this: ^.*(pattern1|pattern2|...|pattnerN).*$
     */
    public void setPattern(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>live.resource_exclude_bot.pattern</code>. The content is
     * the part of only ONE regular expression pattern. Each entry represents a
     * or condition and must be prepared to run as a "match" search (not find)
     * like this: ^.*(pattern1|pattern2|...|pattnerN).*$
     */
    public String getPattern() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ResourceExcludeBot.RESOURCE_EXCLUDE_BOT.IDEXCLUDE_BOT;
    }

    @Override
    public Field<String> field2() {
        return ResourceExcludeBot.RESOURCE_EXCLUDE_BOT.PATTERN;
    }

    @Override
    public Integer component1() {
        return getIdexcludeBot();
    }

    @Override
    public String component2() {
        return getPattern();
    }

    @Override
    public Integer value1() {
        return getIdexcludeBot();
    }

    @Override
    public String value2() {
        return getPattern();
    }

    @Override
    public ResourceExcludeBotRecord value1(Integer value) {
        setIdexcludeBot(value);
        return this;
    }

    @Override
    public ResourceExcludeBotRecord value2(String value) {
        setPattern(value);
        return this;
    }

    @Override
    public ResourceExcludeBotRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ResourceExcludeBotRecord
     */
    public ResourceExcludeBotRecord() {
        super(ResourceExcludeBot.RESOURCE_EXCLUDE_BOT);
    }

    /**
     * Create a detached, initialised ResourceExcludeBotRecord
     */
    public ResourceExcludeBotRecord(Integer idexcludeBot, String pattern) {
        super(ResourceExcludeBot.RESOURCE_EXCLUDE_BOT);

        setIdexcludeBot(idexcludeBot);
        setPattern(pattern);
    }
}
