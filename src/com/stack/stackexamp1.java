package com.stack;

import java.util.ArrayDeque;

public class stackexamp1 {
    public static void main(String[] args) {
//        Stack<Integer> st=new Stack<>();
        ArrayDeque<Integer> s = new ArrayDeque<>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop()); //TC:O(1)
        System.out.println(s.peek());//TC:O(1)
        System.out.println(s.size());//TC:O(1)
        System.out.println(s.pop());
        System.out.println(s.isEmpty());//TC:O(1)
    }
}
