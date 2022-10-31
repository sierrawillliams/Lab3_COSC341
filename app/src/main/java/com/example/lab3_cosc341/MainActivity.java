package com.example.lab3_cosc341;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Button loadQ;
    Spinner numOfQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // number of questions string array
        String[] spinner = new String[]{"1", "2", "3", "4"};
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
                // declare intent to question page
                Intent intent = new Intent(MainActivity.this, Question.class);
                Bundle bundle = new Bundle();
                String numoQ = numOfQ.getSelectedItem().toString();
                bundle.putString("numQ", numoQ);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}