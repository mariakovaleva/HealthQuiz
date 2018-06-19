package com.example.mariia.healthquiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //method for checking if the answers are correct
    public void checkResults(View view) {
        int score = 0;

        //context for the toasts
        Context context = getApplicationContext();


        //correct answer for question 1
        EditText answerOne = (EditText) findViewById(R.id.answer1);

        try {
            //input for question 1
            Short answerOneInput = Short.parseShort(answerOne.getText().toString());
            if (answerOneInput == Short.parseShort(getResources().getText(R.string.answer1).toString())) {
                score++;
            }

        }

        //shows error toast if user clicks on "Check answers" button without making any input
        catch (NumberFormatException e) {
            String errorText = "Answer to question 1 missing";
            Toast error = Toast.makeText(context, errorText, Toast.LENGTH_SHORT);
            error.show();
        }

        //correct answer for question 2
        RadioButton answerTwoOne = (RadioButton) findViewById(R.id.answer2_1);
        if (answerTwoOne.isChecked()) {
            score++;
        }

        //correct answer for question 3
        RadioButton answerThreeThree = (RadioButton) findViewById(R.id.answer3_3);
        if (answerThreeThree.isChecked()) {
            score++;
        }

        //correct answer for question 4
        RadioButton answerFourFour = (RadioButton) findViewById(R.id.answer4_4);
        if (answerFourFour.isChecked()) {
            score++;
        }

        //correct answer for question 5
        RadioButton answerFiveThree = (RadioButton) findViewById(R.id.answer5_3);
        if (answerFiveThree.isChecked()) {
            score++;
        }

        //correct answer for question 6
        CheckBox answerSixOne = (CheckBox) findViewById(R.id.answer6_1);
        CheckBox answerSixTwo = (CheckBox) findViewById(R.id.answer6_2);
        CheckBox answerSixThree = (CheckBox) findViewById(R.id.answer6_3);
        CheckBox answerSixFour = (CheckBox) findViewById(R.id.answer6_4);
        if (answerSixOne.isChecked() && answerSixFour.isChecked() && !(answerSixTwo.isChecked()) && !(answerSixThree.isChecked())) {
            score++;
        }

        //results text
        String text = getResources().getString(R.string.result) + score + "/6. ";

        //displays when score is lower than 6
        if (score < 6) {
            text += "Try again!";
        }

        //displays when the prefect score is reached
        else {
            text += "Congratulations!";
        }

        //toast with the results of quiz
        Toast result = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        result.show();
    }
}
