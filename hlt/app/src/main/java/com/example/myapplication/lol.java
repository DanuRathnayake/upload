package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class lol extends AppCompatActivity {

    EditText MainActivity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lol);

        Button goToCalButton = findViewById(R.id.gotocal);

        goToCalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(getApplicationContext(), testcal.class);
                    startActivity(intent);
                }catch (NullPointerException ex){
                    ex.printStackTrace();
                }


            }

        });
    }
}
