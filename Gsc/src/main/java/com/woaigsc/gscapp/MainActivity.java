package com.woaigsc.gscapp;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.woaigsc.gscapp.base.BaseActivity;
import com.woaigsc.gscapp.fragment.MainFragment;


public class MainActivity extends BaseActivity {
    private TabLayout mTab ;
    private ViewPager mViewpager ;
    private FragmentPagerAdapter mAdapter ;
    private String [] titles ;
    private int [] titleImg ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTab = (TabLayout)findViewById(R.id.gsc_main_tablelayout);
        mViewpager= (ViewPager)findViewById(R.id.gsc_main_viewpager);
        mViewpager.setOffscreenPageLimit(4);
        initViews();
    }

    private void initViews(){
        titles = new String []{"g1","g2","g2","g4"};
        titleImg = new int []{R.mipmap.ic_launcher, R.mipmap.ic_launcher,
        R.mipmap.ic_launcher,R.mipmap.ic_launcher};

        mAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return MainFragment.newInstance(position);
            }

            @Override
            public int getCount() {
                return titles.length;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return titles[position];

            }
        };
        mViewpager.setAdapter(mAdapter);
        mTab.setupWithViewPager(mViewpager);
    }
}
