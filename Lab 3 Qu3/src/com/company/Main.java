package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a sentence to find its length");
        Scanner userInput = new Scanner(System.in);
        int txtL=Length(userInput.nextLine());
        System.out.println("The length is :"+txtL);
    }
    public static int Length(String Text){
        int length = Text.length();
        return length;
    }
}
