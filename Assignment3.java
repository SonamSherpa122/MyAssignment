public class Assignment3
{
    public static void main(String[] args)
    {

    int L =10000;
    int M =50000;
    int H =100000;

if(L>M && L<H)
   {
    System.out.println("Your Salary is "+L);
    System.out.println("Your Salary Is Lowest ");
   }
else
    if(M>L && M>H)
    {
        System.out.println("Your Salary is " + M);
        System.out.println("Your Salary Is Normal ");
    }
else
    if(H>L && H>M)
    {
        System.out.println("Your Salary is " + H);
        System.out.println("Your Salary is Highest");
    }

    }

}
