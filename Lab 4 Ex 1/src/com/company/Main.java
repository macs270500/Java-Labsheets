package com.company;
import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter your name:");
        String name = System.console().readLine();
        System.out.println("Your name is:"+name);
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter your name? ");
        String name = reader.readLine();
        System.out.println("Your name is: "+name);

        System.out.print("Please enter your age? ");
        String age = reader.readLine();
        System.out.println("Your age is: "+age);

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your favourite shape? ");
        String shape = scanner.next();
        System.out.println("Your favourite shape is: "+ shape);

        System.out.print("Enter an integer:");
        int number = scanner.nextInt();
        System.out.println("The integer is: "+number);

        int[] arr = {10,20,30,40,50};
        int i=0;
        try{
            while(i<=arr.length){
                System.out.println("arr["+i+"]="+arr[i]);
                i++;
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("End of main method");*/
    }
}
