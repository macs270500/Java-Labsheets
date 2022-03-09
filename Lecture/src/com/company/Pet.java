package com.company;

public class Pet extends PRODUCT
{
    private String gender;
    private String breed;
    private String color;

    public Pet(String prodId,String prodName,double price,String gender,String breed,String color)
    {
        super(prodId,prodName,price);
        this.gender=gender;
        this.color=color;
        this.breed=breed;

    }
    public void setgender(String gender)
    {
        this.gender=gender;

    }
    public String getgender()
    {
        return this.gender;
    }

    public void setcolor(String color)
    {
        this.color=color;

    }
    public String getcolor()
    {
        return this.color;
    }


    public void setbreed(String breed)
    {
        this.breed=breed;

    }
    public String getbreed()
    {
        return this.breed;
    }

    public void showProducts()
    {
        System.out.println("Gender is "+gender);
        System.out.println("Color is "+color);
        System.out.println("Breed is "+breed);

    }
}


