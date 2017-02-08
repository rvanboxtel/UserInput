package com.example.android.userinput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreThuis = 0;
    int scoreUit = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void plusthuisteam(View view){
        scoreThuis ++;
        DisplayThuis(scoreThuis);
    }
    public void minthuisteam(View view){
        scoreThuis = scoreThuis - 1;
        DisplayThuis(scoreThuis);
    }
    private void DisplayThuis(int Number){
        TextView doelpuntenthuis = (TextView) findViewById(R.id.scoreThuisTeam);
        doelpuntenthuis.setText("" + scoreThuis);
    }
    public void plusuitteam(View view){
        scoreUit ++;
        DisplayUit(scoreUit);
    }
    public void minuitteam(View view){
        scoreUit = scoreUit - 1;
        DisplayUit(scoreUit);
    }
    private void DisplayUit(int Number){
        TextView doelpuntenuit = (TextView) findViewById(R.id.scoreUitTeam);
        doelpuntenuit.setText("" + scoreUit);
    }
}
