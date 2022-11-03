package com.example.pg.trote;

import static com.example.pg.trote.StringUtils.*;
import static com.example.pg.trote.StringUtils.sanitizeToInt;

public class ConvertAction {

    public static String toEmFormat(String px, double base) {
       double em = sanitizeToInt(px) / base;
        String converted = String.valueOf(String.format("%.4f", em));
       return toEmTag(converted);
    }
}
