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

    public void displayForTeamA(int score){
        TextView scoreView = (TextView)findViewById(R.id.team_a_score_text_view);
        scoreView.setText(String.valueOf(score));
    }

    public void addTouchdownA(View v){
        teamAScore = teamAScore + 6;
        displayForTeamA(teamAScore);
    }
}
