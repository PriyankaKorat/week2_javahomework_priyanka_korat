package homework_week2;

import java.util.Scanner;

public class AddTwoBinaryNum {
    /**
     * Write a Java program to add two binary numbers.
     * Input Data:
     * Input first binary number: 10
     * Input second binary number: 11
     * Expected Output:
     * Sum of two binary numbers: 101
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first input 10 and press enter ");
        String x = scan.nextLine();
        System.out.println("Enter second input 11 and press enter ");
        String y = scan.nextLine();
        addBinary(x, y);

    }

    public static void addBinary(String x, String y) {


        int num1 = Integer.parseInt(x, 2); // converting binary string into integer(decimal number)
        int num2 = Integer.parseInt(y, 2); // converting binary string into integer(decimal number)
        int sum = num1 + num2; // Adding those two decimal numbers and storing in sum

        String result = Integer.toBinaryString(sum); // Converting that resultant decimal into binary string
        System.out.println("The sum of two binary num is: " + result);


    }
}
