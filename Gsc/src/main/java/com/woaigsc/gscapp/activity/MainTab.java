package com.woaigsc.gscapp.activity;

import com.woaigsc.gscapp.R;
import com.woaigsc.gscapp.fragment.CategoryFragment;
import com.woaigsc.gscapp.fragment.MyInfoFragment;
import com.woaigsc.gscapp.fragment.RecommendFragment;

/**
 * Created by chuiyuan on 16-5-8.
 */
public enum  MainTab{
    RECOMAND(1,R.string.recommend,R.drawable.icon, RecommendFragment.class),
    CATEGORY(2,R.string.category,R.drawable.icon, CategoryFragment.class),
    MYINFO(4, R.string.app_name,R.drawable.icon, MyInfoFragment.class);

    private int index ;
    private int resName ;
    private int resIcon;
    private Class<?> cls ;

    private MainTab(int index, int resName, int resId, Class<?>cls){
        this.index = index;
        this.resIcon = resIcon ;
        this.resName = resName ;
        this.cls = cls;
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

    public Class<?> getCls() {
        return cls;
    }

    public void setCls(Class<?> cls) {
        this.cls = cls;
    }
}
