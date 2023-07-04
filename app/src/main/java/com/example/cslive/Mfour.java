package com.example.cslive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mfour extends AppCompatActivity {
    Button m1,m2,m3,m4,m5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mfour);


        m1 = findViewById(R.id.onem41_1);
        m2 = findViewById(R.id.onem41_2);
        m3 = findViewById(R.id.onem41_3);
        m4 = findViewById(R.id.onem41_4);
        m5 = findViewById(R.id.onem41_5);


        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1yVmi2M-Zyi-yZ6gmz40Vyc2DNxWkPjFd/view");
            }
        });

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/17MPkZ16BqrcRg8LcaCWuC3ls4nHB5x1d/view");
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1nFTnVmvrJUAxj2MYO1579eeGWYb2E_eI/view");
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1dpzP4_Ffp5wMMxY9LDGyn5Oi_80zWdfq/view");
            }
        });

        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1MZPTt7LvnwmzPVLr8l57ZTqNpNYXhcEc/view");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity( new Intent(Intent.ACTION_VIEW,uri));
    }
}
