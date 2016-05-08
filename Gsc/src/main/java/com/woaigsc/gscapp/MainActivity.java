package com.woaigsc.gscapp;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.woaigsc.gscapp.R;
import com.woaigsc.gscapp.base.BaseActivity;

/**
 * Created by chuiyuan on 16-5-8.
 */
public class MainActivity extends BaseActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
