package com.deque;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExamp1 {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.offerFirst(10);//dq.addFirst()-->this function throws Exception
        dq.offerLast(20);//dq.addLast()-->this function throws Exception
        dq.offerFirst(30);//dq.addFirst()-->this function throws Exception
        dq.offerLast(40);//dq.addLast()-->this function throws Exception
        System.out.println(dq);
        System.out.println(dq.peekFirst());//dq.getFirst()-->this function throws Exception
        System.out.println(dq.peekLast());//dq.getLast()-->this function throws Exception
        dq.pollFirst();//dq.removeFirst()-->this function throws Exception
        dq.pollLast();//dq.removeLast()-->this function throws Exception
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
    }
}
