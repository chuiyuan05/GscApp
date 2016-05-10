package com.woaigsc.gscapp.utils;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.widget.Toast;

import com.woaigsc.gscapp.R;
import com.woaigsc.gscapp.app.AppManager;

/**
 * Created by chuiyuan on 16-5-10.
 */
public class DoubleClickExitHelper {

    private final Activity mActivity ;

    private boolean isOnKeyBacking ; //default to be false
    private Handler mHandler ;
    private Toast mBackToast ;

    public DoubleClickExitHelper(Activity activity){
        mActivity = activity ;
        mHandler = new Handler(Looper.getMainLooper()) ;
    }

    public boolean onKeyDown(int keyCode, KeyEvent event){
        if(keyCode!= KeyEvent.KEYCODE_BACK){
            return  false ;
        }
        if(isOnKeyBacking){
            mHandler.removeCallbacks(onBackTimeRunnable);
            if(mBackToast!= null){
                mBackToast.cancel();
            }
            AppManager.getInstance().AppExit(mActivity);
            return  true;
        }else{
            isOnKeyBacking = true ; //first time to click
            if(mBackToast== null){
                mBackToast = Toast.makeText(mActivity, R.string.tip_double_click_exit,Toast.LENGTH_SHORT);
            }
            mBackToast.show();
            mHandler.postDelayed(onBackTimeRunnable,2000);
            return true ;
        }

    }

    /**
     * Use a post delayed runnable to reset isOnKeyBacking to false.
     */
    private Runnable onBackTimeRunnable = new Runnable() {
        @Override
        public void run() {
            isOnKeyBacking = false ;
            if(mBackToast!= null){
                mBackToast.cancel();
            }
        }
    } ;
}
