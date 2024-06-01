package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lowx extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lowx);



        Button goTolowx1dButton = findViewById(R.id.button5);

        goTolowx1dButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(getApplicationContext(), normex1.class);
                    startActivity(intent);
                }catch (NullPointerException ex){
                    ex.printStackTrace();
                }
            }
        });


        Button goTolowx2dButton = findViewById(R.id.button7);

        goTolowx2dButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(getApplicationContext(), lowx2.class);
                    startActivity(intent);
                }catch (NullPointerException ex){
                    ex.printStackTrace();
                }
            }
        });

        Button goTolowx3dButton = findViewById(R.id.button8);

        goTolowx3dButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(getApplicationContext(), lowx3.class);
                    startActivity(intent);
                }catch (NullPointerException ex){
                    ex.printStackTrace();
                }
            }
        });

    }
}