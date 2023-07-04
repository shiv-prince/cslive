package com.example.cslive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Homepagethree extends AppCompatActivity {
    Button b1,b2,b3,b4,b6,b7;
    Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepagethree);
        logout = findViewById(R.id.logout3);



        b1 = findViewById(R.id.button1three);
        b2 = findViewById(R.id.button2three);
        b3 = findViewById(R.id.button3three);
        b4 = findViewById(R.id.button4three);
        b6 = findViewById(R.id.button6three);
        b7 = findViewById(R.id.button7three);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Homepagethree.this,Mthree.class);
                startActivity(i1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Homepagethree.this,Threetwo.class);
                startActivity(i2);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(Homepagethree.this,Threethree.class);
                startActivity(i3);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(Homepagethree.this,Threefour.class);
                startActivity(i4);
            }
        });


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6 = new Intent(Homepagethree.this,Threefive.class);
                startActivity(i6);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6 = new Intent(Homepagethree.this,Threesix.class);
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
                Intent i = new Intent(Homepagethree.this,MainActivity.class);
                startActivity(i);
            }
        });

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity( new Intent(Intent.ACTION_VIEW,uri));
    }

}

