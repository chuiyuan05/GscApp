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
import com.woaigsc.gscapp.fragment.MainFragment;

/**
 * Created by chuiyuan on 16-4-28.
 */
public class SampleFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT =4 ;
    private String tabTitles [] = new String []{"q","w","e","r"};
    private Context context ;

    public SampleFragmentPagerAdapter(FragmentManager fm ,Context context){
        super(fm);
        this.context = context ;
    }

    public View getTabView(int position){
        View v = LayoutInflater.from(context).inflate(R.layout.gsc_main_customtab, null);
        TextView tv = (TextView)v.findViewById(R.id.gsc_tab_textView);
        tv.setText(tabTitles[position]);
        ImageView img = (ImageView)v.findViewById(R.id.gsc_tab_imageView);
        return v ;
    }

    @Override
    public Fragment getItem(int position) {
        return MainFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
    @Override
    public CharSequence getPageTitle(int position){
        return tabTitles[position];
    }
}
