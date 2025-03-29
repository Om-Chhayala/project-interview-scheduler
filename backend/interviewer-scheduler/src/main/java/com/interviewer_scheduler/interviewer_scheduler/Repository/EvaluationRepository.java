package com.interviewer_scheduler.interviewer_scheduler.Repository;

import com.interviewer_scheduler.interviewer_scheduler.Model.EvaluationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvaluationRepository extends JpaRepository<EvaluationModel, Long> {
}
