package com.example.cslive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mthree extends AppCompatActivity {
      Button m1,m2,m3,m4,m5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mthree);

        m1 = findViewById(R.id.onem3_1);
        m2 = findViewById(R.id.onem3_2);
        m3 = findViewById(R.id.onem3_3);
        m4 = findViewById(R.id.onem3_4);
        m5 = findViewById(R.id.onem3_5);


        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1n3hQlZG6a-TASzojqMKB3ER8Y2zeKR66/view");
            }
        });

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1SL04z-WTciKQ16qERosa13qs75COD20h/view");
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1l3sL_P7Z9g5GGGr3mxsqZqqYTzXISkcU/view");
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1vP6RONjG4QtJ2zk0IzhGsCE_weF9Ev0C/view");
            }
        });

        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1ERG2whonyxOQhAg7szClHWkBWVGskf9i/view");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity( new Intent(Intent.ACTION_VIEW,uri));
    }
}