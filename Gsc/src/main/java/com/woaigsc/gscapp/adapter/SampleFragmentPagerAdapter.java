package com.woaigsc.gscapp.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.woaigsc.gscapp.R;
import com.woaigsc.gscapp.activity.MainTab;
import com.woaigsc.gscapp.base.BaseFragment;
import com.woaigsc.gscapp.fragment.MainFragment;
import com.woaigsc.mylib.SingletonHolder;

/**
 * Created by chuiyuan on 16-4-28.
 */
public class SampleFragmentPagerAdapter extends FragmentPagerAdapter {

    private MainTab [] tabs;
    private Context context ;

    public SampleFragmentPagerAdapter(FragmentManager fm ,Context context, MainTab []tabs){
        super(fm);
        this.context = context ;
        this.tabs = tabs ;
    }

    public View getTabView(int position){
        View v = LayoutInflater.from(context).inflate(R.layout.gsc_main_customtab, null);
        TextView tv = (TextView)v.findViewById(R.id.gsc_tab_textView);
        tv.setText(getPageTitle(position));
        ImageView img = (ImageView)v.findViewById(R.id.gsc_tab_imageView);
        img.setImageResource(tabs[position].getResIcon());
        return v ;
    }

    @Override
    public Fragment getItem(int position) {
        return tabs[position].getFragment();
    }

    @Override
    public int getCount() {
        return tabs.length;
    }

    @Override
    public CharSequence getPageTitle(int position){
        return context.getString(tabs[position].getResName());
    }
}
