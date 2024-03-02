package com.stringpractise;

public class LeftMostRepeatChar {
    static final int CHAR = 256;

    public static void main(String[] args) {
        String str = "adbcdbc";
        int x = checkrepeat(str);
        System.out.println("Leftmost Repeating Character at index " + x);
    }

    //TC(CHAR+N) SC:O(CHAR)
    private static int checkrepeat(String str) {
        boolean[] visited = new boolean[CHAR];
        int res = -1;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (visited[str.charAt(i)]) res = i;
            else visited[str.charAt(i)] = true;
        }
        return res;
    }
}
