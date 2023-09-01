import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

            double checkingBalance;
            double savingsBalance;
            int numberOfAccounts;
            double totalMoneyStored;

            public static int totalNumberOfAccounts(){
                numberOfAccounts++;
                return numberOfAccounts;
        }
            public static double getTotalMoneyStored(){
                return totalMoneyStored;
        }
            public static double getCheckingAccountBalance(){
                return checkingBalance;
        }
            public static double getSavingsAccountBalance3(){
                return savingsBalance;
        }

        Scanner input = new Scanner(System.in);
        System.out.println("How much money would you like to add to your account?");
        String priceText = input.nextLine();
        double deposit = Double.parseDouble(priceText);
        System.out.println("Which account should this go into?");
        String accountName = input.nextLine();
        if (accountName.equals("checking")){
            checkingBalance += deposit;
        } else if (accountName.equals("savings")){
            savingsBalance += deposit;
        }

    }
}