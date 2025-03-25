package com.interviewer_scheduler.interviewer_scheduler.Repository;

import com.interviewer_scheduler.interviewer_scheduler.Model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    List<Schedule> findByInterviewerName(String interviewerName);
}
