package com.mahindracomviva.helloworld;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;

import java.util.Locale;

public class LocaleManager {

    private LocaleManager() {
        /*DEFAULT CONSTRUCTOR*/
    }

    public static Context setLocale(Context c) {
        return updateResources(c, getLanguage());
    }

    public static String getLanguage() {
        return ApplicationUtil.getLanguage();
    }

    public static void setNewLocale(Context c, String language) {
        updateResources(c, language);
    }

    @SuppressLint("NewApi")
    private static Context updateResources(Context context, String language) {
        Context receivedCtx = context;
        Locale locale = new Locale(language);
        Locale.setDefault(locale);
        Resources res = receivedCtx.getResources();
        Configuration config = new Configuration(res.getConfiguration());
        config.setLocale(locale);
        receivedCtx = receivedCtx.createConfigurationContext(config);
        return receivedCtx;
    }
}