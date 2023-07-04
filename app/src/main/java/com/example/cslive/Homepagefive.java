package com.example.cslive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Homepagefive extends AppCompatActivity {

    Button b1,b2,b3,b4,b6,b7;
    Button logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepagefive);
        logout = findViewById(R.id.logout5);



        b1 = findViewById(R.id.button1five);
        b2 = findViewById(R.id.button2five);
        b3 = findViewById(R.id.button3five);
        b4 = findViewById(R.id.button4five);
        b6 = findViewById(R.id.button5five);
        b7 = findViewById(R.id.button6five);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Homepagefive.this,Fiveone.class);
                startActivity(i1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Homepagefive.this,Fivetwo.class);
                startActivity(i2);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(Homepagefive.this,Fivethree.class);
                startActivity(i3);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(Homepagefive.this,Fivefour.class);
                startActivity(i4);
            }
        });


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6 = new Intent(Homepagefive.this,Fivefive.class);
                startActivity(i6);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6 = new Intent(Homepagefive.this,Fivesix.class);
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
                Intent i = new Intent(Homepagefive.this,MainActivity.class);
                startActivity(i);
            }
        });

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity( new Intent(Intent.ACTION_VIEW,uri));
    }

}