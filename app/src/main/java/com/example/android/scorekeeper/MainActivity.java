package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    //Team A Functions

    public void displayForTeamA(int score){
        TextView scoreView = (TextView)findViewById(R.id.team_a_score_text_view);
        scoreView.setText(String.valueOf(score));
    }

    public void addTouchdownA(View v){
        teamAScore = teamAScore + 6;
        displayForTeamA(teamAScore);
    }

    public void addFieldGoalA(View v){
        teamAScore = teamAScore + 3;
        displayForTeamA(teamAScore);
    }

    public void addSafetyA(View v){
        teamAScore = teamAScore + 2;
        displayForTeamA(teamAScore);
    }

    public void addOnePointA(View v){
        teamAScore = teamAScore + 1;
        displayForTeamA(teamAScore);
    }

    //Team B Functions

    public void displayForTeamB(int score){
        TextView scoreView = (TextView)findViewById(R.id.team_b_score_text_view);
        scoreView.setText(String.valueOf(score));
    }

    public void addTouchdownB(View v){
        teamBScore = teamBScore + 6;
        displayForTeamB(teamBScore);
    }

    public void addFieldGoalB(View v){
        teamBScore = teamBScore + 3;
        displayForTeamB(teamBScore);
    }

    public void addSafetyB(View v){
        teamBScore = teamBScore + 2;
        displayForTeamB(teamBScore);
    }

    public void addOnePointB(View v){
        teamBScore = teamBScore + 1;
        displayForTeamB(teamBScore);
    }
}
