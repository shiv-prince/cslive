package com.example.cslive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Threefour extends AppCompatActivity {

    Button m1,m2,m3,m4,m5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_threefour);

        m1 = findViewById(R.id.onem34_1);
        m2 = findViewById(R.id.onem34_2);
        m3 = findViewById(R.id.onem34_3);
        m4 = findViewById(R.id.onem34_4);
        m5 = findViewById(R.id.onem34_5);


        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1yRQCUGCCHtyOBNtXIMNwM9rVJPOUYpSG/view");
            }
        });

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1ezUNZRW_0AtrxJjAxBEClKNcafRMVua3/view");
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1SNtZIU2yaVC39o5iHbQdpwneQ1iyyQCU/view");
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/150uexDuwwHHkCs1cfPnV6FRhxHbJ3Z7v/view");
            }
        });

        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/16e4WZeG8wPOuFG_MF3xiz1ZVE7PATMaz/view");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity( new Intent(Intent.ACTION_VIEW,uri));
    }
}
