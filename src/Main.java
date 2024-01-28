import java.util.Scanner;

public class Main {
    public static void mainMenu(){
        System.out.println("Select your Bank Accounts : ");
        System.out.println("1 - Banque Misr");
        System.out.println("2 - Banque Alahly");
        System.out.println("3 - CIB Bank");
        System.out.println("4 - QNB Bank");
        System.out.println("5 - Exit");
    }

    public static void sideMenu() {
        System.out.println("Select your Operation : ");
        System.out.println("1 - Withdraw");
        System.out.println("2 - Deposit");
        System.out.println("3 - Show Balance");
        System.out.println("4 - Back To Main");
    }

    public static void main(String[] args) {
        // User interface
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome Jack Enter your password : ");
        String password = input.nextLine();
        int option;
        int operation;
        BankAccount bank = null;
        boolean menu = true;
        if(password.equals(BankAccount.password)){
            while (menu){
                option = input.nextInt();
                mainMenu();
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
                    operation = input.nextInt();
                    switch (operation) {
                        case 1:
                            bank.withDraw();
                            break;
                        case 2:
                            bank.deposit();
                            break;
                        case 3:
                            bank.showBalance();
                            break;
                        case 4:
                            System.out.println("Back to Main Menu");
                            repeat = false;
                            break;
                        default:
                            System.out.println("Invalid Choice\n");
                            System.out.println("===================================\n");
                            break;
                }
            }



            }


        }
    }
}
