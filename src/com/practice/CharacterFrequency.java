package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a lowercase string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        // Count the frequency of each character
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        for (char c : inputString.toCharArray()) {
            if (Character.isLowerCase(c)) {
                charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        // Display the character frequencies
        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
