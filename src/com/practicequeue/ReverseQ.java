package com.practicequeue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQ {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.print("Before Revering Queue:");
        System.out.print(q);
        reverseq(q);
        System.out.println();
        System.out.print("After Reversing Qeueu:");
        System.out.print(q);
    }

    private static void reverseq(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        while (!q.isEmpty()) {
            st.push(q.peek());
            q.poll();
        }
        while (!st.isEmpty()) {
            q.add(st.peek());
            st.pop();
        }
    }
}
