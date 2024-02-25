package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Map;

public class WorkOutAdvisor extends AppCompatActivity {
    Button timerbtn ;
    private WorkOut workOut = new WorkOut() ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_out_advisor);

        Button btn = findViewById(R.id.findworkout) ;
        TextView workouts = findViewById(R.id.textView) ;
        Spinner workoutype = findViewById(R.id.workouttype);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView img = findViewById(R.id.workoutimg) ;
                String workout = String.valueOf(workoutype.getSelectedItem());
                workouts.setText(workout);

                Map<String, String> workoutMap = workOut.workoutlist(workout);

                StringBuilder workoutsFormatted = new StringBuilder();

                if(workout.equals("Chest")){
                    img.setImageResource(R.drawable.chest);
                }
                else if(workout.equals("Triceps")){
                    img.setImageResource(R.drawable.triceps);
                }
                else if(workout.equals("Biceps")){
                    img.setImageResource(R.drawable.biceps);
                }
                else if (workout.equals("Shoulder")) {
                    img.setImageResource(R.drawable.shoulder);
                }

                for (Map.Entry<String, String> entry : workoutMap.entrySet()) {
                    workoutsFormatted.append(entry.getKey()).append(":\n ").append(entry.getValue()).append('\n').append('\n');
                }

                workouts.setText(workoutsFormatted.toString());
            }
        });

        timerbtn = findViewById(R.id.timer);
        timerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentimer();
            }
        });
    }

    public void opentimer(){
        Intent intent = new Intent(this, StopWatch.class);
        startActivity(intent);
    }

}