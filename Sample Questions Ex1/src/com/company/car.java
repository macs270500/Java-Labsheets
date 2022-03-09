package com.company;

public class car extends vehicle {
    private String type = "Car";

    public String getType(){return this.type;}

    public  car(String make, String model, int year){
        this.vehicle(make,model,year);
    }
    public void displayDetails(){
        System.out.println("Type:"+getType());
        super.displayDetails();
    }
}
