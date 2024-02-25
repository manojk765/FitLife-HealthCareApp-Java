package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuizIndex extends AppCompatActivity{
    TextView totalQuestionsTextView;
    private Button play  , setting , exit ;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quizstart);

        int totalQuestion = Questions.question.length;
        totalQuestionsTextView = findViewById(R.id.questions) ;

        totalQuestionsTextView.setText("Total questions : "+totalQuestion) ;

        play = (Button) findViewById(R.id.btn_play);
        exit = (Button) findViewById(R.id.btn_exit) ;

        play.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openquiz() ;
            }
        });

        exit.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openhome() ;
            }
        });
    }

    public void openquiz(){
        Intent intent = new Intent( this, Quiz.class) ;
        startActivity(intent);
    }

    public void openhome(){
        Intent intent = new Intent(this, MainActivity.class) ;
        startActivity(intent);
    }
}
