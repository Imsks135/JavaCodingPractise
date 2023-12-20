package com.practicearray;

import java.util.Scanner;

public class EquilibriumPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (checkequilibrium(arr)) {
            System.out.println("Equilibrium point exits");
        } else {
            System.out.println("Equilibrium point not exits");
        }
    }

    private static boolean checkequilibrium(int[] arr) {
        int rs = 0;
        for (int k : arr) {
            rs += k;
        }
        int ls = 0;
        for (int j : arr) {
            rs -= j;
            if (rs == ls) return true;
            ls += j;
        }
        return false;
    }
}
