package com.codedifferently.labs.partA.ex02;

import partA.ex02.SavingBond;

import java.util.Scanner;

public class SavingBondTest {
    public static void main(String[] args) {
       SavingBond person = new SavingBond();
       System.out.println("Hello, How much money will you be putting down?");
       Scanner terms = new Scanner(System.in);
        person.bond = terms.nextDouble();
       System.out.println("How many months will your term last?");
       int termNum = terms.nextInt();
       person.interestRateNTerm(termNum);
       person.term();





//       double bond =2;
//       double sixtyMax = Math.max(1, Math.min(60,bond));//sets a range between 60 and 1
//       double oneMin = Math.min(60, Math.max(1,bond));// puts the range between 60 and 1
//        System.out.println("the number you get is = " + sixtyMax);
//        System.out.println("the number you get is = " + oneMin);
    }

}
