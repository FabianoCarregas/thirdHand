package com.example.pg.trote;

import java.text.DecimalFormat;

import static java.lang.Double.*;

public class StringUtils {

    private static final String REMOVE_ALL_LETTERS = "[^\\d.]";

    public static double sanitizeToDouble(String str) {
        String px = str.replaceAll(REMOVE_ALL_LETTERS, "");
        return parseDouble(px);
    }
     public static String formattedValue(double numb) {
         DecimalFormat decimalFormat = new DecimalFormat("0.####");
         return decimalFormat.format(Double.valueOf(numb));
   }
}
