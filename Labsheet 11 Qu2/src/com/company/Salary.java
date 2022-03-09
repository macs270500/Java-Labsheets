package com.company;

import java.io.*;
import java.util.*;

//Employee Class

class Employee {
    String name, surname,gender;
    double salary;
//user defined data type
    public Employee(String name,String surname,String gender,double salary) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.salary = salary;
    }
}

//salaryCompare Class to compare the salaries

class salaryCompare implements Comparator<Employee> {
    @Override
    //this - other (ascending) example...
    /*
    public int compare(Employee s1, Employee s2) {
        return (int) (s1.salary - s2.salary);
    }*/
    //other - this (descending) example...
    public int compare(Employee s1, Employee s2) {
        return (int) (s2.salary - s1.salary);
    }
}

public class Salary {
    public static void calcSalary() {
        try {
            //Reads data from the file Employees.txt
            Scanner infile = new Scanner(new File("Employees.txt"));
            //Creates a file to store the calculated salary
            Formatter outfile = new Formatter("TotalSalary.txt");

            double Salary;
            //while has data in next line, proceed
            while (infile.hasNext()) {
                // splits the data into arrays using space as delimiters
                String[] split = infile.nextLine().split(" ");
                //determines if employee is paid hourly or monthly
                if (split.length == 6) {
                    if (split[3] == "officer") {//determines position of employee
                        //Calculates the salary with the bonus of an officer
                        Salary = Float.parseFloat(split[5]) + (0.2 * Float.parseFloat(split[5]));
                    } else {
                        //Calculates the salary with the bonus of a senior or higher
                        Salary = Float.parseFloat(split[5]) + (0.15 * Float.parseFloat(split[5]));//
                    }
                } else {
                    double hourly = Float.parseFloat(split[5]) * Float.parseFloat(split[6]);
                    if (split[3] == "officer") {
                        //Calculates the salary with the bonus of an officer
                        Salary = hourly + (0.2 * hourly);
                    } else {
                        //Calculates the salary with the bonus of a senior or higher
                        Salary = hourly + (0.15 * hourly);
                    }

                }
                //Writes the data into the file TotalSalary.txt
                outfile.format("%s %s %1s %6.2f\n", split[0], split[1], split[2], Salary);
            }
            //closes the file
            outfile.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("File Not Found");
        }
    }

    //sorts the salary in decreasing order
    public static void sortSalary() throws IOException {
            //Creating BufferedReader object to read the input text file

            BufferedReader reader = new BufferedReader(new FileReader("TotalSalary.txt"));

            //Creating ArrayList to hold Employee objects

            ArrayList<Employee> employeeRecords = new ArrayList<>();

            //Reading Employee records one by one

            String currentLine = reader.readLine();

            while (currentLine != null) {
                String[] employeeDetail = currentLine.split(" ");

                String name = employeeDetail[0];
                String surname = employeeDetail[1];
                String gender = employeeDetail[2];
                double salary = Double.parseDouble(employeeDetail[3]);

                //Creating Employee object for every employee record and adding it to ArrayList

                employeeRecords.add(new Employee(name,surname, gender,salary));

                currentLine = reader.readLine();
            }

            //Sorting ArrayList employeeRecords based on marks

            employeeRecords.sort(new salaryCompare());

            //Creating BufferedWriter object to write into output text file

            BufferedWriter writer = new BufferedWriter(new FileWriter("SortedSalary.txt"));

            //Writing every employeeRecords into output text file

            for (Employee employee : employeeRecords) {
                writer.write(employee.name);
                writer.write(" " + employee.surname);
                writer.write(" " + employee.gender);
                writer.write(" " + employee.salary);

                writer.newLine();
            }

            //Closing the resources

            reader.close();

            writer.close();
        }
    }


/*
For hourly rate employee the salary is basic salary * hourly rate
If rank is officer, bonus is 20%
If rank is senior or above, bonus is 15%
TotalSalary.txt should have:
*FirstName
*Surname
*Gender
*TotalSalary+Bonus
*/
