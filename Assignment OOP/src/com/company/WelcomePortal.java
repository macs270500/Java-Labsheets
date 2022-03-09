package com.company;

import java.text.ParseException;
import java.util.Scanner;

public class WelcomePortal {
    Administrator admin = new Administrator();
    //Displays all options available after logging in
    public WelcomePortal() throws ParseException {

    }
    public void displayWelcomePortal(){
        System.out.println("-------------------------------");
        System.out.printf("Welcome back %s!\n",admin.staff.getStaffUserName());
        System.out.println("-------------------------------");
        System.out.println("Choose an option to continue...");
        System.out.println("-------------------------------");
        System.out.println("1. Check room availability");
        System.out.println("2. Book room");
        System.out.println("3. Register client");
        System.out.println("4. Additional packages");
        System.out.println("5. Calculate payment");
        System.out.println("0. Exit");
        System.out.println("-------------------------------");


        Scanner sc= new Scanner(System.in);
        System.out.print("Enter option:");
        int option = sc.nextInt();

        switch (option){
            case 0:
                System.exit(0);
                break;

            default:
                System.out.println("Invalid option...!");
                displayWelcomePortal();
                break;
        }

    }
}
