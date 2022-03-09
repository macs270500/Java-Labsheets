package com.company;

public class Worker {
    private static int EID;
    private static String Name;

    public int getEID(){return this.EID;}
    public String getName(){return this.Name;}

    private void setEID(int ID){this.EID = ID;}
    private void setName(String Name){this.Name = Name;}

    public Worker(int ID, String Name){
        setEID(ID);
        setName(Name);
    }

    public void displayDetails(){
        System.out.println("Employee ID: "+getEID());
        System.out.println();getName();
    }

}
