package com.woaigsc.gscapp.utils;

import android.util.Log;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by chuiyuan on 16-5-9.
 */
public class StringUtils {
    private static String TAG =StringUtils.class.getSimpleName();

    /**
     * Split the content and get rid of chinese and english space.
     * @param content
     * @return
     */
    public static String splitContent(String content){
        StringBuilder sb = new StringBuilder();

        Pattern pattern = Pattern.compile("(.*?(，|。|！))");
        Matcher matcher= pattern.matcher(content);
        while(matcher.find()){
            String line = purify(matcher.group()) ;
            Log.d(TAG, line);
            sb.append(line);//get ride of all spaces.
            sb.append("\n");
        }

        return  sb.toString() ;
    }

    /**
     * Get rid of chinese and english space.
     * @param str
     * @return
     */
    public static String purify(String str){
        return str.replaceAll("　","").replaceAll(" ","");
    }
}
