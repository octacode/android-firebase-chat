package com.android.rivchat.util;

import android.content.Context;

import static android.content.Context.MODE_PRIVATE;

public class Preferences {
    public static boolean getFirstRun(Context context) {
        return context.getSharedPreferences("PREFERENCE", MODE_PRIVATE).getBoolean("isFirstRun", true);
    }

    public static void setFirstRun(Context context) {
        context.getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit().putBoolean("isFirstRun", false).apply();
    }

    public static boolean getPaid(Context context) {
        return context.getSharedPreferences("PREFERENCE", MODE_PRIVATE).getBoolean("hasPaid", true);
    }

    public static void setPaid(Context context) {
        context.getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit().putBoolean("hasPaid", false).apply();
    }
}
