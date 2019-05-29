import java.util.Scanner;

/**
 * @author 六诗人
 * @title: Retirement3
 * @projectName newDemoGit
 * @description: TODO
 * @date 2019/5/29下午 2:24
 */
@SuppressWarnings("all")
public class Retirement3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How much money will you contribute every year ?");
        double payment = in.nextDouble();
        System.out.println("Interest rate in %:");
        double interestRate = in.nextDouble();
        double balance = 0;
        int year = 0;
        String input;
        do {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            year++;
            System.out.printf("After you year %d,your balance is %,2f%n",year,balance);
            System.out.println("Ready to retire?(Y/N)");
            input=in.next();
        } while (input.equals("Y"));
    }
}
