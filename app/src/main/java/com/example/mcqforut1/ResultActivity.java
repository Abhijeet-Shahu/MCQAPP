package com.example.mcqforut1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mcqforut1.data.ProgressStore;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_result);

        TextView tvCongrats = findViewById(R.id.tvCongrats);
        TextView tvScore = findViewById(R.id.tvScore);
        Button btnRetry = findViewById(R.id.btnRetry);
        Button btnMainMenu = findViewById(R.id.btnMainMenu);
        Button btnViewProgress = findViewById(R.id.btnViewProgress);

        String username = getIntent().getStringExtra("username");
        String subject = getIntent().getStringExtra("subject");
        int chapter = getIntent().getIntExtra("chapter", 3);
        int score = getIntent().getIntExtra("score", 0);
        int total = getIntent().getIntExtra("total", 0);

        ProgressStore.recordAttempt(this, chapter, score, total);

        tvCongrats.setText("Great effort, " + username + "!");
        tvScore.setText("ETI Chapter " + chapter + " Score: " + score + " / " + total);

        btnRetry.setOnClickListener(v -> {
            Intent intent = new Intent(ResultActivity.this, QuizActivity.class);
            intent.putExtra("username", username);
            intent.putExtra("subject", subject);
            intent.putExtra("chapter", chapter);
            startActivity(intent);
            finish();
        });

        btnMainMenu.setOnClickListener(v -> {
            Intent intent = new Intent(ResultActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });

        btnViewProgress.setOnClickListener(v -> startActivity(new Intent(this, ProgressActivity.class)));
    }
}
