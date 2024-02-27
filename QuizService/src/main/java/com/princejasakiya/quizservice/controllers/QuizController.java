package com.princejasakiya.quizservice.controllers;

import com.princejasakiya.quizservice.entities.Quiz;
import com.princejasakiya.quizservice.services.impl.QuizServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/quiz")
public class QuizController {

    private QuizServiceImpl quizServiceImpl;

    public QuizController(QuizServiceImpl quizServiceImpl) {
        this.quizServiceImpl = quizServiceImpl;
    }

    @PostMapping(path = "/add",produces = "application/json")
    public Quiz createQuiz(@RequestBody Quiz quiz){
        return quizServiceImpl.add(quiz);
    }

    @GetMapping(path = "/get/All",produces = "application/json")
    public List<Quiz> getQuizes(){
        return quizServiceImpl.getAll();
    }

    @GetMapping(path = "/get/id/{id}")
    public Quiz getQuiz(@PathVariable("id") Long id){
        return quizServiceImpl.get(id);
    }
}
