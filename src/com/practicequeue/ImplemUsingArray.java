package com.practicequeue;

class Queue1 {
    int front, rear, size;
    int[] arr;
    int capacity;

    Queue1(int c) {
        front = this.size = 0;
        rear = c - 1;
        capacity = c;
        arr = new int[capacity];
    }

    public void enqueue(int item) {
        if (isFull(this))
            return;
        this.rear = (this.rear + 1)
                % this.capacity;
        this.arr[this.rear] = item;
        this.size = this.size + 1;
        System.out.println(item
                + " enqueued to queue");
    }

    boolean isFull(Queue1 queue) {
        return (queue.size == queue.capacity);
    }

    int dequeue() {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        int item = this.arr[this.front];
        this.front = (this.front + 1)
                % this.capacity;
        this.size = this.size - 1;
        return item;
    }

    boolean isEmpty(Queue1 queue) {
        return (queue.size == 0);
    }

    public int front() {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        return this.arr[this.front];
    }

    public int rear() {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        return this.arr[this.rear];
    }
}

public class ImplemUsingArray {
    public static void main(String[] args) {
        Queue1 queue = new Queue1(1000);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println(queue.dequeue()
                + " dequeued from queue\n");
        System.out.println("Front item is "
                + queue.front());
        System.out.println("Rear item is "
                + queue.rear());
    }
}
