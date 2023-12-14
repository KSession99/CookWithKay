package com.example.cookwithkay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class beef45 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beef45);
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://theforkedspoon.com/ground-turkey-pasta/?ssp_iabi=1683562656232")));

    }
}