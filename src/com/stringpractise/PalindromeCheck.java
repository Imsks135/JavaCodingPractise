package com.stringpractise;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "SATYTAS";
        if (checkpalindrome(str)) {
            System.out.println("String is Palindrome");
        } else System.out.println("Not Palindrome");
    }
    // TC:O(N) SC:O(1)
    private static boolean checkpalindrome(String str) {
             int start=0;
             int end=str.length()-1;
             while(start<end){
                 if(str.charAt(start)!=str.charAt(end))return false;
                 start++;
                 end--;
             }
             return true;
    }
}
