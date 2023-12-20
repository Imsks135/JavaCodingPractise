package com.practice1;

import java.util.Scanner;

/**
 * The type Count digits.
 */
public class CountDigits {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Number of digits in " + n + " is " + countdigit(n));
    }

    private static int countdigit(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
}
