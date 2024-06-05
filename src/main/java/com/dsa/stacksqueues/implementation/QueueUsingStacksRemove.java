package com.dsa.stacksqueues.implementation;

import java.util.Stack;

public class QueueUsingStacksRemove {

}

class QueueUsingStacks {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStacks() {
        this.first = new Stack<>();
        this.second = new Stack<>();
    }

    public void add(int item) {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        first.push(item);

        while (!second.isEmpty()) {
            first.push(second.pop());
        }
    }

    public int remove() {
        return first.pop();
    }

    public int peek() {
        return first.peek();
    }

    public boolean isEmpty() {
        return first.isEmpty();
    }
}