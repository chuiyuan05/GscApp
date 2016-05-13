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
        private ImageView iconImg ;
        private TextView actionTv ;
        private TextView titleTv ;

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
            //must be true, due to using merge in layout.
            View root = LayoutInflater.from(getContext()).inflate(
                    R.layout.toast_view, this, true);
            iconImg = (ImageView)root.findViewById(R.id.toast_icon_iv);
            actionTv = (TextView)root.findViewById(R.id.toast_action_tv);
            titleTv = (TextView)root.findViewById(R.id.toast_title_tv) ;
        }
    }
}
