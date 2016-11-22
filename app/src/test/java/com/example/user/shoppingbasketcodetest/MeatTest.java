package com.example.user.shoppingbasketcodetest;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 22/11/2016.
 */

public class MeatTest {

    Meat meat;

    @Before
    public void Before(){
        meat = new Meat(6.99, "Premium");
    }

    @Test
    public void testHasPrice(){
        assertEquals( 6.99, meat.getPrice() );
    }

    @Test
    public void testSetPrice(){
        meat.setPrice(9.79);
        assertEquals( 9.79, meat.getPrice() );
    }

    @Test
    public void testHasName(){
        assertEquals( "Premium", meat.getName() );
    }

    @Test
    public void testSetName(){
        meat.setName("Rancid");
        assertEquals( "Rancid", meat.getName() );
    }







}
