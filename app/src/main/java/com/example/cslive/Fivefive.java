package com.example.cslive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fivefive extends AppCompatActivity {

    Button m1,m2,m3,m4,m5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fivefive);

        m1 = findViewById(R.id.onem55_1);
        m2 = findViewById(R.id.onem55_2);
        m3 = findViewById(R.id.onem55_3);
        m4 = findViewById(R.id.onem55_4);
        m5 = findViewById(R.id.onem55_5);


        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1jKGidVZTCzzRuA_3-YIBkWZeluhcZson/view");
            }
        });

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1n7rqDARQeO8JFSd25EvjgcuoKYoigJ19/view");
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1nUI_h4CM8LT6kWWvW_hxNjOQjvZ-Jjb9/view");
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1dDl8d3ejVBmd5TVl05hyYTeyb0ilVqrZ/view");
            }
        });

        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1mz-0yiHdeuilmaz-8D59_-I1xBpdoLL9/view");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity( new Intent(Intent.ACTION_VIEW,uri));

    }
}