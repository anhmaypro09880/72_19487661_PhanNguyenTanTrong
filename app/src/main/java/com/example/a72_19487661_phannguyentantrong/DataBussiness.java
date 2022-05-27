package com.example.a72_19487661_phannguyentantrong;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DataBussiness extends SQLiteOpenHelper {
    public DataBussiness(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql ="Create Table Bussiness (tenCv text primary key,mucDo text not null,thoiGian text not null)";
        sqLiteDatabase.execSQL(sql);
    }
    public void addBussiness(Bussiness t){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("tenCv",t.getTenCv());
        values.put("mucDo",t.getMucDo());
        values.put("thoiGian",t.getThoiGian());
        db.insert("Bussiness",null,values);
    }

    public List<Bussiness> getAll(){
        List<Bussiness> list = new ArrayList<>();
        String sql ="SELECT * from Bussiness";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(sql,null);
        if(cursor.moveToFirst()){
            do{
                Bussiness user = new Bussiness();
                user.setTenCv(cursor.getString(0));
                user.setMucDo(cursor.getString(1));
                user.setThoiGian(cursor.getString(2));

                list.add(user);

            }while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return list;
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
