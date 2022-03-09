package com.company;

public class Main {
    public static void main(String[] args) {
	newCar nCar = new newCar();
	nCar.setVariables("4271NV20",2020,1500000,"Peugeot");
	nCar.displayCarDetails();
		System.out.println();
	usedCar uCar = new usedCar();
	uCar.setPreviousOwner("Kalam(718-7936)");
	uCar.setVariables("4503ZP01",2001,300000,"BMW");
	uCar.displayCarDetails();
    }
}
