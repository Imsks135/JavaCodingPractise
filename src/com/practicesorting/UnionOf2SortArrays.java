package com.practicesorting;

public class UnionOf2SortArrays {
    public static void main(String[] args) {
        int[] a = {3, 5, 10, 10, 10, 15, 15, 20};
        int[] b = {5, 10, 10, 15, 30};
        int m = a.length;
        int n = b.length;
        union(a, b, m, n);
    }

    private static void union(int[] a, int[] b, int m, int n) {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }
            if (a[i] < b[j]) {
                System.out.print(a[i] + " ");
                i++;
            } else if (a[i] > b[j]) {
                System.out.print(b[j] + " ");
                j++;
            } else {
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
        while (i < m && a[i] != a[i - 1]) {
            System.out.print(a[i] + " ");
            i++;
        }
        while (j < n && b[j] != b[j - 1]) {
            System.out.print(b[j] + " ");
            j++;
        }
    }
}
