package com.example.user.shoppingbasketcodetest;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 22/11/2016.
 */

public class FishTest {
    Fish fish;

    @Before
    public void Before(){
        fish = new Fish(3.99, "Fresh", true);
    }

    @Test
    public void testHasPrice(){
        assertEquals( 3.99, fish.getPrice() );
    }

    @Test
    public void testSetPrice(){
        fish.setPrice(1.99);
        assertEquals( 1.99, fish.getPrice() );
    }

    @Test
    public void testIsBOGOF(){
        assertEquals( true, fish.getBOGOF() );
    }

    @Test
    public void testHasName(){
        assertEquals( "Fresh", fish.getName() );
    }

    @Test
    public void testSetName(){
        fish.setName("Discount");
        assertEquals( "Discount", fish.getName() );
    }
}
