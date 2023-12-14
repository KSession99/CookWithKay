package com.example.cookwithkay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class salmon30 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salmon30);

        WebView webView = findViewById(R.id.video);
        webView.getSettings().setJavaScriptEnabled(true); // Enable JavaScript if needed
        webView.loadUrl("https://www.cookinwithmima.com/honey-garlic-salmon-bites/");
    }
}