package com.example.cslive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fivethree extends AppCompatActivity {

    Button m1,m2,m3,m4,m5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fivethree);


        m1 = findViewById(R.id.onem53_1);
        m2 = findViewById(R.id.onem53_2);
        m3 = findViewById(R.id.onem53_3);
        m4 = findViewById(R.id.onem53_4);
        m5 = findViewById(R.id.onem53_5);


        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/177Jca_fKi6EDg4poH-DOBGXN15dmUm7k/view");
            }
        });

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/175CtvBb_B3EIYfMGfTFKQGnPMOrdELNI/view");
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1Qm1Z95QWYzlw880wpNCaXgplCbs07s69/view");
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1rlm1ZlFgCVs_JawZhzsKEVIzVfHqGLpO/view");
            }
        });

        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1CurqYvJgTDJXZcCDP_omprKhVuIWTxz9/view");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity( new Intent(Intent.ACTION_VIEW,uri));

    }
}