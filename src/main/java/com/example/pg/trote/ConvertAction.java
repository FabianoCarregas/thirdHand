package com.example.pg.trote;

import static com.example.pg.trote.StringUtils.*;
import static com.example.pg.trote.StringUtils.sanitizeToDouble;

public class ConvertAction {

    public static String toEmFormat(String px, double base) {
       double em = sanitizeToDouble(px) / base;
        String converted = formattedValue(em);
       return toEmTag(converted);
    }

    public static String toRemFormat(String px, double base) {
        double em = sanitizeToDouble(px) / base;
        String converted = formattedValue(em);
        return toRemTag(converted);
    }

    private static String toEmTag(String str) {
        return str.concat("em");
    }

    private static String toRemTag(String str) {
        return str.concat("rem");
    }
}
