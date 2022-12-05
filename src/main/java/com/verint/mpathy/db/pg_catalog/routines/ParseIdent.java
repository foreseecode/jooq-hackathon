/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.pg_catalog.routines;


import com.verint.mpathy.db.pg_catalog.PgCatalog;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ParseIdent extends AbstractRoutine<String[]> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.parse_ident.RETURN_VALUE</code>.
     */
    public static final Parameter<String[]> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.CLOB.getArrayDataType(), false, false);

    /**
     * The parameter <code>pg_catalog.parse_ident.str</code>.
     */
    public static final Parameter<String> STR = Internal.createParameter("str", SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.parse_ident.strict</code>.
     */
    public static final Parameter<Boolean> STRICT = Internal.createParameter("strict", SQLDataType.BOOLEAN.defaultValue(DSL.field("true", SQLDataType.BOOLEAN)), true, false);

    /**
     * Create a new routine call instance
     */
    public ParseIdent() {
        super("parse_ident", PgCatalog.PG_CATALOG, SQLDataType.CLOB.getArrayDataType());

        setReturnParameter(RETURN_VALUE);
        addInParameter(STR);
        addInParameter(STRICT);
    }

    /**
     * Set the <code>str</code> parameter IN value to the routine
     */
    public void setStr(String value) {
        setValue(STR, value);
    }

    /**
     * Set the <code>str</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setStr(Field<String> field) {
        setField(STR, field);
    }

    /**
     * Set the <code>strict</code> parameter IN value to the routine
     */
    public void setStrict(Boolean value) {
        setValue(STRICT, value);
    }

    /**
     * Set the <code>strict</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setStrict(Field<Boolean> field) {
        setField(STRICT, field);
    }
}
