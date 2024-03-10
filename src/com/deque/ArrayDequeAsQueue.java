package com.deque;

import java.util.ArrayDeque;

public class ArrayDequeAsQueue {
    public static void main(String[] args) {
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        q.offer(40);
        System.out.println(q);
    }
}
