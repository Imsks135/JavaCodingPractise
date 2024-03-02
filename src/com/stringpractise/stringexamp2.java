package com.stringpractise;

public class stringexamp2 {
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "geeks";
        String s3 = "for";
        System.out.println(s1.contains(s2));
        System.out.println(s1.equals(s2));
        System.out.println(s1.indexOf(s3));
        System.out.println(s2.indexOf(s3));
        int res = s1.compareTo(s3);//compare lexographically
        if (res == 0) System.out.println("Same");
        if (res > 0) System.out.println("s1 greater");
        if (res < 0) System.out.println("s1 smaller");
    }
}
