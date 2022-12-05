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
public class Float8StddevPop extends AbstractRoutine<Double> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.float8_stddev_pop.RETURN_VALUE</code>.
     */
    public static final Parameter<Double> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>pg_catalog.float8_stddev_pop._1</code>.
     */
    public static final Parameter<Double[]> _1 = Internal.createParameter("_1", SQLDataType.FLOAT.getArrayDataType(), false, true);

    /**
     * Create a new routine call instance
     */
    public Float8StddevPop() {
        super("float8_stddev_pop", PgCatalog.PG_CATALOG, SQLDataType.DOUBLE);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Double[] value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<Double[]> field) {
        setField(_1, field);
    }
}
