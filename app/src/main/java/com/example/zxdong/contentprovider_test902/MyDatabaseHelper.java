package com.example.zxdong.contentprovider_test902;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ZXDong on 2018/6/25.
 */


public class MyDatabaseHelper extends SQLiteOpenHelper {

    public static final String CREATE_CONTACTS="create table contacts(id integer primary key autoincrement,name text,number text,sex text)";
    private Context context;
    public MyDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context,name,factory,version);
        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_CONTACTS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
