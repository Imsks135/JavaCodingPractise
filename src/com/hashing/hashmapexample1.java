package com.hashing;

import java.util.HashMap;
import java.util.Map;

public class hashmapexample1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("gfg", 10);
        hm.put("courses", 15);
        hm.put("ide", 20);
        System.out.println(hm);
        System.out.println(hm.size());
        for (Map.Entry<String, Integer> m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        if (hm.containsKey("gfg")) {
            System.out.println("Yes");
        } else System.out.println("No");
        hm.remove("gfg");
        System.out.println(hm.size());
        System.out.println(hm);
        if (hm.containsValue(15)) {
            System.out.println("Yes");
        } else System.out.println("No");
        System.out.println(hm.get("ide"));
        System.out.println(hm.get("subject"));
    }
}
