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
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View root = inflater.inflate(R.layout.fragment_category,container, false);
        return root ;
    }

}
