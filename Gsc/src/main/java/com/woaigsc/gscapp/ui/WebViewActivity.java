package com.woaigsc.gscapp.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.woaigsc.gscapp.R;
import com.woaigsc.gscapp.base.BaseActivity;

/**
 * Created by chuiyuan on 16-5-19.
 */
public class WebViewActivity extends BaseActivity{
    private WebView mWebView ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        mWebView = (WebView)findViewById(R.id.gsc_webview);
        String url = "http://10.10.9.168:3000/allBusiness.html?businessID=262,259,260";
        //String url = "http://121.42.40.196:8080/web/poem/7";
        mWebView.loadUrl(url);
        WebSettings settings = mWebView.getSettings() ;
        settings.setJavaScriptEnabled(true);
        //Do not use other browser
        mWebView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true ;
            }
        });
    }
}
