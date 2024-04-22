package homework_week2;

import java.util.Scanner;

public class ConvertDecimalToBinary {
    /**
     * Write a Java program to convert a decimal number to binary number.
     * Input Data:
     * Input a Decimal Number : 5
     * Expected Output
     * Binary number is: 101
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter one decimal value and press enter ");
        int a = scan.nextInt();
        decimalTpBinary(a);


    }

    public static void decimalTpBinary(int a) {
        int decimalNumber = a;
        String binary = Integer.toBinaryString(decimalNumber);
        System.out.println("The result of converting decimal number into binary is : " + binary);

    }
}
