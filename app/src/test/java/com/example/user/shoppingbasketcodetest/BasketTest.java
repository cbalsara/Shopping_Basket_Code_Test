package com.example.user.shoppingbasketcodetest;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 22/11/2016.
 */

public class BasketTest {

    Basket basket;
    Meat meat;
    Fish fish;


    @Before
    public void before(){
        basket = new Basket();
        meat = new Meat(6.99, "Premium");
        fish = new Fish(5.10, "Fresh");
    }

    @Test
    public void testEmptyBasket(){
        assertEquals( 0, basket.getItemsInBasket() );
    }

    @Test
    public void testItemInBasket(){
        basket.setItemInBasket(meat);
        basket.setItemInBasket(fish);
        assertEquals( 2, basket.getItemsInBasket() );
    }

    @Test
    public void testRemoveItemInBasket(){
        basket.setItemInBasket(meat);
        basket.setItemInBasket(fish);
        basket.setItemInBasket(meat);
        basket.removeItemInBasket();
        assertEquals( 2, basket.getItemsInBasket() );
    }

    @Test
    public void testEmptyEntireBasket(){
        basket.setItemInBasket(meat);
        basket.setItemInBasket(fish);
        basket.emptyBasket();
        assertEquals( 0, basket.getItemsInBasket() );
    }

    @Test
    public void testTotalBasketValue(){
        basket.setItemInBasket(meat);
        basket.setItemInBasket(meat);
        basket.setItemInBasket(fish);
        assertEquals( 19.08, basket.getTotalValue() );
    }














}