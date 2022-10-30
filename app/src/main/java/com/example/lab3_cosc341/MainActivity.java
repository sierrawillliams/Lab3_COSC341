package com.example.lab3_cosc341;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    Button loadQ;
    Spinner numOfQ;
    ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // number of questions string array
        String[] spinner = new String[]{
                "1", "2", "3", "4"
        };
        // button and spinner declaration
        loadQ = findViewById(R.id.loadQuiz);
        numOfQ = findViewById(R.id.numOfQ);
        // set up spinner with adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,spinner);
        numOfQ.setAdapter(adapter);

        // when load quiz button is pressed
        loadQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numOfQ.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        Object selected = adapterView.getItemAtPosition(i);
                        if(selected.equals(1)){

                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });
                // declare intent to question page
                Intent intent = new Intent(MainActivity.this, Question.class);
                startActivity(intent);
            }
        });

    }
}