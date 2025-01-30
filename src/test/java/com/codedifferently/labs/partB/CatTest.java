package com.codedifferently.labs.partB;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partB.animals.Cat;
import partB.animals.Mammal;
import partB.food.Food;

import java.util.Date;

public class CatTest {
    @Test
    void testSetName(){
        Date bDay = new Date();
        Cat ginger = new Cat("Garfield",bDay,11212);

        ginger.setName("Garfield");
        Assertions.assertEquals("Garfield",ginger.getName());

        ginger.setBirthDate(bDay);
        Assertions.assertEquals(bDay,ginger.getBirthDate());

        ginger.speak();
        Assertions.assertEquals("meow!",ginger.speak());

        Food fish = new Food();
        ginger.eat(fish);
        Assertions.assertEquals(1,ginger.getNumberOfMealsEaten());

        ginger.getId();
        Assertions.assertEquals(1,ginger.getId());
    }

}
