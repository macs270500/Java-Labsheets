package com.company;

public class Fluid {
    public double OZ = 33.814;

    public double litreToOZ(double volumeInLitres){
        double volumeToOZ = volumeInLitres*OZ;
        return volumeToOZ;
    }

    public double ozToLitres(double volumeInOZ){
        double volumeToLitres = volumeInOZ/OZ;
        return volumeToLitres;
    }
}
