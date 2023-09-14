package com.omrfrkg.sqliteprojectejava;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //SQL LİTE
        //VERİTABANI OLUŞTUR
        SQLiteDatabase database = this.openOrCreateDatabase("student",MODE_PRIVATE,null);

        //TABLO OLUŞTUR
        database.execSQL("CREATE TABLE IF NOT EXISTS student(id INTEGER PRIMARY KEY,name VARCHAR,age INT)");

        //TABLOYA VERİ EKLE
        //database.execSQL("INSERT INTO student(name,age) VALUES('ÖMER FARUK',25)");
        //database.execSQL("INSERT INTO student(name,age) VALUES ('sencer',31)");
        //database.execSQL("Update student Set name = 'Ahmet' Where id = 3");
        //database.execSQL("DELETE FROM student WHERE id = 3");

        Cursor cursor = database.rawQuery("SELECT * FROM student",null);
        //Cursor cursor = database.rawQuery("SELECT * FROM student WHERE age > 25",null);
        int nameIx = cursor.getColumnIndex("name");
        int ageIx = cursor.getColumnIndex("age");
        int idIx = cursor.getColumnIndex("id");

        while(cursor.moveToNext()){
            System.out.println(cursor.getString(nameIx));
            System.out.println(cursor.getInt(ageIx));
            System.out.println(cursor.getInt(idIx));
        }
        cursor.close();
    }
}