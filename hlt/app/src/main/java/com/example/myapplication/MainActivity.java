package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {



    Button signup, login,gotocal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

               setContentView(R.layout.activity_main);

        signup = findViewById(R.id.signup);
        login = findViewById(R.id.login);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                opensignup();
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openlogin();
            }
        });
    }
    public void opensignup(){
        Intent intent = new Intent(this,signup.class);
        startActivity(intent);
    }
    public void openlogin(){
        Intent intent = new Intent(this,login.class);
        startActivity(intent);
    }


}