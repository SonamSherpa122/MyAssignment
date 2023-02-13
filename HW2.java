public class HW2
{
    public static void main(String[] args)
    {
Developer java=new Developer();
java.javaDev();
java.money();
        System.out.println("--------------");
Banker bank=new Banker();
bank.banker();
bank.money.buy();
        System.out.println("-------------");
        Trader trade=new Trader();
        trade.trade();
       trade.money.fun();

    }
}
class Job
{
  Money money  = new Money();

    void money() {
        System.out.println("If you become a  Java Developer money will come after you");
    }

}
class Developer extends Job
{
    void javaDev()
    {
        System.out.println("I am a Java Developer");
    }
}
class Banker extends Developer
{
    void banker()
    {
        System.out.println("I am not a Banker");
    }
}
class Trader extends Banker
{
    void trade()
    {
        System.out.println("I am Day Trader");
    }
}
class Money
{
    void buy()
    {
        System.out.println("Money Helps To Survive");
    }
    void fun()
    {
        System.out.println("Money Helps you to have fun ");
    }
}