package com.woaigsc.utils.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.TextView;

import java.util.jar.Attributes;

/**
 * Created by chuiyuan on 16-5-6.
 */
public class ScrollingTextView extends TextView{
    public ScrollingTextView(Context context, AttributeSet attrs, int defstyle){
        super(context,attrs,defstyle);
    }

    public ScrollingTextView(Context context, AttributeSet attrs){
        super(context, attrs);
    }

    public ScrollingTextView(Context context){
        super(context);
    }

    @Override
    protected void onFocusChanged(boolean focused, int direction,
                                  Rect previouslyFocusedRect){
        if(focused){
            super.onFocusChanged(focused, direction, previouslyFocusedRect);
        }
    }

    @Override
    public void onWindowFocusChanged(boolean focused){
        if(focused){
            super.onWindowFocusChanged(focused);
        }
    }
}
