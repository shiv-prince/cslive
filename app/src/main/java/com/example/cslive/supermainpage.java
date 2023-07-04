package com.example.cslive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class supermainpage extends AppCompatActivity {

    Button s3,s4,s5,s6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supermainpage);
        s3 = findViewById(R.id.sem_3);
        s4 = findViewById(R.id.sem_4);
        s5 = findViewById(R.id.sem_5);
        s6 = findViewById(R.id.sem_6);

        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(supermainpage.this,Homepagethree.class);
                startActivity(intent);
            }
        });
        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(supermainpage.this,Homepagefour.class);
                startActivity(intent);
            }
        });
        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(supermainpage.this,Homepagefive.class);
                startActivity(intent);
            }
        });
        s6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(supermainpage.this,Homepagesix.class);
                startActivity(intent);
            }
        });
    }
}