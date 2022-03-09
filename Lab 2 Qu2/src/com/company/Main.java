package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int maximum = 0;
        System.out.println("Enter 3 numbers");
        System.out.print("Num1:");
        Scanner userInput = new Scanner(System.in);
        numbers[0]=userInput.nextInt();
        System.out.print("Num2:");
        numbers[1]=userInput.nextInt();
        System.out.print("Num3:");
        numbers[2]=userInput.nextInt();
        for(int i=0;i<2;i++){
            if(numbers[i]>numbers[i+1]){
                maximum = numbers[i];
            }
            else{
                maximum = numbers[i+1];
            }
        }
        System.out.println(maximum);
    }
}
