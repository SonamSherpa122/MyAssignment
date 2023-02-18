public class ExceptionTestDay13
{
    public static void main(String[] args)
    {
        AccountInfo accountInfo=new AccountInfo("XYZ",50000);
        System.out.println("My account Details : " +accountInfo.AccountBalance);

        try
        {
            accountInfo.buy(400000000.0);
        }
        catch (InsufficientBalance a)
        {
            System.out.println("==> There is a Problem: "+a);
        }

    }

}
class AccountInfo
{
    String Name;
    int AccountBalance;

    public AccountInfo(String name, int accountBalance) {
        Name = name;
        AccountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "AccountInfo{" +
                "Name='" + Name + '\'' +
                ", AccountBalance=" + AccountBalance +
                '}';
    }
    void buy(double buyAmount)
    {
        System.out.println("==> Buying");
        System.out.println("==> I wanna Buy Bmw..."+buyAmount);

        if(AccountBalance>buyAmount)
        {
            System.out.println("You can Buy Bmw....");
        }
        else if (AccountBalance<buyAmount)
        {
            InsufficientBalance a=new InsufficientBalance("You have Insufficient Balance..");
            throw a;
        }

    }
}
class InsufficientBalance extends RuntimeException
{
    InsufficientBalance(String a)
    {
        super(a);
    }
}
