package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter number of seconds:");
        Scanner userInput = new Scanner(System.in);
        int timeInput = userInput.nextInt();
        int hour=0, minutes=0, seconds=0;
        boolean done = false;
        while(done == false){
            if(timeInput>=3600){
                timeInput-=3600;
                hour+=1;
            }
            else if (timeInput>=60){
                timeInput-=60;
                minutes+=1;
            }
            else{
                seconds = timeInput;
                done=true;
            }
        }
        System.out.println("The converted value is "+hour+":"+minutes+":"+seconds);
    }
}
