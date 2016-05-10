package com.woaigsc.gscapp.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.woaigsc.gscapp.R;
import com.woaigsc.gscapp.base.BaseFragment;
import com.woaigsc.gscapp.net.URLConstant;
import com.woaigsc.gscapp.net.HttpSingleton;
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
        initView(root);
        fetchData();
        return root ;
    }

    @Override
    public void initView(View view) {
        Log.d(TAG,"initView");
        mPoemView = (PoemView)view.findViewById(R.id.recommend_poemview);
        mPoemView.setPoemTitle(getString(R.string.jiangjinjiu_title));
        mPoemView.setPoemAuthor(getString(R.string.jiangjinjiu_author));
        mPoemView.setPoemDynasty(getString(R.string.jiangjinjiu_dynasty));
        mPoemView.setPoemContent(getString(R.string.jiangjinjiu_content));
    }

    @Override
    public void fetchData() {
        Log.d(TAG, "initData");
        String url = URLConstant.SERVER_ADDRESS+"/poem/4";
        StringRequest req = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.d(TAG, "response:"+response) ;
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        }) ;
        HttpSingleton.getInstance(this.getContext()).addToRequestQueue(req);

    }

}
