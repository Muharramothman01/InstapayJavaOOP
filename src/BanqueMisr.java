public class BanqueMisr implements BankAccount {
    private double balanceBM;
    public BanqueMisr() {

    }

    @Override
    public void withDraw(double amount) {
        System.out.print("Enter the amount to withdraw: ");
        if ( amount <= 5000){
            System.out.println("Invalid amount \n TRY AGAIN!!");
        }else {
            if (amount <= balanceBM ) {
                balanceBM -= amount;
                System.out.println(" Amount withdrawal: " + amount + "\n Balance after withdrawal: " + balanceBM);
            } else {
                System.out.println("Your balance is less than " + amount + "\t Transaction failed...!!" );
          }
      }
    }

    @Override
    public double getWithdrawLimit() {
        return 5000;
    }
    @Override
    public void deposit(double amount) {
        System.out.println("Note: you should know that max deposit is 8000 LE and min is 200. \n Enter the amount to deposit: ");
        if (amount <= 8000) {

            balanceBM += amount;
            System.out.println(" Amount Deposit: " + amount + "\n Balance after withdrawal: " + balanceBM);

        } else {
            System.out.println(" Deposit Transaction Failed!");
        }
    }


    @Override
    public double getDepositLimit() {
        return 8000;
    }

    @Override
    public double showBalance() {
        return balanceBM;
    }
}
