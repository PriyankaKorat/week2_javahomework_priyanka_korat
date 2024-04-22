package homework_week2;

import java.util.Scanner;

public class FindOutArea {
    /**
     * Write a program to enter any radius value of the circle and find out the
     * area.(Formula of Area A=PI*r*r)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of radius = ");
        double r = scan.nextDouble();
        findArea(r);
    }

    public static void findArea(double r) {
        double pi = 3.14;
        double area = r * r * pi;
        System.out.println("The ans is:" + area);


    }
}
