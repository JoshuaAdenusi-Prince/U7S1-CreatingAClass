package com.codedifferently.labs.partA.ex02;

import partA.ex02.SavingBond;

public class SavingBondTest {
    public static void main(String[] args) {
       SavingBond person = new SavingBond();
       double bond = 0.5;
        double sixtyMax = Math.max(60,bond);
        double oneMin = Math.min(1,60);

        System.out.println("the bigger number is = "+ sixtyMax);
        System.out.println("the smaller number is = " + oneMin);
    }

}
