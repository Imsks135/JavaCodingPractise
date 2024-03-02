package com.stringpractise;

public class CheckAnagram {
    static final int CHAR = 256;

    public static void main(String[] args) {
        String str1 = "aabaccdee";
        String str2 = "baacdecea";
        if (areanagram(str1, str2)) System.out.println("Both Strings Are Anagram of Each Other");
        else System.out.println("Both Strings Are Not Anagram of Each Other");
    }

    //TC:O(CHAR+N) SC:O(CHAR)
    private static boolean areanagram(String str1, String str2) {
        int[] count = new int[256];
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for (int i = 0; i < CHAR; i++) {
            if (count[i] != 0) return false;
        }
        return true;
    }
}
