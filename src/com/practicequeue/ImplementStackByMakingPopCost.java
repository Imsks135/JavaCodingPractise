package com.practicequeue;

import java.util.LinkedList;
import java.util.Queue;

class MyStack4 {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    void push(int x) {
        q1.offer(x);
    }

    int pop() {
        if (q1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        // Move all elements from q1 to q2 except the last one
        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }

        // Remove the last element from q1 (simulates pop operation)
        int popped = q1.poll();

        // Swap references of q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return popped;
    }

    int top() {
        if (q1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        // Move all elements from q1 to q2 except the last one
        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }

        // Retrieve the last element from q1 (simulates top operation)
        int topElement = q1.peek();

        // Move the last element back to q1
        q2.offer(q1.poll());

        // Swap references of q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return topElement;
    }

    boolean isEmpty() {
        return q1.isEmpty();
    }
}

public class ImplementStackByMakingPopCost {
    public static void main(String[] args) {
        MyStack4 stack = new MyStack4();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.top());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element after pop: " + stack.top());
    }
}
