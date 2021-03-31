public class SpecialCheckingAccount extends CheckingAccount{

    private double minimumBalance;
    private double annualInterestRate;

    public SpecialCheckingAccount (int id, double startBal, double chkCharge, double ir, double min){
        super(id, startBal, chkCharge);
        annualInterestRate = ir;
        minimumBalance = min;
    }

    public void clearCheck(double amount){
        if (currentBalance() >= minimumBalance){
            decreaseBalance(amount);
        }
        else{
            super.clearCheck(amount);
        }
    }

    public double monthlyInterest(){
        if (currentBalance() >= minimumBalance){
            return currentBalance()*annualInterestRate/12;
        }
        else{
            return super.monthlyInterest();
        }
    }
}
