package com.codedifferently.labs.partA.ex01;

import partA.ex01.CheckingAccount;

public class CheckingAccountTest {
    public static void main(String[] args) {
        CheckingAccount DH225 = new CheckingAccount();
        DH225.name = "Dianna Holt";
        DH225.balance = 1_000_000_000.00;
        DH225.deposit(1000.000);
    }
}
