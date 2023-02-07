import java.sql.SQLOutput;
import java.util.Scanner;
public class LoopDay6 {
    public static void main(String[] args) {

        System.out.println("Withdraw");
        System.out.println(".........");
        System.out.println("1. $2000");
        System.out.println("2. $5000");
        System.out.println("3. $10000");
        System.out.println("4. $12000");
        System.out.println("5. EXIT");

        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();

        switch (choose) {
            case 1:
                System.out.println("Your Withdrawn Amount is 2000");
                break;

            case 2:
                System.out.println("Your Withdrawn Amount is 5000");
                break;

            case 3:
                System.out.println("Your Withdrawn Amount is 10000");
                break;

            case 4:
                System.out.println("Your Withdrawn Amount is 12000");
                break;

            case 5:
                System.out.println("You want to Exit....");
                break;

            default:
                System.out.println("Please Try again");
        }
    }
}
