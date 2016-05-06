package com.woaigsc.utils.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by chuiyuan on 16-5-6.
 */
public class ActionBar extends RelativeLayout {
    private LayoutInflater mInflater ;
    private RelativeLayout mBarView ;
    private ImageView mLogoView ;
    private View mBackIndicator ;
    private TextView mTitleView ;
    private LinearLayout mActionsView ;
    private ImageButton mHomeButton ;
    private RelativeLayout mHomeLayout ;
    private ProgressBar mProgress ;

    public ActionBar(Context context, AttributeSet attrs){
        super(context, attrs);
        mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
}
