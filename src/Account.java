public abstract class Account {
    String accountID;
    String accountHolder_Name;
    double balance;
    String accType;
    double overdraftlimit;

    public Account(String accountID, String accountHolder_Name, double balance, String accType)
    {
        this.accountID = accountID;
        this.accountHolder_Name = accountHolder_Name;
        this.accType = accType;
        this.balance = balance;
    }

    public Account()
    {

    }

    public abstract void createAccount();

    public void deposit(double amount)
    {
        System.out.println();
        System.out.println("Account ID : " + getAccountId());
        if(amount <= 5000)
        {
            System.out.println("Please deposit at least 100000");
            System.out.println("-------------------------------------------------");
            return;
        }
        balance += amount;
        System.out.println("Deposited : " + amount + " to Account ID" + getAccountId());
        System.out.println("Current Balance of "+ getAccountId()+ " is : " + balance);
        System.out.println("-------------------------------------------------");
    }

    public void withdraw(double amount)
    {   
        System.out.println();
        System.out.println("Account ID : " + getAccountId());
        System.out.println("Withdrawing --------");
        if(amount >= balance)
        {
            System.out.println("Invalid Withdrawal Amount");
        }
        else
        {
            balance -= amount;
            System.out.println("Withdraw :" + amount);
            System.out.println("Current Balance of "+ getAccountId()+ " is : " + balance);
        }
        System.out.println("-------------------------------------------------");
    }

    public void displayInformation(String accountid)
    {
        System.out.println("Account Type : " + getClass().getName());
        System.out.println("Account ID : " + getAccountId());
        System.out.println("Account Holder Name : " + getAccountholder());
        System.out.println("Balance : " + getBalance());
    }

    public String getAccountId() {
        return accountID;
    }

    public void setAccountId(String accountID) {
        this.accountID = accountID;
    }

    public String getAccountholder() {
        return accountHolder_Name;
    }

    public void setAccountholder(String accountHolder_Name) {
        this.accountHolder_Name = accountHolder_Name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccounttype() {
        return accType;
    }

    public void setAccounttype(String accType) {
        this.accType = accType;
    }

    public abstract void displayOverdraftLimit();

    public double getOverdraftlimit() {
        return overdraftlimit;
    }

    public void setOverdraftlimit(double overdraftlimit) {
        this.overdraftlimit = overdraftlimit;
    }

}