package com.example.cslive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Threethree extends AppCompatActivity {
    Button m1,m2,m3,m4,m5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_threethree);


        m1 = findViewById(R.id.onem33_1);
        m2 = findViewById(R.id.onem33_2);
        m3 = findViewById(R.id.onem33_3);
        m4 = findViewById(R.id.onem33_4);
        m5 = findViewById(R.id.onem33_5);


        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/134GiQlMtCk_bLujtqk5b1IvxTHkImYW3/view");
            }
        });

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1nYiLcnhguUDJ5R1PlPCIQ7ScsCTzqjEb/view");
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/10X0cyQPtDcrNyBH6O4EQZmcCRxKFUo6m/view");
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1dbxWXQfx5VzWZ3lYW3e5P0OBkNXNYgP9/view");
            }
        });

        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1xANVtZxsXa_8Ve0hTOa8jgVTHCjPogZ5/view");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity( new Intent(Intent.ACTION_VIEW,uri));
    }
}
