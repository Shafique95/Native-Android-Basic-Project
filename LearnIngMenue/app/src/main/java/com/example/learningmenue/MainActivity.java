package com.example.learningmenue;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menue_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId()==R.id.settinngId){
            Toast.makeText(this, "Setting is selecteddd", Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId()==R.id.feedbackId){
            Toast.makeText(this, "This is Feedback", Toast.LENGTH_SHORT).show();
        }if (item.getItemId()==R.id.aboutUsId){
            Toast.makeText(this, "This is about", Toast.LENGTH_SHORT).show();
        }if (item.getItemId()==R.id.shareId){
            Toast.makeText(this, "This is Share", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}