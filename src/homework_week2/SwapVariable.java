package homework_week2;

import java.util.Scanner;

public class SwapVariable {
    /**
     * Write a Java program to swap two variables.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scan.nextInt();
        System.out.println("Enter the second number: ");
        int b = scan.nextInt();
        swap(a, b);

    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping the result is : " + a);
        System.out.println("After swapping the result is : " + b);

    }
}
