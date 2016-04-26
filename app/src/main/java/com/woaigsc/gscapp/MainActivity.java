package com.woaigsc.gscapp;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;

import com.woaigsc.gscapp.test.LMFragment;
import com.woaigsc.gscapp.test.PMFragment;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Configuration config = getResources().getConfiguration();
        FragmentManager fragmentManager = getFragmentManager() ;
        FragmentTransaction fragmentTransaction =
                fragmentManager.beginTransaction() ;

        if(config.orientation == Configuration.ORIENTATION_LANDSCAPE){
            LMFragment lmFragment = new LMFragment();
            fragmentTransaction.replace(android.R.id.content, lmFragment);
        }else{
            PMFragment pmFragment = new PMFragment();
            fragmentTransaction.replace(android.R.id.content, pmFragment);
        }
        fragmentTransaction.commit() ;

    }
}
