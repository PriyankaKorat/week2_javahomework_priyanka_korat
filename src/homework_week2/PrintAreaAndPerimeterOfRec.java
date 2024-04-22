package homework_week2;

import java.util.Scanner;

public class PrintAreaAndPerimeterOfRec {
    /**
     * Write a Java program to print the area and perimeter of a rectangle.
     * Test Data:
     * Width = 5.6 Height = 8.5
     * Expected Output:
     * Area is 5.6 * 8.5 = 47.60
     * Perimeter is 2 * (5.6 + 8.5) = 28.20
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first value 5.6 and press enter");
        float a = scan.nextFloat();
        System.out.println("Enter second value 8.5 and press enter");
        float b = scan.nextFloat();
        areaPerimeter(a, b);
    }

    public static void areaPerimeter(float a, float b) {
        float area = a * b;
        float perimeter = 2 * (a + b);
        System.out.println("Area of rectangle is: " + area);
        System.out.println("Perimeter of rectangle is: " + perimeter);
    }
}
