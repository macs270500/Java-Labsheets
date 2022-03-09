package com.company;

public class Degree extends Award{
    private static int GEM;


    public int getGEM() {return this.GEM;}

    private void setGEM(int marks){this.GEM = marks;}

    public Degree(int GEM,int science,int ham,int departmental){
        this.Award(science,ham,departmental);
        setGEM(GEM);
    }

    public int computeTotal(){
        return super.computeTotal()+getGEM();
    }

    public void displayMarks(){
        System.out.println("*** Degree Award ***");
        System.out.println("GEM: "+getGEM());
        super.displayMarks();
        System.out.println("TOTAL: "+computeTotal());
    }
}
