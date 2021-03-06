package com.example.ecommerceproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = findViewById(R.id.webViewId);

        WebSettings set = webView.getSettings();
        set.setJavaScriptEnabled(true);
        set.setAllowFileAccess(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.prothomalo.com/");


    }
}