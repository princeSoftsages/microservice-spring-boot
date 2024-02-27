package com.princejasakiya.quizservice.services;

import com.princejasakiya.quizservice.entities.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "QUESTION-SERVICE")
public interface QuestionClient {
    @GetMapping(path = "/question/get/quiz/id/{quizId}")
    List<Question> getQuestionOfQuiz(@PathVariable("quizId") Long id);
}
