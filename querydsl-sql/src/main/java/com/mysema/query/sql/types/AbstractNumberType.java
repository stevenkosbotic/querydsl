package com.mysema.query.sql.types;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysema.util.MathUtils;

public abstract class AbstractNumberType<T extends Number & Comparable<T>> implements Type<T> {

    @Override
    public T getValue(ResultSet rs, int startIndex) throws SQLException {
        Number num = (Number) rs.getObject(startIndex);
        return num != null ? MathUtils.cast(num, getReturnedClass()) : null; 
    }
    
}