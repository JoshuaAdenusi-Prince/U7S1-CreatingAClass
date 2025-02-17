package com.codedifferently.labs.partA.ex02;

import partA.ex02.SavingBond;

import java.util.Scanner;

public class SavingBondTest {
    public static void main(String[] args) {
       SavingBond person = new SavingBond();
//       System.out.println(person.term(8.0));
//       person.bond = 10.0;
//       person.term(50);
//        System.out.println(person.interestRate(50));
//        System.out.println(person.total(3));
        System.out.println("Hello, How much money will you be putting down?");
        Scanner terms = new Scanner(System.in);
        double bond = terms.nextDouble();
        person.bond = bond;
        System.out.println("How many months will your term last?");
        double termLength = terms.nextDouble();
        double howLong = person.term(termLength);
        double full = bond * howLong;
        System.out.println(full);
//        System.out.println(howLong);

//Looooollll :(
//        double interest = person.interestRate(bond);
//        double total = interest *= howLong;
//        System.out.println(total);
//
//        System.out.println(person.term(bond));



//       double bond =2;
//       double sixtyMax = Math.max(1, Math.min(60,bond));//sets a range between 60 and 1
//       double oneMin = Math.min(60, Math.max(1,bond));// puts the range between 60 and 1
//        System.out.println("the number you get is = " + sixtyMax);
//        System.out.println("the number you get is = " + oneMin);
    }

}
