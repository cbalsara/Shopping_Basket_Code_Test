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
        if (getItemsInBasket() > 0) {
            return foodStuff.remove(0);
        }
        return null;
    }

//    empty the basket
    public void emptyBasket(){
        this.foodStuff.clear();
    }

    public double getTotalValue(){
        double total = 0;
//        whatever is edible in the foodstuff arrayList, return the total
//        + the 'price' of that 'edible' item
        for (Edible foodItem : this.foodStuff){
            total = total + foodItem.getPrice();
        }
        return total;
    }



}
