package com.dartcouncil.assessment_platform.repository;

import com.dartcouncil.assessment_platform.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReportRepo extends JpaRepository<Report, Long> {

}
