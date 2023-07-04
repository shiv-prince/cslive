package com.example.cslive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fourtwo extends AppCompatActivity {

    Button m1,m2,m3,m4,m5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourtwo);

        m1 = findViewById(R.id.onem42_1);
        m2 = findViewById(R.id.onem42_2);
        m3 = findViewById(R.id.onem42_3);
        m4 = findViewById(R.id.onem42_4);
        m5 = findViewById(R.id.onem42_5);


        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/19xdnBQco9KrLoeb8vQ5rNP3JJKLA5TPW/view");
            }
        });

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1ITezKIAzkISgTZhUWlZBOzM-_NjXaaCR/view");
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1K1pDodbFgmPGc7ae0lBhr3V4ASE7kJNS/view");
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1-_fvpXEYxx9wM3g-2snrxT7AYVWc4lsS/view");
            }
        });

        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/10HX2rYaehvHIDzVZj4Yhi6_vSiL9UHmo/view");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity( new Intent(Intent.ACTION_VIEW,uri));
    }
}