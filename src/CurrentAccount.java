import java.util.Scanner;

public class CurrentAccount extends Account{

    public void createAccount()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Account ID : ");
        accountID = scan.nextLine();
        System.out.print("Enter Account Holder Name : ");
        accountHolder_Name = scan.nextLine();
        System.out.print("Enter Initial Balance : ");
        balance = scan.nextDouble();
        setOverdraftlimit(2000000);
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
        System.out.println("Overdraft limit : " + overdraftlimit);
    }

    @Override
    public void displayOverdraftLimit()
    {
        System.out.println("Limit for Current Account is: " + overdraftlimit);
    }
    
    

}