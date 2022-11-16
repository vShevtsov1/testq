package org.example.process;


import org.example.annotations.Component;
import org.example.interfaces.interview;

@Component
public class JavaInterview implements interview {
    @Override
    public void interview() {
        System.out.println("Detailed introduction to the candidates skills and company principals");
    }
}
