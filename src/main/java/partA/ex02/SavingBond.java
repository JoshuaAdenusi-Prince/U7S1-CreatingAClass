package partA.ex02;

public class SavingBond {
    public int term, monthsRemaining;
    public double bond, rate;

    public void interestRateNTerm (int months){
            if (months >= 0 && months <= 11) {
                rate = 0.005;
            }else if (months >= 12 && months <= 23) {
                rate = 0.010;
            }else if (months >= 24 && months <= 35) {
                rate = 0.015;
            }else if (months >= 36 && months <= 47) {
                rate = 0.020;
            }else if (months >= 48 && months <= 60) {
                rate = 0.025;
            } else {
                System.out.println("Invalid Term");
              months = 0;
            }
            term = months;
            monthsRemaining = months;

        }

    public void term(){
        if(monthsRemaining > 0 && monthsRemaining <= 60) {
            bond += bond * rate/12;
            monthsRemaining--;
            System.out.println("bond: $" + bond);
            System.out.println("Months Remaining: " + monthsRemaining);
        }
        else{
            System.out.println("bond Matured");
        }
    }
}
