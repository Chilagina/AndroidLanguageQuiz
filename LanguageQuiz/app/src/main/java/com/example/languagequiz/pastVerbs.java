package com.example.languagequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class pastVerbs extends AppCompatActivity {

    private PastVerbsQuestionLibrary mPastVerbsQuestionLibrary = new PastVerbsQuestionLibrary();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past_verbs);

        mScoreView = (TextView) findViewById(R.id.score);
        mQuestionView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);

        updateQuestion();

        //Start of Button Listener for Button 1
        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // logic for button
                if (mButtonChoice1.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(pastVerbs.this, "Correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(pastVerbs.this, "Wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }

            }
        });
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // logic for button
                if (mButtonChoice2.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(pastVerbs.this, "Correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(pastVerbs.this, "Wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // logic for button
                if (mButtonChoice3.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(pastVerbs.this, "Correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(pastVerbs.this, "Wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
    }

    private void updateScore(int point) {
        mScoreView.setText("" + mScore);
    }

    private void updateQuestion() {
        mQuestionView.setText(mPastVerbsQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mPastVerbsQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mPastVerbsQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mPastVerbsQuestionLibrary.getChoice3(mQuestionNumber));

        mAnswer = mPastVerbsQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;
    }

    public void buttonMainMenuOnClick(View V) {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
}

