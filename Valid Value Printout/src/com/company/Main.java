package com.company;

import java.util.*;

public class Main {
    public static List<Integer> entries = new ArrayList<Integer>();
    public static int entry;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter  an integer from 1 tp 100 (0 to quit):");
        entry = sc.nextInt();
        while (entry != 0){
            number(entry);
            prompt();
        }

        if(entry == 0){
                entries.forEach(entry->{
                    System.out.println("Entries are: "+entry);
                });
            }


    }
    public static void number(int entry){
        if(entry>0 && entry<=100){
            entries.add(entry);
            System.out.println("Entry "+entry+" is accepted");
        }
        else {
            System.out.println("Invalid Entry");
        }
    }
    public static void prompt(){
        System.out.print("Enter  an integer from 1 tp 100 (0 to quit):");
        entry = sc.nextInt();
    }
}
