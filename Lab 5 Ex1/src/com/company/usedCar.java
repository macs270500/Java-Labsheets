package com.company;

public class usedCar extends Car {
    private String previousOwner;
    private final double dealerProfit = 10000;
    public void setPreviousOwner(String previousOwner) {this.previousOwner = previousOwner;}
    public String getPreviousOwner(){return this.previousOwner;}
    public double computeSellPrice(){
        return this.dealerProfit+this.getCostPrice();
    }
    public void displayCarDetails(){
        this.setSellingPrice(this.computeSellPrice());
        System.out.println("*** Used Car ***");
        System.out.println("Owner : "+this.getPreviousOwner());
        super.displayCarDetails();
        System.out.println("Selling price : "+this.getSellingPrice());
    }

}
