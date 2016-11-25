package com.example.user.shoppingbasketcodetest;

/**
 * Created by user on 22/11/2016.
 */

public class Fish implements Edible {

    protected double price;
    protected String name;
    protected boolean bogof;


    public Fish(double price, String name, boolean freeStuff ){
        this.price = price;
        this.name = name;
        this.bogof = freeStuff;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double newPrice){
        this.price = newPrice;
    }

    public boolean getBOGOF(){
        return this.bogof;
    }


    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }


}
