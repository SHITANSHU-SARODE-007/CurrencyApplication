package com.example.shitanshu.currencyapplication;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by shitanshu on 3/22/2017.
 */

public class Splash extends AppCompatActivity {
    // splash screen delay time
    private static final int SPLASH_DISPLAY_TIME = 5000;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setting the splash layout
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            public void run() {
                //creating intent
                Intent intent = new Intent();

                //which class to open when the splash timer runs out
                intent.setClass(Splash.this, Login.class);

                //start the new class and finish this class
                Splash.this.startActivity(intent);
                Splash.this.finish();
            }
        }, SPLASH_DISPLAY_TIME);
    }
}



