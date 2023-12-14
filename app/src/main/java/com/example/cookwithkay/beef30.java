package com.example.cookwithkay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class beef30 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beef30);
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://foodandbevy.com/philly-cheesesteak-sloppy-joes/?utm_source=social&utm_medium=pinterest&utm_campaign=compt1")));

    }
}