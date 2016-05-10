package com.woaigsc.gscapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.view.KeyEvent;

import com.woaigsc.gscapp.ui.MainTab;
import com.woaigsc.gscapp.adapter.SampleFragmentPagerAdapter;
import com.woaigsc.gscapp.base.BaseActivity;
import com.woaigsc.gscapp.utils.DoubleClickExitHelper;
import com.woaigsc.mylib.SingletonHolder;
import com.woaigsc.mylib.widget.ActionBar;
import com.woaigsc.mylib.widget.CustomViewPager;


public class MainActivity extends BaseActivity {
    private TabLayout mTab ;
    private CustomViewPager mViewpager ;
    private ActionBar mActionBar ;

    private SampleFragmentPagerAdapter mAdapter ;

    private DoubleClickExitHelper mDoubleClickExit ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTab = (TabLayout)findViewById(R.id.gsc_main_tablelayout);
        //Content, to put Fragment.
        mViewpager= (CustomViewPager) findViewById(R.id.gsc_main_viewpager);
        mActionBar = (ActionBar)findViewById(R.id.gsc_actionbar);
        mViewpager.setOffscreenPageLimit(4);
        initViews();
    }

    private void initViews(){
        mActionBar.setTitle("GscApp");
        mDoubleClickExit = new DoubleClickExitHelper(this) ;

        MainTab [] tabs = MainTab.values() ;
        mAdapter = new SampleFragmentPagerAdapter(getSupportFragmentManager(), this, tabs);
        mViewpager.setPagingEnabled(false);
        mViewpager.setAdapter(mAdapter);
        mTab.setupWithViewPager(mViewpager);

        for(int i=0;i<mTab.getTabCount();i++){
            TabLayout.Tab tab = mTab.getTabAt(i);
            if(tab!= null){
                tab.setCustomView(mAdapter.getTabView(i));
            }
        }

        mViewpager.setCurrentItem(0);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //destroy all singleton.
        SingletonHolder.destroy();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK){
            /*if(AppContext.get(AppConfig.KEY_DOUBLE_CLICK_EXIT, true)){
                return mDoubleClickExit.onKeyDown(keyCode, event) ;
            }*/
            return mDoubleClickExit.onKeyDown(keyCode, event) ;
        }
        return super.onKeyDown(keyCode, event);
    }
}
