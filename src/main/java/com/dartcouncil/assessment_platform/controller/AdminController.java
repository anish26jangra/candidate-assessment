package com.dartcouncil.assessment_platform.controller;

import com.dartcouncil.assessment_platform.entity.Question;
import com.dartcouncil.assessment_platform.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/questions")
        public ResponseEntity<Question> addQuestion(@RequestBody Question question) {
        adminService.addQuestion(question);
        return new ResponseEntity<>(question , HttpStatus.CREATED);
    }

    @GetMapping("/questions")
    public ResponseEntity<List<Question>> getAllQuestions() {
        List<Question>allQues = adminService.getAllQuestions();
        if(allQues != null && !allQues.isEmpty()){
            return new ResponseEntity<>(allQues , HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
