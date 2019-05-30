package thethreepag;

import java.util.Scanner;

@SuppressWarnings("all")
public class Retirement {

    public static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        System.out.println("how much money do you need to retine?");//需要存储的量
        double goal = scanner.nextDouble();
        System.out.println("How much money will you contribute every year?");//每次存多少
        double payment = scanner.nextDouble();
        System.out.println("Interest rate in %");//利率？
        double interestRate = scanner.nextDouble();
        double balance = 0;
        int years = 0;
        while (balance < goal) {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }
        System.out.println("You can retire in years" + years);
    }

}
