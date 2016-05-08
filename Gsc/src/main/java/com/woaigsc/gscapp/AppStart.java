package com.woaigsc.gscapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

import com.woaigsc.gscapp.base.BaseActivity;
import com.woaigsc.gscapp.utils.AppManager;

/**
 * Created by chuiyuan on 16-5-5.
 */
public class AppStart extends BaseActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final View view = View.inflate(this, R.layout.activity_appstart, null);
        setContentView(view);

        AlphaAnimation alphaAnimation= new AlphaAnimation(0.5f,1.0f);
        alphaAnimation.setDuration(800);
        view.startAnimation(alphaAnimation);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                redirectTo();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    /**
     * redirect to MainActivity.
     */
    private void redirectTo(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        AppManager.getInstance().finishActivity(AppStart.class);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
