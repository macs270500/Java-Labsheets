package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            double volume = 0, convertedVolume = 0;
            String volumeEntered;

            Fluid fluid = new Fluid( );
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Volume:");
            volume = sc.nextDouble( );

            System.out.print("Volume entered in Litres [L] or Ounce [OZ]:");
            volumeEntered = sc.next( );

            if (volumeEntered.equals("L")) {
                convertedVolume = fluid.litreToOZ(volume);
                System.out.print("The conversion of " + volume + " L is: " + convertedVolume + " OZ");
            } else {
                convertedVolume = fluid.ozToLitres(volume);
                System.out.print("The conversion of " + volume + " OZ is: " + convertedVolume + " L");
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
