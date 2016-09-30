package com.example.android.shuffleboardscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int TBScore = 0;
    int TRScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //* This method is called when left "3" is clicked. */

    public void add3PointsTB(View view){
        TBScore = TBScore + 3;
        displayForTeamBlue(TBScore);
    }

    //* This method is called when left "2" is clicked. */

    public void add2PointsTB(View view){
        TBScore = TBScore + 2;
        displayForTeamBlue(TBScore);
    }

    //* This method is called when left "1" is clicked. */

    public void add1PointTB(View view){
        TBScore = TBScore + 1;
        displayForTeamBlue(TBScore);
    }

    //* This method is called when right "3" is clicked. */

    public void add3PointsTR(View view){
        TRScore = TRScore + 3;
        displayForTeamRed(TRScore);
    }

    //* This method is called when right "2" is clicked. */

    public void add2PointsTR(View view){
        TRScore = TRScore + 2;
        displayForTeamRed(TRScore);
    }

    //* This method is called when right "1" is clicked. */

    public void add1PointTR(View view){
        TRScore = TRScore + 1;
        displayForTeamRed(TRScore);
    }

    //* This method is called when Reset is clicked. */

    public void resetScore(View view){
        TBScore = 0;
        TRScore = 0;
        displayForTeamBlue(TBScore);
        displayForTeamRed(TRScore);
    }

    //* Displays the given score for Team Blue.*/

    public void displayForTeamBlue(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    //* Displays the given score for Team Red.*/

    public void displayForTeamRed(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_r_score);
        scoreView.setText(String.valueOf(score));
    }
}
