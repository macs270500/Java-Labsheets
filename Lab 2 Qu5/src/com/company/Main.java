package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the amount in $:");
        Scanner userInput = new Scanner(System.in);
        double currency = userInput.nextDouble();
        double convertedCurrency = currency*39.74;
        String converted = String.format("%.2f",convertedCurrency);
        System.out.print("The amount is:Rs " + converted);
    }
}
