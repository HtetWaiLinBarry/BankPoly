import java.util.Scanner;

public class SavingsAccount extends Account{
    double interestrate;
    int duration;

    @Override
    public void createAccount() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Account ID : ");
        accountID = scan.nextLine();
        System.out.print("Enter Account Holder Name : ");
        accountHolder_Name = scan.nextLine();
        System.out.print("Enter Initial Balance : ");
        balance = scan.nextDouble();
        System.out.print("Enter Interest Rate : ");
        interestrate = scan.nextDouble();
        System.out.print("Enter Duration (Months) : ");
        duration = scan.nextInt();
        setOverdraftlimit(5000000);
        displayOverdraftLimit();

    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        if(amount >= overdraftlimit)
        {
            System.out.println("Can't withdraw " + amount + " due to Over Draft Limit.");           
            displayOverdraftLimit();
            return;
        } 
        super.withdraw(amount);
    }

    @Override
    public void displayInformation(String accountid) {
        super.displayInformation(getAccountId());
        displayOverdraftLimit();
    }

    public double calculateInterest()
    {
        return interestrate;
    }

    @Override
    public void displayOverdraftLimit() {
        System.out.println("Limit for Saving Account is: " + overdraftlimit);
    }

}