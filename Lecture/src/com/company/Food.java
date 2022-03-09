package com.company;

import java.sql.Time;


public class Food extends PRODUCT  {
    private String foodType;
    private int quantity;

    public Food(String prodId,String prodName,double price,String foodType,int quantity)
    {
        super(prodId,prodName,price);
        setfoodType(foodType);//did you know u could use it like that??
        this.quantity=quantity;

    }
    public void setfoodType(String type)
    {
        this.foodType=type;

    }
    public String getFoodType()
    {
        return this.foodType;
    }

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public int getQuantity(){
        return this.quantity;
    }

    public void checkQuantity(int quantity){
        try{
            checkStock(quantity);
        }
        catch (outOfStockException OSE){
            System.out.println(OSE.getMessage());
        }
    }

    public void checkStock(int quantity) throws outOfStockException{
        if(quantity<1){
            throw new outOfStockException("outOfStockException");
        }
        else{
            System.out.println("Food quantity is:"+getQuantity());
        }
    }

    public void showProducts()
    {
        System.out.println("Food type is "+foodType);
        System.out.println("Food quantity is:"+getQuantity());
        checkQuantity(this.quantity);
    }

}

class outOfStockException extends Exception{
public outOfStockException(String message){super(message);}
}
