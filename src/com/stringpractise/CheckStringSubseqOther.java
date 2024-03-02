package com.stringpractise;

public class CheckStringSubseqOther {
    public static void main(String[] args) {
        String str1 = "ABCDEF";
        String str2 = "BDF";
        int m = str1.length();
        int n = str2.length();
        if (checksubseq(str1, str2, m, n)) System.out.println("Subsequence exits");
        else System.out.println("Subsequence Not Exists");
    }

    // TC:O(m+n) SC:O(1)
    private static boolean checksubseq(String str1, String str2, int m, int n) {
        int j = 0;
        for (int i = 0; i < m && j < n; i++) {
            if (str1.charAt(i) == str2.charAt(j)) j++;
        }
        return (j == n);
    }
}
