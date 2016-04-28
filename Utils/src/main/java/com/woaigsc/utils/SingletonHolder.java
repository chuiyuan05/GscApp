package com.woaigsc.utils;

import android.util.Log;

import java.lang.reflect.Constructor;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by chuiyuan on 16-4-28.
 */
public class SingletonHolder {
    private  static final String TAG = "SingletonHolder";
    /**
     * Keep all singleton
     */
    private static final ConcurrentHashMap<Class<?> , Object> INSTANCE_MAP = new ConcurrentHashMap<>();

    /**
     * Get the only singleton
     * <p/>
     * And retain at the same time
     * @param cls  !important, cls must have empty constructor
     * @param <T>
     * @return
     */
    public static <T> T getInsance(Class<T> cls){
        // 因为已经是线程安全的 ConcurrentHashMap，所以如果已经缓存过，可直接读取，减少不必要的同步锁性能消耗
        T instance = (T)INSTANCE_MAP.get(cls) ;
        if(instance!= null){
            return instance ;
        }
        // 避免多线程导致判断重入
        synchronized (cls){
            instance = (T)INSTANCE_MAP.get(cls) ;
            if(instance!= null){
                return instance ;
            }
            try{
                Constructor constructor = cls.getDeclaredConstructor();
                constructor.setAccessible(true);
                instance = (T) constructor.newInstance();
                INSTANCE_MAP.put(cls, instance);
            }catch (Exception e){
                Log.e(TAG, "Initialize class error");
            }
        }
        return instance ;
    }

    public static void destroy(){
        INSTANCE_MAP.clear();
    }
}
