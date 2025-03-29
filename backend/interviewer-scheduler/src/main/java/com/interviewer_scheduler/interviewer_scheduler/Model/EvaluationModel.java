package com.interviewer_scheduler.interviewer_scheduler.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "evaluation")
public class EvaluationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String interviewerEmail;

    @Column(nullable = false)
    private String intervieweeName;

    // type of evaluation

    @Column(nullable = false)
    private String intervieweeEmail;

    @Column(nullable = false)
    private LocalDateTime interviewTime;

    private String comment; // remove
    private String finalDecision;

    @OneToMany(mappedBy = "evaluation", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference // Prevents infinite recursion
    private List<EvaluationParameter> parameters = new ArrayList<>();

    public EvaluationModel() {}

    public EvaluationModel(String interviewerEmail, String intervieweeName, String intervieweeEmail, LocalDateTime interviewTime, String comment, String finalDecision, List<EvaluationParameter> parameters) {
        this.interviewerEmail = interviewerEmail;
        this.intervieweeName = intervieweeName;
        this.intervieweeEmail = intervieweeEmail;
        this.interviewTime = interviewTime;
        this.comment = comment;
        this.finalDecision = finalDecision;
        this.parameters = parameters != null ? parameters : new ArrayList<>();
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getInterviewerEmail() { return interviewerEmail; }
    public void setInterviewerEmail(String interviewerEmail) { this.interviewerEmail = interviewerEmail; }

    public String getIntervieweeName() { return intervieweeName; }
    public void setIntervieweeName(String intervieweeName) { this.intervieweeName = intervieweeName; }

    public String getIntervieweeEmail() { return intervieweeEmail; }
    public void setIntervieweeEmail(String intervieweeEmail) { this.intervieweeEmail = intervieweeEmail; }

    public LocalDateTime getInterviewTime() { return interviewTime; }
    public void setInterviewTime(LocalDateTime interviewTime) { this.interviewTime = interviewTime; }

    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }

    public String getFinalDecision() { return finalDecision; }
    public void setFinalDecision(String finalDecision) { this.finalDecision = finalDecision; }

    public List<EvaluationParameter> getParameters() { return parameters; }
    public void setParameters(List<EvaluationParameter> parameters) {
        this.parameters = parameters != null ? parameters : new ArrayList<>();
    }
}
