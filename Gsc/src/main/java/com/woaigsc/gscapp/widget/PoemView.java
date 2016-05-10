package com.woaigsc.gscapp.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.woaigsc.gscapp.R;
import com.woaigsc.gscapp.entity.Poem;
import com.woaigsc.gscapp.utils.StringUtils;

/**
 * Created by chuiyuan on 16-5-8.
 */
public class PoemView extends RelativeLayout{
    private RelativeLayout mPoemView ;
    private TextView mTitleTv ;
    private TextView mAuthorTv;
    private TextView mDynastyTv;
    private TextView mContentTv ;

    //private LayoutInflater  mInflater ;

    private Poem poem ;

    public PoemView(Context context ){
        super(context);
    }

    public PoemView(Context context, AttributeSet attrs){
        super(context,attrs);
        LayoutInflater mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mPoemView = (RelativeLayout)mInflater.inflate(R.layout.poem_view, null);
        this.addView(mPoemView);

        mTitleTv = (TextView)mPoemView.findViewById(R.id.poem_title);
        mAuthorTv = (TextView)mPoemView.findViewById(R.id.poem_author);
        mDynastyTv = (TextView)mPoemView.findViewById(R.id.poem_dynasty);
        mContentTv = (TextView)mPoemView.findViewById(R.id.poem_content);
    }

    public void setPoem(Poem poem){
        this.poem = poem ;
        setPoemTitle(poem.getTitle());
        setPoemAuthor(poem.getAuthor());
        setPoemDynasty(poem.getDynasty());
        setPoemContent(poem.getContent());
    }

    public void setPoemTitle(String title ){
        mTitleTv.setText(title);
    }

    public void setPoemAuthor(String author){
        mAuthorTv.setText(author);
    }

    public void setPoemDynasty(String dynasty){
        mDynastyTv.setText(dynasty);
    }

    /**
     * content will be split and space will be get ride.
     * @param content
     */
    public void setPoemContent(String content){
        //split content.
        mContentTv.setText(StringUtils.splitContent(content));
    }


}
