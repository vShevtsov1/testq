package org.example.process;

import org.example.annotations.Autowired;
import org.example.annotations.Component;
import org.example.entities.candidate;
import org.example.interfaces.choosingCandidate;
import org.example.interfaces.prepareAndStart;

import java.util.List;
import java.util.Random;
@Component
public class JavaChoosingCandidate implements choosingCandidate {
    @Autowired
    private prepareAndStart prepareAndStart;
    @Override
    public candidate chooseCandidate() {
        List<candidate>candidates = prepareAndStart.onStart();
        Random rand = new Random();
        candidate  candidate = candidates.get(rand.nextInt(candidates.size()));
        System.out.println("Selected candidate is"+candidate);
        return candidate;
    }
}
