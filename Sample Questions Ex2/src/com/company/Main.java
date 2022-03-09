package com.company;

public class Main {

    public static void main(String[] args) {
        Diploma diploma = new Diploma(6,3,6,48);
        diploma.displayMarks();
        System.out.println();
        Degree degree = new Degree(6,3,6,90);
        degree.displayMarks();
    }
}
