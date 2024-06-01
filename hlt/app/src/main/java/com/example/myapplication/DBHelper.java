package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(Context context) {
        super(context, "Userdata", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL("create table Userdetails(username TEXT primary key, password TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase DB, int i, int i1) {
        DB.execSQL("drop table if exists Userdetails");
    }

    public boolean insertdata(String username, String password) {
        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("username", username);
        contentValues.put("password", password);
        long result = DB.insert("Userdetails", null, contentValues);
        if (result == -1) {
            return false;
        }
        else {
            return true;
        }

        }

        public boolean checkusername(String username){
        SQLiteDatabase DB = this.getWritableDatabase();
            Cursor cursor = DB.rawQuery("select * from Userdetails where username=?",new String[]{username});
            if (cursor.getCount()>0){
                return true;
            }
            else{
                return false;
            }
        }
        public Boolean checkusernamepassword(String usename, String password){
        SQLiteDatabase DB = this.getWritableDatabase();
        Cursor cursor = DB.rawQuery("select * from  Userdetails where username=? and password=?",new String[]{usename,password});
        if (cursor.getCount()>0){
            return true;
        }
        else {
            return false;
        }
        }


}
