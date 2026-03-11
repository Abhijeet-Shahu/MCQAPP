package com.example.mcqforut1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class ChapterSelectActivity extends AppCompatActivity {

    private String username;
    private String subject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chapter_select);

        username = getIntent().getStringExtra("username");
        subject = getIntent().getStringExtra("subject");

        TextView tvHello = findViewById(R.id.tvHello);
        CardView cardCh3 = findViewById(R.id.cardCh3);
        CardView cardCh4 = findViewById(R.id.cardCh4);
        CardView cardCh5 = findViewById(R.id.cardCh5);
        Button btnProgress = findViewById(R.id.btnProgress);

        tvHello.setText("Welcome, " + username);

        cardCh3.setOnClickListener(v -> startQuiz(3));
        cardCh4.setOnClickListener(v -> startQuiz(4));
        cardCh5.setOnClickListener(v -> startQuiz(5));
        btnProgress.setOnClickListener(v -> startActivity(new Intent(this, ProgressActivity.class)));
    }

    private void startQuiz(int chapter) {
        Intent intent = new Intent(ChapterSelectActivity.this, QuizActivity.class);
        intent.putExtra("username", username);
        intent.putExtra("subject", subject);
        intent.putExtra("chapter", chapter);
        startActivity(intent);
    }
}
