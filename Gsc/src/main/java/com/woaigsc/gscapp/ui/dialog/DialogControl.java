package com.woaigsc.gscapp.ui.dialog;

import android.app.ProgressDialog;

/**
 * Created by chuiyuan on 16-5-10.
 */
public interface DialogControl {

    public void hideWaitDialog();

    public ProgressDialog showWaitDialog();

    public ProgressDialog showWaitDialog(int resId);

    public ProgressDialog showWaitDialog(String msg) ;
}
