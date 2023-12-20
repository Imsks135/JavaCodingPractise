package com.practicedemo;

import java.util.Scanner;

public class SumOfDigitsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input string
        System.out.print("Enter a string with uppercase, lowercase, and digits: ");
        String inputString = scanner.nextLine();
        // Calculate and display the sum of digits
        int sumOfDigits = calculateSumOfDigits(inputString);
        System.out.println("Sum of digits in the string: " + sumOfDigits);
        scanner.close();
    }
    private static int calculateSumOfDigits(String inputString) {
        int sum = 0;
        for (char c : inputString.toCharArray()) {
            // Check if the character is a digit
            if (Character.isDigit(c)) {
                // Convert the character to an integer and add to the sum
                sum += Character.getNumericValue(c);
            }
        }
        return sum;
    }
}
