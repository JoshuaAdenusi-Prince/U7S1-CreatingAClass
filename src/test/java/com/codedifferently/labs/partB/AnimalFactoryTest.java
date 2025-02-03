package com.codedifferently.labs.partB;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partB.animals.Animal;

public class AnimalFactoryTest {
    @Test
    void animalTest(){
//        String name = "Dog";
//        Integer age = 53;
//        Animal animal = new Animal();
//
//        String actualName = animal.getName();
//        Integer actualaAge = animal.getAge();
//
//        Assertions.assertEquals(name,actualName);
//        Assertions.assertEquals(age, actualaAge);
        Animal Dog = new Animal();

        System.out.println(Dog.getId());

    }
}
