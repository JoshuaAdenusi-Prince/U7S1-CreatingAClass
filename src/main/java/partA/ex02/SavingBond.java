package partA.ex02;

public class SavingBond {
    public double term(double month){
//        return Math.max(1, Math.min(60,month));
        for (int i = 60; i >= 0 ; i--) {
            month += i;
            return i;
        }
        return 0;
    }
    public double bond;
    public double interestRate(double months){
            if (months >= 0 && months <= 11) {
                return 0.5;
            }else if (months >= 12 && months <= 23) {
                return 1.0;
            }else if (months >= 24 && months <= 35) {
                return 1.5;
            }else if (months >= 36 && months <= 47) {
                return 2.0;
            }else if (months >= 48 && months <= 60) {
                return 2.5;
            } else {
              return 0;
            }

        }
//        public double total(double plusInt){
//        double part = bond*interestRate(double months);
//        plusInt = part + bond;
//        return plusInt;
//    }




}
