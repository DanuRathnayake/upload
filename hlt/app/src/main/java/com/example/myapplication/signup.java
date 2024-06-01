package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signup extends AppCompatActivity {

    EditText username, password, cPassword;
    Button signup;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        cPassword = findViewById(R.id.cPassword);
        signup = findViewById(R.id.signup);
        DB = new DBHelper(this);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String user = username.getText().toString();
                String pass = password.getText().toString();
                String cPass = cPassword.getText().toString();

                if(TextUtils.isEmpty(user) || TextUtils.isEmpty(pass) || TextUtils.isEmpty(cPass)){
                    Toast.makeText(signup.this, "All filed required", Toast.LENGTH_SHORT).show();
                }
                else{
                    if(pass.equals(cPass)){
                        Boolean checkuser = DB.checkusername(user);
                        if(checkuser==false){
                            Boolean insert= DB.insertdata(user,pass);
                            if(insert==true){
                                Toast.makeText(signup.this, "Signup Successfull", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(),login.class);
                                startActivity(intent);
                            }
                            else{
                                Toast.makeText(signup.this, "Try agin", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            Toast.makeText(signup.this, "Username Exsits", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else{
                        Toast.makeText(signup.this, "Password not matching", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });
    }
}