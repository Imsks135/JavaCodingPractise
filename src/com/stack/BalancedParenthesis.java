package com.stack;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with parentheses:");
        String str = sc.nextLine();
        if (isBalanced(str)) System.out.println("Given string is balanced");
        else System.out.println("Given String is Not Balanced");
    }

    //TC:O(N) SC:O(N)
    private static boolean isBalanced(String str) {
        ArrayDeque<Character> st = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if (x == '(' || x == '{' || x == '[') st.push(x);
            else {
                if (st.isEmpty()) return false;
                else if (!matching(st.peek(), x)) return false;
                else st.pop();
            }
        }
        return st.isEmpty();
    }

    //TC:O(N) SC:O(N)
    private static boolean matching(Character c1, char x) {
        return ((c1 == '[' && x == ']') || (c1 == '(' && x == ')') || (c1 == '{' && x == '}'));
    }
}
