package com.practice;

import java.util.Scanner;

public class NumberToWordConverter {

    private static final String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] teens = {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if (num < 0 || num > 999) {
            System.out.println("This program doesn't support number less than zero or more than 999");
        } else {
            System.out.println("Word Representation: " + convertNumberToWord(num));
        }
    }

    private static String convertNumberToWord(int num) {
        if (num == 0) return "Zero";
        return convert(num).trim();
    }

    private static String convert(int num) {
        if (num < 10) return units[num];
        else if (num < 20) {
            return teens[num - 10];
        } else if (num < 100) {
            return tens[num / 10] + " " + convert(num % 10);
        } else {
            return units[num / 100] + " Hundred " + convert(num % 100);
        }
    }
}
