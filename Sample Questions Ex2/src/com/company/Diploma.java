package com.company;

public class Diploma extends Award {
    private static int diplomaProject;

    public int getDiplomaProject() {return this.diplomaProject;}
    private void setDiplomaProject(int marks){this.diplomaProject = marks;}

    public Diploma(int diploma,int science,int ham,int departmental){
        this.Award(science,ham,departmental);
        setDiplomaProject(diploma);
    }

    public int computeTotal(){
        return super.computeTotal()+getDiplomaProject();
    }

    public void displayMarks(){
        System.out.println("*** Diploma Award ***");
        System.out.println("Diploma Project: "+getDiplomaProject());
        super.displayMarks();
        System.out.println("TOTAL: "+computeTotal());
    }

}
