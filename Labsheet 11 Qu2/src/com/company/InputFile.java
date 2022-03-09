package com.company;

import java.io.FileNotFoundException;
import java.util.Formatter;

public class InputFile {
    public static void write() {
        try {
            //Creates the file Employees.txt to store the preset data
            Formatter outfile = new Formatter("Employees.txt");
            //Writes the preset data to the file
            outfile.format("%s %1s %s %s %6.2f\n","John Smith","M","manager","monthly",45000.00);
            outfile.format("%s %1s %s %s %6.2f %d\n","Sunil Bates","M","senior","hourly",700.00,45);
            outfile.format("%s %1s %s %s %6.2f %d\n","Ezio Auditore","M","senior","hourly",1500.00,45);
            outfile.format("%s %1s %s %s %6.2f\n","Eva Leung","F","officer","monthly",30500.00);
            //closes the file
            outfile.close();
        }catch(FileNotFoundException fnfe) {
            System.out.println("File Not Found");
        }catch(SecurityException se){
            System.out.println("No Permission");
        }
    }
}
