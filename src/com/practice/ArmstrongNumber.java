package com.practice;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        if (isArmstrongNum(num)) {
            System.out.println("Enter Number is an Armstrong Number");
        } else {
            System.out.println("Enter Number is not an Armstrong Number");
        }
    }
    private static boolean isArmstrongNum(int num) {
        int temp = num;
        int size = String.valueOf(num).length();
        int sum = 0;
        while (num > 0) {
            int d = num % 10;
            sum += (int) Math.pow(d, size);
            num /= 10;
        }
        return sum == temp;
    }
}
