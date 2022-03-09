package com.company;

public class Employee {
    int count = 0;
    String name;
    String department;

    Employee() {
        count++;
    }

     Employee(String name, String dept) {
        this.name = name;
        this.department = dept;
        count++;
    }
}
