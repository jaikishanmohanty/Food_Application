package com.example.foodapplication;

import static java.lang.Thread.sleep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        Thread td = new Thread(){
           public void run(){
               try {
                   sleep(5000);
               }
               catch (Exception e){
                   e.printStackTrace();
               }finally {
                   Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
                   startActivity(intent);
               }
           }
        };td.start();



    }
}