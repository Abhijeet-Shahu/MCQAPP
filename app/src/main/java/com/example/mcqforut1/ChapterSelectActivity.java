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
        TextView tvSubjectTitle = findViewById(R.id.tvSubjectTitle);
        TextView tvCard3Title = findViewById(R.id.tvCard3Title);
        TextView tvCard3Sub = findViewById(R.id.tvCard3Subtitle);
        TextView tvCard4Title = findViewById(R.id.tvCard4Title);
        TextView tvCard4Sub = findViewById(R.id.tvCard4Subtitle);
        TextView tvCard5Title = findViewById(R.id.tvCard5Title);
        TextView tvCard5Sub = findViewById(R.id.tvCard5Subtitle);
        CardView cardCh3 = findViewById(R.id.cardCh3);
        CardView cardCh4 = findViewById(R.id.cardCh4);
        CardView cardCh5 = findViewById(R.id.cardCh5);
        Button btnProgress = findViewById(R.id.btnProgress);

        tvHello.setText("Welcome, " + username);
        tvSubjectTitle.setText("Choose your " + subject + " unit");

        if ("MAN".equals(subject)) {
            tvCard3Title.setText("Unit III");
            tvCard3Sub.setText("Management Practices");
            tvCard4Title.setText("Unit IV");
            tvCard4Sub.setText("Marketing Management");
            tvCard5Title.setText("Unit V");
            tvCard5Sub.setText("Supply Chain and HRM");
        } else {
            tvCard3Title.setText("Chapter 3");
            tvCard3Sub.setText("Blockchain Technology");
            tvCard4Title.setText("Chapter 4");
            tvCard4Sub.setText("Immersive and Sustainable Computing");
            tvCard5Title.setText("Chapter 5");
            tvCard5Sub.setText("Digital Forensics and Ethical Hacking");
        }

        cardCh3.setOnClickListener(v -> startQuiz(3));
        cardCh4.setOnClickListener(v -> startQuiz(4));
        cardCh5.setOnClickListener(v -> startQuiz(5));
        btnProgress.setOnClickListener(v -> {
            Intent intent = new Intent(this, ProgressActivity.class);
            intent.putExtra("subject", subject);
            startActivity(intent);
        });
    }

    private void startQuiz(int chapter) {
        Intent intent = new Intent(ChapterSelectActivity.this, QuizActivity.class);
        intent.putExtra("username", username);
        intent.putExtra("subject", subject);
        intent.putExtra("chapter", chapter);
        startActivity(intent);
    }
}
