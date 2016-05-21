package com.woaigsc.gscapp.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.woaigsc.gscapp.R;
import com.woaigsc.gscapp.entity.Category;


/**
 * Used in {@link com.woaigsc.gscapp.fragment.CategoryFragment}
 * Created by chuiyuan on 16-5-21.
 */
public class CategoryView extends RelativeLayout{
    private LayoutInflater mInflater ;
    private Context mContext ;

    private RelativeLayout mCategoryView ;
    private TextView mRefTv ;
    private GridView mGridView ;

    private Category mCategory;

    public CategoryView(Context context, AttributeSet attrs,
                        int defStyleAttr){
        super(context, attrs, defStyleAttr);
        mInflater = LayoutInflater.from(context);
        mCategoryView = (RelativeLayout)mInflater.inflate(R.layout.gsc_category_view,null);
        this.addView(mCategoryView);

        mRefTv = (TextView)mCategoryView.findViewById(R.id.gsc_category_ref_tv);
        mGridView = (GridView)mCategoryView.findViewById(R.id.gsc_category_details_gridlayout);

        TypedArray a = context.obtainStyledAttributes(attrs,R.styleable.PoemView);
        //int contentLine = a.getInt(R.styleable.PoemView_contentLine);
        a.recycle();
    }

    public CategoryView(Context context, AttributeSet attrs){
        this(context, attrs, 0);
    }

    public CategoryView(Context context){
        this(context, null);
    }

    /**
     * Set {@link Category}
     * @param category
     */
    public void setCategory(Category category){
        this.mCategory = category ;
        mRefTv.setText(category.getRef());
    }
}
