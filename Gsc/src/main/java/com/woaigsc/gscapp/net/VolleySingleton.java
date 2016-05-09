package com.woaigsc.gscapp.net;

import android.content.Context;
import android.graphics.Bitmap;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;

/**
 * Created by chuiyuan on 16-5-9.
 */
public class VolleySingleton {
    private String TAG = this.getClass().getSimpleName() ;

    private static VolleySingleton instance ;
    private RequestQueue mRequestQueue ;
    private ImageLoader mImageLoader ;
    private Context mContext ;

    private VolleySingleton(Context context){
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
    public static VolleySingleton getInstance(Context context){
        if(instance == null){
            synchronized(VolleySingleton.class){
                if(instance == null){
                    instance = new VolleySingleton(context) ;
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
