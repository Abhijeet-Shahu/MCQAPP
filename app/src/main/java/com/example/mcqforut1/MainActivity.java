package com.example.mcqforut1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    private EditText etUsername;
    private Button btnContinue;
    private CardView cardEti;
    private CardView cardMan;
    private TextView tvEtiTag;
    private TextView tvManTag;
    private String selectedSubject = "ETI";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.etUsername);
        btnContinue = findViewById(R.id.btnContinue);
        cardEti = findViewById(R.id.cardEti);
        cardMan = findViewById(R.id.cardMan);
        tvEtiTag = findViewById(R.id.tvEtiTag);
        tvManTag = findViewById(R.id.tvManTag);

        cardEti.setOnClickListener(v -> selectSubject("ETI"));
        cardMan.setOnClickListener(v -> selectSubject("MAN"));
        btnContinue.setOnClickListener(v -> goToChapterSelection());

        selectSubject(selectedSubject);
    }

    private void selectSubject(String subject) {
        selectedSubject = subject;
        boolean isEti = "ETI".equals(subject);

        cardEti.setCardBackgroundColor(ContextCompat.getColor(this, isEti ? R.color.surface_highlight : R.color.surface_card));
        cardMan.setCardBackgroundColor(ContextCompat.getColor(this, isEti ? R.color.surface_card : R.color.surface_highlight));

        tvEtiTag.setBackgroundResource(isEti ? R.drawable.bg_chip_active : R.drawable.bg_chip);
        tvManTag.setBackgroundResource(isEti ? R.drawable.bg_chip : R.drawable.bg_chip_active);
    }

    private void goToChapterSelection() {
        String username = etUsername.getText().toString().trim();

        if (username.isEmpty()) {
            etUsername.setError("Enter name");
            etUsername.requestFocus();
            return;
        }

        if (!username.matches("^[a-zA-Z ]+$")) {
            etUsername.setError("Name should contain only letters");
            etUsername.requestFocus();
            return;
        }

        Intent intent = new Intent(MainActivity.this, ChapterSelectActivity.class);
        intent.putExtra("username", username);
        intent.putExtra("subject", selectedSubject);
        startActivity(intent);
    }
}
