package com.example.user.shoppingbasketcodetest;

/**
 * Created by user on 22/11/2016.
 */

public class Meat implements Edible {

    protected double price;
    protected String name;
    protected boolean BOGOF;


    public Meat(double price, String name, boolean freeStuff ){
        this.price = price;
        this.name = name;
        this.BOGOF = freeStuff;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double newPrice){
        this.price = newPrice;
    }

    public boolean getBOGOF(){
        return this.BOGOF;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }


}
