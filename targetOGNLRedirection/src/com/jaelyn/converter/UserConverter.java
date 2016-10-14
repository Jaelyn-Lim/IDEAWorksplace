package com.jaelyn.converter;

import com.jaelyn.bean.User;
import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;

import java.util.Map;

/**
 * Created by Jaelyn on 11/10/2016.
 */
public class UserConverter extends DefaultTypeConverter {
    @Override
    public Object convertValue(Map<String, Object> context, Object value, Class toType) {

            if(toType == User.class){
                if(((String[])value)[0].matches("\\w+,\\w+")==true){
                String[] par = (String[])value;
                User user =new User();
                String[] userValues = par[0].split(",");
                user.setName(userValues[0]);
                user.setPass(userValues[1]);
                return user;
                }
            }else if (toType == String.class){
                User user = (User)value;
                return "<"+user.getName()+","+user.getPass()+">";
            }

        return null;
    }
}
