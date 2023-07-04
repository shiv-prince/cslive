package com.example.cslive;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class sixfourone extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixfourone);

        Button m1,m2,m3,m4,m5;
        m1 = findViewById(R.id.button41m1);
        m2 = findViewById(R.id.button41m2);
        m3 = findViewById(R.id.button41m3);
        m4 = findViewById(R.id.button41m4);
        m5 = findViewById(R.id.button41m5);


        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1kB2005j1ocrVEXNieJsxSHRvZ7sAtzss/view");
            }
        });

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1m7C5LnLmfIEzPjyjiPygFxxjDkiGnmB6/view");
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1a14A1zGdCnXYQPr2C9fahSY6ss8Sy-m3/view");
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1KreyBQFUNkUwFty4rDqZ8pu7okAOiSH4/view");
            }
        });

        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/12nXRxokfvXdooftBZ_rqdHyfiVmt0hOK/view");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity( new Intent(Intent.ACTION_VIEW,uri));
    }
}