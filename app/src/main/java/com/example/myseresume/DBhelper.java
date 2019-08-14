package com.example.myseresume;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBhelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 3;//データベースバージョン

    //データベースの変数
    private static final String DATABASE_NAME = "test.db";
    private static final String TABLE_NAME = "";


    DBhelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
    }

    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){
        onUpgrade(db,oldVersion,newVersion);
    }
}
