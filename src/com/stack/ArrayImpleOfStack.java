package com.stack;

class MyStack {
    int[] arr;
    int cap;
    int top;

    MyStack(int c) {
        top = -1;
        cap = c;
        arr = new int[cap];

    }

    void push(int x) {
        if (top == cap - 1) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        arr[top] = x;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE;
        }
        int res = arr[top];
        top--;
        return res;
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE;
        }
        return arr[top];
    }

    int size() {
        return (top + 1);
    }

    boolean isEmpty() {
        return top == -1;
    }

    void printStack() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.print("Stack elements in array are : ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class ArrayImpleOfStack {
    public static void main(String[] args) {
        MyStack st = new MyStack(5);
        st.push(10);
        st.push(15);
        st.push(20);
        st.push(25);
        st.push(30);
        st.printStack();
        System.out.println(st.pop());
        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
    }
}
