import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class PROJECTTEST
{
    public static void main(String[] args) {
        try{
            System.out.print("Please Enter Your Username==> ");

            Scanner scanner=new Scanner(System.in);
            String stringData= scanner.nextLine();

            System.out.print("Please Enter Your Address==> ");
            Scanner scanner1=new Scanner(System.in);
            String stringData1= scanner1.nextLine();


            System.out.println("Please Enter Your PassKey: ");
            Scanner scan2 = new Scanner(System.in);
            String password = scan2.nextLine();


            System.out.println("Please Enter Your Date of Birth: ");
            Scanner scan3 = new Scanner(System.in);
            String dob = scan3.nextLine();


            System.out.println("Please Enter Your Gender: ");
            Scanner scan4 = new Scanner(System.in);
            String gender = scan4.nextLine();

            System.out.println("Please Enter Email Address: ");
            Scanner scan5 = new Scanner(System.in);
            String email = scan5.nextLine();

            FileOutputStream Fout=new FileOutputStream(""+stringData);

            byte dataInArrayFormat[]= stringData.getBytes();

            Fout.write(dataInArrayFormat);
            System.out.println("Hello MR." +stringData);


        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

