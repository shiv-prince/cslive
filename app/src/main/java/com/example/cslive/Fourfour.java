package com.example.cslive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fourfour extends AppCompatActivity {
    Button m1,m2,m3,m4,m5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourfour);

        m1 = findViewById(R.id.onem44_1);
        m2 = findViewById(R.id.onem44_2);
        m3 = findViewById(R.id.onem44_3);
        m4 = findViewById(R.id.onem44_4);
        m5 = findViewById(R.id.onem44_5);


        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1p16TPhMsWRpuQNSVd-Inu2Nbfee3QCuF/view");
            }
        });

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1VccxenAnqFL6zZguEduDTK66EI87s_Ml/view");
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1tf-VdznHjvRpcvSFjfW2GiCCBxD7ihGw/view");
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1IwS-rR4kyWQf5-wmxaHcUWAgIMXqjpRC/view");
            }
        });

        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1ubnpACqewCRKtJXJVI8OZ5CzKBdOAhrn/view\n");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity( new Intent(Intent.ACTION_VIEW,uri));
    }
}
