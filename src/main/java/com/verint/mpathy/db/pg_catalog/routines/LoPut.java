/*
 * This file is generated by jOOQ.
 */
package com.verint.mpathy.db.pg_catalog.routines;


import com.verint.mpathy.db.pg_catalog.PgCatalog;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LoPut extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.lo_put._1</code>.
     */
    public static final Parameter<Long> _1 = Internal.createParameter("_1", SQLDataType.BIGINT, false, true);

    /**
     * The parameter <code>pg_catalog.lo_put._2</code>.
     */
    public static final Parameter<Long> _2 = Internal.createParameter("_2", SQLDataType.BIGINT, false, true);

    /**
     * The parameter <code>pg_catalog.lo_put._3</code>.
     */
    public static final Parameter<byte[]> _3 = Internal.createParameter("_3", SQLDataType.BLOB, false, true);

    /**
     * Create a new routine call instance
     */
    public LoPut() {
        super("lo_put", PgCatalog.PG_CATALOG);

        addInParameter(_1);
        addInParameter(_2);
        addInParameter(_3);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Long value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Long value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_3</code> parameter IN value to the routine
     */
    public void set__3(byte[] value) {
        setValue(_3, value);
    }
}
