package com.example.cslive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences pref = getSharedPreferences("in", MODE_PRIVATE);
                boolean check = pref.getBoolean("fl", false);
                Intent inext;
                if (check) {
                    inext = new Intent(splash.this, supermainpage.class);
                } else {
                    inext = new Intent(splash.this, MainActivity.class);

                }
                startActivity(inext);
                finish();
            }
        },2000);
    }
}