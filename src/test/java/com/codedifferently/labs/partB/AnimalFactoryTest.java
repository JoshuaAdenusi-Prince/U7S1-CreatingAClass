package com.codedifferently.labs.partB;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partB.animals.Cat;
import partB.animals.Dog;
import partB.factories.AnimalFactory;

import java.util.Date;

public class AnimalFactoryTest {
    @Test
    void dogCreateTest(){
        String name = "Dasher";
        Date birthDate = new Date();

        Dog doggie = AnimalFactory.createDog(name, birthDate);

        Assertions.assertEquals(name,doggie.getName());
        System.out.println(doggie.getName());

        Assertions.assertEquals(birthDate, doggie.getBirthDate());
        System.out.println(doggie.getBirthDate());
    }
    @Test
    void catCreateTest(){
        String name2 = "Galileo";
        Date birthDate = new Date();

         Cat kitten = AnimalFactory.createCat(name2, birthDate);

        Assertions.assertEquals(name2, kitten.getName());
        System.out.println(kitten.getName());

        Assertions.assertEquals(birthDate, kitten.getBirthDate());
        System.out.println(kitten.getBirthDate());
    }
}
