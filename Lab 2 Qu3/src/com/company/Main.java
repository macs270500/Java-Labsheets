package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter student mark:");
        Scanner userInput = new Scanner(System.in);
            int marks = userInput.nextInt();
            if(marks<0 || marks>100){
                System.out.println("Invalid Mark!");
            }
            else if (marks >= 80) {
                System.out.println("A+");
            } else if (marks >= 70) {
                System.out.println("A");
            } else if (marks >= 60) {
                System.out.println("B");
            } else if (marks >= 50) {
                System.out.println("C");
            } else if (marks >= 40) {
                System.out.println("D");
            } else {
                System.out.println("FAIL");
            }
        }
    }

