package com.example.cslive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Threesix extends AppCompatActivity {
    Button m1,m2,m3,m4,m5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_threesix);


        m1 = findViewById(R.id.onem36_1);
        m2 = findViewById(R.id.onem36_2);
        m3 = findViewById(R.id.onem36_3);
        m4 = findViewById(R.id.onem36_4);
        m5 = findViewById(R.id.onem36_5);


        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1qdLjCDGKnBdV85a0PaAEzikizDzXBwGH/view");
            }
        });

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1Af5lHDFht_cwovd7x9YLxBBZeY5cSGHV/view");
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1K7PeCiEHiLb0oeMR5Wra-HLn9-S-wYpV/view");
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1h-WEvwXDAlv_GOeyVQu3KYHUfKvmCSIs/view");
            }
        });

        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1rQ_68Y-A6FefPauTIJyZyE7CbkrA2rQk/view");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity( new Intent(Intent.ACTION_VIEW,uri));
    }
}
