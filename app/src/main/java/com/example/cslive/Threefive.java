package com.example.cslive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Threefive extends AppCompatActivity {
    Button m1,m2,m3,m4,m5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_threefive);

        m1 = findViewById(R.id.onem35_1);
        m2 = findViewById(R.id.onem35_2);
        m3 = findViewById(R.id.onem35_3);
        m4 = findViewById(R.id.onem35_4);
        m5 = findViewById(R.id.onem35_5);


        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1eKB0MPwedwrx9lfq1brIDjCNs1dhB-5b/view");
            }
        });

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1Wfkc8NDuG0AJBSdt_1ZAIwnEM5WkuN1y/view");
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1ZZ47raW11Lvq3Y3RlhxPYGkaDikyOcQ2/view");
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1psTmF3r56QT-_6kCCEtbz41v79QaAt6C/view");
            }
        });

        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/12eIgCE_ff5-aP44ibtW7q9Jzfp-tfFTM/view");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity( new Intent(Intent.ACTION_VIEW,uri));
    }
}
