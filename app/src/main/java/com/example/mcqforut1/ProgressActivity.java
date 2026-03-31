package com.example.mcqforut1;

import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import com.example.mcqforut1.data.ProgressStore;

public class ProgressActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String subject = getIntent() != null ? getIntent().getStringExtra("subject") : null;
        if (!"MAN".equals(subject) && !"ETI".equals(subject)) {
            subject = "ETI";
        }

        setContentView(buildContent(subject));
    }

    private ScrollView buildContent(String subject) {
        ScrollView scrollView = new ScrollView(this);
        scrollView.setFillViewport(true);
        scrollView.setBackgroundResource(R.drawable.bg_gradient_main);

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        int pad = dp(24);
        root.setPadding(pad, pad, pad, pad);
        scrollView.addView(root, new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        ));

        TextView title = new TextView(this);
        title.setText(subject + " Progress");
        title.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30);
        title.setTypeface(Typeface.DEFAULT_BOLD);
        title.setTextColor(ContextCompat.getColor(this, R.color.ink_light));
        root.addView(title);

        TextView subtitle = new TextView(this);
        subtitle.setText("Attempts, best score and average for each unit");
        subtitle.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
        subtitle.setTextColor(ContextCompat.getColor(this, R.color.ink_muted));
        LinearLayout.LayoutParams subtitleParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        subtitleParams.topMargin = dp(6);
        root.addView(subtitle, subtitleParams);

        root.addView(buildStatCard(subject, 3));
        root.addView(buildStatCard(subject, 4));
        root.addView(buildStatCard(subject, 5));

        Button back = new Button(this);
        back.setText("Back");
        back.setAllCaps(false);
        back.setTextColor(ContextCompat.getColor(this, R.color.ink_light));
        back.setBackgroundResource(R.drawable.bg_card);
        LinearLayout.LayoutParams backParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        backParams.topMargin = dp(18);
        root.addView(back, backParams);
        back.setOnClickListener(v -> finish());

        return scrollView;
    }

    private CardView buildStatCard(String subject, int chapter) {
        CardView card = new CardView(this);
        card.setCardBackgroundColor(ContextCompat.getColor(this, R.color.surface_panel));
        card.setRadius(dp(18));
        card.setCardElevation(dp(6));

        LinearLayout.LayoutParams cardParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        cardParams.topMargin = dp(12);
        if (chapter == 3) {
            cardParams.topMargin = dp(20);
        }
        card.setLayoutParams(cardParams);

        LinearLayout inner = new LinearLayout(this);
        inner.setOrientation(LinearLayout.VERTICAL);
        inner.setPadding(dp(18), dp(18), dp(18), dp(18));

        TextView label = new TextView(this);
        label.setText(getChapterLabel(subject, chapter));
        label.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        label.setTypeface(Typeface.DEFAULT_BOLD);
        label.setTextColor(ContextCompat.getColor(this, R.color.ink_dark));
        inner.addView(label);

        ProgressStore.ChapterStats stats = ProgressStore.getStats(this, subject, chapter);
        TextView statText = new TextView(this);
        statText.setText(
                "Attempts: " + stats.attempts
                        + "\nBest: " + stats.bestScore + " / " + stats.bestTotal + " (" + stats.bestPercent() + "%)"
                        + "\nAverage: " + stats.averagePercent() + "%"
        );
        statText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15);
        statText.setTextColor(ContextCompat.getColor(this, R.color.ink_soft));
        LinearLayout.LayoutParams statParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        statParams.topMargin = dp(6);
        inner.addView(statText, statParams);

        card.addView(inner);
        return card;
    }

    private String getChapterLabel(String subject, int chapter) {
        if ("MAN".equals(subject)) {
            switch (chapter) {
                case 3:
                    return "Unit III";
                case 4:
                    return "Unit IV";
                case 5:
                    return "Unit V";
                default:
                    return "Unit " + chapter;
            }
        }
        return "Chapter " + chapter;
    }

    private int dp(int value) {
        return Math.round(value * getResources().getDisplayMetrics().density);
    }
}
