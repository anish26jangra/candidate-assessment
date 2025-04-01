package com.dartcouncil.assessment_platform.controller;

import com.dartcouncil.assessment_platform.entity.Question;
import com.dartcouncil.assessment_platform.entity.User;
import com.dartcouncil.assessment_platform.repository.UserRepo;
import com.dartcouncil.assessment_platform.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class CandidateController {
    @Autowired
    private CandidateService candidateService;

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/quiz")
    public ResponseEntity<List<Question>> getQuiz() {
        return ResponseEntity.ok(candidateService.getQuiz());
    }

    @PostMapping("/submit/{userId}")
    public ResponseEntity<Integer> submitAnswers(@RequestBody Map<Long, String> answers, @PathVariable Long userId) {
        User user = userRepo.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        return ResponseEntity.ok(candidateService.submitAnswers(answers, user));
    }
}
