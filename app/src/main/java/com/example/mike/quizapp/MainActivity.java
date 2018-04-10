package com.example.mike.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Tracks the users score
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClicked (View view){
        //Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        //Question 1 Check which radio button was clicked
        switch (view.getId()){
            case R.id.not_birthday1:
                if (checked)
                    break;
            case R.id.not_birthday2:
                if (checked)
                    break;
            case R.id.birthday:
                if (checked)
                    // correct answer
                    break;
        }

    //Question 2 Check which radio button was clicked
        switch (view.getId()){
        case R.id.not_stairs1:
            if (checked)
                break;
        case R.id.not_stairs2:
            if (checked)
                break;
        case R.id.stairs_ans:
            if (checked)
                // correct answer
                break;
    }
}

    /**
     * This method is called when the submit answers button is clicked.
     */
    public void submitAnswers(View view) {
        //Scores question 1
        RadioButton birthday = findViewById(R.id.birthday);
        if (birthday.isChecked()) {
            score = score + 1;
        }

        //Scores question 2
        RadioButton stairs = findViewById(R.id.stairs_ans);
        boolean onStairsClicked = stairs.isChecked();
        if (stairs.isChecked()) {
            score = score + 1;
        }
        //Scores question 3
        CheckBox choice1 = (CheckBox) findViewById(R.id.checkbox1);
        if (choice1.isChecked()) {
            score = score + 1;
        }
        CheckBox choice2 = (CheckBox) findViewById(R.id.checkbox2);
        if (choice2.isChecked()) {
            score = score + 1;
        }
        CheckBox choice3 = (CheckBox) findViewById(R.id.checkbox3);
        if (choice3.isChecked()) {
            score = score + 1;
        }
        CheckBox choice7 = (CheckBox) findViewById(R.id.checkbox7);
        if (choice7.isChecked()) {
            score = score + 1;
        }
        CheckBox choice8 = (CheckBox) findViewById(R.id.checkbox8);
        if (choice8.isChecked()) {
            score = score + 1;
        }
        CheckBox choice9 = (CheckBox) findViewById(R.id.checkbox9);
        if (choice9.isChecked()) {
            score = score + 1;
        }
        //Scores question 4
        EditText nameField2 = (EditText) findViewById(R.id.speed);
        String name2 = nameField2.getText().toString();
        if (name2.equals("150")) {
            score = score + 1;
        }
        // Shows score.
        Toast.makeText(this, "Your score is " + score + " out of 9.", Toast.LENGTH_SHORT).show();
        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }
}
