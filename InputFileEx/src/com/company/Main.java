package com.company;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Options:\n1.READ\n2.WRITE\n0.EXIT");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        while (option != 0) {
            options(option);
            option = sc.nextInt();
        }
    }
    public static void options(int option){
        InputFileEx write = new InputFileEx();
        ReadFileEx read = new ReadFileEx();
        if (option == 1) {
            read.read();
        } else if (option == 2) {
            write.write();
        } else if (option == 0) {
            System.exit(0);
        } else{
            System.out.println("Option not available");
        }
    }
}


