package com.company;

import java.util.Scanner;

public class Main {
    private static double Sum(double num1,double num2){
        return num1+num2;
    }
    private static double Subs(double num1,double num2){
        return num1-num2;
    }
    private static double Mul(double num1,double num2){
        return num1*num2;
    }
    private static double Div(double num1,double num2){
        return num1/num2;
    }
    public static void main(String[] args) {
        System.out.print("Enter num1:");
        Scanner userInput = new Scanner(System.in);
        double num1 = userInput.nextDouble();
        System.out.print("Enter num2:");
        double num2 = userInput.nextDouble();
        System.out.println("\n***Calculation***");
        System.out.println("Addition = "+Sum(num1,num2));
        System.out.println("Subtraction = "+Subs(num1,num2));
        System.out.println("Multiplication = "+Mul(num1,num2));
        System.out.println("Division = "+Div(num1,num2));
    }
}
