package com.practice;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DisplayWordsFromFile {
    public static void main(String[] args) {
        String inputfile = "C:\\Users\\IMSKS\\Downloads\\Note.txt";
        try {
            displaywords(inputfile);
        } catch (IOException e) {
            System.err.println("An error occured:" + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void displaywords(String inputfile) throws IOException {
        try (Scanner sc = new Scanner(new File(inputfile))) {
            while (sc.hasNextLine()) {
                String word = filter(sc.nextLine());
                System.out.println(word);
            }
        }
    }

    private static String filter(String s) {
        return s.replaceAll("[^a-zA-Z0-9?\\s]", "");
    }
}
