package com.woaigsc.gscapp.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by chuiyuan on 16-5-9.
 */
public abstract class BaseFragment1 extends Fragment
    implements View.OnClickListener{
    protected String TAG = this.getClass().getSimpleName();

    protected Context context ;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(getLayoutId(),container,false);
        findViews(root);
        setupViews(savedInstanceState);
        return root;
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    protected abstract int getLayoutId();

    protected abstract void findViews(View view);

    protected abstract void setupViews(Bundle bundle);

    protected void setListener(){

    }

    protected void fetchData(){

    }

    @Override
    public void onClick(View v) {

    }
}
