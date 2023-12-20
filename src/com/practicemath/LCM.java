package com.practicemath;

import java.util.Scanner;

import static com.practicemath.GCD.gcd;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1 = sc.nextInt();
        System.out.println("Enter second number:");
        int n2 = sc.nextInt();
        System.out.println("LCM of these numbers are: " + lcm(n1, n2));
    }

    private static int lcm(int n1, int n2) {
        return n1 * n2 / gcd(n1, n2);
    }
}
