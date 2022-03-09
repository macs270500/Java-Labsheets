package com.company;

import java.io.FileNotFoundException;
import java.util.Formatter;

public class InputFileEx {
    public static void write() {
        try {
            String empid = "B0001";
            float salary = 10000;
            String empid2 = "B0002";
            float salary2 = 20000;

            Formatter outfile = new Formatter("Client\\Client.txt");
            outfile.format("%10s tax %s\n","Employee ID","Salary");
            outfile.format("%-11s tax %6.2f\n", empid, salary);
            outfile.format("%-11s tax %6.2f\n", empid2, salary2);
            outfile.close( );
        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found");
        } catch (SecurityException se) {
            System.out.println("No permission");
        }
    }
}
