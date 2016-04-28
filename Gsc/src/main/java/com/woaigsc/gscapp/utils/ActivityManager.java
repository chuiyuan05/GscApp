package com.woaigsc.gscapp.utils;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chuiyuan on 16-4-27.
 */
public class ActivityManager {
    private static List<Activity> activities = new ArrayList<>();

    public static boolean addActivity(Activity activity){
        return activities.add(activity);
    }

    public static boolean removeActivity(Activity activity) {
        return activities.remove(activity) ;
    }

    public static void finishAll(){
        if(activities.isEmpty()){
            return;
        }
        for (Activity activity: activities){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
