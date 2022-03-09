package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HSC_Student {

    public static void main(String[] args) throws FileNotFoundException {
        InputFile.write();
        ReadFile.read();
        Scanner infile1 = new Scanner(new File("passedInAllModules.txt"));

        System.out.println("Students that passed in all modules");
        System.out.println("Last-Name First-Name Gender Telephone Number Average");
        infile1.nextLine();
        while (infile1.hasNext()) {
            String[] split = infile1.nextLine().split(",");
            System.out.println(split[0] + " " + split[1] + " " + split[2] + " " + split[3]+" "+split[4]);
        }
        System.out.println("\n");
        Scanner infile2 = new Scanner(new File("passedInSomeModules.txt"));
        System.out.println("Students that passed in some modules");
        System.out.println("Last-Name First-Name Gender NumberOfPassedModules");
        infile2.nextLine();
        while(infile2.hasNext()){
            String[] split = infile2.nextLine().split(",");
            System.out.println(split[0]+" "+split[1]+" "+split[2]+" "+split[3]);
        }
    }
}