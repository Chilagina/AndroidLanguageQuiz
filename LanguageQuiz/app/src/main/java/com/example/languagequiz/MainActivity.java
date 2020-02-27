package com.example.languagequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.example.languagequiz.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   }

    public void buttonNounOnClick(View V) {
        Intent i = new Intent(getApplicationContext(), spanishNouns.class);
        startActivity(i);
    }

    public void buttonPresentVerbsOnClick(View V) {
        Intent i = new Intent(getApplicationContext(), presentVerbs.class);
        startActivity(i);
    }

    public void buttonPastVerbsOnClick(View V) {
        Intent i = new Intent(getApplicationContext(), pastVerbs.class);
        startActivity(i);
    }
}

