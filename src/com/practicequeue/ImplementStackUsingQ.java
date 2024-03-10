package com.practicequeue;

import java.util.LinkedList;
import java.util.Queue;

class MyStack3 {
    Queue<Integer> q1;
    Queue<Integer> q2;

    MyStack3() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    int top() {
        return q1.peek();
    }

    int size() {
        return q1.size();
    }

    int pop() {
        return q1.poll();
    }

    void push(int x) {
        while (!q1.isEmpty()) {
            q2.offer(q1.peek());
            q1.poll();
        }
        q1.offer(x);
        while (!q2.isEmpty()) {
            q1.offer(q2.peek());
            q2.poll();
        }
    }
}

public class ImplementStackUsingQ {
    public static void main(String[] args) {
        MyStack3 st = new MyStack3();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.size());
        System.out.println(st.top());
        System.out.println(st.pop());
    }
}
