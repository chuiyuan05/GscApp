package com.woaigsc.gscapp.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.woaigsc.gscapp.utils.AppManager;

/**
 * Created by chuiyuan on 16-4-27.
 */
public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onDestroy() {
        super.onDestroy();
        AppManager.getInstance().finishActivity(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppManager.getInstance().addActivity(this);
    }
}
