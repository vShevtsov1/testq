package org.example.process;

import org.example.annotations.Component;
import org.example.entities.candidate;
import org.example.entities.manager;
import org.example.interfaces.introduction;

@Component
public class JavaIntroduction implements introduction {

    @Override
    public void introduction(manager manager,  candidate candidate) {
        System.out.println(String.format("HR %s %s contacted and got to know with %s %s to invite for an interview",manager.getName(),manager.getSurname(),candidate.getName(),candidate.getSurname()));
    }
}
