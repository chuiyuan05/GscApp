package com.woaigsc.gscapp.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by chuiyuan on 16-5-9.
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String POEM_DATABASE_NAME = "poemdb";
    public static final String POEM_TABLE_NAME="poemtable";
    public static final String CREATE_POEM_TABLE="";

    public DatabaseHelper(Context context){
        super(context,POEM_DATABASE_NAME, null,1 );
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_POEM_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
