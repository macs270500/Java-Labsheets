package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the temperature to convert:");
        Scanner userInput = new Scanner(System.in);
        double celsius = userInput.nextDouble();
        double fahrenheit = (celsius*1.8)+32;
        System.out.println("The temperature in Fahrenheit is "+fahrenheit);
    }
}
