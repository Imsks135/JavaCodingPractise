package com.stringpractise;

public class stringexamp1 {
    public static void main(String[] args) {
        String str = "satyam";
        System.out.println(str.length());
        System.out.println(str.charAt(4));
        System.out.println(str.substring(3));
        System.out.println(str.substring(3, 5));
        String str1 = "geeks";
        String str2 = "geeks";
        if (str1 == str2) System.out.println("Yes");
        else System.out.println("No");
        String str3 = new String("geeks");
        if (str1 == str3) System.out.println("Yes Equal");
        else System.out.println("Not Equal");
    }
}
