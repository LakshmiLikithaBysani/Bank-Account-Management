import java.util.Scanner;

class BankAccountManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== BANK ACCOUNT MANAGEMENT =====");

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        long accountNumber = sc.nextLong();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter Deposit Amount: ");
        double deposit = sc.nextDouble();

        balance = balance + deposit;

        System.out.print("Enter Withdrawal Amount: ");
        double withdrawal = sc.nextDouble();

        if (withdrawal <= balance) {
            balance = balance - withdrawal;
            System.out.println("Withdrawal Successful!");
        } else {
            System.out.println("Insufficient Balance!");
        }

        System.out.println("\n===== ACCOUNT DETAILS =====");
        System.out.println("Account Holder : " + name);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Final Balance  : " + balance);

        sc.close();
    }
}
