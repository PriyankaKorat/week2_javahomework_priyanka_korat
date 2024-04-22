package homework_week2;

import java.util.Scanner;

public class CalculatorProgramme {
    /**
     * Write a program for a calculator with addition, subtraction, multiplication
     * and division methods all with parameters and use string concatenation
     * methods.(Note: Two static and Two instance methods.)
     */
    public static void main(String[] args) {
        CalculatorProgramme calculatorProgramme = new CalculatorProgramme();
        Scanner a = new Scanner(System.in);
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int e = a.nextInt();
        System.out.println("Enter the value of b");
        int f = a.nextInt();
        calculatorProgramme.addition(e, f);
        calculatorProgramme.subtraction(e, f);
        multiplication(e, f);
        division(e, f);

    }

    public void addition(int e, int f) {
        int add = e + f;
        System.out.println("The sum of " + e + " and " + f + " is: " + add);
    }

    public void subtraction(int e, int f) {
        int sub = e - f;
        System.out.println("The subtraction of " + e + " and " + f + " is: " + sub);

    }

    public static void multiplication(int e, int f) {
        int mul = e * f;
        System.out.println("The multiplication of " + e + " and " + f + " is: " + mul);

    }

    public static void division(int e, int f) {
        int div = e / f;
        System.out.println("The division of " + e + " and " + f + " is: " + div);

    }

}
