package com.woaigsc.gscapp.app;

import android.util.Log;

/**
 * Created by chuiyuan on 16-5-8.
 */
public class AppContext extends BaseApplication {
    private static AppContext instance ;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this ;
        //Log.d(TAG,"AppContext onCreate.");
    }

    public static AppContext getInstance(){
        return instance ;
    }
}
