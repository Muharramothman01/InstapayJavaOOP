public interface BankAccount {
    String password = "1234";
    void withDraw(double amount);
    void deposit(double amount);
    double showBalance();
}
