package com.mahindracomviva.helloworld;

public class ApplicationUtil {

    private static String language = "en";

    public static String getLanguage() {
        return language;
    }

    public static void setLanguage(String language) {
        ApplicationUtil.language = language;
    }
}
