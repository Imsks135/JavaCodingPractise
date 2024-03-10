package com.practicequeue;

import java.util.Stack;

class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    public void enqueue(int x) {
        stack1.push(x);
    }
    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException("Queue is empty");

        if (stack2.isEmpty()) {
            transferElements();
        }
        return stack2.pop();
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException("Queue is empty");

        if (stack2.isEmpty()) {
            transferElements();
        }
        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    private void transferElements() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }
}

public class ImplemOfQUsingStack {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Peek: " + queue.peek());
        queue.enqueue(40);
        queue.enqueue(50);
        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }
    }
}
