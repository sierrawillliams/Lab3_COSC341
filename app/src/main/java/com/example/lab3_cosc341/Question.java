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

import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Question extends AppCompatActivity {

    TextView questionsText;
    InputStream streamCountLines, inputStream;
    BufferedReader readerCountLines, bufferedReader;
    int intCount = 0;
    int intCurrent = 0;
    String[] textData;
    RadioGroup Ontario, PEI, NFL, NWT;
    RadioButton rB;
    Button next, finish;
    ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        next = findViewById(R.id.next);
        finish = findViewById(R.id.finish);

        Ontario = findViewById(R.id.OntarioChoices);
        PEI = findViewById(R.id.PEIChoices);
        NFL = findViewById(R.id.NFLChoices);
        NWT = findViewById(R.id.NWTChoices);

        viewFlipper = findViewById(R.id.viewFlipper);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int score = 0;
                intCurrent++;
                if(intCurrent != intCount){
                    int radioButtonID = Ontario.getCheckedRadioButtonId();
                    rB = findViewById(radioButtonID);
                    String selectedText = (String) rB.getText();
                    if(selectedText == "Ottawa"){
                        score++;
                    } else {
                        score = 0;
                    }
                }

                if(view == next){
                    viewFlipper.showNext();
                }
                if(view == finish){
                    Intent intent = new Intent(Question.this, Grade.class);
                    startActivity(intent);
                }
            }
        });

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

     }
}