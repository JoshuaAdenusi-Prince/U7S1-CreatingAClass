package com.codedifferently.labs.partB;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partB.animals.Animal;
import partB.animals.Dog;
import partB.animals.Mammal;
import partB.food.Food;

import java.util.Date;

public class DogTest {
  @Test
          void dogTest(){
      Dog beauceron = new Dog("Rocky", new Date(),11323);

      beauceron.setName("Rocky");
      Assertions.assertEquals("Rocky", beauceron.getName());
      System.out.println(beauceron.getName());

      beauceron.setBirthDate(new Date());
      Assertions.assertEquals(new Date(),beauceron.getBirthDate());
      System.out.println(beauceron.getBirthDate());

      beauceron.speak();
      Assertions.assertEquals("bark!", beauceron.speak());
      System.out.println(beauceron.speak());


      Food steak = new Food();
      beauceron.eat(steak);
      Assertions.assertEquals( 1, beauceron.getNumberOfMealsEaten());
      System.out.println(beauceron.getNumberOfMealsEaten());

      beauceron.getId();
      Assertions.assertEquals(11323,beauceron.getId());
      System.out.println(beauceron.getId());

      System.out.println(beauceron instanceof Animal);
      System.out.println(beauceron instanceof Mammal);

  }


}
