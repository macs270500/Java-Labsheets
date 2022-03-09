package com.company;

public class Interest {
    public static void main(String[] args){
        double rate, principal,interest;
        principal = 17000;
        rate = 0.027;

        interest = principal*rate;
        principal = principal + interest;
        System.out.print("The interest earned is $");
        System.out.println(interest);
        System.out.print("The investment after one year is $");
        System.out.println(principal);
    }
}
