package com.princejasakiya.questionservice.controller;

import com.princejasakiya.questionservice.entities.Question;
import com.princejasakiya.questionservice.services.impl.QuestionServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/question")
public class QuestionController {
    private QuestionServiceImpl questionServiceImpl;

    public QuestionController(QuestionServiceImpl questionServiceImpl) {
        this.questionServiceImpl = questionServiceImpl;
    }

    @PostMapping(path = "/add",produces = "application/json")
    public Question addQuestion(@RequestBody Question question){
        return questionServiceImpl.createQuestion(question);
    }

    @GetMapping(path = "/get/all",produces = "application/json")
    public List<Question> getAllQuestion(){
        return questionServiceImpl.getAllQuestion();
    }

    @GetMapping(path = "/get/id/{id}",produces = "application/json")
    public Question getQuestionBuId(@PathVariable("id") Long id){
        return questionServiceImpl.getQuestionById(id);
    }

    @GetMapping(path = "/get/quiz/id/{quizId}",produces = "application/json")
    public List<Question> getQuestionsOfQuiz(@PathVariable("quizId") Long quizId){
        return questionServiceImpl.getQuestionOfQuiz(quizId);
    }
}
