package homework_week2;

import java.util.Scanner;

public class PrintTable {
    /**
     * Write a Java program that takes a number as input and prints its
     * multiplication table up to 10. (table 8)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 8");
        int a = scan.nextInt();
        table(a);

    }

    public static void table(int a) {

        System.out.println(a + "*" + 1 + "=" + a * 1);
        System.out.println(a + "*" + 2 + "=" + a * 2);
        System.out.println(a + "*" + 3 + "=" + a * 3);
        System.out.println(a + "*" + 4 + "=" + a * 4);
        System.out.println(a + "*" + 5 + "=" + a * 5);
        System.out.println(a + "*" + 6 + "=" + a * 6);
        System.out.println(a + "*" + 7 + "=" + a * 7);
        System.out.println(a + "*" + 8 + "=" + a * 8);
        System.out.println(a + "*" + 9 + "=" + a * 9);
        System.out.println(a + "*" + 10 + "=" + a * 10);


    }
}
