package com.example.android.countcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreTeamA=0;
    int scoreTeamB=0;

    public void plusthree(View v) {
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }

    public void plustwo(View v) {
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }

    public void plusone(View v) {
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void three(View v) {
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }

    public void two(View v) {
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }

    public void one(View v) {
        scoreTeamB+=1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View v) {
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
