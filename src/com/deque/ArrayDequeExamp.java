package com.deque;

import java.util.ArrayDeque;

public class ArrayDequeExamp {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(10);
        ad.add(20);
        ad.add(30);
        ad.add(40);
        System.out.println(ad);
        System.out.println(ad.peek());
        System.out.println(ad.remove());
        System.out.println(ad);
    }
}
