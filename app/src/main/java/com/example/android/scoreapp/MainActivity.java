package com.example.android.scoreapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Team A
    int scoreTeamA = 0;
    int scoreTeamASave;
    int threePointTeamA = 0;
    int threePointTeamASave;
    int twoPointTeamA = 0;
    int twoPointTeamASave;
    int onePointTeamA = 0;
    int onePointTeamASave;

    private String teamAName = "TeamAName";
    private String scoreTeam_A = "ScoreTeamA";
    private String scoreTeamA_Save = "ScoreTeamASave";
    private String threePoint_A = "ThreePointA";
    private String threePointA_Save = "ThreePointASave";
    private String twoPoint_A = "TwoPointA";
    private String twoPointA_Save = "TwoPointASave";
    private String onePoint_A = "OnePointA";
    private String onePointA_Save = "OnePointASave";

    //Team B
    int scoreTeamB = 0;
    int scoreTeamBSave;
    int threePointTeamB = 0;
    int threePointTeamBSave;
    int twoPointTeamB = 0;
    int twoPointTeamBSave;
    int onePointTeamB = 0;
    int onePointTeamBSave;

    private String teamBName = "TeamBName";
    private String scoreTeam_B = "ScoreTeamB";
    private String scoreTeamB_Save = "ScoreTeamBSave";
    private String threePoint_B = "ThreePointB";
    private String threePointB_Save = "ThreePointBSave";
    private String twoPoint_B = "TwoPointB";
    private String twoPointB_Save = "TwoPointBSave";
    private String onePoint_B = "OnePointB";
    private String onePointB_Save = "OnePointBSave";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //SaveInstanceState
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("TeamAName", teamAName);
        outState.putInt(scoreTeam_A, scoreTeamA);
        outState.putInt(scoreTeamA_Save, scoreTeamASave);
        outState.putInt(threePoint_A, threePointTeamA);
        outState.putInt(threePointA_Save, threePointTeamASave);
        outState.putInt(twoPoint_A, twoPointTeamA);
        outState.putInt(twoPointA_Save, twoPointTeamASave);
        outState.putInt(onePoint_A, onePointTeamA);
        outState.putInt(onePointA_Save, onePointTeamASave);

        outState.putString("TeamBName", teamBName);
        outState.putInt(scoreTeam_B, scoreTeamB);
        outState.putInt(scoreTeamB_Save, scoreTeamBSave);
        outState.putInt(threePoint_B, threePointTeamB);
        outState.putInt(threePointB_Save, threePointTeamBSave);
        outState.putInt(twoPoint_B, twoPointTeamB);
        outState.putInt(twoPointB_Save, twoPointTeamBSave);
        outState.putInt(onePoint_B, onePointTeamB);
        outState.putInt(onePointB_Save, onePointTeamBSave);
    }

    //RestoreInstanceState
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        teamAName = savedInstanceState.getString("TeamAName");
        scoreTeamA = savedInstanceState.getInt(scoreTeam_A);
        scoreTeamASave = savedInstanceState.getInt(scoreTeamA_Save);
        threePointTeamA = savedInstanceState.getInt(threePoint_A);
        threePointTeamASave = savedInstanceState.getInt(threePointA_Save);
        twoPointTeamA = savedInstanceState.getInt(twoPoint_A);
        twoPointTeamASave = savedInstanceState.getInt(twoPointA_Save);
        onePointTeamA = savedInstanceState.getInt(onePoint_A);
        onePointTeamASave = savedInstanceState.getInt(onePointA_Save);

        teamBName = savedInstanceState.getString("TeamBName");
        scoreTeamB = savedInstanceState.getInt(scoreTeam_B);
        scoreTeamBSave = savedInstanceState.getInt(scoreTeamB_Save);
        threePointTeamB = savedInstanceState.getInt(threePoint_B);
        threePointTeamBSave = savedInstanceState.getInt(threePointB_Save);
        twoPointTeamB = savedInstanceState.getInt(twoPoint_B);
        twoPointTeamBSave = savedInstanceState.getInt(twoPointB_Save);
        onePointTeamB = savedInstanceState.getInt(onePoint_B);
        onePointTeamBSave = savedInstanceState.getInt(onePointB_Save);

        displayForTeamA(scoreTeamA);
        displayForThreePointA(threePointTeamA);
        displayForTwoPointA(twoPointTeamA);
        displayForOnePointA(onePointTeamA);

        displayForTeamB(scoreTeamB);
        displayForThreePointB(threePointTeamB);
        displayForTwoPointB(twoPointTeamB);
        displayForOnePointB(onePointTeamB);
    }

    //Displays the given score for Team A.
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    //Displays the given three points for Team A.
    public void displayForThreePointA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pt1a);
        scoreView.setText(String.valueOf(score));
    }

    //Displays the given two points for Team A.
    public void displayForTwoPointA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pt2a);
        scoreView.setText(String.valueOf(score));
    }

    //Displays the given one point for Team A.
    public void displayForOnePointA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pt3a);
        scoreView.setText(String.valueOf(score));
    }

    //This is called when the 3 Points is clicked for Team A.
    public void addThreeForTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        threePointTeamA = threePointTeamA + 1;
        displayForTeamA(scoreTeamA);
        displayForThreePointA(threePointTeamA);
    }

    //This is called when the 2 Points is clicked for Team A.
    public void addTwoForTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        twoPointTeamA = twoPointTeamA + 1;
        displayForTeamA(scoreTeamA);
        displayForTwoPointA(twoPointTeamA);
    }

    //This is called when the Free Throw is clicked for Team A.
    public void addOneForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        onePointTeamA = onePointTeamA + 1;
        displayForTeamA(scoreTeamA);
        displayForOnePointA(onePointTeamA);
    }

    //Displays the given score for Team B.
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    //Displays the given three points for Team B.
    public void displayForThreePointB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pt1b);
        scoreView.setText(String.valueOf(score));
    }

    //Displays the given two points for Team B.
    public void displayForTwoPointB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pt2b);
        scoreView.setText(String.valueOf(score));
    }

    //Displays the given one point for Team B.
    public void displayForOnePointB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pt3b);
        scoreView.setText(String.valueOf(score));
    }

    //This is called when the 3 Points is clicked for Team B.
    public void addThreeForTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        threePointTeamB = threePointTeamB + 1;
        displayForTeamB(scoreTeamB);
        displayForThreePointB(threePointTeamB);
    }

    //This is called when the 2 Points is clicked for Team B.
    public void addTwoForTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        twoPointTeamB = twoPointTeamB + 1;
        displayForTeamB(scoreTeamB);
        displayForTwoPointB(twoPointTeamB);
    }

    //This is called when the Free Throw is clicked for Team B.
    public void addOneForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        onePointTeamB = onePointTeamB + 1;
        displayForTeamB(scoreTeamB);
        displayForOnePointB(onePointTeamB);
    }

    //This is called when the Reset is clicked.
    public void resetScore(View view) {
        scoreTeamA = 0;
        threePointTeamA = 0;
        twoPointTeamA = 0;
        onePointTeamA = 0;

        displayForTeamA(scoreTeamA);
        displayForThreePointA(threePointTeamA);
        displayForTwoPointA(twoPointTeamA);
        displayForOnePointA(onePointTeamA);

        scoreTeamB = 0;
        threePointTeamB = 0;
        twoPointTeamB = 0;
        onePointTeamB = 0;

        displayForTeamB(scoreTeamB);
        displayForThreePointB(threePointTeamB);
        displayForTwoPointB(twoPointTeamB);
        displayForOnePointB(onePointTeamB);
    }
}
