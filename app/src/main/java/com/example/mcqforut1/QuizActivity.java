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

    private TextView tvTimer;
    private TextView tvQuestion;
    private TextView tvMeta;
    private Button btnA;
    private Button btnB;
    private Button btnC;
    private Button btnD;
    private Button btnSkip;

    private ArrayList<Question> questions;
    private int index = 0;
    private int score = 0;
    private int questionNo = 1;

    private CountDownTimer timer;
    private String username;
    private String subject;
    private int chapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_quiz);

        tvTimer = findViewById(R.id.tvTimer);
        tvQuestion = findViewById(R.id.tvQuestion);
        tvMeta = findViewById(R.id.tvMeta);

        btnA = findViewById(R.id.btnA);
        btnB = findViewById(R.id.btnB);
        btnC = findViewById(R.id.btnC);
        btnD = findViewById(R.id.btnD);
        btnSkip = findViewById(R.id.btnSkip);

        username = getIntent().getStringExtra("username");
        subject = getIntent().getStringExtra("subject");
        chapter = getIntent().getIntExtra("chapter", 3);

        questions = QuestionBank.getETIQuestionsByChapter(chapter);

        tvMeta.setText("ETI • Chapter " + chapter + " • " + questions.size() + " questions");

        loadQuestion();

        btnA.setOnClickListener(v -> checkAnswer(0));
        btnB.setOnClickListener(v -> checkAnswer(1));
        btnC.setOnClickListener(v -> checkAnswer(2));
        btnD.setOnClickListener(v -> checkAnswer(3));
        btnSkip.setOnClickListener(v -> skipQuestion());
    }

    private void loadQuestion() {
        resetOptions();

        if (index >= questions.size()) {
            Intent intent = new Intent(QuizActivity.this, ResultActivity.class);
            intent.putExtra("username", username);
            intent.putExtra("subject", subject);
            intent.putExtra("chapter", chapter);
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

    private void startTimer() {
        if (timer != null) {
            timer.cancel();
        }

        timer = new CountDownTimer(45000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                tvTimer.setText("Time " + (millisUntilFinished / 1000) + "s");
            }

            @Override
            public void onFinish() {
                disableOptions();
                highlightCorrectAnswer();
                new Handler().postDelayed(() -> {
                    index++;
                    loadQuestion();
                }, 1200);
            }
        }.start();
    }

    private void skipQuestion() {
        if (timer != null) {
            timer.cancel();
        }

        disableOptions();
        highlightCorrectAnswer();

        new Handler().postDelayed(() -> {
            index++;
            loadQuestion();
        }, 1200);
    }

    private void checkAnswer(int selectedOption) {
        if (timer != null) {
            timer.cancel();
        }

        disableOptions();

        Question q = questions.get(index);
        Button correctBtn = getButtonByIndex(q.correctanswers);
        Button selectedBtn = getButtonByIndex(selectedOption);

        if (correctBtn != null) {
            correctBtn.setBackgroundResource(R.drawable.bg_option_correct);
        }

        if (selectedOption == q.correctanswers) {
            score++;
        } else if (selectedBtn != null) {
            selectedBtn.setBackgroundResource(R.drawable.bg_option_wrong);
        }

        new Handler().postDelayed(() -> {
            index++;
            loadQuestion();
        }, 1200);
    }

    private Button getButtonByIndex(int index) {
        switch (index) {
            case 0:
                return btnA;
            case 1:
                return btnB;
            case 2:
                return btnC;
            case 3:
                return btnD;
            default:
                return null;
        }
    }

    private void resetOptions() {
        btnA.setEnabled(true);
        btnB.setEnabled(true);
        btnC.setEnabled(true);
        btnD.setEnabled(true);
        btnSkip.setEnabled(true);

        btnA.setBackgroundResource(R.drawable.bg_option);
        btnB.setBackgroundResource(R.drawable.bg_option);
        btnC.setBackgroundResource(R.drawable.bg_option);
        btnD.setBackgroundResource(R.drawable.bg_option);
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
        if (correctBtn != null) {
            correctBtn.setBackgroundResource(R.drawable.bg_option_correct);
        }
    }
}
