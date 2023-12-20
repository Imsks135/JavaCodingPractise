package com.practice1;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        if (checkpalindrom(n)) {
            System.out.println(n + " is an palindrome number.");
        } else {
            System.out.println(n + " is not an palindrome number.");
        }
    }

    private static boolean checkpalindrom(int n) {
        int rev = 0;
        int temp = n;
        while (temp != 0) {
            rev = 10*rev + temp % 10;
            temp = temp / 10;
        }
        return rev == n;
    }
}
