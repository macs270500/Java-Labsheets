package com.company;

public class PRODUCT {
    private String prodId;
    private String prodName;
    private double price;

    public PRODUCT(String prodId,String prodName,double price)
    {
        this.prodId=prodId;
        this.prodName=prodName;
        this.price=price;
    }

    public void setProdID(String id)
    {
        this.prodId=id;
    }
    public void setProdName(String pName)
    {
        this.prodName=pName;
    }
    public void setPrice(double pr)
    {
        this.price=pr;
    }
    public String getProdId()
    {
        return this.prodId;
    }
    public String getProdName()
    {
        return this.prodName;
    }
    public double getPrice()
    {
        return this.price;
    }


    public void showProducts()
    {
        System.out.println("Id "+prodId);
        System.out.println("Price "+price);
        System.out.println("Product Name "+prodName);

    }
}
