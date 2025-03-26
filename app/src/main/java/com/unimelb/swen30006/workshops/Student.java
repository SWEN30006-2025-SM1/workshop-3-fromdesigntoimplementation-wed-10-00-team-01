package com.unimelb.swen30006.workshops;

import java.util.*;

public class Student {
    String email;
    String studentID;
    List<Submission> submissions = new ArrayList<>();

    public double totalGrade( ){
        return 0.0;
    }

    public void submit(Submission sub){
        submissions.add(sub);
    }
}
