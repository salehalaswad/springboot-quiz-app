package com.alaswad.quizapp;

import com.alaswad.quizapp.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/api")
public class AppController {


    @Autowired
    private CustomRepository questionRepository;

    @PostMapping("/")
    public void add(
            @RequestBody Map<String, Map<String, String>> request
    ) {
        Options options = new Options(
                request.get("options").get("first"),
                request.get("options").get("second"),
                request.get("options").get("third")
        );
        Question question = new Question(request.get("question").get("text"), options);
        Answer answer = new Answer(question, options, request.get("answer").get("rOption"));
        questionRepository.save(question);
    }

    @SuppressWarnings("OptionalGetWithoutIsPresent") // nur zum Testen
    @GetMapping("/question/{id}")
    public Question getRandomQuestion(@PathVariable Integer id) {
        return questionRepository.findById(id).get();
    }


}
