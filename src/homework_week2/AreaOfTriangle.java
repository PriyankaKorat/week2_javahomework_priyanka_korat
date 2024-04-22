package homework_week2;

import java.util.Scanner;

public class AreaOfTriangle {
    /**
     * Write a program to calculate the area of a triangle.
     * area = (base * height) / 2;
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of base ");
        double base = scan.nextDouble();
        System.out.println("Enter the value of height");
        double height = scan.nextDouble();
        areaOfTriangle(base, height);

    }

    public static void areaOfTriangle(double base, double height) {
        double area = base * height / 2;
        System.out.println("The area of triangle is : " + area);
    }

}
