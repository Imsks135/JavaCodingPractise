package com.practice1;

import java.util.Scanner;

public class FactorialOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }

    //TC:Theta(n) SC:Theta(n)
    private static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}
