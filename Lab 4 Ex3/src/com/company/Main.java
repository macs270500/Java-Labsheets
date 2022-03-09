package com.company;

public class Main {

    public static void main(String[] args) {
        try{
        int[] myNumbers = {1, 2, 3};
        System.out.println(myNumbers[10]);
        }
        catch(ArrayIndexOutOfBoundsException AE){
            System.out.println("Something went wrong.");
        }
        System.out.println("The 'try catch' is finished");
    }
}
