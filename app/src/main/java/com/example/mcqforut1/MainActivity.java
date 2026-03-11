package com.example.mcqforut1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etUsername;
    private Button btnContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.etUsername);
        btnContinue = findViewById(R.id.btnContinue);

        btnContinue.setOnClickListener(v -> goToChapterSelection());
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
        intent.putExtra("subject", "ETI");
        startActivity(intent);
    }
}
