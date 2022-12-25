package com.bzl.stackqueue;

import java.util.LinkedList;

public class StackQueue {
    LinkedList<Integer> stack = new LinkedList<Integer>();
    LinkedList<Integer> queue = new LinkedList<Integer>();
    public static void main(String[] args) {
        StackQueue ob = new StackQueue();
        ob.push(70);
        ob.push(30);
        ob.push(56);
        ob.pop();
        System.out.println(ob.peek());
        ob.printStack();
        ob.enqueue(56);
        ob.enqueue(30);
        ob.enqueue(70);
        ob.printQueue();
    }
    public void push(Integer a){
        stack.add(a);
    }
    public void printStack(){
        System.out.println(stack);
    }
    public  Integer pop(){
        return stack.pop();
    }
    public Integer peek(){
        return stack.peek();
    }
    public void enqueue(Integer a){
        queue.add(a);
    }
    public void printQueue(){
        System.out.println(queue);
    }
}