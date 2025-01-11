package com.codedifferently.labs.partA.ex02;

import partA.ex02.SavingBond;

public class SavingBondTest {
    public static void main(String[] args) {
       SavingBond person = new SavingBond();
       System.out.println(person.term(5));
       person.bond = 200;
       person.interestRate(11);




//       double bond =2;
//       double sixtyMax = Math.max(1, Math.min(60,bond));//sets a range between 60 and 1
//       double oneMin = Math.min(60, Math.max(1,bond));// puts the range between 60 and 1
//        System.out.println("the number you get is = " + sixtyMax);
//        System.out.println("the number you get is = " + oneMin);
    }

}
