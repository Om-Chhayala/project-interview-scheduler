package com.interviewer_scheduler.interviewer_scheduler.Service;


import com.interviewer_scheduler.interviewer_scheduler.Model.EvaluationModel;
import com.interviewer_scheduler.interviewer_scheduler.Model.EvaluationParameter;
import com.interviewer_scheduler.interviewer_scheduler.Repository.EvaluationParameterRepository;
import com.interviewer_scheduler.interviewer_scheduler.Repository.EvaluationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvaluationService {

    @Autowired
    private EvaluationRepository evaluationRepository;

    @Autowired
    private EvaluationParameterRepository parameterRepository;

    public EvaluationModel createEvaluation(EvaluationModel evaluation) {
        if (evaluation.getParameters() != null) {
            for (EvaluationParameter param : evaluation.getParameters()) {
                param.setEvaluation(evaluation);
            }
        }
        return evaluationRepository.save(evaluation);
    }

    public List<EvaluationModel> getAllEvaluations() {
        return evaluationRepository.findAll();
    }
}