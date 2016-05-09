package com.woaigsc.gscapp.utils;

import android.util.Log;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by chuiyuan on 16-5-9.
 */
public class StringUtils {
    private static String TAG =StringUtils.class.getSimpleName();

    public static String splitContent(String content){
        StringBuilder sb = new StringBuilder();

        Pattern pattern = Pattern.compile("(.*?(，|。|！))");
        Matcher matcher= pattern.matcher(content);
        while(matcher.find()){
            String line = (matcher.group()).replaceAll("　","") ;
            Log.d(TAG, line);
            sb.append(line);//get ride of all spaces.
            sb.append("\n");
        }

        return  sb.toString() ;
    }
}
