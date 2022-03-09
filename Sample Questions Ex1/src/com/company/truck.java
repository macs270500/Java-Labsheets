package com.company;

public class truck extends vehicle{
    private String type="Truck";
    private static double load;

    public String getType(){return this.type;}
    private void setLoad(double load){this.load=load;}
    public double getLoad(){return this.load;}

    public truck(String make,String model,int year,double load){
        this.vehicle(make,model,year);
        setLoad(load);
    }

    public void displayDetails(){
        System.out.println("Type:"+getType());
        super.displayDetails();
        System.out.println("Load:"+getLoad());
    }
}
