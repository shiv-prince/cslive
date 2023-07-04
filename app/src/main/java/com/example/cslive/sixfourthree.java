package com.example.cslive;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class sixfourthree extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixfourthree);
        Button m1,m2,m3,m4,m5;


        m1 = findViewById(R.id.button43m1);
        m2 = findViewById(R.id.button43m2);
        m3 = findViewById(R.id.button43m3);
        m4 = findViewById(R.id.button43m4);
        m5 = findViewById(R.id.button43m5);


        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1C18YD46QjJEnMmmOMuGGDcqh8D2sENyi/view");
            }
        });

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1QSLlX8kYgVk7uc55TGXK0EU8PCqCQMT4/view");
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1a3nS22LdOTcE21v3d8lo7c14cRA89QVg/view");
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1De6Wgl3gSPP46AZFK9Py5mB9XjYY32Zw/view");
            }
        });

        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1eaTczL0He8CadXknQ2txu8Kh0ksbPnka/view");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity( new Intent(Intent.ACTION_VIEW,uri));
    }
}