package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try {
            int a, b, result;
            Scanner input = new Scanner(System.in);
            System.out.println("Input two integers");
            a = input.nextInt();
            b = input.nextInt();
            result = a / b;
            System.out.println("Result = " + result);
        }
        catch (ArithmeticException AE){
            System.out.println(AE);
        }
        catch (InputMismatchException IME){
            System.out.println(IME);
        }
    }
}
