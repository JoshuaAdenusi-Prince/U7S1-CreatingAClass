package partA.ex01;

public class CheckingAccount {

    public String name;
    public Double balance;

    public void deposit(double x) {
        balance += x;
    }

    public void withdraw(double que){
        if (que > balance){
            System.out.println("You know you are poor right? Try again...");
        } if (que < 0){
            System.out.println("This doesn't even make sense...Try again...");
        } if(que <= balance && que >= 0){
            double finalBalance = balance - que;
            System.out.println("Your remaining account balance is: " + finalBalance);
        }
    }
}
