package com.codedifferently.labs.partB;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partB.animals.Cat;
import partB.storage.CatHouse;

import java.util.Date;

public class CatHouseTest {
    @Test
    void addCatTest(){
        Cat pookie = new Cat("jax", new Date(), 22438);
        CatHouse.add(pookie);
        Assertions.assertEquals("jax",pookie.getName());
        

//        String cat = "corithin";
//        Cat coritheon = new Cat("coritheon", new Date(), 13977);
//        Cat pantheon = new Cat("pantheon", new Date(), 677139);
//        Cat add = CatHouse.add(pantheon);
    }
}
