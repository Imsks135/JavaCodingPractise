package com.deque;

import java.util.ArrayDeque;

public class ArrayDequeAsStack {
    public static void main(String[] args) {
        //ArrayDeque as Stack
        ArrayDeque<Integer> st = new ArrayDeque<>();
        st.push(5);
        st.push(15);
        st.push(25);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
        st.push(35);
        System.out.println(st);
    }
}
