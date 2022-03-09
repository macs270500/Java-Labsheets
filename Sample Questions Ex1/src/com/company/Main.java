package com.company;

public class Main {

    public static void main(String[] args) {
        car car = new car("Toyota","Corolla",2015);
        car.displayDetails();
        System.out.println();
        truck truck = new truck("Ford","F150",2008,500.8);
        truck.displayDetails();
    }
}
