package com.jaelyn.concerter;

import java.util.Map;

/**
 * Created by Jaelyn on 09/10/2016.
 */
public class NumToZHConverter extends ognl.DefaultTypeConverter {
    @Override
    public Object convertValue(Map context, Object value, Class toType) {

        return "123";
    }
}
