package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person testPerson = new Person();
        System.out.print("Enter name: ");
        Scanner sc = new Scanner(System.in);
        testPerson.setName(sc.next());
        System.out.print("Enter age: ");
        testPerson.setAge(sc.nextInt());
        System.out.println("Your name is "+testPerson.getName()+" & your age is "+testPerson.getAge());
    }
}
