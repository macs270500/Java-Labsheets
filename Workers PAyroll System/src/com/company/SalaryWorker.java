package com.company;

public class SalaryWorker extends Worker {
    private static int Salary;

    private int getSalary(){return this.Salary;}
    public void setSalary(int Salary){this.Salary = Salary;}

    public SalaryWorker(int ID, String Name,int Salary) {
        super(ID,Name);
        setSalary(Salary);
    }

    public void displayDetails(){
        super.displayDetails();
        getSalary();
    }
}
