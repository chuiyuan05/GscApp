package com.woaigsc.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.woaigsc.utils.R;

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

        mBarView = (RelativeLayout)mInflater.inflate(R.layout.actionbar, null);
        this.addView(mBarView);
        mLogoView = (ImageView)mBarView.findViewById(R.id.actionbar_home_logo);
        mHomeLayout = (RelativeLayout)mBarView.findViewById(R.id.actionbar_home_bg);
        mHomeButton = (ImageButton)mBarView.findViewById(R.id.actionbar_home_btn);
        mBackIndicator = mBarView.findViewById(R.id.actionbar_home_is_back);

        mTitleView = (TextView)mBarView.findViewById(R.id.actionbar_title);
        mActionsView = (LinearLayout)mBarView.findViewById(R.id.actionbar_actions);

        mProgress = (ProgressBar)mBarView.findViewById(R.id.actionbar_progress);

        TypedArray a = context.obtainStyledAttributes(attrs,R.styleable.ActionBar);
        CharSequence title = a.getString(R.);

    }
}







