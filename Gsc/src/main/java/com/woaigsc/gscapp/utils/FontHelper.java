package com.woaigsc.gscapp.utils;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.woaigsc.gscapp.exception.FontException;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chuiyuan on 16-5-21.
 */
public class FontHelper {
    public static String FONT_FIRST = "zhongqichenweixin.ttf";
    public static String FONT_SECEOND = "zhongqiliqiang.ttf";

    public String DEFAULT_FONT= FONT_FIRST;//Default font.

    public static Map<String, Typeface> fontMap = new HashMap<>();
    private static FontHelper instance ;

    private AssetManager mAssetManager ;

    private Context context ;

    private FontHelper(Context context){
        this.context = context;
        mAssetManager = context.getAssets();
    }

    public static FontHelper getInstance(Context context){
        if(instance == null){
            synchronized (FontHelper.class){
                if(instance == null){
                    instance = new FontHelper(context);
                }
            }
        }
        return instance;
    }

    /**
     * Only need to be called at least once when startup.
     * If you want to add another font, call it again.
     * @param fontName The font you want to init.
     */
    private void initFont(String fontName){
        Typeface typeface = Typeface.createFromAsset(mAssetManager,"fonts/"+fontName);
        fontMap.put(fontName,typeface);
    }

    /**
     * Get font by fontName. If the no font was initiated, return
     * FONT_FIRST by default. If the font you want to use was not initiated,
     * init it now, and return.
     * @param fontName The font you want to use for this time.
     * @return
     */
    public Typeface getFont(String fontName){
        if(fontMap.isEmpty()){
            initFont(FONT_FIRST);
            return fontMap.get(FONT_FIRST);
        }
        if(fontMap.get(fontName) == null){
            initFont(fontName);
        }
        return fontMap.get(fontName);
    }

    /**
     * Set font for a TextView.
     * @param textView
     * @param fontName
     */
    public void setFont(TextView textView, String fontName){
        textView.setTypeface(getFont(fontName));
    }

    /**
     * Set font for ViewGroup recursively.
     * @param viewGroup
     * @param fontName
     */
    public void setFont(ViewGroup viewGroup, String fontName){
        int count = viewGroup.getChildCount();
        for(int i=0; i<count; i++){
            View view = viewGroup.getChildAt(i);
            if(view instanceof TextView){
                setFont((TextView)view, fontName);//for textview
            }else if(view instanceof ViewGroup){
                setFont((ViewGroup)view, fontName);//for ViewGroup
            }
        }
    }

}
