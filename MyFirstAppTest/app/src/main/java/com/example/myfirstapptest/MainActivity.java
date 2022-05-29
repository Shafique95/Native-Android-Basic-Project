package com.example.myfirstapptest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button saveDataButton;
    private EditText nameEditText, ageEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        saveDataButton =findViewById(R.id.saveBtn);
        nameEditText= findViewById(R.id.nameEditText);
        ageEditText = findViewById(R.id.ageEditText);
        saveDataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveData();
            }
        });
    }

   public void saveData() {
        String name = nameEditText.getText().toString();
       String age = ageEditText.getText().toString();

    }
}