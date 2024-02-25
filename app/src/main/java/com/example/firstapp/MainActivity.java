package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3) ;
        Button button4 = findViewById(R.id.button4) ;
        Button button5 = findViewById(R.id.button5) ;

        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openQuizIndex();
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openRecepies();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBMI();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openworkout();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentips();
            }
        });


    }


    public void openQuizIndex(){
        Intent intent = new Intent(MainActivity.this, QuizIndex.class);
        startActivity(intent);
    }

    public void openRecepies() {
            Intent intent = new Intent(MainActivity.this, RecepieIndex.class);
            startActivity(intent);
    }

    public void openBMI(){
        Intent intent = new Intent(this,BMICalculator.class);
        startActivity(intent);
    }

    public void openworkout(){
        Intent intent = new Intent(this, WorkOutAdvisor.class);
        startActivity(intent);
    }

    private void opentips() {
        Intent intent = new Intent(this, TipGenerator.class) ;
        startActivity(intent);
    }

}