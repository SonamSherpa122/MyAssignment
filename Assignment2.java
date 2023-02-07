public class Assignment2
    {
    public static void main(String[] args)
    {
        YourInterestValue Math = new YourInterestValue();

        Math.simpleInterestValue();
        Math.simpleInterest2(78721, 2, 5.5F, 4);
        Math.compoundInterest(10000, 2, 5.5F, 5);
    }
    }
    class YourInterestValue
    {
          void  simpleInterestValue()
    {
        int p= 10;
        int n=2;
        float r =3.5F;
        float t = 2.9F;
        float Si=p*n*r*t;
        float Ci=p*((1+r/n)*n*t);
    }
    void simpleInterest2(int p, int n, float r,float t)
    {
        float Si=p*n*r*t;
        System.out.println("Your Simple Interest will be " +Si);
    }
    void compoundInterest(int p, int n, float r,float t)
    {
        float Ci=p*((1+r/n)*n*t);
        System.out.println("Your Compound Interest will be " +Ci);
    }

    }



