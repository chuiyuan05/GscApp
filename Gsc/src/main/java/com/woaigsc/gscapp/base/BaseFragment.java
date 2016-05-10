package com.woaigsc.gscapp.base;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.woaigsc.gscapp.R;
import com.woaigsc.gscapp.ui.dialog.DialogControl;

/**
 * Created by chuiyuan on 16-5-9.
 */
public abstract class BaseFragment extends Fragment
    implements View.OnClickListener, DialogControl{
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

    /**
     * Can be called in setupViews.
     */
    protected void setListener(){

    }

    /**
     * Can be called in setupViews
     */
    protected void fetchData(){

    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void hideWaitDialog() {
        FragmentActivity activity = getActivity() ;
        if (activity instanceof DialogControl){
            ((DialogControl) activity).hideWaitDialog();
        }
    }

    @Override
    public ProgressDialog showWaitDialog() {
        return showWaitDialog(R.string.gsc_loading);
    }

    @Override
    public ProgressDialog showWaitDialog(int resId) {
        FragmentActivity activity = getActivity() ;
        if(activity instanceof DialogControl){
            return ((DialogControl) activity).showWaitDialog(resId) ;
        }
        return null;
    }

    @Override
    public ProgressDialog showWaitDialog(String msg) {
        FragmentActivity activity = getActivity() ;
        if(activity instanceof DialogControl){
            return ((DialogControl) activity).showWaitDialog(msg);
        }
        return null;
    }
}
