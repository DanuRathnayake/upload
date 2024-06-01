package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class overd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overd);


        Button goTooverd1dButton = findViewById(R.id.button24);

        goTooverd1dButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(getApplicationContext(), ovd1.class);
                    startActivity(intent);
                }catch (NullPointerException ex){
                    ex.printStackTrace();
                }
            }
        });


        Button goTooverd2dButton = findViewById(R.id.button25);

        goTooverd2dButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(getApplicationContext(), ovd2.class);
                    startActivity(intent);
                }catch (NullPointerException ex){
                    ex.printStackTrace();
                }
            }
        });


        Button goTooverd3dButton = findViewById(R.id.button26);

        goTooverd3dButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(getApplicationContext(), ovd3.class);
                    startActivity(intent);
                }catch (NullPointerException ex){
                    ex.printStackTrace();
                }
            }
        });

    }
}