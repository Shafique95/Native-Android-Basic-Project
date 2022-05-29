package com.example.mysharefeedbakapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FeedbacActivity extends AppCompatActivity implements View.OnClickListener {
    private Button sendButton, clearButton;
    private EditText nameEditText, messageEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedbac);
        sendButton = findViewById(R.id.sendButtonId);
        clearButton = findViewById(R.id.clearButtonId);
        nameEditText = findViewById(R.id.nameEditId);
        messageEditText = findViewById(R.id.messageEditId);
        sendButton.setOnClickListener(this);
        clearButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        try {
            String name = nameEditText.getText().toString();
            String message = messageEditText.getText().toString();
            if (view.getId() == R.id.sendButtonId) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/email");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"www.shafiquebd@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Feedbac From app");
                intent.putExtra(Intent.EXTRA_TEXT, "name : " + name + "\n Message :" + message);
                startActivity(Intent.createChooser(intent, "Feedback with"));
            }
            if (view.getId() == R.id.clearButtonId) {
                nameEditText.setText("");
                messageEditText.setText("");
            }
        } catch (Exception e) {

        }


    }

}