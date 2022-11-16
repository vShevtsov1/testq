package org.example;

import org.example.annotations.Autowired;
import org.example.annotations.Component;
import org.example.annotations.Qualifier;
import org.example.entities.candidate;
import org.example.entities.manager;
import org.example.interfaces.*;
import org.example.process.*;

import java.util.List;

@Component
public class selectionProcess {

    @Autowired
    @Qualifier(value = "choosingCandidate")
    private choosingCandidate choosingCandidate;
    @Autowired
    @Qualifier(value = "introduction")
    private introduction introduction;
    @Autowired
    @Qualifier(value = "interview")
    private interview interview;
    @Autowired
    @Qualifier(value = "technicalInterview")
    private technicalInterview technicalInterview;
    @Autowired
    @Qualifier(value = "jobOffer")
    private jobOffer jobOffer;
    public void process() {
        candidate candidate = choosingCandidate.chooseCandidate();
        manager manager = new manager("testName","testSurname","test");
        introduction.introduction(manager,candidate);
        interview.interview();
        technicalInterview.technicalInterview();
        jobOffer.jobOffer(candidate);
    }
}
