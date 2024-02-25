package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Quiz extends AppCompatActivity implements View.OnClickListener{

    TextView totalQuestionsTextView;
    TextView questionTextView;
    Button ansA, ansB, ansC, ansD;
    Button submitBtn;

    int score=0;
    int totalQuestion = Questions.question.length;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);

        totalQuestionsTextView = findViewById(R.id.total_question);
        questionTextView = findViewById(R.id.question);
        ansA = findViewById(R.id.ans_A);
        ansB = findViewById(R.id.ans_B);
        ansC = findViewById(R.id.ans_C);
        ansD = findViewById(R.id.ans_D);
        submitBtn = findViewById(R.id.submit_btn);

        ansA.setOnClickListener(this);
        ansB.setOnClickListener(this);
        ansC.setOnClickListener(this);
        ansD.setOnClickListener(this);
        submitBtn.setOnClickListener(this);

        totalQuestionsTextView.setText("Total questions : "+totalQuestion) ;

        loadNewQuestion();

    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View view) {

        ansA.setBackgroundColor(Color.WHITE);
        ansB.setBackgroundColor(Color.WHITE);
        ansC.setBackgroundColor(Color.WHITE);
        ansD.setBackgroundColor(Color.WHITE);

        Button clickedButton = (Button) view;
        if(clickedButton.getId()==R.id.submit_btn){
            System.out.println(score);
            if(selectedAnswer.equals(Questions.correctAnswers[currentQuestionIndex])){
                score++;
            }
            currentQuestionIndex++;
            loadNewQuestion();


        }else{

            //choices button clicked
            selectedAnswer  = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(R.color.pink);

        }
    }

    void loadNewQuestion(){

        if(currentQuestionIndex == totalQuestion ){
            finishQuiz();
            return;
        }

        totalQuestionsTextView.setText("Question " + (currentQuestionIndex + 1) + " / " + totalQuestion);

        questionTextView.setText(Questions.question[currentQuestionIndex]);
        ansA.setText(Questions.choices[currentQuestionIndex][0]);
        ansB.setText(Questions.choices[currentQuestionIndex][1]);
        ansC.setText(Questions.choices[currentQuestionIndex][2]);
        ansD.setText(Questions.choices[currentQuestionIndex][3]);

    }

    void finishQuiz(){
        Intent intent = new Intent(this, QuizEnd.class) ;
        intent.putExtra("score", score);

        System.out.println(score) ;
        startActivity(intent);
    }

//    void restartQuiz(){
//        score = 0;
//        currentQuestionIndex =0;
//        loadNewQuestion();
//    }
}