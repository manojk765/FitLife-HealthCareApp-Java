package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMICalculator extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalculator);

        EditText heightText = findViewById(R.id.height) ;
        EditText weightText = findViewById(R.id.weight) ;

        Button btn = findViewById(R.id.btn) ;

        Button btn1 = findViewById(R.id.exit_btn) ;

        TextView statusText =  findViewById(R.id.status) ;

        TextView result = findViewById(R.id.result);

        btn.setOnClickListener(new View.OnClickListener() {
            String s = "" ;

            @Override
            public void onClick(View v) {

                float height = Float.parseFloat(String.valueOf(heightText.getText()))/100 ;
                float weight = Float.parseFloat(String.valueOf(weightText.getText())) ;

                float BMI = weight/(height*height);

                result.setText(String.valueOf(BMI));

                if (BMI < 18.5) {
                    s = "Under Weight" ;
                } else if (BMI >= 18.5 && BMI < 24.9) {
                    s = "Healthy" ;
                } else if (BMI >= 24.9 && BMI < 30) {
                    s= "Overweight" ;
                } else if (BMI >= 30) {
                    s = "Suffering from Obesity" ;
                }

                statusText.setText(s) ;

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BMICalculator.this , MainActivity.class) ;
                startActivity(intent);
            }
        });
    }
}