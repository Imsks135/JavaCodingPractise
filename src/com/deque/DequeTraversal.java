package com.deque;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeTraversal {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(10);
        dq.addLast(20);
        dq.addFirst(30);
        dq.addLast(40);
        System.out.println(dq);
        Iterator<Integer> it = dq.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        for (Integer x : dq) {
            System.out.print(x + " ");
        }
        System.out.println();
        Iterator<Integer> it1 = dq.descendingIterator();
        while (it1.hasNext()) {
            System.out.print(it1.next() + " ");
        }
    }
}
