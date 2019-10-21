package com.aslmmovic.notify.common;

import android.content.Context;
import android.content.SharedPreferences;


/**
 * SharedPrefrenceManagerClass to Save the token Generated locally and retrieve it
 * by making Singleton Object of it .
 *
 */
public class SharedPrefrencesManager {


    private static Context context;
    private static SharedPrefrencesManager instance;

    private SharedPrefrencesManager(Context context) {
        this.context = context;
    }

    public static synchronized SharedPrefrencesManager getInstance(Context context) {
        if (instance == null)
            instance = new SharedPrefrencesManager(context);
        return instance;
    }

    public boolean storeToken(String token) {
        SharedPreferences sharedPreferences =
                context.getSharedPreferences(Constants.SHARED_PREF_NAME,
                        Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(Constants.KEY_ACCESS_TOKEN, token);
        editor.apply();
        return true;
    }

    public String getToken() {
        SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString(Constants.KEY_ACCESS_TOKEN, null);
    }
}
