package homework_week2;

import java.util.Scanner;

public class PrintPattern_20 {
    /**
     * Write a Java Program to print as below.
     * "+------------------------+"
     * "|                        |"
     * "| CORNER STORE           |"
     * "|                        |"
     * "| 2015-03-29 04:38PM     |"
     * "|                        |"
     * "| Gallons: 10.870        |"
     * "| Price/gallon: $ 2.089  |"
     * "|                        |"
     * "| Fuel total: $ 22.71    |"
     * "|                        |"
     * "+------------------------+"
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter store name CORNER STORE  and press enter");
        String storeName = scan.nextLine();
        System.out.println("enter gallons 10.870");
        double gallons = scan.nextDouble();
        System.out.println("enter price of gallon $2.089");
        double pGallons = scan.nextDouble();
        print2(storeName, gallons, pGallons);


    }

    public static void print2(String storeName, double gallons, double pGallons) {
        double fuleTotal = gallons * pGallons;
        System.out.println("+------------------------+");
        System.out.println("|                        |");
        System.out.println("|  " + storeName + "          |");
        System.out.println("|                        |");
        System.out.println("|  2015-03-29 04:38PM    |");
        System.out.println("|                        |");
        System.out.println("|  Gallons:" + gallons + "         |");
        System.out.println("|  Price/gallon:" + pGallons + "    |");
        System.out.println("|                        |");
        System.out.println("|  Fuel total: $" + fuleTotal + " |");
        System.out.println("|                        |");
        System.out.println("+------------------------+");


    }
}
