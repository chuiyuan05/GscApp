package com.woaigsc.utils.event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by chuiyuan on 16-4-28.
 */
public class EventDispatcherImpl {
    static ExecutorService executorService = Executors.newCachedThreadPool();
    private static final String TAG ="EventDispatcherImpl";

    private final Map<Class<?>, List<Class<?>>> eventTypesCache = new HashMap<>();
    //private final Map<Class<?>, CopyOnWriteArrayList<Su>>
}
