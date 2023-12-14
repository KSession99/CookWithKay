package com.example.cookwithkay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        final RadioButton Short = (RadioButton) findViewById(R.id.rbShort);
        final RadioButton Medium = (RadioButton) findViewById(R.id.rbMedium);
        final RadioButton Long = (RadioButton) findViewById(R.id.rbLong);
        final Spinner ingredients = (Spinner) findViewById(R.id.ingredients);
        Button find = (Button) findViewById(R.id.btFind);
        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedSpinnerItemPosition = ingredients.getSelectedItemPosition();
                if (Short.isChecked() && selectedSpinnerItemPosition == 1){
                    startActivity(new Intent( SearchActivity.this, beef30.class ));
                }
                if (Medium.isChecked() && selectedSpinnerItemPosition == 1){
                    startActivity(new Intent(SearchActivity.this, beef45.class ));
                }
                if (Long.isChecked() && selectedSpinnerItemPosition == 1){
                    startActivity(new Intent(SearchActivity.this, beef60.class));
                }
                if(Short.isChecked() && selectedSpinnerItemPosition == 2){
                    startActivity(new Intent(SearchActivity.this, chicken30.class));
                }
               if(Medium.isChecked() && selectedSpinnerItemPosition == 2){
                    startActivity(new Intent(SearchActivity.this, chicken45.class));
                }
                if(Short.isChecked() && selectedSpinnerItemPosition == 3) {
                    startActivity(new Intent(SearchActivity.this, salmon30.class));
                }
            }
        });
    }
}