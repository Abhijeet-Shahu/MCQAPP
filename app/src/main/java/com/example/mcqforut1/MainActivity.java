package com.example.mcqforut1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText etusername;
    CardView cardsubman,cardsubeti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        etusername = findViewById(R.id.editTextText);
        cardsubeti = findViewById(R.id.cardeti);
        cardsubman = findViewById(R.id.cardView);

        cardsubman.setOnClickListener(v-> startQuiz("MAN"));

        cardsubeti.setOnClickListener(v-> startQuiz("ETI"));


    }
    private void startQuiz(String subject){
        String username = etusername.getText().toString().trim();

        if(username.isEmpty()){
            etusername.setError("Enter Name");
            etusername.requestFocus();
            return;
        }

        if (!username.matches("^[a-zA-Z ]+$")) {
            etusername.setError("Name should contain only letters");
            etusername.requestFocus();
            return;
        }

        Intent intent = new Intent(MainActivity.this, QuizActivity.class);
        intent.putExtra("username",username);
        intent.putExtra("subject",subject);
        startActivity(intent);
    }
}