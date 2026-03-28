package com.example.mcqforut1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mcqforut1.data.ProgressStore;

public class ProgressActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_progress);

        String subject = getIntent().getStringExtra("subject");
        if (subject == null || subject.isEmpty()) {
            subject = "ETI";
        }

        TextView tvTitle = findViewById(R.id.tvProgressTitle);
        TextView tvCh3Label = findViewById(R.id.tvCh3Label);
        TextView tvCh4Label = findViewById(R.id.tvCh4Label);
        TextView tvCh5Label = findViewById(R.id.tvCh5Label);
        TextView tvCh3 = findViewById(R.id.tvCh3Stats);
        TextView tvCh4 = findViewById(R.id.tvCh4Stats);
        TextView tvCh5 = findViewById(R.id.tvCh5Stats);
        Button btnBack = findViewById(R.id.btnBack);

        tvTitle.setText(subject + " Progress");

        if ("MAN".equals(subject)) {
            tvCh3Label.setText("Unit III");
            tvCh4Label.setText("Unit IV");
            tvCh5Label.setText("Unit V");
        } else {
            tvCh3Label.setText("Chapter 3");
            tvCh4Label.setText("Chapter 4");
            tvCh5Label.setText("Chapter 5");
        }

        renderChapter(subject, 3, tvCh3);
        renderChapter(subject, 4, tvCh4);
        renderChapter(subject, 5, tvCh5);

        btnBack.setOnClickListener(v -> finish());
    }

    private void renderChapter(String subject, int chapter, TextView target) {
        ProgressStore.ChapterStats stats = ProgressStore.getStats(this, subject, chapter);
        String text = "Attempts: " + stats.attempts
                + "\nBest: " + stats.bestScore + " / " + stats.bestTotal + " (" + stats.bestPercent() + "%)"
                + "\nAverage: " + stats.averagePercent() + "%";
        target.setText(text);
    }
}
