public class androidPhone
{
    public static void main(String[] args)
    {
        Phone Phn = new Phone("Samsung", "Oppo");
        Phn.printPhoneOption();

        Samsung Sam = new Samsung("Samsung"," ","S");
        Sam.printSamsung();

        Oppo Op=new Oppo(" ","Oppo","OP15");
        Op.printOppo();
    }
}
class Phone
{
    String SamsungPhn;
    String OppoPhn;

    public Phone(String samsungPhn, String oppoPhn)
    {
        SamsungPhn = samsungPhn;
        OppoPhn = oppoPhn;

    }

    void printPhoneOption()
    {
        System.out.println("This is " + SamsungPhn + " Phone");
        System.out.println("This is " + OppoPhn + " Phone");
    }

}
    class Samsung extends Phone
    {
        String galaxySeries;
        public Samsung(String samsungPhn, String oppoPhn, String galaxySeries)
        {
                    super(samsungPhn, oppoPhn);
                    this.galaxySeries = galaxySeries;
        }
        void printSamsung()
        {
                    System.out.println("This is "+SamsungPhn+ " Phone with " +galaxySeries+"Series");
        }
    }   class Oppo extends Phone
{
        String oppoSeries;
        public Oppo(String samsungPhn, String oppoPhn, String oppoSeries)
        {
                    super(samsungPhn, oppoPhn);
                    this.oppoSeries = oppoSeries;
        }
        void printOppo()
        {
                    {
                        System.out.println("This is "+OppoPhn+ " Phone with " +oppoSeries+"Series");
                    }
        }
}
