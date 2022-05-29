package com.example.buttontutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

 private Button loginButton,logoutButton;
 private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginButton =(Button) findViewById(R.id.loginButtonId);
        textView = (TextView) findViewById(R.id.textViewId);
        logoutButton = (Button) findViewById(R.id.logoutButtonId);
    }


    public void msg(View view) {
        Toast.makeText(MainActivity.this,"Login Button is clicked",Toast.LENGTH_SHORT).show();
    }

    public void msg2(View view) {
        textView.setText("LogOut is clicked");
        Toast.makeText(this, "Logout Button is clicked", Toast.LENGTH_SHORT).show();
    }
}