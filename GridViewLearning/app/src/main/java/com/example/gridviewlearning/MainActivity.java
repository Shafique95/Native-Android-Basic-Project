package com.example.gridviewlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    private  int[] flags ={
            R.drawable.afghanistan,R.drawable.armenia,R.drawable.azerbaijan,
            R.drawable.bahrain,R.drawable.bangladesh,R.drawable.bhutan,R.drawable.china,R.drawable.indialogo,
            R.drawable.japan,R.drawable.nepal,R.drawable.srilanka
    };
    String[] countryname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countryname=getResources().getStringArray(R.array.country_text);
        gridView = findViewById(R.id.gridViewId);
        CustomAdapter adapter = new CustomAdapter(this,countryname,flags);
        gridView.setAdapter(adapter);
    }
}