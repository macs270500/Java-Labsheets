package com.company;

import java.text.ParseException;
import java.util.Scanner;

public class Login {
    boolean foundAccount=false;
    Administrator admin;
    WelcomePortal portal = new WelcomePortal();
    public Login() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** LOGIN ***");
        System.out.println("NOTICE:Type exit in username to exit system");
        System.out.println();
        while (!foundAccount) {
            System.out.print("Enter username: ");
            String username = sc.next();
            String password = null;
            if (username.equalsIgnoreCase("exit")) {
                System.exit(0);
            } else {
                System.out.print("Enter password: ");
                password = sc.next();
            }
            admin = new Administrator();
            //Checks if user and password exists
            if (username.equals(admin.staff.getStaffUserName()) && password.equals(admin.staff.getPassword())) {
                System.out.println("Login successful!");
                portal.displayWelcomePortal();
                foundAccount = true;
            } else {
                System.out.println("No such account found!");
            }
        }
    }
}
