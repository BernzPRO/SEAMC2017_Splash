package com.example.bernie.seamc2017_splash;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Bernie on 11/2/16.
 */

public class Splash_Screen extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen_layout);
        Thread myThread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3500);
                    Intent startMainActivity =  new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(startMainActivity);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        myThread.start();
    }
}


