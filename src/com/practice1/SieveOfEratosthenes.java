package com.practice1;

import java.util.Arrays;
import java.util.Scanner;

import static com.practice1.CheckPrimeNum.checkprime;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        sieve(n);
    }

    private static void sieve(int n) {
        if (n <= 1) return;
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        for (int i = 2; i <= n; i++) {
            if (checkprime(i)) {
                System.out.println(i);
                for (int j = i * i; j <= n; j = j + i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (isPrime[i])
                System.out.print(i + " ");
        }
    }
}
