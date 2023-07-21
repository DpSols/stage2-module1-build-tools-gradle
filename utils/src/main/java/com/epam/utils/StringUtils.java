package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return str.toCharArray()[0]!='-' && !str.equals("0");
    }
}
