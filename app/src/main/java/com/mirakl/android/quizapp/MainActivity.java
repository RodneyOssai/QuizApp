package com.mirakl.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int finalScore = 0;
    String failed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gradingLogic() {

        /*
        Question One Correct Answer
         */
        EditText qOneAnswer = (EditText) findViewById(R.id.q1Ans);
        String ansOne = qOneAnswer.getText().toString().toLowerCase();//Get the text that the user input, Convert to string and change it to lowercase.
        String correctAns1 = "hyper text markup language"; // Give the code the correct answer
        if (ansOne.contentEquals(correctAns1)) {  // Compare the user input with correct answer.
            finalScore = 1;
        } else {
            failed = "Number 1";
        }
        /*
        Question Two Correct Answer
         */
        RadioGroup qTwoRadioGroup = (RadioGroup) findViewById(R.id.q2radioGroup);
        RadioButton correctAns2 = (RadioButton) findViewById(R.id.option2);//Give the code the correct answer
        int q2selectedRadioID = qTwoRadioGroup.getCheckedRadioButtonId();//Get the answer your user selected
        RadioButton selectedRadioQ2 = findViewById(q2selectedRadioID);//Convert it to RadioButton Object so that it can be compared with correct answer


        if (selectedRadioQ2 == correctAns2) {
            finalScore = finalScore + 1;
        } else {
            failed = failed + ", Number 2";
        }
        /*
        Question 3 Correct Answer
         */
        RadioGroup qThreeRadioGroup = (RadioGroup) findViewById(R.id.q3radioGroup);
        RadioButton correctAns3 = (RadioButton) findViewById(R.id.q3radioButton2);//Give the code the correct answer
        int q3selectedRadioID = qThreeRadioGroup.getCheckedRadioButtonId();//Get the answer your user selected
        RadioButton selectedRadioQ3 = findViewById(q3selectedRadioID);//Convert it to RadioButton Object so that it can be compared with correct answer


        if (selectedRadioQ3 == correctAns3) {
            finalScore = finalScore + 1;
        } else {
            failed = failed + ", Number 3";
        }
        /*
        Question 4 Correct Answer
         */
        RadioGroup qFourRadioGroup = (RadioGroup) findViewById(R.id.q4radioGroup);
        RadioButton correctAns4 = (RadioButton) findViewById(R.id.q4radioButton2);//Give the code the correct answer
        int q4selectedRadioID = qFourRadioGroup.getCheckedRadioButtonId();//Get the answer your user selected
        RadioButton selectedRadioQ4 = findViewById(q4selectedRadioID);//Convert it to RadioButton Object so that it can be compared with correct answer


        if (selectedRadioQ4 == correctAns4) {
            finalScore = finalScore + 1;
        } else {
            failed = failed + ", Number 4";
        }
        /*
        Question 5 Correct Answer
         */
        RadioGroup qFiveRadioGroup = (RadioGroup) findViewById(R.id.q5radioGroup);
        RadioButton correctAns5 = (RadioButton) findViewById(R.id.q5radioButton);//Give the code the correct answer
        int q5selectedRadioID = qFiveRadioGroup.getCheckedRadioButtonId();//Get the answer your user selected
        RadioButton selectedRadioQ5 = findViewById(q5selectedRadioID);//Convert it to RadioButton Object so that it can be compared with correct answer


        if (selectedRadioQ5 == correctAns5) {
            finalScore = finalScore + 1;
        } else {
            failed = failed + ", Number 5";
        }
         /*
        Question Six Correct Answer
         */
        EditText qSixAnswer = (EditText) findViewById(R.id.q6Ans);
        String ansSix = qSixAnswer.getText().toString().toLowerCase();//Get the text that the user input, Convert to string and change it to lowercase.
        String correctAns6 = "six"; // Give the code the correct answer
        String correctAns6_2 = "6";// Also correct if the user types in an integer
        if ((ansSix.contentEquals(correctAns6)) || (ansSix.contentEquals(correctAns6_2))) {  // Compare the user input with correct answer.
            finalScore = finalScore + 1;
        } else {
            failed = failed + ", Number 6";
        }
        /*
        Question Seven Correct Answer
         */
        CheckBox q7CorrectAnswer1 = (CheckBox) findViewById(R.id.q7checkBox);
        CheckBox q7CorrectAnswer2 = (CheckBox) findViewById(R.id.q7checkBox3);
        boolean tdTag = q7CorrectAnswer1.isChecked();
        boolean trTag = q7CorrectAnswer2.isChecked();
        if (tdTag && trTag) {
            finalScore = finalScore + 1;
        } else {
            failed = failed + ", Number 7";
        }
        /*
        Question Eight Correct Answer
         */
        EditText q8AnsField = findViewById(R.id.q8Ans);
        String ansEight = q8AnsField.getText().toString().toLowerCase().trim();
        String correctAns8 = "funny-dog.jpg";
        if (ansEight.contentEquals(correctAns8)) {  // Compare the user input with correct answer.
            finalScore = finalScore + 1;
        } else {
            failed = failed + ", Number 8";
        }

    }

    public void submitQuiz(View v) {
        /*
        Name
         */
        EditText nameField = (EditText) findViewById(R.id.player_name);
        String playerName = nameField.getText().toString();

        gradingLogic();

        if (finalScore == 8) {
            Toast.makeText(getApplicationContext(), "Wow " + playerName + " !!! Perfect score of " + finalScore + "/8", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), "Hey " + playerName + " you got" + finalScore + " questions right out of 8 questions", Toast.LENGTH_LONG).show();
        }
        finalScore = 0; // Reset finalScore value to 0 after displaying to user.
    }
}
