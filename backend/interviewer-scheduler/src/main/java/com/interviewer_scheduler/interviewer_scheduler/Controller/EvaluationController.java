package com.interviewer_scheduler.interviewer_scheduler.Controller;


import com.interviewer_scheduler.interviewer_scheduler.Model.EvaluationModel;
import com.interviewer_scheduler.interviewer_scheduler.Model.EvaluationParameter;
import com.interviewer_scheduler.interviewer_scheduler.Service.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/evaluations")
public class EvaluationController {

    @Autowired
    private EvaluationService evaluationService;

    @PostMapping
    public EvaluationModel createEvaluation(@RequestBody EvaluationModel evaluation) {
        return evaluationService.createEvaluation(evaluation);
    }

    @GetMapping
    public List<EvaluationModel> getAllEvaluations() {
        return evaluationService.getAllEvaluations();
    }
}