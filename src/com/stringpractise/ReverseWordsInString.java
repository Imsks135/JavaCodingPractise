package com.stringpractise;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String str = "Hi >Satyam< How @Are #you";
        System.out.println("Original String is: " + str);
        String reversed = reverseWords(str);
        System.out.println("String with Reversed Words: " + reversed);
    }

    //TC:O(N) SC:O(1)
    private static String reverseWords(String str) {
        char[] chars = str.toCharArray();
        int start = 0;
        for (int end = 0; end < chars.length; end++) {
            if (chars[end] == ' ') {
                reverse(chars, start, end - 1);
                start = end + 1;
            }
        }
        reverse(chars, start, chars.length - 1);
        System.out.println("After Reversing characters in all strings:" + new String(chars));
        reverse(chars, 0, chars.length - 1);
        return new String(chars);
    }

    private static void reverse(char[] chars, int begin, int end) {
        while (begin < end) {
            char temp = chars[begin];
            chars[begin] = chars[end];
            chars[end] = temp;
            begin++;
            end--;
        }
    }
}
