package homework_week2;

import java.util.Scanner;

public class DegreeCelsius {
    /**
     * Write a program to insert any temperature value in degree Fahrenheit and
     * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of temperature");
        double f = scan.nextDouble();
        DegreeCelsius obj = new DegreeCelsius();
        obj.m(f);

    }

    public void m(double temperature) {
        double g = ((temperature - 32) * 5 / 9);
        System.out.println(g);

    }
}
