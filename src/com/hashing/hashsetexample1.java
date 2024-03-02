package com.hashing;

import java.util.HashSet;
import java.util.Iterator;

public class hashsetexample1 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("gfg");
        hs.add("courses");
        hs.add("ide");
        System.out.println(hs);
        System.out.println(hs.contains("ide"));
        Iterator<String> it = hs.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
