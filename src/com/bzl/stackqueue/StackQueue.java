package com.bzl.stackqueue;

import java.util.LinkedList;

public class StackQueue {
    LinkedList<Integer> stack = new LinkedList<Integer>();
    public static void main(String[] args) {
        StackQueue ob = new StackQueue();
        ob.push(70);
        ob.push(30);
        ob.push(56);
        ob.pop();
        System.out.println(ob.peek());
        ob.print();
    }
    public void push(Integer a){
        stack.add(a);
    }
    public void print(){
        System.out.println(stack);
    }
    public  Integer pop(){
        return stack.pop();
    }
    public Integer peek(){
        return stack.peek();
    }
}