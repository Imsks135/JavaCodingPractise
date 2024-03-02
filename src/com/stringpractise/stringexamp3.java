package com.stringpractise;

public class stringexamp3 {
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "geeks";
        System.out.println(s1.indexOf(s2, 1));
        String s3 = s2;
        s2 = s2 + "forgeeks";//s2=s2.concat("forgeeks")
        System.out.println(s2);
        System.out.println(s2 == s3);
    }
}
