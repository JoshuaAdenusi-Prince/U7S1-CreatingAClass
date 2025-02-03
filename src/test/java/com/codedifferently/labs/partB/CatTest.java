package com.codedifferently.labs.partB;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partB.animals.Animal;
import partB.animals.Cat;
import partB.animals.Mammal;
import partB.food.Food;

import java.util.Date;

public class CatTest {
    @Test
    void catTest(){
        Date bDay = new Date();
        Cat ginger = new Cat("Garfield",bDay,11212);

        ginger.setName("Garfield");
        Assertions.assertEquals("Garfield",ginger.getName());
        System.out.println(ginger.getName());

        ginger.setBirthDate(bDay);
        Assertions.assertEquals(bDay,ginger.getBirthDate());
        System.out.println(bDay);

        ginger.speak();
        Assertions.assertEquals("meow!",ginger.speak());
        System.out.println(ginger.speak());

        Food fish = new Food();
        ginger.eat(fish);

        Assertions.assertEquals(1,ginger.getNumberOfMealsEaten());
        System.out.println(fish);

        ginger.getId();
        Assertions.assertEquals(11212,ginger.getId());
        System.out.println(ginger.getId());

        System.out.println(ginger instanceof Animal);
        System.out.println(ginger instanceof Mammal);
    }

}
