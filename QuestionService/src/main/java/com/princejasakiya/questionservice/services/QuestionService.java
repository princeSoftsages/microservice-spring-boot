package com.princejasakiya.questionservice.services;

import com.princejasakiya.questionservice.entities.Question;

import java.util.List;

public interface QuestionService {
    Question createQuestion(Question question);

    List<Question> getAllQuestion();

    Question getQuestionById(Long id);

    List<Question> getQuestionOfQuiz(Long quizId);
}
