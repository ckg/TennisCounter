package com.example.android.tenniscounter;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scorePlayerA = 0;
    int scorePlayerB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForPlayerA(scorePlayerA);
        displayForPlayerA(scorePlayerB);
    }

    /**
     * Increase the score for Player A by 3 points.
     */
    public void addFifteenForPlayerA(View v) {
        scorePlayerA = scorePlayerA + 15;
        displayForPlayerA(scorePlayerA);
    }

    /**
     * Increase the score for Player A by 2 points.
     */
    public void addTenForPlayerA(View v) {
        scorePlayerA = scorePlayerA + 10;
        displayForPlayerA(scorePlayerA);
    }

    /**
     * Increase the score for Player A by 1 point.
     */
    public void addOneForPlayerA(View v) {
        scorePlayerA = scorePlayerA + 1;
        displayForPlayerA(scorePlayerA);
    }

    /**
     * Increase the score for Player B by 3 points.
     */
    public void addFifteenForPlayerB(View v) {
        scorePlayerB = scorePlayerB + 15;
        displayForPlayerB(scorePlayerB);
    }

    /**
     * Increase the score for Player B by 2 points.
     */
    public void addTenForPlayerB(View v) {
        scorePlayerB = scorePlayerB + 10;
        displayForPlayerB(scorePlayerB);
    }

    /**
     * Increase the score for Player B by 1 point.
     */
    public void addOneForPlayerB(View v) {
        scorePlayerB = scorePlayerB + 1;
        displayForPlayerB(scorePlayerB);
    }
    /**
     * Resets the score for both Players.
     */
    public void resetScore(View v){
        scorePlayerA = 0;
        scorePlayerB = 0;
        displayForPlayerA(scorePlayerA);
        displayForPlayerB(scorePlayerB);

    }

    /**
     * Displays the given score for Player A.
     */
    private void displayForPlayerA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Player_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Player B.
     */
    private void displayForPlayerB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Player_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
