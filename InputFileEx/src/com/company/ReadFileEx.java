package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileEx {
    public static void read(){
        try{
            Scanner infile = new Scanner(new File("Client\\Client.txt"));
            while(infile.hasNext()) {
                String empid = infile.next();
                infile.next();
                float salary = infile.nextFloat();
                System.out.println(empid +" "+ salary);
//                System.out.println(salary);
//                infile.nextLine();
            }
            infile.close();
//                empid = infile.next();
//                infile.next();
//                salary = infile.nextFloat();
//                System.out.println(empid);
//                System.out.println(salary);
        } catch (FileNotFoundException fnfe) {
            System.out.println("File Not Found");
        }
    }
}
