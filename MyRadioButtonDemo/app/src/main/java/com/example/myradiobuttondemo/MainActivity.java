package com.example.myradiobuttondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 private RadioGroup radioGroup;
 private Button button;
 private TextView resultTextView;
 private RadioButton genderButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = findViewById(R.id.radioGropuId);
        button =findViewById(R.id.showButtonId);
        resultTextView = findViewById(R.id.resultViewId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int selectecd = radioGroup.getCheckedRadioButtonId();
               genderButton = findViewById(selectecd);
              String value= genderButton.getText().toString();
              resultTextView.setText(value);
            }
        });
    }
}