package com.company;

public class newCar extends Car{
    private final double salesTax=50000;

    public double computeSellPrice(){
        return this.getCostPrice()+salesTax;
    }

    public void displayCarDetails(){
        this.setSellingPrice(computeSellPrice());
        System.out.println("*** New Car ***");
        super.displayCarDetails();
        System.out.println("Selling price : "+this.getSellingPrice());
    }
}
