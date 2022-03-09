package com.company;

public class vehicle {
    private static String make,model;
    private static int year;

    public String getMake(){return this.make;}
    private void setMake(String make){this.make=make;}
    public String getModel(){return this.model;}
    private void setModel(String model){this.model=model;}
    public int getYear(){return this.year;}
    private void setYear(int year){this.year=year;}

    public void vehicle(String make,String model,int year){
        setMake(make);
        setModel(model);
        setYear(year);
    }
    public void displayDetails(){
        System.out.println("Make:"+getMake());
        System.out.println("Model:"+getModel());
        System.out.println("Year:"+getYear());
    }
}
