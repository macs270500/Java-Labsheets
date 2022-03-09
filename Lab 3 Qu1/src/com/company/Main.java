package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter numbers to compare:");
        System.out.print("Num 1:");
        Scanner userInput = new Scanner(System.in);
        int num1 = userInput.nextInt();
        System.out.print("Num 2:");
        int num2 = userInput.nextInt();
        if (num1>num2){
            System.out.println(num1+" is greater than "+num2);
        }
        else{
            System.out.println(num2+" is greater than "+num1);
        }
    }
}
