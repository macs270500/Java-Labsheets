package com.company;

public class Car {
    private int year;
    private double costPrice, sellingPrice;
    private String plateNumber,make;

    public String getPlateNo(){return this.plateNumber;}
    public String getMake(){return this.make;}
    public int getYear(){return this.year;}
    public double getCostPrice(){
        return this.costPrice;
    }
    public double getSellingPrice(){return this.sellingPrice;}

    public void setSellingPrice(double sellingPrice){
        this.sellingPrice = sellingPrice;
    }
    public void setVariables(String plateNumber, int year, double costPrice, String make){
        this.plateNumber = plateNumber;
        this.year = year;
        this.costPrice = costPrice;
        this.make = make;
    }
    public void displayCarDetails(){
        System.out.println("Plate number : "+this.getPlateNo());
        System.out.println("Year : "+this.getYear());
        System.out.println("Make : "+this.getMake());
        System.out.println("Cost price : "+this.getCostPrice());
    }
}
