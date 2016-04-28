package com.woaigsc.utils.event;

/**
 * Created by chuiyuan on 16-4-28.
 */
public class EventDispatcher {
    private EventDispatcherImpl dispatcher = new EventDispatcherImpl();

    protected EventDispatcher(){

    }

    public void register(Object subscriber){

    }

    public void register(Object subscriber, int priority){

    }

    public boolean isRegistered(Object subscriber){
        return false;
    }

    public void unregister(Object subscriber){

    }

    public void post(Event event){

    }
}
