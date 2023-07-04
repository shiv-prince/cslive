package com.example.cslive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fivefour extends AppCompatActivity {

    Button m1,m2,m3,m4,m5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fivefour);


        m1 = findViewById(R.id.onem54_1);
        m2 = findViewById(R.id.onem54_2);
        m3 = findViewById(R.id.onem54_3);
        m4 = findViewById(R.id.onem54_4);
        m5 = findViewById(R.id.onem54_5);


        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1JDW-yfXHxhBzRBe8vIfDL0ueRzcBstCg/view");
            }
        });

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/19w7iKBej3R16OG-B0jFOWj-VkybDy3o0/view");
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1mEbDsCVnAHlRnbua3jVk2QZx1TTF8xvJ/view");
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1SKeGQDzNzJepZycPmfK69q2lnb6G8AkY/view");
            }
        });

        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1LztYBNCahH98_Ffeipocxhxi9PEWlZ2N/view");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity( new Intent(Intent.ACTION_VIEW,uri));

    }
}