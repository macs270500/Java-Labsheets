package com.company;


public class Main {
    public static void main(String[] args) throws outOfStockException {

            PRODUCT pr=new PRODUCT("01","Malinois",2000);
            pr.showProducts();
        System.out.println();
            Food fd=new Food("02","Dog",10,"Ekanuba",0);
            fd.showProducts();
        System.out.println();
            Pet pt=new Pet("03","Malinois",100,"Female","belgian malinois","brown");
            pt.showProducts();

    }
}
