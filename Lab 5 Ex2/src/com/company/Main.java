package com.company;
public class Main {

    public static void main(String[] args) {
        Semester semester = new Semester();
        semester.Semester("SIS2024Y","MACS",85,80);
        Yearly yearly = new Yearly();
        yearly.Yearly("SIS2025Y","SSD",85,80,84,88);
        semester.displayDetails();
        System.out.println();
        yearly.displayDetails();
    }
}
