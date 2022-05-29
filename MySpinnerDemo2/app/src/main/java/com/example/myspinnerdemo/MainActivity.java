package com.example.myspinnerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
 private Spinner spinner;
 private  String[] countryname;
 private  String[] population;
    private  int[] flags ={
            R.drawable.afghanistan,R.drawable.armenia,R.drawable.azerbaijan,
            R.drawable.bahrain,R.drawable.bangladesh,R.drawable.bhutan,R.drawable.china,R.drawable.indialogo,
            R.drawable.japan,R.drawable.nepal,R.drawable.srilanka

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryname = getResources().getStringArray(R.array.country_text);
        population = getResources().getStringArray(R.array.population);
        spinner = findViewById(R.id.spinnerId);
        CustomAdapter customAdapter = new CustomAdapter(this,flags,countryname,population);
        spinner.setAdapter(customAdapter);
    }
}