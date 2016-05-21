package com.woaigsc.gscapp.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.woaigsc.gscapp.R;
import com.woaigsc.gscapp.entity.Poem;
import com.woaigsc.mylib.utils.FontHelper;
import com.woaigsc.gscapp.utils.StringUtils;

/**
 * Created by chuiyuan on 16-5-8.
 */
public class PoemView extends RelativeLayout
    implements View.OnClickListener{
    private LayoutInflater mInflater ;
    private Context mContext ;

    private RelativeLayout mPoemView ;
    private TextView mTitleTv ;
    private TextView mDynastyAuthorTv;
    private TextView mContentTv ;

    //private LayoutInflater  mInflater ;

    private Poem poem ;

    private onPoemViewClickListener mListener ;

    public PoemView(Context context ){
        super(context);
    }

    public PoemView(Context context, AttributeSet attrs){
        super(context,attrs);
        this.mContext = context ;
        mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        mPoemView = (RelativeLayout)mInflater.inflate(R.layout.poem_view, null);
        this.addView(mPoemView);
        mTitleTv = (TextView)mPoemView.findViewById(R.id.poem_title);
        mDynastyAuthorTv = (TextView)mPoemView.findViewById(R.id.poem_dynasty_author);
        mContentTv = (TextView)mPoemView.findViewById(R.id.poem_content);

        TypedArray a = context.obtainStyledAttributes(attrs,R.styleable.PoemView);
        //int contentLine = a.getInt(R.styleable.PoemView_contentLine);
        a.recycle();

        setListeners();
        //Set font for PoemView
        FontHelper.getInstance(context).setFont(mPoemView,FontHelper.FONT_FIRST);
    }

    public void setPoem(Poem poem){
        this.poem = poem ;
        mTitleTv.setText(StringUtils.purify(poem.getTitle()));
        mTitleTv.getPaint().setFakeBoldText(true);
        mDynastyAuthorTv.setText(StringUtils.purify(
                "["+poem.getDynasty()+"]"+poem.getAuthor()));
        mContentTv.setText(StringUtils.splitContent(poem.getContent()));
    }

    @Override
    public void onClick(View v) {
        if(mListener == null){
            return;
        }
        switch (v.getId()){
            case R.id.poem_title:
                mListener.onTitleClick();
                break;
            case R.id.poem_dynasty_author:
                mListener.onDynastyAuthorClick();
                break;
            case R.id.poem_content:
                mListener.onContentClick();
                break;
        }
    }

    private void setListeners(){
        mTitleTv.setOnClickListener(this);
        mDynastyAuthorTv.setOnClickListener(this);
        mContentTv.setOnClickListener(this);
    }

    /**
     * Listener click on the poemview.
     */
    public interface onPoemViewClickListener{
        void onTitleClick();
        void onDynastyAuthorClick();
        void onContentClick();
    }

    public void setOnPoemViewClickListener(onPoemViewClickListener listener){
        this.mListener = listener;
    }
}
