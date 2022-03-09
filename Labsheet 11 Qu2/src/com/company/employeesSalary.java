package com.company;

import java.io.IOException;

public class employeesSalary {

    public static void main(String[] args) throws IOException {
        InputFile.write();//Writes the preset data to the file
        Salary.calcSalary();/*Reads the preset data,
        calculates the salary+bonus and
        saves it into another file.*/
        Salary.sortSalary();//Sorts the salary by descending order
    }
}
