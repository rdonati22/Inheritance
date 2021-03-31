public class SavingsAccount extends Account{

    private double interestRate;

    public SavingsAccount(int id, double startBal, double i){
        super(id, startBal);
        interestRate = i;
    }

    public double monthlyInterest(){
        return currentBalance()*interestRate/12;
    }

    public void withdraw(double value){
        if (value > currentBalance()){
            System.out.println("Insufficient funds");
        }
        else{
            decreaseBalance(value);
        }
    }
}
