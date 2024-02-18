package com.practicesorting;

public class Merge2SortedArrays {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        int[] b = {5, 15, 25, 35, 45};
        int m = a.length;
        int n = b.length;
        merge2array(a, b, m, n);
    }

    // TC:theta(m+n), SC:O(1)
    private static void merge2array(int[] a, int[] b, int m, int n) {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (a[i] <= b[j]) {
                System.out.print(a[i] + " ");
                i++;
            } else {
                System.out.print(b[j] + " ");
                j++;
            }
        }
        while (i < m) {
            System.out.print(a[i] + " ");
            i++;
        }
        while (j < n) {
            System.out.print(b[j] + " ");
            j++;
        }
    }
}
