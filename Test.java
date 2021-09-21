import java.util.*;
class BankAccount
{
    private int Account_No;
    private String Account_Type;
    private String Customer_Name;
    private int Customer_ID;
    private int balance;
    public void Insert_Record(int AccountNo, String accountType, String custName, int customerID) {
        this.Account_No = AccountNo;
        this.Account_Type = accountType;
        this.Customer_Name = custName;
        this.Customer_ID = customerID;
    }
    public int getAccountNo()
    {
        return Account_No;
    }
    public String getAccountType()
    {
        return Account_Type;
    }
    public int getCustomerID()
    {
        return Customer_ID;
    }
    public String getCustName()
    {
        return Customer_Name;
    }
    public int getBalance()
    {
        return balance;
    }
    public void setAccountType(String accountType)
    {
        this.Account_Type = accountType;
    }

    public void setCustomerID(int customerID)
    {
        this.Customer_ID = customerID;
    }

    public void setCustName(String custName)
    {
        this.Customer_Name = custName;
    }

    public void setBalance(int balance)
    {
        this.balance = balance;
    }

    public void setAccountNo(int accountNo)
    {
        Account_No = accountNo;
    }

    public void deposit(int amount)
    {
        int ph = (getBalance() + amount);
        setBalance(ph);
        System.out.println("Rs." + amount + " deposited");
    }

    public void withDraw(int amount)
    {
        if (amount > getBalance())
        {
            System.out.println("Not enough funds available");
        } else
        {
            int kh = (getBalance() - amount);
            setBalance(kh);
            System.out.println("Rs. " + amount + " withdrawn ");
        }
    }
    public void Display_Balance()
    {
        System.out.println(getBalance());
    }
    public void Display_CustomerDetails()
    {
        System.out.println("Account No. " + getAccountNo());
        System.out.println("Name " + getCustName());
        System.out.println("customerID " + getCustomerID());
    }
}
    class Test
    {
        public static void main(String[] args)throws java.lang.Exception
        {
            Scanner in=new Scanner(System.in);
            BankAccount obj = new BankAccount();
            System.out.println("Enter Account Number");
            int acc=in.nextInt();
            System.out.println("Enter customer id");
            int custId=in.nextInt();
            System.out.println("Enter Account Name");
            String custname=in.nextLine();
            in.nextLine();
            System.out.println("Enter Account Type");
            String type=in.nextLine();
            obj.Insert_Record(acc, type, custname, custId);
            obj.deposit(1900);
            obj.Display_Balance();
            obj.withDraw(1190);
            obj.Display_Balance();
            obj.Display_CustomerDetails();
        }
    }

