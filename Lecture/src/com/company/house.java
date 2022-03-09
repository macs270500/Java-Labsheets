package com.company;

public class house extends PRODUCT
{
    private String size;
    private String houseType;


    public house(String prodId,String prodName,double price,String foodType)
    {
        super(prodId,prodName,price);
        this.houseType=houseType;
        this.size=size;
    }
    public void setSize(String size)
    {
        this.size=size;
    }
    public void setHouse(String house)
    {
        this.houseType=house;
    }
    public String getSize()
    {
        return this.size;
    }
    public String getHouse()
    {
        return this.houseType;
    }

    public void showProduct()
    {
        System.out.println("Size of pet house "+size);
        System.out.println("Type of house is "+houseType);
    }

}

