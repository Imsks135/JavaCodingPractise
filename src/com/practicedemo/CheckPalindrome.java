package com.practicedemo;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter an String:");
            String str = sc.nextLine();
            if (isPalindrome(str)) {
                System.out.println("Enter String is palindrome");
            } else {
                System.out.println("Enter String is not palindrome");
            }
        }
    }

    private static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

}
