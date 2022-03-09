package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class ReadFile {
    public static void read(){
    try{
        Scanner infile = new Scanner(new File("student.txt"));
        Formatter outfile1 = new Formatter("passedInSomeModules.txt");
        Formatter outfile2 = new Formatter("passedInAllModules.txt");
        outfile1.format("%s,%10s,%s,%10s\n","Last Name","First Name","Gender","Number of Modules Passed");
        outfile2.format("%s,%10s,%s,%15s,%s\n","Last Name","First Name","Gender","Telephone Number","Average");
        while(infile.hasNext()){
        String[] split = infile.nextLine().split(" ");
//System.out.println(split[0]+" "+split[1]+" "+split[2]+" "+split[3]+" "+split[4]+" "+split[5]+" "+split[6]);
            int counter = 0;
            if(Integer.parseInt(split[3])<40||Integer.parseInt(split[4])<40||Integer.parseInt(split[5])<40){
                if(Integer.parseInt(split[3])>=40){
                    counter++;
                }
                if(Integer.parseInt(split[4])>=40){
                    counter++;
                }
                if(Integer.parseInt(split[5])>=40){
                    counter++;
                }
                outfile1.format("%s,%11s,%7s,%13d\n", split[0],split[1],split[2],counter);
            }
            else{
            int average = (Integer.parseInt(split[3])+Integer.parseInt(split[4])+Integer.parseInt(split[5]))/3;
//System.out.println(average);
            outfile2.format("%s,%11s,%7s,%13s,%10d\n",split[0],split[1],split[2],split[6],average);
            }
        }
        outfile1.close();
        outfile2.close();
    }catch(FileNotFoundException fnfe){
        System.out.println("File Not Found");
    }
    }
}
