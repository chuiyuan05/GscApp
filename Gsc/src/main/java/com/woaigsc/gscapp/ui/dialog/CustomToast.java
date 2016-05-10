package com.woaigsc.gscapp.ui.dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.woaigsc.gscapp.R;

/**
 * Created by chuiyuan on 16-5-10.
 */
public class CustomToast {
    public static final long DURATION_LONG =5000L;
    public static final long DURATION_MEDIUM = 3500L ;
    public static final long DURATION_SHORT = 2500L;

    private long duration = DURATION_MEDIUM;

    private class ToastView extends FrameLayout{
        private ImageView actionIv ;
        private TextView actionTv ;
        private ImageView msgIv;
        private TextView msgTv ;

        public ToastView(Context context){
            this(context,null);
        }

        public ToastView(Context context, AttributeSet attrs){
            this(context, attrs,0);
        }

        public ToastView(Context context, AttributeSet attrs, int defStyleAttr){
            super(context, attrs, defStyleAttr);
            initView();
        }

        private void initView(){
            View root = LayoutInflater.from(getContext()).inflate(
                    R.layout., this, true);

        }
    }
}
