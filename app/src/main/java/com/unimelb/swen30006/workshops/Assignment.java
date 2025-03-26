package com.unimelb.swen30006.workshops;

import org.checkerframework.checker.units.qual.A;

import java.util.*;

public class Assignment {
    String description = "this is assignment 1 instructions";
    int maxAttempts = 3;
    String name = "SMD ass 1";
    List<Submission> allSubmissions = new ArrayList<>();
    SampleValidator sv = new SampleValidator();

    public List<Submission> validSubmissions(){
        List<Submission> valids = new ArrayList<>();
        for (Submission s: this.allSubmissions){
            if (sv.validateSubmission(s)==null){
                valids.add(s);
            }
        }
        return valids;
    }

}
