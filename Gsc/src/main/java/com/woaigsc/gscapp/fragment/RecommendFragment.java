package com.woaigsc.gscapp.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.woaigsc.gscapp.R;
import com.woaigsc.gscapp.base.BaseFragment;
import com.woaigsc.gscapp.entity.Poem;
import com.woaigsc.gscapp.widget.PoemView;

/**
 * Created by chuiyuan on 16-5-8.
 */
public class RecommendFragment extends BaseFragment {
    private static RecommendFragment fragment ;
    private PoemView mPoemView ;

    public RecommendFragment(){

    }

    public static RecommendFragment newInstance(){
        if(fragment == null){
            fragment = new RecommendFragment() ;
        }
        return fragment ;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View root = inflater.inflate(R.layout.fragment_recommend,container, false);
        mPoemView = (PoemView)root.findViewById(R.id.recommend_poemview);
        mPoemView.setPoemTitle(getString(R.string.jiangjinjiu_title));
        return root ;
    }


}
