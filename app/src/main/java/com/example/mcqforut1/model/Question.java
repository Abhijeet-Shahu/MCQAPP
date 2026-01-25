package com.example.mcqforut1.model;

public class Question {
    public String questions;
    public String[] options;
    public int correctanswers;

    public Question(String questions, String[] options, int correctanswers ) {
        this.correctanswers = correctanswers;
        this.options = options;
        this.questions = questions;
    }

}
