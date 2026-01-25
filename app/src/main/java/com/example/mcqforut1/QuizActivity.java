package com.example.mcqforut1;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mcqforut1.data.QuestionBank;
import com.example.mcqforut1.model.Question;

import java.util.ArrayList;

public class QuizActivity extends AppCompatActivity {

    TextView tvTimer, tvQuestion;
    Button btnA, btnB, btnC, btnD;
    Button btnSkip;
    ArrayList<Question> questions;
    int index = 0;
    int score = 0;
    int questionNo = 1;

    CountDownTimer timer;
    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_quiz);

        tvTimer = findViewById(R.id.tvTimer);
        tvQuestion = findViewById(R.id.tvQuestion);

        btnA = findViewById(R.id.btnA);
        btnB = findViewById(R.id.btnB);
        btnC = findViewById(R.id.btnC);
        btnD = findViewById(R.id.btnD);
        btnSkip = findViewById(R.id.btnSkip);


        // Get data from intent
        username = getIntent().getStringExtra("username");
        String subject = getIntent().getStringExtra("subject");

        if (subject != null && subject.equals("MAN")) {
            questions = QuestionBank.getMANquestions();
        } else {
            questions = QuestionBank.getETIquestions();
        }

        loadQuestion();

        btnA.setOnClickListener(v -> checkAnswer(0));
        btnB.setOnClickListener(v -> checkAnswer(1));
        btnC.setOnClickListener(v -> checkAnswer(2));
        btnD.setOnClickListener(v -> checkAnswer(3));
        btnSkip.setOnClickListener(v -> skipQuestion());

    }

    // ---------------- LOAD QUESTION ----------------
    private void loadQuestion() {

        resetOptions();

        if (index >= questions.size()) {
            Intent intent = new Intent(QuizActivity.this, ResultActivity.class);
            intent.putExtra("username", username);
            intent.putExtra("subject", getIntent().getStringExtra("subject"));
            intent.putExtra("score", score);
            intent.putExtra("total", questions.size());
            startActivity(intent);
            finish();
            return;
        }

        Question q = questions.get(index);

        tvQuestion.setText(questionNo + ". " + q.questions);
        questionNo++;

        btnA.setText(q.options[0]);
        btnB.setText(q.options[1]);
        btnC.setText(q.options[2]);
        btnD.setText(q.options[3]);

        startTimer();
    }

    // ---------------- TIMER ----------------
    private void startTimer() {

        if (timer != null) timer.cancel();

        timer = new CountDownTimer(45000, 1000) {

            @Override
            public void onTick(long millisUntilFinished) {
                tvTimer.setText("Time: " + (millisUntilFinished / 1000) + "s");
            }

            @Override
            public void onFinish() {
                disableOptions();
                highlightCorrectAnswer();

                new Handler().postDelayed(() -> {
                    index++;
                    loadQuestion();
                }, 1500);
            }
        }.start();
    }

    private void skipQuestion() {

        timer.cancel();
        disableOptions();

        // Show correct answer
        highlightCorrectAnswer();

        // Move to next question after delay
        new android.os.Handler().postDelayed(() -> {
            index++;
            loadQuestion();
        }, 1500);
    }


    // ---------------- CHECK ANSWER ----------------
    private void checkAnswer(int selectedOption) {

        timer.cancel();
        disableOptions();

        Question q = questions.get(index);

        Button correctBtn = getButtonByIndex(q.correctanswers);
        Button selectedBtn = getButtonByIndex(selectedOption);

        // Correct option → GREEN
        setOptionStyle(correctBtn, android.R.color.holo_green_light);

        if (selectedOption == q.correctanswers) {
            score++;
        } else {
            // Wrong selected option → RED
            setOptionStyle(selectedBtn, android.R.color.holo_red_light);
        }

        new Handler().postDelayed(() -> {
            index++;
            loadQuestion();
        }, 1500);
    }

    // ---------------- HELPERS ----------------

    private Button getButtonByIndex(int index) {
        switch (index) {
            case 0: return btnA;
            case 1: return btnB;
            case 2: return btnC;
            case 3: return btnD;
            default: return null;
        }
    }

    private void setOptionStyle(Button btn, int bgColor) {
        btn.setBackgroundColor(getResources().getColor(bgColor));
        btn.setTextColor(getResources().getColor(android.R.color.black));
    }

    private void resetOptions() {

        btnA.setEnabled(true);
        btnB.setEnabled(true);
        btnC.setEnabled(true);
        btnD.setEnabled(true);
        btnSkip.setEnabled(true);

        int defaultColor = android.R.color.holo_blue_light;

        setOptionStyle(btnA, defaultColor);
        setOptionStyle(btnB, defaultColor);
        setOptionStyle(btnC, defaultColor);
        setOptionStyle(btnD, defaultColor);
    }

    private void disableOptions() {
        btnA.setEnabled(false);
        btnB.setEnabled(false);
        btnC.setEnabled(false);
        btnD.setEnabled(false);
        btnSkip.setEnabled(false);
    }

    private void highlightCorrectAnswer() {
        Question q = questions.get(index);
        Button correctBtn = getButtonByIndex(q.correctanswers);
        setOptionStyle(correctBtn, android.R.color.holo_green_light);
    }
}
