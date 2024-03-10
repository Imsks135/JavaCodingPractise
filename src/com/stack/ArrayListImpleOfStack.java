package com.stack;

import java.util.ArrayList;

class MyStack1 {
    ArrayList<Integer> arr = new ArrayList<>();

    void push(int x) {
        arr.add(x);
    }

    int pop() {
        int res = arr.get(arr.size() - 1);
        arr.remove(arr.size() - 1);
        return res;
    }

    int peek() {
        return arr.get(arr.size() - 1);
    }

    boolean isEmpty() {
        return arr.isEmpty();
    }

    int size() {
        return arr.size();
    }

    void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.print("Stack elements in array list are: ");
        for (int i = size() - 1; i >= 0; i--) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }

}

public class ArrayListImpleOfStack {
    public static void main(String[] args) {
        MyStack1 st = new MyStack1();
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
