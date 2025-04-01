package com.dartcouncil.assessment_platform.controller;

import com.dartcouncil.assessment_platform.entity.User;
import com.dartcouncil.assessment_platform.entity.Question;
import com.dartcouncil.assessment_platform.entity.Report;
import com.dartcouncil.assessment_platform.repository.UserRepo;
import com.dartcouncil.assessment_platform.repository.QuestionRepo;
import com.dartcouncil.assessment_platform.repository.ReportRepo;
import com.dartcouncil.assessment_platform.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/quiz")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        return ResponseEntity.ok(reportService.registerUser(user));
    }

    @GetMapping("/{userId}")
    public ResponseEntity<?> getReport(@PathVariable Long userId) {
        return ResponseEntity.ok(reportService.getReport(userId));
    }




}
