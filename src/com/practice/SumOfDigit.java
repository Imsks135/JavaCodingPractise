package com.practice;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        int sod = 0;
        while (num != 0) {
            sod += num % 10;
            num /= 10;
        }
        System.out.println("Sum Of Digits are: " + sod);
        sc.close();
    }
}
