package com.company;

public class Module {
    private String code,name;
    private double assignment1,test1;

    //Setters and getters||Accessors and Mutators
    private void setCode(String Code){this.code = Code;}
    private void setName(String Name){this.name = Name;}
    private void setAssignment1(double Assignment1){this.assignment1 = Assignment1;}
    private void setTest1(double Test1){this.test1 = Test1;}
    public String getName(){return this.name;}
    public String getCode(){return this.code;}
    public  double getAssignment1(){return this.assignment1;}
    public double getTest1(){return this.test1;}

    public void Module(String Code,String Name,double Assignment1,double Test1){
        setCode(Code);
        setName(Name);
        setAssignment1(Assignment1);
        setTest1(Test1);
    }

    public double continuousAssessment(double assignment1, double test1){
        double totalConAss = (((assignment1+test1)/200)*100);
        return totalConAss;
    }

    public void displayDetails(){
        System.out.println("Name: "+getName()+"\nCode: "+getCode()+
                "\nassignment 1: "+getAssignment1()+"\ntest 1: "+getTest1());
    }
}