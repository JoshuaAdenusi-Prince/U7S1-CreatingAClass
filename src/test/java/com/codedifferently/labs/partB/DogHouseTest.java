package com.codedifferently.labs.partB;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partB.animals.Dog;
import partB.storage.DogHouse;

import java.util.Date;

public class DogHouseTest {
    @Test
    void DogTestStuff(){
        Dog kitty = new Dog("Skipper", new Date(), 2257986);
        Dog kitty1 = new Dog("Dipper", new Date(), 3357602);
        Dog kitty2 = new Dog("Kipper", new Date(), 9982468);
        Dog kitty3 = new Dog("Nipper", new Date(), 7112764);
        Dog kitty4 = new Dog("Piper", new Date(), 5503982);
        Dog kitty5 = new Dog("Jake", new Date(), 1024093);
        DogHouse.add(kitty);
        DogHouse.add(kitty1);
        DogHouse.add(kitty2);
        DogHouse.add(kitty3);
        DogHouse.add(kitty4);
        DogHouse.add(kitty5);
        System.out.println(kitty);
        System.out.println(kitty1);
        Assertions.assertEquals(kitty,new Dog("Skipper", new Date(), 2257986));
        DogHouse.remove(kitty1);
        DogHouse.remove(9982468);
        Dog whoDis = DogHouse.getDogById(7112764);
        Assertions.assertEquals(whoDis, DogHouse.getDogById(7112764));
        System.out.println(whoDis);
        Integer snuffOut = DogHouse.getNumberOfDogs();
        Assertions.assertEquals(snuffOut, DogHouse.getNumberOfDogs());
        System.out.println(snuffOut);

    }
}
