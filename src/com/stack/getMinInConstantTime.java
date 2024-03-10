package com.stack;

import java.util.Objects;
import java.util.Stack;

class MyStack2 {
    Stack<Integer> ms;
    Stack<Integer> as;

    MyStack2() {
        ms = new Stack<>();
        as = new Stack<>();
    }

    void push(int x) {
        if (ms.isEmpty()) {
            ms.add(x);
            as.add(x); //TC:O(1)
            return;
        }
        ms.add(x);
        if (as.peek() >= ms.peek()) as.add(x);
    }

    void pop() {
        if (Objects.equals(as.peek(), ms.peek())) as.pop();
        ms.pop();  //TC:O(1)
    }

//    int top() {
//        return ms.peek();//TC:O(1)
//    }

    int getMin() {
        return as.peek();//TC:O(1)
    }
}

//TC:O(1) SC:O(N)
public class getMinInConstantTime {
    public static void main(String[] args) {
        MyStack2 st = new MyStack2();
        st.push(4);
        st.push(5);
        st.push(8);
        st.push(1);
        st.pop();
        System.out.print("Minimum Element from Stack " + st.getMin());
    }
}
