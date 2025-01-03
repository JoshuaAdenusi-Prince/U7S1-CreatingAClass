package com.codedifferently.labs.partA.example01;

import partA.example01.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Gio";//assigns person ones name "Gio"
        person1.age = 29;//assigns age of person1
        person1.address = "Philadelphia"; //assigns address as philly

        System.out.println(person1.greet("Tariq"));//Prints "Gio says Hello Tariq, How are you?"
        System.out.println(person1.tellJoke());//"Prints the joke "What has two thumbs and writes bad code? .... Gio!"
    }
}
