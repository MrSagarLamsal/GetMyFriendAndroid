package com.bhawa.getmyfriendandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autoContry;
    String[] country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        autoContry=findViewById(R.id.contryname);
        country =getResources().getStringArray(R.array.country);
        autoContry.setAdapter( new ArrayAdapter<String>(
                this,R.layout.support_simple_spinner_dropdown_item,country
        ));
    }
}
