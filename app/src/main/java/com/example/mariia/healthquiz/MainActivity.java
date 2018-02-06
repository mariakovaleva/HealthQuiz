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
        getSupportActionBar().hide();
    }

    public void checkResults(View view){
        int score = 0;

        EditText answer1 = (EditText) findViewById(R.id.answer1);
        String answer1_text = answer1.getText().toString();
        if(answer1_text.equals(getResources().getString(R.string.answer1))){
            score++;
        }

        RadioButton answer2_1 = (RadioButton) findViewById(R.id.answer2_1);
        if(answer2_1.isChecked()){
            score++;
        }

        RadioButton answer3_3 = (RadioButton) findViewById(R.id.answer3_3);
        if(answer3_3.isChecked()){
            score++;
        }

        RadioButton answer4_4 = (RadioButton) findViewById(R.id.answer4_4);
        if(answer4_4.isChecked()){
            score++;
        }

        RadioButton answer5_3 = (RadioButton) findViewById(R.id.answer5_3);
        if(answer5_3.isChecked()){
            score++;
        }

        Context context = getApplicationContext();
        String text = getResources().getString(R.string.result) + score + "/5";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
