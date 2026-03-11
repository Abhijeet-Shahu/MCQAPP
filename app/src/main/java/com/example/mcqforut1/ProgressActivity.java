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

        TextView tvCh3 = findViewById(R.id.tvCh3Stats);
        TextView tvCh4 = findViewById(R.id.tvCh4Stats);
        TextView tvCh5 = findViewById(R.id.tvCh5Stats);
        Button btnBack = findViewById(R.id.btnBack);

        renderChapter(3, tvCh3);
        renderChapter(4, tvCh4);
        renderChapter(5, tvCh5);

        btnBack.setOnClickListener(v -> finish());
    }

    private void renderChapter(int chapter, TextView target) {
        ProgressStore.ChapterStats stats = ProgressStore.getStats(this, chapter);

        String text = "Attempts: " + stats.attempts
                + "\nBest: " + stats.bestScore + " / " + stats.bestTotal + " (" + stats.bestPercent() + "%)"
                + "\nAverage: " + stats.averagePercent() + "%";

        target.setText(text);
    }
}
