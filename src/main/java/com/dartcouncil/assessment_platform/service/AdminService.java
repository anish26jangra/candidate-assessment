package com.dartcouncil.assessment_platform.service;

import com.dartcouncil.assessment_platform.entity.Question;
import com.dartcouncil.assessment_platform.repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private QuestionRepo questionRepo;

    public Question addQuestion(Question question) {

        return questionRepo.save(question);
    }

    public List<Question> getAllQuestions() {

        return questionRepo.findAll();
    }
}
