package com.practicedemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter an String:");
            String input = sc.nextLine();
            char result = findfirstnonrepeat(input);
            if (result != '\0') {
                System.out.println("First Non-Repeating Character is: " + result);
            } else {
                System.out.println("No Non-Repeating Character");
            }
        }
    }

    private static char findfirstnonrepeat(String input) {

        Map<Character, Integer> mp = new HashMap<>();
        for (char c : input.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        for (char c : input.toCharArray()) {
            if (mp.get(c) == 1) {
                return c;
            }
        }
        return '\0';
    }
}
