import java.util.Scanner;

public class Main {
    public static void mainMenu(){
        System.out.println("Select your Bank Accounts : ");
        System.out.println("1 - Banque Misr");
        System.out.println("2 - Banque Alahly");
        System.out.println("3 - CIB Bank");
        System.out.println("4 - QNB Bank");
        System.out.println("5 - Exit");
        System.out.println("\n");
    }

    public static void sideMenu() {
        System.out.println("Select your Operation : ");
        System.out.println("1 - Withdraw");
        System.out.println("2 - Deposit");
        System.out.println("3 - Show Balance");
        System.out.println("4 - Back To Main");
        System.out.println("\n");
    }

    public static void main(String[] args) {
        // User interface
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome Jack Enter your password : ");
        String password = input.nextLine();
        int option;
        int operation;
        double amount;
        BankAccount bank = null;
        boolean menu = true;
        if(password.equals(BankAccount.password)){
            while (menu){
                mainMenu();
                option = input.nextInt();
                switch (option) {
                    case 1:
                        bank = new BanqueMisr();
                        break;
                    case 2:
                        bank = new BanqueAlahly();
                        break;
                    case 3:
                        bank = new CIB();
                        break;
                    case 4:
                        bank = new QNB();
                        break;
                    case 5:
                        menu = false;
                        break;
                    default:
                        System.out.println("Invalid Choice\n");
                        System.out.println("===================================\n");
                        continue;
                }

                if (!menu) {
                    System.out.println("Thank you, sir");
                    break;
                }

                boolean repeat = true;
                while (repeat) {
                    sideMenu();
                    operation = input.nextInt();
                    if(operation == 1){
                        System.out.println("Enter the amount : ");
                        amount = input.nextDouble();
                        bank.withDraw(amount);
                    }
                    else if(operation == 2){
                        System.out.println("Enter the amount : ");
                        amount = input.nextDouble();
                        bank.deposit(amount);
                    }
                    else if (operation == 3){
                        System.out.println("Your balance is : "+bank.showBalance()+" EGP");
                    }
                    else if(operation == 4){
                        repeat = false;
                    }
                    else {
                        System.out.println("Invalid Choice\n");
                        System.out.println("===================================\n");
                    }
                }
            }



        }


    }
}

