import java.util.Scanner;

public class BankSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 0;

        System.out.println("Welcome to Simple Banking System");

        while(true){

            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if(choice == 1){
                System.out.print("Enter amount to deposit: ");
                double amount = sc.nextDouble();

                balance = balance + amount;

                System.out.println("Money deposited successfully");
            }

            else if(choice == 2){
                System.out.print("Enter amount to withdraw: ");
                double amount = sc.nextDouble();

                if(amount <= balance){
                    balance = balance - amount;
                    System.out.println("Withdrawal successful");
                }
                else{
                    System.out.println("Insufficient balance");
                }
            }

            else if(choice == 3){
                System.out.println("Current balance: " + balance);
            }

            else if(choice == 4){
                System.out.println("Thank you for using the banking system");
                break;
            }

            else{
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}