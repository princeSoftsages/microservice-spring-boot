package com.princejasakiya.quizservice.services;

import com.princejasakiya.quizservice.entities.Quiz;

import java.util.List;
import java.util.Optional;

public interface QuizService {

    Quiz add(Quiz quiz);

    List<Quiz> getAll();

    Quiz get(Long id);
}
