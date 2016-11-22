package com.example.user.shoppingbasketcodetest;

/**
 * Created by user on 22/11/2016.
 */

public class Fish implements Edible {

    protected double price;
    protected String name;


    public Fish(double price, String name){
        this.price = price;
        this.name = name;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double newPrice){
        this.price = newPrice;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }


}
