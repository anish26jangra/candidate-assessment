package com.dartcouncil.assessment_platform.repository;

import com.dartcouncil.assessment_platform.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepo extends JpaRepository<Question , Long> {
}
