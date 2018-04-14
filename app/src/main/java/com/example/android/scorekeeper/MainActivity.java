package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Tracks the goals for Team A.
    int goalsTeamA = 0;

    // Tracks the goals for Team B.
    int goalsTeamB = 0;

    // Tracks the fouls for Team A.
    int foulsTeamA = 0;

    // Tracks the fouls for Team B.
    int foulsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Adds a goal for Team A when Button Goal is clicked for Team A.
     */
    public void addGoalForTeamA(View view) {
        goalsTeamA = goalsTeamA + 1;
        displayGoalsForTeamA(goalsTeamA);
    }

    /**
     * Adds a goal for Team B when Button Goal is clicked for Team B.
     */
    public void addGoalForTeamB(View view) {
        goalsTeamB = goalsTeamB + 1;
        displayGoalsForTeamB(goalsTeamB);
    }

    /**
     * Adds a foul for Team A when Button Foul is clicked for Team A.
     */
    public void addFoulForTeamA(View view) {
        foulsTeamA = foulsTeamA + 1;
        displayFoulsForTeamA(foulsTeamA);
    }

    /**
     * Adds a foul for Team B when Button Foul is clicked for Team B.
     */
    public void addFoulForTeamB(View view) {
        foulsTeamB = foulsTeamB + 1;
        displayFoulsForTeamB(foulsTeamB);
    }

    /**
     * Resets the goals and fouls for both teams to zero.
     */
    public void resetScores(View view){
        goalsTeamA = 0;
        goalsTeamB = 0;
        foulsTeamA = 0;
        foulsTeamB = 0;
        displayGoalsForTeamA(goalsTeamA);
        displayGoalsForTeamB(goalsTeamB);
        displayFoulsForTeamA(foulsTeamA);
        displayFoulsForTeamB(foulsTeamB);
    }

    /**
     * Displays the total goals for Team A.
     */
    private void displayGoalsForTeamA(int goals) {
        TextView goalsView = (TextView) findViewById(R.id.team_a_goals);
        goalsView.setText(String.valueOf(goals));
    }

    /**
     * Displays the total goals for Team B.
     */
    private void displayGoalsForTeamB(int goals) {
        TextView goalsView = (TextView) findViewById(R.id.team_b_goals);
        goalsView.setText(String.valueOf(goals));
    }

    /**
     * Displays the total fouls for Team A.
     */
    private void displayFoulsForTeamA(int fouls) {
        TextView foulsView = (TextView) findViewById(R.id.team_a_fouls);
        foulsView.setText(String.valueOf(fouls));
    }

    /**
     * Displays the total fouls for Team B.
     */
    private void displayFoulsForTeamB(int fouls) {
        TextView foulsView = (TextView) findViewById(R.id.team_b_fouls);
        foulsView.setText(String.valueOf(fouls));
    }
}
