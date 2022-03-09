package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.print("Enter a value to convert from miles to kilometer:");
        Scanner userInput = new Scanner(System.in);
        Double Miles = userInput.nextDouble();
        Double Kilometer = Miles * 1.609;
        System.out.println("The calculated value is:"+Kilometer);
    }
}
