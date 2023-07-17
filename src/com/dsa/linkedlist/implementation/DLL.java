package com.dsa.linkedlist.implementation;

public class DLL {
    private Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val) {
        if (head == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        node.next = null;
        node.prev = last;
        last.next = node;
    }

    public void insert(int after, int val) {
        Node prev = find(after);
        if (prev == null) {
            System.out.println("does not exists");
            return;
        }
        Node node = new Node(val);
        node.next = prev.next;
        prev.next = node;
        node.prev = prev;
        if (node.next != null) {
            node.next.prev = node;
        }
    }

    private Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) return node;
            node = node.next;
        }
        return null;
    }

    public void display() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("Printing in Reverse");
        while (last != null) {
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
