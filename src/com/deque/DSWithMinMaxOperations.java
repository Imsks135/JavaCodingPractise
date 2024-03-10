package com.deque;

import java.util.Deque;
import java.util.LinkedList;

class MyDS {
    Deque<Integer> dq;

    MyDS() {
        dq = new LinkedList<>();
    }

    void insertMin(int x) {
        dq.addFirst(x);
    }

    void insertMax(int x) {
        dq.addLast(x);
    }

    int getMin() {
        return dq.peekFirst();
    }

    int getMax() {
        return dq.peekLast();
    }

    int extractMin() {
        return dq.pollFirst();
    }

    int extractMax() {
        return dq.pollLast();
    }
}

public class DSWithMinMaxOperations {
    public static void main(String[] args) {
        MyDS dq = new MyDS();
        dq.insertMin(5);
        dq.insertMax(10);
        dq.insertMin(1);
        dq.insertMax(12);
        dq.insertMin(4);
        dq.insertMax(20);
        System.out.println(dq.extractMin());
        System.out.println(dq.extractMax());
        System.out.println(dq.getMin());
        System.out.println(dq.getMax());
    }
}
