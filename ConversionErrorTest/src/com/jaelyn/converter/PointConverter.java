package com.jaelyn.converter;

import com.jaelyn.bean.Point;
import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;

import java.util.Map;

/**
 * Created by Jaelyn on 13/10/2016.
 */
public class PointConverter extends DefaultTypeConverter {
    @Override
    public Object convertValue(Map<String, Object> context, Object value, Class toType) {
        if (toType == Point.class){
            String[] params = (String[])value;
            Point pointText = new Point();
            String[] pointValue = params[0].split(",");
            pointText.setX(Integer.parseInt(pointValue[0]));
            pointText.setY(Integer.parseInt(pointValue[1]));
            System.out.print("经过converter方法");
            return pointText;
        } else if (toType == String.class){
            Point point = (Point)value;
            return point.getX()+","+point.getY();
        }
        return null;
    }
}
