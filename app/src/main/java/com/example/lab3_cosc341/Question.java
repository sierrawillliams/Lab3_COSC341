package com.example.lab3_cosc341;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Question extends AppCompatActivity {


    RadioGroup Ontario, PEI, NFL, NWT;
    Button next, finish;
    ViewFlipper viewFlipper;
    String numQ;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        //inititalize title
//        title = findViewById(R.id.title);
//        String textArray[] = new String[5];
//        BufferedReader brTest = null;
//        try {
//            brTest = new BufferedReader(new FileReader(String.valueOf(R.raw.questions)));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        String text = null;
//        try {
//            text = brTest.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        title.setText(text);
//        //initialize buttons
        next = findViewById(R.id.next);
        finish = findViewById(R.id.finish);
//        //initialize radio buttons
//        Ontario = findViewById(R.id.OntarioChoices);
//        PEI = findViewById(R.id.PEIChoices);
//        NFL = findViewById(R.id.NFLChoices);
//        NWT = findViewById(R.id.NWTChoices);
//        //initialize images
//        img1 = findViewById(R.id.Ontario);
//        img2 = findViewById(R.id.PEI);
//        img3 = findViewById(R.id.NFL);
//        img4 = findViewById(R.id.NWT);
        //initialize viewFlipper
//        viewFlipper = findViewById(R.id.viewFlipper);
        //import bundle values
        Bundle bundle = getIntent().getExtras();
        numQ = bundle.getString("numofQ");
////        // if spinner val is 1
////        if (numQ.equals("1")) {
////
////        } else if (numQ.equals("2")) {
////
////        } else if (numQ.equals("3")) {
////
////        } else {
////
////        }
//
//
//        //when next is clicked
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int score = 0;
                // display correct if right, incorrect if wrong
                if (Ontario.getCheckedRadioButtonId() == R.id.Ottawa) {
                    score += 1;
                    Toast.makeText(Question.this, "Correct", Toast.LENGTH_SHORT);
                } else {
                    Toast.makeText(Question.this, "Incorrect", Toast.LENGTH_SHORT);
                }

                // display correct if right, incorrect if wrong
                if (PEI.getCheckedRadioButtonId() == R.id.Charlottetown) {
                    score += 1;
                    Toast.makeText(Question.this, "Correct", Toast.LENGTH_SHORT);
                } else {
                    Toast.makeText(Question.this, "Incorrect", Toast.LENGTH_SHORT);
                }

                // display correct if right, incorrect if wrong
                if (NFL.getCheckedRadioButtonId() == R.id.St_JohnsNFL) {
                    score += 1;
                    Toast.makeText(Question.this, "Correct", Toast.LENGTH_SHORT);
                } else {
                    Toast.makeText(Question.this, "Incorrect", Toast.LENGTH_SHORT);
                }

                // display correct if right, incorrect if wrong
                if (NWT.getCheckedRadioButtonId() == R.id.Yellowknife) {
                    score += 1;
                    Toast.makeText(Question.this, "Correct", Toast.LENGTH_SHORT);
                } else {
                    Toast.makeText(Question.this, "Incorrect", Toast.LENGTH_SHORT);
                }

                //when finish is clicked open grade page
                int finalScore = score;
                Intent intent = new Intent(Question.this, Grade.class);
                Bundle bundle = new Bundle();
                String grade = String.valueOf(finalScore);
                bundle.putString("score", grade);
                bundle.putString("numOfQ", numQ);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Question.this, Grade.class);
//                Bundle bundle = new Bundle();
//                bundle.putInt("score", finalScore);
//                bundle.putString("numOfQ", numQ);
                startActivity(intent);
            }
        });
//    }
    }
//    }
}

//                int score = 0;
//                intCurrent++;
//                if(intCurrent != intCount){
//                }
//                if(view == img1){
//                    int radioButtonID = Ontario.getCheckedRadioButtonId();
//                    rB = findViewById(radioButtonID);
//                    String selectedText = (String) rB.getText();
//                    if(selectedText == "Ottawa"){
//                        score++;
//                    } else {
//                        score = 0;
//                    }
//                }
//                if(view == img2) {
//                    int radioButtonID = PEI.getCheckedRadioButtonId();
//                    rB = findViewById(radioButtonID);
//                    String selectedText = (String) rB.getText();
//                    if (selectedText == "Charlottetown") {
//                        score++;
//                    } else {
//                        score = 0;
//                    }
//                }
//                if(view == img3){
//                    int radioButtonID = NFL.getCheckedRadioButtonId();
//                    rB = findViewById(radioButtonID);
//                    String selectedText = (String) rB.getText();
//                    if(selectedText == "St. John's"){
//                        score++;
//                    } else {
//                        score = 0;
//                    }
//                }
//                if(view == img4){
//                    int radioButtonID = NWT.getCheckedRadioButtonId();
//                    rB = findViewById(radioButtonID);
//                    String selectedText = (String) rB.getText();
//                    if(selectedText == "Yellowknife"){
//                        score++;
//                    }
//                }
//
//                if(view == next){
//                    viewFlipper.showNext();
//                }
//                if(view == finish){
//                    Intent intent = new Intent(Question.this, Grade.class);
//                    startActivity(intent);
//                }

//        intCount = 0;
//
//        questionsText = findViewById(R.id.numOfQtitle);
//
//        streamCountLines = this.getResources().openRawResource(R.raw.questions);
//        readerCountLines = new BufferedReader(new InputStreamReader(streamCountLines));
//
//        //count number of lines from questions.txt
//        try{
//            while(readerCountLines.readLine() != null){
//                intCount++;
//            }
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//        inputStream = this.getResources().openRawResource(R.raw.questions);
//        bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//
//        textData = new String[intCount];
//
//        try{
//            for(int i=0; i<intCount; i++){
//                textData[i] = bufferedReader.readLine();
//            }
//
//        }catch(Exception f){
//            f.printStackTrace();
//        }
//
//        questionsText.setText(textData[0]);
//
//        intCurrent = 0;