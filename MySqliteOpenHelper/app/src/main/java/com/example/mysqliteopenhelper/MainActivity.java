package com.example.mysqliteopenhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    MyDataBaseHelper myDataBaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDataBaseHelper = new MyDataBaseHelper(this);
       SQLiteDatabase sqLiteDatabase = myDataBaseHelper.getWritableDatabase();
    }
}