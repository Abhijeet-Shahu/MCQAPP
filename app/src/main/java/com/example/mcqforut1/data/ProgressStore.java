package com.example.mcqforut1.data;

import android.content.Context;
import android.content.SharedPreferences;

public class ProgressStore {

    private static final String PREF_NAME = "quiz_progress";

    private static String key(String subject, int chapter, String suffix) {
        return subject + "_ch_" + chapter + "_" + suffix;
    }

    public static void recordAttempt(Context context, String subject, int chapter, int score, int total) {
        SharedPreferences prefs = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);

        int attempts = prefs.getInt(key(subject, chapter, "attempts"), 0) + 1;
        int totalCorrect = prefs.getInt(key(subject, chapter, "total_correct"), 0) + score;
        int totalQuestions = prefs.getInt(key(subject, chapter, "total_questions"), 0) + total;

        int bestScore = prefs.getInt(key(subject, chapter, "best_score"), 0);
        int bestTotal = prefs.getInt(key(subject, chapter, "best_total"), 0);

        boolean shouldUpdateBest = bestTotal == 0 || (score * bestTotal) > (bestScore * total);
        if (shouldUpdateBest) {
            bestScore = score;
            bestTotal = total;
        }

        prefs.edit()
                .putInt(key(subject, chapter, "attempts"), attempts)
                .putInt(key(subject, chapter, "total_correct"), totalCorrect)
                .putInt(key(subject, chapter, "total_questions"), totalQuestions)
                .putInt(key(subject, chapter, "best_score"), bestScore)
                .putInt(key(subject, chapter, "best_total"), bestTotal)
                .apply();
    }

    public static ChapterStats getStats(Context context, String subject, int chapter) {
        SharedPreferences prefs = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);

        int attempts = prefs.getInt(key(subject, chapter, "attempts"), 0);
        int totalCorrect = prefs.getInt(key(subject, chapter, "total_correct"), 0);
        int totalQuestions = prefs.getInt(key(subject, chapter, "total_questions"), 0);
        int bestScore = prefs.getInt(key(subject, chapter, "best_score"), 0);
        int bestTotal = prefs.getInt(key(subject, chapter, "best_total"), 0);

        return new ChapterStats(attempts, totalCorrect, totalQuestions, bestScore, bestTotal);
    }

    public static class ChapterStats {
        public final int attempts;
        public final int totalCorrect;
        public final int totalQuestions;
        public final int bestScore;
        public final int bestTotal;

        public ChapterStats(int attempts, int totalCorrect, int totalQuestions, int bestScore, int bestTotal) {
            this.attempts = attempts;
            this.totalCorrect = totalCorrect;
            this.totalQuestions = totalQuestions;
            this.bestScore = bestScore;
            this.bestTotal = bestTotal;
        }

        public int averagePercent() {
            if (totalQuestions == 0) {
                return 0;
            }
            return Math.round((totalCorrect * 100f) / totalQuestions);
        }

        public int bestPercent() {
            if (bestTotal == 0) {
                return 0;
            }
            return Math.round((bestScore * 100f) / bestTotal);
        }
    }
}
