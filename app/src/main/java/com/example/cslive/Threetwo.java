package com.example.cslive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Threetwo extends AppCompatActivity {
    Button m1,m2,m3,m4,m5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_threetwo);


        m1 = findViewById(R.id.onem32_1);
        m2 = findViewById(R.id.onem32_2);
        m3 = findViewById(R.id.onem32_3);
        m4 = findViewById(R.id.onem32_4);
        m5 = findViewById(R.id.onem32_5);


        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1tidaYCWCViB0HLFlYwO67-DqkKZEYSq2/view");
            }
        });

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1fRETfX-93zUhDMmdTMOtYQP_RI6Yy6nT/view");
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1HKeL-BMyBWNc0J2q5Gvj2rwun7YU0-Xk/view");
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1FKYPvd2xCSzTmx3MAfOwKQUebKu66SO6/view");
            }
        });

        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1GJ0VAlzJLF63IQNwsrccHYu5hzkyyi5l/view");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity( new Intent(Intent.ACTION_VIEW,uri));
    }
}
