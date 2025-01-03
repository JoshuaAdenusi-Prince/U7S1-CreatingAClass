package partA.ex01;

public class CheckingAccount {

    public String name;
    public Double balance;

    public void deposit(Double x) {
        balance += x;
    }
}
