import java.util.Scanner;
public class ATMInterface {
    static double balance = 1000;
    static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Oasis ATM!");
        while (true) {
            System.out.println("\nChoose an option : ");
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit Money");
            System.out.println("3.Withdraw Money");
            System.out.println("4.Exit");

            System.out.println("Enter your choice: ");
            int choice=sc.nextInt();

            switch (choice) {
                case 1:CheckBalance();
                    
                    break;
            case 2:depositMoney();
                   break;

              case 3: WithdrawMoney();
                      break;
               case 4:   
               System.out.println("Thank you for using Oasis ATM. Goodbye!"); 
               System.exit(0); 
                default:
                System.out.println("Invalid option.Please try again.");
            }
            
        }
    }
    static void CheckBalance(){
        System.out.println("Your current balance is: $"+ balance);
    }
    static void depositMoney(){
        System.out.println("Enter amount to deposit:$");
        double amount=sc.nextDouble();
              if (amount>0){
                balance += amount;
                System.out.println("$" + amount + "deposited successfully.");
                CheckBalance();
              }else{
                System.out.println("Enter a valid amount.");
              }
            }
         static void WithdrawMoney(){
            System.out.println("Enter amount to withdraw: $");
            double amount =sc.nextDouble();
            if (amount>0 && amount<= balance){
                balance -= amount;
                System.out.println("$" + amount + "withdrawn successfully.");
                CheckBalance();
            }else if (amount>balance){
                System.out.println("Insufficient balance.");
            }else{
                System.out.println("enter a valid amount.");
            }
         }    
}
