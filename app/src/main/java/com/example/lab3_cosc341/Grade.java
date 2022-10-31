package com.example.lab3_cosc341;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Grade extends AppCompatActivity {

    Button done;
    TextView score;
    String finalScore;
    String grade;
    int one;
    int two;
    int three;
    int four;
    int zero;
    String numOfQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade);
        //initialize done button
        done = findViewById(R.id.done);
        //initialize possible grades
        zero = 0;
        one = 1;
        two = 2;
        three = 3;
        four = 4;
        //initialize grade
        Bundle bundle = getIntent().getExtras();
        grade = bundle.getString("score");
        numOfQ = bundle.getString("numQ");
        //initialize finalScore
        finalScore = grade + "/" + numOfQ;
        //initialize score and set it to grade
        score = findViewById(R.id.score);
        score.setText(finalScore);

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Grade.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}