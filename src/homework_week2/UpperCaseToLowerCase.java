package homework_week2;

import java.util.Scanner;

public class UpperCaseToLowerCase {
    /**
     * Write a program to convert the upper case to lower case.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the upper case and press enter");
        String name = scan.nextLine();
        lowerCase(name);

    }

    public static void lowerCase(String name) {
        String strLowerCase = name.toLowerCase();
        System.out.println("Input string in Uppercase: " + name.toLowerCase());

    }
}
