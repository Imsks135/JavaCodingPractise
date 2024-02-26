package com.hashing;

import java.util.HashSet;

public class hashsetexample2 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("gfg");
        hs.add("courses");
        hs.add("ide");
        System.out.println(hs.size());
        hs.remove("ide");
        System.out.println(hs.size());
        for (String st : hs) {
            System.out.print(st + " ");
        }
        System.out.println();
        System.out.println(hs.isEmpty());
        hs.clear();
        System.out.println(hs.size());
    }
}
