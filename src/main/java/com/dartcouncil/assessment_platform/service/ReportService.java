package com.dartcouncil.assessment_platform.service;

import com.dartcouncil.assessment_platform.entity.Report;
import com.dartcouncil.assessment_platform.entity.User;
import com.dartcouncil.assessment_platform.repository.ReportRepo;
import com.dartcouncil.assessment_platform.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReportService {

    @Autowired
    private ReportRepo reportRepo;
    @Autowired
    private UserRepo userRepo;

    public User registerUser(User user) {
        return userRepo.save(user);
    }

    public Optional<Report> getReport(Long userId) {
        return reportRepo.findById( userId);
    }

}
