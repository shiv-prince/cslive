package com.example.cslive;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class sixthree extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixthree);
        Button m1,m2,m3,m4,m5;

        m1 = findViewById(R.id.thm1);
        m2 = findViewById(R.id.thm2);
        m3 = findViewById(R.id.thm3);
        m4 = findViewById(R.id.thm4);
        m5 = findViewById(R.id.thm5);


        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1V5z3XB-Ic7GEiXzpZ8jBuDIkGsx-KFNM/view");
            }
        });

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/16BdxhaH4Mabd2SMNid0xR7vWLhjCb387/view");
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/13r90Rd6a-LjEMYgRm651SExeI4Dp-6ew/view");
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1d31B3noFxz8KW4b26yB7GGUzU2WHTrFT/view");
            }
        });

        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1bUVsP5CwuIZr5LECeS6aQ5vE3mCJYujL/view");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity( new Intent(Intent.ACTION_VIEW,uri));
    }
}