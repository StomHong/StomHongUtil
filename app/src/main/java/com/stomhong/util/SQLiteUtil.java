package com.stomhong.util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * @author StomHong on 2016/9/22.
 */

public class SQLiteUtil {



public static DBHelper create(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
    return new DBHelper(context,name,factory,version);
}






    private static class DBHelper extends SQLiteOpenHelper {


        public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
            super(context, name, factory, version);
        }
//        public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
//            super(context, name, factory, version, errorHandler);
//        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            //第一次创建表的时调用
            db.execSQL("");
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("");
        }
    }
}
