package org.example.process;

import org.example.annotations.Component;
import org.example.interfaces.technicalInterview;

@Component
public class JavaTechnicalInterview implements technicalInterview {
    @Override
    public void technicalInterview() {
        System.out.println("Verification of candidate’s knowledge of technical terms and principles of work");
    }
}
