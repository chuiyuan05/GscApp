package com.woaigsc.gscapp.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.woaigsc.gscapp.AppContext;

/**
 * Created by chuiyuan on 16-5-8.
 */
public class BaseFragment extends Fragment implements BaseFragmentInterface,
        View.OnClickListener{
    protected String TAG = this.getClass().getSimpleName();
    protected LayoutInflater mInflater ;

    public AppContext getApplication(){
        return (AppContext)getActivity().getApplication();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mInflater = inflater;
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    protected int getLayoutId(){
        return 0;
    }

    protected View inflateView(int resId){
        return mInflater.inflate(resId, null);
    }
    @Override
    public void initView(View view) {

    }

    @Override
    public void initData() {

    }

    @Override
    public void onClick(View v) {

    }
}
