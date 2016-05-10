package com.woaigsc.gscapp.app;

import android.app.Activity;
import android.content.Context;

import java.util.Stack;

/**
 * Created by chuiyuan on 16-4-27.
 * Manages Activity.
 */
public class AppManager {
    private static Stack<Activity> activityStack ;
    private static AppManager instance ;

    private AppManager(){

    }

    public static AppManager  getInstance(){
        if(instance == null){
            instance = new AppManager();
         }
        return  instance ;
    }

    public void addActivity(Activity activity){
        if(activityStack == null){
            activityStack = new Stack<Activity>();
        }
        activityStack.add(activity);
    }

    public Activity getTopActivity(){
        return activityStack.lastElement() ;
    }

    /**
     * Finish top activity
     */
    public void finishTopActivity(){
        Activity activity = activityStack.lastElement();
        finishActivity(activity);
    }

    /**
     * Finish this activity.
     * @param activity
     */
    public void finishActivity(Activity activity){
        if(activity!= null && !activity.isFinishing()){
            activityStack.remove(activity);
            activity.finish();
            activity = null ;
        }
    }

    /**
     * Finish Activity named cls
     * @param cls
     */
    public void finishActivity(Class<?> cls){
        for(Activity activity : activityStack){
            if(activity.getClass().equals(cls)){
                finishActivity(activity);
                //break;
            }
        }
    }

    /**
     * Finish all activities
     */
    public void finishAllActivity(){
        for (int i =0;i<activityStack.size() ;i++){
            if (null!= activityStack.get(i)){
                activityStack.get(i).finish();
            }
        }
        activityStack.clear();
    }

    /**
     * Get specific activity.
     * @param cls
     * @return
     */
    public Activity getActivity(Class<?> cls){
        if(activityStack!= null){
            for (Activity activity: activityStack){
                if(activity.getClass().equals(cls)){
                    return activity ;
                }
            }
        }
        return null ;
    }

    /**
     * Exit app
     * @param context
     */
    public void AppExit(Context context){
        finishAllActivity();
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
    }

}
