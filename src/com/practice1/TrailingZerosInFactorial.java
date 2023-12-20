package com.practice1;

import java.util.Scanner;

public class TrailingZerosInFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Trailing zeros in " + n + " is " + trailingzeros(n));
    }

    private static int trailingzeros(int n) {
        int res = 0;
        for (int i = 5; i <= n; i *= 5) {
            res = res + n / i;
        }
        return res;
    }
}
