package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuizEnd extends AppCompatActivity {
    private Button play  , setting , exit ;

    TextView totalQuestionsTextView;

    int totalQuestion = Questions.question.length;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_end);

        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);

        totalQuestionsTextView = findViewById(R.id.questions);
        totalQuestionsTextView.setText("Your score is "+ score+" out of "+ totalQuestion) ;


        play = (Button) findViewById(R.id.btn_play);
        exit = (Button) findViewById(R.id.btn_exit) ;

        play.setText("Retake the Quiz");
        exit.setText("Go To Home");

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