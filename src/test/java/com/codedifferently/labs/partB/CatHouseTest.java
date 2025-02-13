package com.codedifferently.labs.partB;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partB.animals.Cat;
import partB.storage.CatHouse;
import java.util.Date;

public class CatHouseTest {
    @Test
    void addCatTest(){
        Cat puppy0 = new Cat("jax", new Date(), 224386);
        Cat puppy1 = new Cat("feifei", new Date(), 442887);
        Cat puppy2 = new Cat("Jacobi", new Date(), 375992);
        Cat puppy3 = new Cat("Xao Hei", new Date(), 779800);
        Cat puppy4 = new Cat("Ling'er", new Date(), 225876);
        Cat puppy5 = new Cat("Qin Yu", new Date(), 102035);
        CatHouse.add(puppy0);
        CatHouse.add(puppy1);
        CatHouse.add(puppy2);
        CatHouse.add(puppy3);
        CatHouse.add(puppy4);
        CatHouse.add(puppy5);
        CatHouse.remove(puppy2);
        CatHouse.remove(375992);
        Cat penelopie = CatHouse.getCatById(102035);
        Assertions.assertEquals(penelopie, CatHouse.getCatById(102035));
        System.out.println(penelopie);
        Integer allCats = CatHouse.getNumberOfCats();
        Assertions.assertEquals(allCats, CatHouse.getNumberOfCats());
        System.out.println(allCats);




    }
}
