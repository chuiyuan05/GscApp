package com.woaigsc.gscapp.base;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.woaigsc.gscapp.R;
import com.woaigsc.gscapp.app.AppManager;
import com.woaigsc.gscapp.ui.dialog.DialogControl;
import com.woaigsc.gscapp.utils.DialogHelper;

/**
 * Created by chuiyuan on 16-4-27.
 */
public class BaseActivity extends AppCompatActivity implements DialogControl {
    protected String TAG = this.getClass().getSimpleName() ;

    private boolean waitDialogVisible ;
    /**
     * Show after call showWaitDialog.
     */
    private ProgressDialog waitDialog ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppManager.getInstance().addActivity(this);
        waitDialogVisible = true ;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        AppManager.getInstance().finishActivity(this);
    }

    @Override
    public void hideWaitDialog() {
        if(waitDialogVisible && waitDialog!= null){
            waitDialog.dismiss();
            waitDialog = null ;
        }
    }

    @Override
    public ProgressDialog showWaitDialog() {
        return showWaitDialog(R.string.gsc_loading);
    }

    @Override
    public ProgressDialog showWaitDialog(int resId) {
        return showWaitDialog(getString(resId));
    }

    @Override
    public ProgressDialog showWaitDialog(String msg) {
        if(waitDialogVisible){
            if(waitDialog == null){
                waitDialog = DialogHelper.getWaitDialog(this, msg);
            }
            if(waitDialog!= null){
                waitDialog.setMessage(msg);
                waitDialog.show();
            }
            return waitDialog ;
        }
        return null;
    }
}
