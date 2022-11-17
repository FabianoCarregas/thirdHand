package com.example.pg.trote;

import static com.example.pg.trote.StringUtils.*;
import static com.example.pg.trote.StringUtils.sanitizeToDouble;

public class ConvertAction {

    public static String convertValue(String str, String type, double base) {
        String value = calculateByBase(str, base);
        return value.concat(type);
    }

    private static String calculateByBase(String px, double base) {
       double em = sanitizeToDouble(px) / base;
       return toValidValue(em);
    }

}
