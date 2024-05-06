public class MainAccount
{
    public static void main(String[] args) {
        Account account[] = new Account[2];
        account[0] = new CurrentAccount();
        account[1] = new SavingsAccount();

        for(int i = 0; i < account.length; i++)
        {
            System.out.println();
            System.out.println(account[i].getClass().getName());
            account[i].createAccount();
            System.out.println();
        }

        for(int i = 0; i < account.length; i++)
        {
            account[i].displayInformation(account[i].getAccountId());
            System.out.println();
        }
        
        account[0].withdraw(2000000);
        System.out.println();
        account[0].deposit(3000);
        account[0].displayInformation(account[0].getAccountId());
        account[1].withdraw(700000);


        System.out.println("Displaying All Info");
        for(int i = 0; i < account.length; i++)
        {
            account[i].displayInformation(account[i].getAccountId());
            System.out.println();
        }

    }
}