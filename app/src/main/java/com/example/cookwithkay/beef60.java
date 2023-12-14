package com.example.cookwithkay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class beef60 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beef60);
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://bakeitwithlove.com/cracker-barrel-meatloaf/#recipe")));

    }
}