package org.example.process;

import org.example.annotations.Component;
import org.example.entities.candidate;
import org.example.interfaces.prepareAndStart;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
@Component
public class JavaPrepareAndStart implements prepareAndStart {
    @Override
    public List<candidate> onStart() {
        System.out.println("Starting selection process");
        System.out.println("Reading list of candidates");
        List<candidate> candidateList = new ArrayList<>();
        try(Scanner sc  = new Scanner(new File("users.txt"))) {
            while (sc.hasNextLine())
            {
                String[]user=sc.nextLine().split(" ");
                candidateList.add(new candidate(user[0],user[1]));
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return candidateList;
    }
}
