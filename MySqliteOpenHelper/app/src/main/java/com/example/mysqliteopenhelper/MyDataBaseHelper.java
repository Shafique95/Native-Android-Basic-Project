package com.example.mysqliteopenhelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyDataBaseHelper extends SQLiteOpenHelper {
    private Context context;
    private  static final String  DATABASE_name="student.db";
    private  static  final String TABLE_name = "student_details";
    private  static  final String ID = "_id";
    private  static  final String name= "name";
    private  static  final String Age = "age";
    private  static  final String Gender = "gender";
    private  static  final  int VERSIOn_number = 1;
    private static  final String  Create_Table = "CREATE TABLE "+TABLE_name+"("+ID+"INTEGER PRIMARY KEY AUTOINCREMENT,"+name+" VARCHAR(255),"+Age+"INTEGER);";
    private  static  final  String dropTable  ="DROP TABLE IF EXISTS" + TABLE_name;
    public MyDataBaseHelper(@Nullable Context context) {
        super(context, DATABASE_name, null,VERSIOn_number);
        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        try {
            Toast.makeText(context, "Database is created and onCreate is called", Toast.LENGTH_SHORT).show();
            sqLiteDatabase.execSQL(Create_Table);
        }catch (Exception e){
            Toast.makeText(context, "Exception :"+ e, Toast.LENGTH_SHORT).show();
        }


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        try {
            Toast.makeText(context, "OnUpgradet is called Is Called", Toast.LENGTH_SHORT).show();
            sqLiteDatabase.execSQL(dropTable);
            onCreate(sqLiteDatabase);
        }catch (Exception e){

        }

    }
}
