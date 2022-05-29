package com.example.mycountryprofiledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        imageView = findViewById(R.id.imageViewId);
        textView = findViewById(R.id.textViewId);


        // To Receive value form another Activity
        Bundle bundle = getIntent().getExtras();
        if (bundle !=null){
            String countryname= bundle.getString("name");
            showDetails(countryname);
        }
    }
    void showDetails(String countryname){
        if (countryname.equals("Bangladesh")){
            imageView.setImageResource(R.drawable.bangladesh);
            textView.setText(R.string.bangladesh_text);
        }if (countryname.equals("India")){
            imageView.setImageResource(R.drawable.india);
            textView.setText(R.string.india_text);
        }if (countryname.equals("Pakistan")){
            imageView.setImageResource(R.drawable.pk);
            textView.setText(R.string.pakistan_text);
        }
    }
}