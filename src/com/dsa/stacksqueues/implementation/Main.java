package com.dsa.stacksqueues.implementation;

public class Main {
    public static void main(String[] args) throws Exception {
//        CustomStack stack = new DynamicStack(5);
//
//        stack.push(34);
//        stack.push(45);
//        stack.push(2);
//        stack.push(9);
//        stack.push(18);
//        stack.push(18);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//        CustomQueue queue = new CustomQueue(5);
//        queue.insert(34);
//        queue.insert(45);
//        queue.insert(2);
//        queue.insert(9);
//        queue.insert(18);
//        queue.display();
//        System.out.println(queue.remove());
//        queue.display();

        CircularQueue queue = new CircularQueue(5);
        queue.insert(34);
        queue.insert(45);
        queue.insert(2);
        queue.insert(9);
        queue.insert(18);
        queue.display();
        System.out.println(queue.remove());
        queue.display();

    }
}
