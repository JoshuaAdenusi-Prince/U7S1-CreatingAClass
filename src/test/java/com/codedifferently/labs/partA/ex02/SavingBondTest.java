package com.codedifferently.labs.partA.ex02;

import partA.ex02.SavingBond;

import java.util.Scanner;

public class SavingBondTest {
    public static void main(String[] args) {
       SavingBond person = new SavingBond();
       System.out.println(person.term(8.0));
       person.bond = 10.0;
        System.out.println(person.interestRate(50));
        System.out.println(person.total(3));
//        Scanner bonds = new Scanner(System.in);
//
//        for (int i = 1; i <= 60 ; i++) {
//
//        }



//       double bond =2;
//       double sixtyMax = Math.max(1, Math.min(60,bond));//sets a range between 60 and 1
//       double oneMin = Math.min(60, Math.max(1,bond));// puts the range between 60 and 1
//        System.out.println("the number you get is = " + sixtyMax);
//        System.out.println("the number you get is = " + oneMin);
    }

}
