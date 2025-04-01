package com.dartcouncil.assessment_platform.service;

import com.dartcouncil.assessment_platform.entity.Question;
import com.dartcouncil.assessment_platform.entity.Report;
import com.dartcouncil.assessment_platform.entity.User;
import com.dartcouncil.assessment_platform.repository.QuestionRepo;
import com.dartcouncil.assessment_platform.repository.ReportRepo;
import com.dartcouncil.assessment_platform.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CandidateService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private QuestionRepo questionRepo;
    @Autowired
    private ReportRepo reportRepo;

    public List<Question> getQuiz() {
        List<Question> allQuestions = questionRepo.findAll();
        Collections.shuffle(allQuestions);
        return allQuestions.stream().limit(5).collect(Collectors.toList());
    }

    public int submitAnswers(Map<Long, String> answers, User user) {
        int score = 0;
        for (Long questionId : answers.keySet()) {
            Question question = questionRepo.findById(questionId).orElse(null);
            if (question != null && question.getCorrectAnswer().equals(answers.get(questionId))) {
                score++;
            }
        }
        Report report = new Report();
        report.setUser(user);
        report.setScore(score);
        report.setSubmittedAt(LocalDateTime.now());
        reportRepo.save(report);
        return score;
    }

}
