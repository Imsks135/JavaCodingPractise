package com.practice1;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int n1 = sc.nextInt();
        System.out.println("Enter Second Number:");
        int n2 = sc.nextInt();
        System.out.println("GCD or HCF of these numbers are:" + gcd(n1, n2));
    }

    static int gcd(int n1, int n2) {
        if (n2 == 0) return n1;
        else return gcd(n2, n1 % n2);
    }
}
