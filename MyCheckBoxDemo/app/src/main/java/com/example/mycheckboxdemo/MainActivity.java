package com.example.mycheckboxdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 private CheckBox milkCheckbox,sugerCheckBox,waterCheckBox;
 private Button showButton;
 private TextView resultTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        milkCheckbox = findViewById(R.id.milkCheckBoxId);
        sugerCheckBox = findViewById(R.id.sugerCheckBoxId);
        waterCheckBox = findViewById(R.id.waterCheckBoxId);
        showButton = findViewById(R.id.showButtonId);
        resultTextView = findViewById(R.id.resultTextViewId);
        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                if (milkCheckbox.isChecked()){
                    String value = milkCheckbox.getText().toString();
                    stringBuilder.append(value + " is Ordered\n" );
                } if (sugerCheckBox.isChecked()){
                    String value = sugerCheckBox.getText().toString();
                    stringBuilder.append(value + " is Ordered\n" );
                } if (waterCheckBox.isChecked()){
                    String value = waterCheckBox.getText().toString();
                    stringBuilder.append(value + " is Ordered\n" );
                }
                resultTextView.setText(stringBuilder);
            }
        });
    }
}