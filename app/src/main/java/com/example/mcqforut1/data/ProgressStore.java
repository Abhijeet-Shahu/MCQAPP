package com.example.mcqforut1.data;

import android.content.Context;
import android.content.SharedPreferences;

public class ProgressStore {

    private static final String PREF_NAME = "eti_progress";

    private static String attemptsKey(int chapter) {
        return "ch_" + chapter + "_attempts";
    }

    private static String totalCorrectKey(int chapter) {
        return "ch_" + chapter + "_total_correct";
    }

    private static String totalQuestionsKey(int chapter) {
        return "ch_" + chapter + "_total_questions";
    }

    private static String bestScoreKey(int chapter) {
        return "ch_" + chapter + "_best_score";
    }

    private static String bestTotalKey(int chapter) {
        return "ch_" + chapter + "_best_total";
    }

    public static void recordAttempt(Context context, int chapter, int score, int total) {
        SharedPreferences prefs = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);

        int attempts = prefs.getInt(attemptsKey(chapter), 0) + 1;
        int totalCorrect = prefs.getInt(totalCorrectKey(chapter), 0) + score;
        int totalQuestions = prefs.getInt(totalQuestionsKey(chapter), 0) + total;

        int bestScore = prefs.getInt(bestScoreKey(chapter), 0);
        int bestTotal = prefs.getInt(bestTotalKey(chapter), 0);

        boolean shouldUpdateBest = bestTotal == 0 || (score * bestTotal) > (bestScore * total);
        if (shouldUpdateBest) {
            bestScore = score;
            bestTotal = total;
        }

        prefs.edit()
                .putInt(attemptsKey(chapter), attempts)
                .putInt(totalCorrectKey(chapter), totalCorrect)
                .putInt(totalQuestionsKey(chapter), totalQuestions)
                .putInt(bestScoreKey(chapter), bestScore)
                .putInt(bestTotalKey(chapter), bestTotal)
                .apply();
    }

    public static ChapterStats getStats(Context context, int chapter) {
        SharedPreferences prefs = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);

        int attempts = prefs.getInt(attemptsKey(chapter), 0);
        int totalCorrect = prefs.getInt(totalCorrectKey(chapter), 0);
        int totalQuestions = prefs.getInt(totalQuestionsKey(chapter), 0);
        int bestScore = prefs.getInt(bestScoreKey(chapter), 0);
        int bestTotal = prefs.getInt(bestTotalKey(chapter), 0);

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
