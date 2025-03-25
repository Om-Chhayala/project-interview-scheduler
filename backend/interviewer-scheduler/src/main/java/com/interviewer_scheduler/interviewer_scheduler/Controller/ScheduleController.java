package com.interviewer_scheduler.interviewer_scheduler.Controller;

import com.interviewer_scheduler.interviewer_scheduler.Model.Schedule;
import com.interviewer_scheduler.interviewer_scheduler.Service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schedules")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    @PostMapping
    public Schedule createSchedule(@RequestBody Schedule schedule) {
        return scheduleService.createSchedule(schedule);
    }

    @GetMapping
    public List<Schedule> getAllSchedules() {
        return scheduleService.getAllSchedules();
    }

    @GetMapping("/interviewer/{interviewerName}")
    public List<Schedule> getSchedulesByInterviewer(@PathVariable String interviewerName) {
        return scheduleService.getSchedulesByInterviewer(interviewerName);
    }
}
