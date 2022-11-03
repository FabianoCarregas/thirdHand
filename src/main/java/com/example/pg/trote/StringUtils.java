package com.example.pg.trote;

import static java.lang.Double.*;

public class StringUtils {

    private static final String REMOVE_ALL_LETTERS = "[^\\d.]";

    public static double sanitizeToInt(String str) {
        String px = str.replaceAll(REMOVE_ALL_LETTERS, "");
        return parseDouble(px);
    }

    public static String toEmTag(String str) {
        return str.concat("em");
    }

    public static String toRemTag(String str) {
        return str.concat("em");
    }

}
