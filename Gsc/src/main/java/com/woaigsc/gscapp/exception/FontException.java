package com.woaigsc.gscapp.exception;

/**
 * Created by chuiyuan on 16-5-21.
 */
public class FontException extends Exception {
    public FontException(){
        super();
    }

    public FontException(String msg,Throwable cause){
        super(msg, cause);
    }

    public FontException(String msg){
        super(msg);
    }

    public FontException(Throwable cause){
        super(cause);
    }
}
