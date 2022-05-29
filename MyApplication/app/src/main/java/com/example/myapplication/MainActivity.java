package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private Button saveDataButton,loadDataBtn;
    private EditText nameEditText, ageEditText;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // initialize databaseReference;
        databaseReference = FirebaseDatabase.getInstance().getReference("Student");
        saveDataButton =findViewById(R.id.saveBtn);
        loadDataBtn = findViewById(R.id.loadDataBtn);
        nameEditText= findViewById(R.id.nameEditText);
        ageEditText = findViewById(R.id.ageEditText);
        // Add Listener with btn
        loadDataBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                startActivity(intent);
            }
        });
        // Add Listener with btn
        saveDataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
            }
        });

    }

    public void saveData() {
        String name = nameEditText.getText().toString();
        String age = ageEditText.getText().toString();
        // to get database Key
        String key = databaseReference.push().getKey();
        // create Student Obj
        Student student = new Student(name,age);
        databaseReference.child(key).setValue(student);
        Toast.makeText(this, "Data Save ", Toast.LENGTH_SHORT).show();
        nameEditText.setText("");
        ageEditText.setText("");


    }
}