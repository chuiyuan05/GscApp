package com.woaigsc.gscapp.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.alibaba.fastjson.JSON;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.woaigsc.gscapp.R;
import com.woaigsc.gscapp.base.BaseFragment;
import com.woaigsc.gscapp.entity.Poem;
import com.woaigsc.gscapp.net.HttpUtils;
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

    @Override
    protected void findViews(View view) {
        mPoemView = (PoemView)view.findViewById(R.id.recommend_poemview);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_recommend;
    }

    @Override
    protected void setupViews(Bundle bundle) {
        fetchData();
    }

    @Override
    public void fetchData() {
        Log.d(TAG, "initData");
        showWaitDialog() ;//show wait dialog
        String url = HttpUtils.selectPoemByIdUrl(10) ;
        Request req = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.d(TAG, "response:"+response) ;
                //main thread
                Poem poem = JSON.parseObject(response, Poem.class);
                mPoemView.setPoem(poem);
                Log.d(TAG, poem.toString()) ;
                hideWaitDialog();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
                hideWaitDialog();//network failed
            }
        }) ;
        HttpSingleton.getInstance(this.getContext()).addToRequestQueue(req);

    }

    @Override
    protected void setListener() {
        super.setListener();
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
    }
}
