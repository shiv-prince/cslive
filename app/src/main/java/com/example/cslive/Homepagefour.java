package com.example.cslive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Homepagefour extends AppCompatActivity {

    Button b1,b2,b3,b4,b6,b7;
    Button logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepagefour);

        logout = findViewById(R.id.logout4);



        b1 = findViewById(R.id.button1four);
        b2 = findViewById(R.id.button2four);
        b3 = findViewById(R.id.button3four);
        b4 = findViewById(R.id.button4four);
        b6 = findViewById(R.id.button5four);
        b7 = findViewById(R.id.button6four);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Homepagefour.this,Mfour.class);
                startActivity(i1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Homepagefour.this,Fourtwo.class);
                startActivity(i2);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(Homepagefour.this,Fourthree.class);
                startActivity(i3);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(Homepagefour.this,Fourfour.class);
                startActivity(i4);
            }
        });


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6 = new Intent(Homepagefour.this,Fourfive.class);
                startActivity(i6);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6 = new Intent(Homepagefour.this,Foursix.class);
                startActivity(i6);
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences pref = getSharedPreferences("in",MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putBoolean("fl",false);
                editor.apply();
                editor.commit();
                Intent i = new Intent(Homepagefour.this,MainActivity.class);
                startActivity(i);
            }
        });

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity( new Intent(Intent.ACTION_VIEW,uri));
    }

}
