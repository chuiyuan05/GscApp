package com.woaigsc.gscapp.utils;

import android.app.ProgressDialog;
import android.content.Context;
import android.text.TextUtils;

/**
 * Created by chuiyuan on 16-5-10.
 */
public class DialogHelper {

    public static ProgressDialog getWaitDialog(Context context, String msg){
        ProgressDialog waitDialog = new ProgressDialog(context);
        if(!TextUtils.isEmpty(msg)){
            waitDialog.setMessage(msg);
        }
        return waitDialog;
    }
}
