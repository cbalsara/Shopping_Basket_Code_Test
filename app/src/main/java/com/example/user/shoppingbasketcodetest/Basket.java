package com.example.user.shoppingbasketcodetest;

import java.util.ArrayList;


/**
 * Created by user on 22/11/2016.
 */

public class Basket {

    protected ArrayList<Edible> foodStuff;


    public Basket(){
        this.foodStuff = new ArrayList<Edible>();
    }

    public int getItemsInBasket(){
        return this.foodStuff.size();
    }

//    add item to basket
    public void setItemInBasket(Edible food){
        this.foodStuff.add(food);
    }

//    remove specific item from basket
    public Edible removeItemInBasket(){
        if(getItemsInBasket() > 0) {
            return foodStuff.remove(1);
        }
        return null;
    }

//    empty the basket
    public void emptyBasket(){
        this.foodStuff.clear();
    }

    public double getTotalValue(){
        //work out the price of all the food in foodStuff array and return it.

        double total = 0;

//        if(){
//             //do something
//        }

        for (Edible item : this.foodStuff){
            total = total + item.getPrice();
        }

        return total;
    }



}
