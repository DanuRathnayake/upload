package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class normalx extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normalx);


        Button goTonormx1Button = findViewById(R.id.button);

        goTonormx1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(getApplicationContext(), normx1.class);
                    startActivity(intent);
                }catch (NullPointerException ex){
                    ex.printStackTrace();
                }
            }
        });


        Button goTonormx2Button = findViewById(R.id.button13);

        goTonormx2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(getApplicationContext(), normx2.class);
                    startActivity(intent);
                }catch (NullPointerException ex){
                    ex.printStackTrace();
                }
            }
        });

        Button goTonormx3Button = findViewById(R.id.button14);

        goTonormx3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(getApplicationContext(), normx3.class);
                    startActivity(intent);
                }catch (NullPointerException ex){
                    ex.printStackTrace();
                }
            }
        });
    }
}