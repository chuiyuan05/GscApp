package com.woaigsc.gscapp.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.woaigsc.gscapp.R;
import com.woaigsc.gscapp.base.BaseFragment;

/**
 * Created by chuiyuan on 16-5-8.
 */
public class MyInfoFragment extends BaseFragment {
    private static MyInfoFragment fragment ;

    public MyInfoFragment(){

    }

    public static MyInfoFragment newInstance(){
        if(fragment == null) {
            fragment = new MyInfoFragment();
        }
        return fragment;
    }

    @Override
    protected void findViews(View view) {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_myinfo;
    }

    @Override
    protected void setupViews(Bundle bundle) {

    }
}
