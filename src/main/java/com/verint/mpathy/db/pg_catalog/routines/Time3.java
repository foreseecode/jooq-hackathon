/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.pg_catalog.routines;


import com.verint.mpathy.db.pg_catalog.PgCatalog;

import java.time.LocalTime;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Time3 extends AbstractRoutine<LocalTime> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.time.RETURN_VALUE</code>.
     */
    public static final Parameter<LocalTime> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.LOCALTIME(6), false, false);

    /**
     * The parameter <code>pg_catalog.time._1</code>.
     */
    public static final Parameter<LocalTime> _1 = Internal.createParameter("_1", SQLDataType.LOCALTIME(6), false, true);

    /**
     * The parameter <code>pg_catalog.time._2</code>.
     */
    public static final Parameter<Integer> _2 = Internal.createParameter("_2", SQLDataType.INTEGER, false, true);

    /**
     * Create a new routine call instance
     */
    public Time3() {
        super("time", PgCatalog.PG_CATALOG, SQLDataType.LOCALTIME(6));

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(LocalTime value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<LocalTime> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Integer value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__2(Field<Integer> field) {
        setField(_2, field);
    }
}
