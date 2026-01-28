package com.example.mcqforut1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    TextView tvCongrats, tvScore;
    Button btnRetry, btnMainMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_result);

        tvCongrats = findViewById(R.id.tvCongrats);
        tvScore = findViewById(R.id.tvScore);
        btnRetry = findViewById(R.id.btnRetry);
        btnMainMenu = findViewById(R.id.btnMainMenu);

        // Receive data
        String username = getIntent().getStringExtra("username");
        String subject = getIntent().getStringExtra("subject");
        int score = getIntent().getIntExtra("score", 0);
        int total = getIntent().getIntExtra("total", 0);

        tvCongrats.setText("thik thak hai " + username + "!");

//        if(score<35){
//            tvCongrats.setText("Khush mat ho fail Hai tu " + username + "!");
//        } else if (score>=35 && score<70) {
//            tvCongrats.setText("Itne marks me UT nhi niklega " + username + "!");
//        }
//        else if(score>=70 && score<=98){
//            tvCongrats.setText("Thik thak hai " + username + "!");
//
//        } else if (score == 99) {
//            tvCongrats.setText("You can do better " + username + "!");
//
//        } else if (score >= 100) {
//            tvCongrats.setText("Cheating kiya na " + username + "!");
//        }

        tvScore.setText("Score: " + score + " / " + total);

        // Retry SAME subject
        btnRetry.setOnClickListener(v -> {
            Intent intent = new Intent(ResultActivity.this, QuizActivity.class);
            intent.putExtra("username", username);
            intent.putExtra("subject", subject);
            startActivity(intent);
            finish();
        });

        // Go to main menu
        btnMainMenu.setOnClickListener(v -> {
            Intent intent = new Intent(ResultActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
