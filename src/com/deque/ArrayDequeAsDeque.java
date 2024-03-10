package com.deque;

import java.util.ArrayDeque;

public class ArrayDequeAsDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(10);
        dq.addLast(20);
        dq.addFirst(30);
        dq.addLast(40);
        System.out.println(dq.size());
        System.out.println(dq);
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());
        System.out.println(dq);
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());

    }
}
