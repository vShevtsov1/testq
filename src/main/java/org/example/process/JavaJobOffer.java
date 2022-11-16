package org.example.process;

import org.example.annotations.Component;
import org.example.entities.candidate;
import org.example.interfaces.jobOffer;

import java.util.Random;

@Component
public class JavaJobOffer implements jobOffer {
    @Override
    public void jobOffer(candidate candidate) {
        Random random = new Random();
        if( random.nextBoolean()){
            System.out.println(String.format("Candidate %s %s had received a job offer",candidate.getName(),candidate.getSurname()));
        }
        else {
            System.out.println(String.format("Candidate %s %s hadn’t receive a  job offer",candidate.getName(),candidate.getSurname()));

        }
    }
}
