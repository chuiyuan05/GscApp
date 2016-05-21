package com.woaigsc.gscapp.fragment;

import android.os.Bundle;
import android.view.View;

import com.woaigsc.gscapp.R;
import com.woaigsc.gscapp.base.BaseFragment;

/**
 * Created by chuiyuan on 16-5-21.
 */
public class AllFragment extends BaseFragment {
    private static AllFragment fragment ;

    public AllFragment(){

    }

    public static AllFragment newInstance(){
        if(fragment == null){
            fragment = new AllFragment();
        }
        return fragment ;
    }
    @Override
    protected void findViews(View view) {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_all;
    }

    @Override
    protected void setupViews(Bundle bundle) {

    }
}
