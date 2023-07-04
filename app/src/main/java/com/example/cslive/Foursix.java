package com.example.cslive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Foursix extends AppCompatActivity {

    Button m1,m2,m3,m4,m5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foursix);


        m1 = findViewById(R.id.onem46_1);
        m2 = findViewById(R.id.onem46_2);
        m3 = findViewById(R.id.onem46_3);
        m4 = findViewById(R.id.onem46_4);
        m5 = findViewById(R.id.onem46_5);


        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/19pHImqcSVgvbV9uOw93Uyo8MlPQiOFmn/view");
            }
        });

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/16cnxpRXE_wmB3pPq4jpjpEm8TnhTc8ch/view");
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1q96pS2xpoSEqZD4hpjQF168xEZ32GOZ1/view");
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1LVx_WuvtvAjPX0uiJB8274xJ2lfO_oaw/view");
            }
        });

        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1drOYYVeJsUEbe2_yE9rZ35i4q54waGKh/view");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity( new Intent(Intent.ACTION_VIEW,uri));
    }
}
