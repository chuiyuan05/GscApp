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
public class CategoryFragment extends BaseFragment{
    private static CategoryFragment fragment ;

    public CategoryFragment (){

    }

    public static CategoryFragment newInstance(){
        if(fragment == null){
            fragment = new CategoryFragment();
        }
        return fragment ;
    }

    @Override
    protected void findViews(View view) {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_category;
    }

    @Override
    protected void setupViews(Bundle bundle) {

    }
}
