package partA.ex02;

public class SavingBond {
    public double term(double terms){
//        return Math.max(1, Math.min(60,month));
        for (double i = terms; i >= 0 ; i--) {
            System.out.println(terms);
        }
        return terms;
    }
    public double bond;

    public double interestRate(double months){
            if (months >= 0 && months <= 11) {
                return .005;
            }else if (months >= 12 && months <= 23) {
                return .010;
            }else if (months >= 24 && months <= 35) {
                return .015;
            }else if (months >= 36 && months <= 47) {
                return .020;
            }else if (months >= 48 && months <= 60) {
                return .025;
            } else {
              return 0;
            }

        }
//        bond*= 0.025;
//        public double total(double plusInt){
//        double part = bond*interestRate(double months);
//        plusInt = part + bond;
//        return plusInt;
//    }




}
