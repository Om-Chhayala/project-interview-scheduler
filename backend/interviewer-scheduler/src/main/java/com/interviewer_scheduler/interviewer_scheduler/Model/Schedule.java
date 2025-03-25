package com.interviewer_scheduler.interviewer_scheduler.Model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String interviewerName;
    private String intervieweeName;
    private String email;
    private String resumeLink;
    private LocalDateTime interviewDate;

    public Schedule() {
    }

    public Schedule(String interviewerName, String intervieweeName, String email, String resumeLink, LocalDateTime interviewDate) {
        this.interviewerName = interviewerName;
        this.intervieweeName = intervieweeName;
        this.email = email;
        this.resumeLink = resumeLink;
        this.interviewDate = interviewDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInterviewerName() {
        return interviewerName;
    }

    public void setInterviewerName(String interviewerName) {
        this.interviewerName = interviewerName;
    }

    public String getIntervieweeName() {
        return intervieweeName;
    }

    public void setIntervieweeName(String intervieweeName) {
        this.intervieweeName = intervieweeName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getResumeLink() {
        return resumeLink;
    }

    public void setResumeLink(String resumeLink) {
        this.resumeLink = resumeLink;
    }

    public LocalDateTime getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(LocalDateTime interviewDate) {
        this.interviewDate = interviewDate;
    }
}

