package com.practice1;

import java.util.Scanner;

public class PrintDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        printdivisors(n);
    }

    private static void printdivisors(int n) {
        int i;
        for (i = 1; i * i < n; i++) {  //from 1 to sqrt(n)
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        for (; i >= 1; i--) {  //from sqrt(n) to n
            if (n % i == 0) {
                System.out.println(n / i);
            }
        }
    }
}
