package com.woaigsc.gscapp.net;

import android.content.Context;
import android.graphics.Bitmap;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;

/**
 * Created by chuiyuan on 16-5-9.
 * A wrap of Volley.
 */
public class HttpSingleton {
    private String TAG = this.getClass().getSimpleName() ;

    private static HttpSingleton instance ;
    private RequestQueue mRequestQueue ;
    private ImageLoader mImageLoader ;
    private Context mContext ;

    private HttpSingleton(Context context){
        this.mContext = context ;
        mRequestQueue = getRequestQueue() ;
        mImageLoader = new ImageLoader(mRequestQueue,
                new ImageLoader.ImageCache(){
                    @Override
                    public Bitmap getBitmap(String url) {
                        return null;
                    }

                    @Override
                    public void putBitmap(String url, Bitmap bitmap) {

                    }
                });
    }

    /**
     * To be modified.
     * @param context
     * @return
     */
    public static HttpSingleton getInstance(Context context){
        if(instance == null){
            synchronized(HttpSingleton.class){
                if(instance == null){
                    instance = new HttpSingleton(context) ;
                }
            }
        }
        return instance ;
    }

    public RequestQueue getRequestQueue(){
        if(mRequestQueue== null){
            mRequestQueue = Volley.newRequestQueue(mContext.getApplicationContext());
        }
        return  mRequestQueue ;
    }

    public <T> void addToRequestQueue(Request <T> req ){
        getRequestQueue().add(req);
    }

    public ImageLoader getImageLoader(){
        return mImageLoader ;
    }
}
