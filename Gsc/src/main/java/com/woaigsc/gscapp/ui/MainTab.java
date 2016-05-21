package com.woaigsc.gscapp.ui;

import android.support.v4.app.Fragment;

import com.woaigsc.gscapp.R;
import com.woaigsc.gscapp.fragment.AllFragment;
import com.woaigsc.gscapp.fragment.CategoryFragment;
import com.woaigsc.gscapp.fragment.MyInfoFragment;
import com.woaigsc.gscapp.fragment.RecommendFragment;

/**
 * Created by chuiyuan on 16-5-8.
 */
public enum  MainTab{
    RECOMAND(1,R.string.recommend,R.drawable.icon, RecommendFragment.newInstance()),
    CATEGORY(2,R.string.category,R.drawable.icon, CategoryFragment.newInstance()),
    ALL(3,R.string.all, R.drawable.icon, AllFragment.newInstance()),
    MYINFO(4, R.string.myinfo,R.drawable.icon, MyInfoFragment.newInstance());

    private int index ;
    private int resName ;
    private int resIcon;
    private Fragment fragment;

    private MainTab(int index, int resName, int resIcon, Fragment fragment){
        this.index = index;
        this.resIcon = resIcon ;
        this.resName = resName ;
        this.fragment= fragment;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getResName() {
        return resName;
    }

    public void setResName(int resName) {
        this.resName = resName;
    }

    public int getResIcon() {
        return resIcon;
    }

    public void setResIcon(int resIcon) {
        this.resIcon = resIcon;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }
}
