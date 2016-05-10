package com.woaigsc.gscapp.app;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;

/**
 * Created by chuiyuan on 16-5-8.
 */
public class BaseApplication extends Application {
    protected final String TAG = this.getClass().getSimpleName() ;

    private static String PREF_NAME = "gsc.pref";
    private static String LAST_REFRESH_TIME= "last_refresh_time.pref";
    static Context context ;
    static Resources resources ;

    private static boolean isLeastGB ;
    static{
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.GINGERBREAD){
            isLeastGB = true ;
        }else {
            isLeastGB = false ;
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext() ;
        resources = context.getResources() ;
        Log.d(TAG, "onCreate.");
    }

    /**
     * Why sync
     * @return
     */
    public static synchronized BaseApplication context(){
        return (BaseApplication)context ;
    }

    public static Resources resources(){
        return resources ;
    }

    public static SharedPreferences getPreferences(){
        SharedPreferences pre = context().getSharedPreferences(PREF_NAME, MODE_PRIVATE);
        return pre ;
    }

    public static SharedPreferences getPreferences(String prefName){
        SharedPreferences pre = context().getSharedPreferences(prefName, MODE_PRIVATE);
        return pre ;
    }

    @TargetApi((Build.VERSION_CODES.GINGERBREAD))
    public static void apply(SharedPreferences.Editor editor){
        if(isLeastGB){
            editor.apply();
        }else {
            editor.commit() ;
        }
    }

    public static void set(String key, int value){
        SharedPreferences.Editor editor = getPreferences().edit();
        editor.putInt(key, value);
        apply(editor);
    }
    public static void set(String key, String value){
        SharedPreferences.Editor editor = getPreferences().edit() ;
        editor.putString(key, value);
        apply(editor);
    }

    public static void set(String key, boolean value){
        SharedPreferences.Editor  editor = getPreferences().edit();
        editor.putBoolean(key, value);
        apply(editor);
    }
    public static boolean get(String key, boolean defValue ){
        return getPreferences().getBoolean(key, defValue);
    }

    public static String get(String key,String defValue){
        return getPreferences().getString(key, defValue);
    }

    public static int get(String key, int defValue){
        return getPreferences().getInt(key, defValue);
    }

}
