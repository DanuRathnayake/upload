package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yu);

        Button goTolowxButton = findViewById(R.id.button3);

        goTolowxButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(getApplicationContext(), lowx.class);
                    startActivity(intent);
                }catch (NullPointerException ex){
                    ex.printStackTrace();
                }
            }
        });
        //normal weight button

        Button goTonormalButton = findViewById(R.id.button4);

        goTonormalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(getApplicationContext(), normalx.class);
                    startActivity(intent);
                }catch (NullPointerException ex){
                    ex.printStackTrace();
                }

            }
        });
        //overweight ex button
        Button goTooverxButton = findViewById(R.id.button6);

        goTooverxButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(getApplicationContext(), overx.class);
                    startActivity(intent);
                }catch (NullPointerException ex){
                    ex.printStackTrace();
                }
            }
        });







        Button goTolowdButton = findViewById(R.id.button10);

        goTolowdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(getApplicationContext(), lowd.class);
                    startActivity(intent);
                }catch (NullPointerException ex){
                    ex.printStackTrace();
                }
            }
        });

        // normal diet plans

        Button goTonormaldButton = findViewById(R.id.button11);

        goTonormaldButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(getApplicationContext(), normald.class);
                    startActivity(intent);
                }catch (NullPointerException ex){
                    ex.printStackTrace();
                }
            }
        });

        Button goTooverxdButton = findViewById(R.id.button12);

        goTooverxdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(getApplicationContext(), overd.class);
                    startActivity(intent);
                }catch (NullPointerException ex){
                    ex.printStackTrace();
                }
            }
        });

    }
}