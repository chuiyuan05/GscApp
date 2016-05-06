package com.woaigsc.gscapp.widget;

import android.content.Context;
import android.support.v4.app.FragmentTabHost;
import android.util.AttributeSet;

/**
 * Created by chuiyuan on 16-5-5.
 */
public class MyFragmentTabHost  extends FragmentTabHost{
    private String mCurrentTag ;

    public MyFragmentTabHost(Context context, AttributeSet attrs){
        super(context, attrs);

    }
}
