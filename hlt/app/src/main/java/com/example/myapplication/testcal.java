package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.databinding.ActivityMainBinding;

/*public class testcal extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testcal);

        Button goToPlanButton = findViewById(R.id.gotoplan);

        goToPlanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              try{
                  Intent intent = new Intent(getApplicationContext(),plans.class);
                  startActivity(intent);
              }  catch (NullPointerException ex){
                  ex.printStackTrace();
              }
              }
        });
    }
}
*/


public class testcal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testcal);



        Button goToPlansallButton = findViewById(R.id.gotoplan);

        goToPlansallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(getApplicationContext(), yu.class);
                    startActivity(intent);
                }catch (NullPointerException ex){
                    ex.printStackTrace();
                }
            }
        });


        EditText  heightEditText = findViewById(R.id.height);
        EditText weightEditText = findViewById(R.id.weight);
        Button calculateButton = findViewById(R.id.btn);
        TextView resultTextView = findViewById(R.id.result);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String heightStr = heightEditText.getText().toString();
                String weightStr = weightEditText.getText().toString();

                float h = Float.parseFloat(heightStr) / 100;
                float w = Float.parseFloat(weightStr);
                float res = w / (h * h);

                resultTextView.setText(String.format("%.2f", res));


                TextView msgTextView = findViewById(R.id.msg);



                String healthMessage = healthymassage(res);

// Set the text of the TextView
                msgTextView.setText(String.format("Considered: %s", healthMessage));

            }
            private String healthymassage(double res) {
                if (res < 18.5)
                    return "Underweight";
                if (res < 25.0)
                    return "Healthy";
                if (res > 25.0)
                    return "Obese";
                return "";
            }


        });
    }
}