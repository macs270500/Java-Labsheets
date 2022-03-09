package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //area of circle
        System.out.print("Enter the radius of the circle to calculate its area:");
        Scanner userInput = new Scanner(System.in);
        Double radius = userInput.nextDouble();
        Double area = Math.PI * (radius*radius);
        System.out.println("The area of the circle is:"+area);

        //earth temperature
        System.out.print("Enter the depth of the earth where the temperature is to be calculated:");
        double Depth = userInput.nextDouble();
        double celsius = 10*Depth+20;
        double fahrenheit = 1.8*celsius+32;
        System.out.println("The temperature in Celsius is "+celsius);
        System.out.println("The temperature in Fahrenheit is "+fahrenheit);

        //To compute the total surface area of a closed cylinder
        System.out.print("Enter the radius of the cylinder:");
        radius = userInput.nextDouble();
        System.out.print("Enter the height of the cylinder:");
        double height = userInput.nextDouble();
        double volume = (Math.PI * radius * radius) * height;
        double TSA = 2 * (Math.PI * radius * radius) + (2 * Math.PI * radius * height);
        System.out.println("The volume of the cylinder is: "+volume);
        System.out.println("The total surface area of the cylinder is: "+TSA);

        //To calculate the sum and average of 4 numbers
        System.out.println("Enter 4 numbers to calculate its sum and average");
        double[] numbers = new double[4];
        double sum =0;
        double average = 0;
        for(int i=0 ; i<4 ; i++){
            System.out.print("Enter num "+(i+1)+":");
            numbers[i] = userInput.nextDouble();
        }
        for(int j=0 ; j<4 ; j++){
            sum += numbers[j];
        }
        average = sum/4;
        System.out.println("The sum is: "+sum);
        System.out.println("The average is: "+average);

        //
    }
}
