package com.example.cslive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fourfive extends AppCompatActivity {
    Button m1,m2,m3,m4,m5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourfive);


        m1 = findViewById(R.id.onem45_1);
        m2 = findViewById(R.id.onem45_2);
        m3 = findViewById(R.id.onem45_3);
        m4 = findViewById(R.id.onem45_4);
        m5 = findViewById(R.id.onem45_5);


        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1DQnxQOPZpQQlOb16P3eXngHu_Xv_IPmr/view");
            }
        });

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1Nj3Ef068siGYfCgVgGrVeJ_7nFk6Z42a/view");
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/10v2U1PXqYwTud8yAX_iy-WpVjP2cjTv3/view");
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1D_vUo85eGIu2GgIa92bos3WaipPqY8wE/view");
            }
        });

        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1sB1Xg4TLA9koWBjBM8r24uC-7HsTgowm/view");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity( new Intent(Intent.ACTION_VIEW,uri));
    }
}