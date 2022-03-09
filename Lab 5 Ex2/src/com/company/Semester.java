package com.company;

public class Semester extends Module {
    public void Semester(String code,String name,double assignment1,double test1){
        this.Module(code, name, assignment1, test1);
    }

    public double continuousAssessment(){
    return continuousAssessment(getAssignment1(),getTest1());
    }

    public void displayDetails(){
        System.out.println("*** Semesterly modules ***");
        super.displayDetails();
        System.out.println("Continuous Assessment: "+continuousAssessment());
    }
}
