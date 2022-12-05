/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.pg_catalog.routines;


import com.verint.mpathy.db.pg_catalog.PgCatalog;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Int2mod extends AbstractRoutine<Short> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.int2mod.RETURN_VALUE</code>.
     */
    public static final Parameter<Short> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.SMALLINT, false, false);

    /**
     * The parameter <code>pg_catalog.int2mod._1</code>.
     */
    public static final Parameter<Short> _1 = Internal.createParameter("_1", SQLDataType.SMALLINT, false, true);

    /**
     * The parameter <code>pg_catalog.int2mod._2</code>.
     */
    public static final Parameter<Short> _2 = Internal.createParameter("_2", SQLDataType.SMALLINT, false, true);

    /**
     * Create a new routine call instance
     */
    public Int2mod() {
        super("int2mod", PgCatalog.PG_CATALOG, SQLDataType.SMALLINT);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Short value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<Short> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Short value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__2(Field<Short> field) {
        setField(_2, field);
    }
}
