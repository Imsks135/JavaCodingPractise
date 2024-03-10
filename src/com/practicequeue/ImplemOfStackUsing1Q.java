package com.practicequeue;

import java.util.LinkedList;
import java.util.Queue;

class MyStack5 {
    Queue<Integer> q = new LinkedList<>();

    void push(int x) {
        q.offer(x);
    }

    int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return removeLast(q);
    }

    int top() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int last = removeLast(q);
        q.offer(last);
        return last;
    }

    boolean isEmpty() {
        return q.isEmpty();
    }

    // Recursive function to remove the last element from the queue
    int removeLast(Queue<Integer> q) {
        int removed = q.poll(); // Remove the front element
        if (q.isEmpty()) {
            return removed; // Base case: if the queue becomes empty
        } else {
            int last = removeLast(q); // Recursively remove elements
            q.offer(removed); // Re-enqueue the removed element after recursion
            return last; // Return the last element obtained from recursion
        }
    }
}

public class ImplemOfStackUsing1Q {
    public static void main(String[] args) {
        MyStack5 stack = new MyStack5();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element: " + stack.top());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element after pop: " + stack.top());
    }
}
