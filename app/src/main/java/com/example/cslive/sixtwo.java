package com.example.cslive;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class sixtwo extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixtwo);
        Button m1,m2,m3,m4,m5;
        m1 = findViewById(R.id.twom1);
        m2 = findViewById(R.id.twom2);
        m3 = findViewById(R.id.twom3);
        m4 = findViewById(R.id.twom4);
        m5 = findViewById(R.id.twom5);

        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1n9Zxr7T5U94_R3H_cJoklw8AXtPXaWmK/view");
            }
        });

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1mn_JLHXTXg-a1xPNGl8WFe8TFyK5J2Og/view");
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/10OMRkZuvehXa6TdOxu-kzKs4Pb0dBO8c/view");
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1ydwYy7QaCuWphpWWpcqGwJHiMlLrav-l/view");
            }
        });

        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1PsbORXD4IJ3_F8Sg5sSo-lxsm9-k2csl/view");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity( new Intent(Intent.ACTION_VIEW,uri));
    }
}
