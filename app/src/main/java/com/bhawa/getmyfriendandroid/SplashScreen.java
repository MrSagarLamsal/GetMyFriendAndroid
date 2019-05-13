package com.bhawa.getmyfriendandroid;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        final Intent goToMain=new Intent(this,MainActivity.class);

        //Sending navigation to main by makaing splash screen for defined time
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(goToMain);
                finish();
            }

        },2000);

    }
}
