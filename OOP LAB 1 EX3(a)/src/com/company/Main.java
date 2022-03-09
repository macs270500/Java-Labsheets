package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter test data:");
        Scanner userInput = new Scanner(System.in);
        String testData = userInput.next();
        int index = testData.indexOf("/");
        int length = testData.length();
        int testData1 = Integer.parseInt(testData.substring(0,index));
        int testData2 = Integer.parseInt(testData.substring(index+1,length));
        int finalValue = testData1/testData2;
        System.out.println("Expected output:"+finalValue);
    }
}
