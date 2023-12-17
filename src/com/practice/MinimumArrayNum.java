package com.practice;

public class MinimumArrayNum {
    public static void main(String[] args) {
        int[] a = {31, 35, 34, 36, 32};
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("Min Number is:" + min);
    }
}
