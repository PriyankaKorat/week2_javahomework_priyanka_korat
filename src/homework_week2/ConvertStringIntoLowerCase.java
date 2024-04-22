package homework_week2;

import java.util.Scanner;

public class ConvertStringIntoLowerCase {
    /**
     * Write a Java program to convert a given string into lowercase.
     * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
     * Output: the quick brown fox jumps over the lazy dog.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Uppercase string and press enter");
        String sentence = scan.nextLine();
        lowerCase2(sentence);

    }

    public static void lowerCase2(String sentence) {
        String x = sentence.toLowerCase();
        System.out.println("The result of the uppercase into lowercase is: " + sentence.toLowerCase());

    }
}
