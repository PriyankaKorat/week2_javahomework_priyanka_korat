package homework_week2;

import java.util.Scanner;

public class PrintAvgOfThreeNum {
    /**
     * Write a Java program that takes three numbers as input to calculate and
     * print the average of the numbers.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first digit and press enter ");
        double a = scan.nextInt();
        System.out.println("Enter second digit and press enter ");
        double b = scan.nextInt();
        System.out.println("Enter third digit nad press enter ");
        double c = scan.nextInt();
        avgOfThreeNum(a, b, c);

    }

    public static void avgOfThreeNum(double a, double b, double c) {
        double ans = a + b + c;
        System.out.println("Average of three number is : " + ans / 3);
    }
}
